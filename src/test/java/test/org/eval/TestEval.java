package test.org.eval;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static test.org.eval.UtilEval.toMap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class TestEval {

	private String match(String str, Pattern pattern) {
		Matcher matcher = pattern.matcher(str);
	    while( matcher.find() ) {
	    	int groupCount = matcher.groupCount();
	    	String result = "["+groupCount+"]";
	    	for(int i=1; i<=groupCount; i++){
	    		result += "["+matcher.group(i)+"]";
	    	}
   			return result;
	    }
		return null;
	}
	
	@Test
	public void test1() {
		try {
			assertEquals("[1][96.05999999999996]", match("format(${96.05999999999996},%3.2f)%", Pattern.compile("\\$\\{(.*?)\\}")));
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}


	@Test
	public void test2() {
		try {
			assertEquals("[3][format][96.05999999999996][%3.2f]", match("format(96.05999999999996;%3.2f)%", Pattern.compile("(.*?)\\((.*?)\\;(.*?)\\)")));
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void test3() {
		try {
			assertEquals("[1][3.2]", match("%3.2f", Pattern.compile("%(.*?)f")));
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void test4() {
		try {
			assertEquals("String", UtilEval.eval("String"));
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void test5() {
		try {
			assertEquals("BlaBlaBla", UtilEval.eval("${label}", toMap("label", "BlaBlaBla")));
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void test6() {
		try {
			assertEquals("50.56%", UtilEval.eval("format(${quantity};%3.2f)%", toMap("quantity","50.555555555")));
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void test8() {
		try {
			assertEquals("BLABLABLA", UtilEval.eval("upper(blablabla)"));
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void test9() {
		try {
			assertEquals("blablabla", UtilEval.eval("lower(BLABLABLA)"));
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
