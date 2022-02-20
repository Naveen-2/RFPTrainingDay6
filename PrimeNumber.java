import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a prime number: ");
        int n = input.nextInt();
        input.close();
        boolean isPrime = true;
        
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.println(n + " is not a prime number.");
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(n + " is a prime number.");
        }
    }
}