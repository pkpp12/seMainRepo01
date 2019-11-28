package se.maven.example;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
@RunWith(Categories.class)
@IncludeCategory(functionGroup1Test.class)
@SuiteClasses({ AppTest.class, SimpleCalculatorTest.class, WeiredAddInSimpleCalculatorTest.class })
public class AllTests {

}
