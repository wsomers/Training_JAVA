package Training;

public class funtions {
	public static void main(String[] args) {
		printName();
		
		int A = 5;
		int B = 3;
		
		addNumbers(A,B);
		
		System.out.println("product of " + A + " and " + B +" is " + multiplyNumbers(A,B));
		
		sumOfSquares(A,B);
		
	}
	
	static void printName() {                   // nothing passed or returned
		System.out.println("What's your name?");
	}
	
	static void addNumbers(int x, int y) {      // passing values
		int sum = x + y;
		System.out.println("sum of " + x + " and " + y +" is " + sum);
	}
	
	static int multiplyNumbers(int x, int y) {  // returning 'int' value
		int product = x * y;	
		return product;
	}
	
	static void sumOfSquares(int x, int y) {    // fuctionls calling functions
		addNumbers(multiplyNumbers(x,x), multiplyNumbers(y,y));
	}
		
}

