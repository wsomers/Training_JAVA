package oop;

public class topClass implements interfaceClass {
	
	static int counter = 0;      // static to the Class - can be changed directly
	private String name;         // Private to the Object
	public int age = 30;         // open to the Project(?)
	int id;                      // default  open to the Package(?)
	
	
	public topClass() {          // Constructor 'topClass'  - must be the same name as the class' name)
		//super();
		counter++;
		id = counter;
		System.out.println("New topClass #" + counter + " with no name:" + name);
	}
	
	
	public topClass(String name, int yearsOld) {    //another Constructor and overloading (with arguments)
		//super();
		counter++;
		id = counter;
		System.out.println("New topClass #" + counter + " with name:" + name);
		this.name = name;             //  use   'this'  when variables are not obvious 
		age = yearsOld;
	}

	public String getName() {	// a Getter, since name is Private
		return name;
	}
	
	public void setName(String name) {	// a Setter
		System.out.println("this.name is " + this.name + "   and name is " + name);
		this.name = name;
		System.out.println("this.name is now " + this.name);
	}
	
	public void displayID() {
		System.out.println("My ID is " + id);
	}

	// Interface Methods
	private void methPrivate() {
		System.out.println("I'm a Private Method");
	}
	
	void methDefault() {
		System.out.println("I'm a Default Method");
	}
	
	public void methPublic() {
		System.out.println("I'm a Public Method");
	}
	
	public void usePrivate() {
		methPrivate();
	}
	
	public void displayAll() {
		System.out.print(" ID: " + id);
		System.out.print(" Name: " + name);
		System.out.print(" Age: " + age);
		System.out.println("");
	}
}
