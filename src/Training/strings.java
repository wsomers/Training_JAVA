package Training;

public class strings {

	public static void main(String[] args) {
	
		String bookTitle = "The Lord of the Rings";
		String findWord = "Ring";
		
		if (bookTitle.contains(findWord)) {
			System.out.println("Found " + findWord);
		}
		
		String firstName = "Tim";
		String lastName = "Jones";
		String ssn = "734958240";
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0, 1));
		System.out.print(ssn.substring(5));
		System.out.print("\n");
		
		System.out.println("Length of ssn: " + ssn.length());
				

	}

}
