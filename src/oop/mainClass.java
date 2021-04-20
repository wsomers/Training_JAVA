package oop;

public class mainClass {

	public static void main(String[] args) {

		topClass t1 = new topClass();
		t1.setName("Jude");

		//t1.name = "Harry";       // name is private  -> "The field topClass.name is not visible"
		System.out.println(t1.getName());
		
		System.out.println(t1.age);
		t1.age = 25;               // age is not private
		System.out.println(t1.age);
		
		//topClass.age = 50;        // "Cannot make a static reference to the non-static field topClass.age"
		topClass.counter = 50;
				
		topClass t2 = new topClass("Bob", 17);
		System.out.println(t2.age);
		 
		subClass s1 = new subClass();              // uses Constructor from topClass  
		//subClass s2 = new subClass("Tom", 53);   // "The constructor subClass(String, int) is undefined"
		System.out.println(t1.age);
				
		//System.out.println(t1.getTest());      // only subClass had Test
		System.out.println(s1.getTest());
		
		
		t2.displayID();
		s1.displayID();
		
		s1.methPublic();
		s1.methDefault();
		//s1.methPrivate();       // "The method methPrivate() from the type topClass is not visible"
		s1.usePrivate();          // calls methPrivate() from within the class
		
        t1.displayAll();
        t2.displayAll();
        s1.displayAll();
        
        interfaceClass i1 = new topClass();      // can do this because topClass does implement interfaceClass
        //i1.setName("Ken");                     // "The method setName(String) is undefined for the type interfaceClass"
        i1.displayAll();                         // name is 'null'
        
        interfaceClass s2 = new subClass();      // can do this because subClass extends topClass, which implements interfaceClass
        //s2.test();                             // "The method test() is undefined for the type interfaceClass"
        s2.displayAll();                         // name is 'null'
	}

}
