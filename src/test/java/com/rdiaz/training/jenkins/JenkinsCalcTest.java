package com.rdiaz.training.jenkins;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator myCal = new JenkinsCalculator();
		AssertJUnit.assertEquals(10, myCal.add(5, 5));
	}

	@Test
	public void subtractTest() {
		JenkinsCalculator myCal = new JenkinsCalculator();
		AssertJUnit.assertEquals(5, myCal.subtract(10, 5));
	}

}
