import java.util.Scanner;

public class CouponNumbers
{
	public static void main(String[] args) 
	{
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		int max=1000000000;
		int random=(int) (Math.random()*max);	
        //System.out.println(random);
		StringBuffer sb=new StringBuffer();
		
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
           // System.out.println(sb);
            //System.out.println(random);
			random /= chars.length;
            System.out.println(random + "\n");
		}

		//String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	
	}
}