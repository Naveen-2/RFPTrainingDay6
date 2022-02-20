import java.util.*;

public class ReverseNumber{
	
	public static void main (String[] args){
		System.out.print("Enter a number to reverse: ");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.close();
		int remainder, reverse = 0;
		for(;N != 0;){  
			remainder = N % 10;  
			reverse = reverse * 10 + remainder;  
			N = N/10;  
		} 	
		System.out.print("Reversed number is " + reverse); 		
	}
	
}