package demo;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str = "Selenium";
//String reversed = new StringBuilder(str).reverse().toString();
//System.out.println("Reversed String: "+ reversed);
//	}



//Reverse Integers

//public void reverseIntegers() {
	int num = -123456789;
	int reversed = 0;

	while (num != 0) {
	    int digit = num % 10;
	    reversed = reversed * 10 + digit;
	    num = num / 10;
	}

	System.out.println("Reversed number: " + reversed); 
}}
