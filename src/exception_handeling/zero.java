package exception_handeling;

public class zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        doMath(12,3);
        doMath(12,0);
	}

	
	public static void doMath(int a, int b) {
		
		try {
		    int c = a/b;
		    System.out.println("Answer: " + c);
		}catch(ArithmeticException e) {
			System.out.println("Answer: error");
		    System.out.println(e.toString());	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Answer: another error");
		    System.out.println(e.toString());	
		}finally {
			System.out.println("This always runs");
		}
		System.out.println("end of doMath.\n");
	}
}
