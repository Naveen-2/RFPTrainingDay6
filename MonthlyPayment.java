import java.util.Scanner;

public class MonthlyPayment{
    
    public static void main(String args[]) {
    	int P = Integer.parseInt(args[0]);
        int Y = Integer.parseInt(args[1]);
        int R = Integer.parseInt(args[2]);
    	monthlyPayment(P, Y, R);
    }

    public static void monthlyPayment(int P, int Y, double R) {
        double n = 12 * Y;
        double r = R / (12 * 100);
        double payment = (P * r) / (1 - Math.pow((1 + r), -n));
        System.out.println("MonthlyPayment:" + payment);
    }

}