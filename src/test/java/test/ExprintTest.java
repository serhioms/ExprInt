package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.exprint.TestCalcSet;
import test.calc.TestCalc;
import test.sets.TestSets;
import test.setsorig.TestSetsOrig;

@RunWith(Suite.class)
@SuiteClasses({ TestCalc.class, TestCalcSet.class, TestSets.class, TestSetsOrig.class })
public class ExprintTest {

}
