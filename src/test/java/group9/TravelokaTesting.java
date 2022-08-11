package group9;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;

//run multiple classes

import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({

//call your classes that contain the test cases
	tanyiqing.class,
	defitri.class,
	yungcheekai.class

})

// any class name

public class TravelokaTesting {}