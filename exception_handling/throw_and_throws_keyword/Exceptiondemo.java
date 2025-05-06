package exception_handling.try_catch;
 
public class Exceptiondemo {
	public static void divide(int a,int b) {
		int result;
		try {
			//12/8
			//16/0
			result=a/b;
			//line 11 will execute when no error in 9th line
			System.out.println(result);	
		}
	catch(Exception e) {
		System.err.println(e.getMessage());
	}
		//in final block can be used to close database connections
		finally {
			System.out.println("hello welcome");
		}
	}
}

