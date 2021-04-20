package Training;

public class arrays {
	public static void main(String[] args) {
	// opt 1	
		// Declare, define, and assign Array
		String[] cities = {"NY", "LA", "Dallas", "Tampa"};
		System.out.println(cities[1]);
		
	// opt 2
		// Declare and define Size
		String[] states = new String[4];
		// Assign
		states[0] = "New York";
		states[1] = "Califonia";
		states[2] = "Texas";
		states[3] = "Florida";
		System.out.println(states[1]);
		
	// opt 3
		// Declare
		String[] countries;
		// Define
		countries = new String[3];
		// Assign
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[0]);
				
				
	}

}
