package Training;

public class fibinnaciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("fib(0) " + fib(0));
		System.out.println("fib(1) " + fib(1));
		System.out.println("fib(2) " + fib(2));
		System.out.println("fib(3) " + fib(3));
		System.out.println("fib(40) " + fib(40));

	}
	
	public static int fib(int n) {
		if (n==0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return (fib(n-1) + fib(n-2));
		}
	}

}
