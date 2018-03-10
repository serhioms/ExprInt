package test.org.eval;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilEval {

	// format(${percentageQty},%3.2f)%
	static private Pattern[] expressPattern = new Pattern[] {
			Pattern.compile("\\$\\{(.*?)\\}"),					// ${percentageQty}
			Pattern.compile("(.*?)\\((.*?)\\;(.*?)\\)"),		// format(95.87613;%3.2f)
			Pattern.compile("(.*?)\\((.*?)\\)"),				// upper(blablabla)
	};

	@SafeVarargs
	static public String eval(String expr, Map<String, String>... data) {
		for (Pattern pattern : expressPattern) {
			Matcher matcher = pattern.matcher(expr);
		    while( matcher.find() ) {
		    	switch( matcher.groupCount() ) {
		    	case 1:
		    		String fragment = matcher.group(0);
		    		String var = matcher.group(1);
		    		if( fragment.replaceAll(var, "").equals("${}") ) {
			    		boolean isResolved = false;
			    		for (Map<String, String> val : data) {
			    			if( val.containsKey(var)) {
			    				expr = expr.replace(fragment, val.get(var));
			    				matcher = pattern.matcher(expr);
			    				isResolved = true;
			    			}
						}
			    		if( !isResolved ) {
		    				throw new RuntimeException("Can't resolve variable: "+var);
			    		}
		    		} else if( fragment.replaceAll(var, "").equals("()") ) {
	    				throw new RuntimeException("Not implemented eval: "+fragment);
		    		} else {
	    				throw new RuntimeException("Syntax error: "+fragment);
		    		}
		    		break;
		    	case 2:
		    		fragment = matcher.group(0);
		    		String func = matcher.group(1);
		    		String arg1 = matcher.group(2);
		    		if( fragment.replaceAll(func, "").replaceAll(arg1, "").equals("()") ) {
			    		switch( func.toLowerCase() ) {
			    		case "upper":
		    				expr = expr.replace(fragment, arg1.toUpperCase());
			    			break;
			    		case "lower":
		    				expr = expr.replace(fragment, arg1.toLowerCase());
			    			break;
			    		default:
		    				return expr;
			    		}
		    		} else {
	    				throw new RuntimeException("Syntax error: "+fragment);
		    		}
			    	break;
		    	case 3:
		    		fragment = matcher.group(0);
		    		func = matcher.group(1);
		    		arg1 = matcher.group(2);
		    		String arg2 = matcher.group(3);
		    		if( fragment.replaceAll(func, "").replaceAll(arg1, "").replaceAll(arg2, "").equals("(;)") ) {
			    		switch( func.toLowerCase() ) {
			    		case "format":
			    			if( arg2.contains("%") && arg2.contains("f")) {
			    				expr = expr.replace(fragment, String.format(arg2, new Double(arg1)));
			    			} else if( arg2.contains("%") && arg2.contains("d")) {
			    				expr = expr.replace(fragment, String.format(arg2, new Integer(arg1)));
			    			} else if( arg2.contains("%") && arg2.contains("s")) {
			    				expr = expr.replace(fragment, String.format(arg2, arg1));
			    			}
			    			break;
			    		default:
		    				return expr;
			    		}
		    		} else {
	    				throw new RuntimeException("Syntax error: "+fragment);
		    		}
			    	break;
			    default:
    				return expr;
		    	}
		    }
		}
		return expr;
	}

	public static Map<String,String> toMap(String...keyval){
		Map<String,String> map = new HashMap<String,String>();
		
		for(int i=0,max=keyval.length; i<max; i+=2) {
			map.put(keyval[i], keyval[i+1]);
		}
		return map;
	}
	
}
