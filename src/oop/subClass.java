package oop;

public class subClass extends topClass {   // inherits everything from topClass (except multiple Constructors) and adds to it
	
	private String test = "pass";

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
	@Override
	public void displayID() {         // overriding the displayID in topClass
		System.out.println("My ID is " + id + " (subClass)");
	}

}
