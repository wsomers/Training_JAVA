package Training;

public class loops {

	public static void main(String[] args) {

		String[] cities = {"NY", "LA", "Dallas", "Tampa"};
	// do-while
		int i=0;
		do {
			System.out.println(cities[i]);
			i = i +1;
		}	while (i<4);
		
	// While
		int n=0;
		boolean foundit = false;
		while (n<4 && !foundit) {
			if (cities[n] == "Cleveland") {
				System.out.println(cities[n]);
				foundit = true;
			}
			n++;
		}
		
	// for loop
		for (int x = 0; x < 4; x++) {
			System.out.println(cities[x]);
		}

	}

}
