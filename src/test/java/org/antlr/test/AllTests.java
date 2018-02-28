package org.antlr.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalc.class, TestCalcSet.class, TestSets.class, TestSetsOrig.class })
public class AllTests {

}
