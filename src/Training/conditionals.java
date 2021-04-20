package Training;

public class conditionals {
	public static void main(String[] args) {
		
		int temp = 55;
		String day = "M";
		
		if (temp > 80) {
			System.out.println("hot");
		}
		else if (temp >60) {
			System.out.println("not so hot");
		}
		else {
			System.out.println("cold");
		}

		switch (day) {
			case "M" : 
				System.out.println("Monday");
				break;
			case "T" : 
				System.out.println("Tuesday");
				break;
			case "W" : 
				System.out.println("Wednesday");
				break;
		}
	}
}
