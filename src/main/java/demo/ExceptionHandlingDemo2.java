package demo;

public class ExceptionHandlingDemo2 {
public static void main(String[] args) {
	try {
	System.out.println("Hello world \n hello");
	int i =1/0;
	System.out.println("Execution Completed ");
	}
	catch (Exception exp) {
		System.out.println("I am inside try and catch block");
		System.out.println("Message is : "+ exp.getMessage());
		System.out.println("Message is: "+ exp.getCause());
		exp.printStackTrace();
	}
	finally {
		System.out.println("I am inside finally block");
	}
}
}
