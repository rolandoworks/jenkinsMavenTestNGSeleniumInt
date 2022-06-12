package com.rdiaz.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator myCal = new JenkinsCalculator();
		assertEquals(10, myCal.add(5, 5));
	}
	
	@Test
	public void subtractTest() {
		JenkinsCalculator myCal = new JenkinsCalculator();
		assertEquals(5, myCal.subtract(10, 5));
	}

}
