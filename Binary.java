import java.util.Scanner;

public class Binary{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a decimal number: ");
        int a = input.nextInt();     
        input.close();  

        int[] b = toBinary(a);
        System.out.print("Binary value of "+a+" is ");
        for(int i = 0;i <= b.length-1;i++){    
            System.out.print(b[i]);    
        } 
        
        // double c = toDecimal(b);
        // System.out.println("\n" + c);
        System.out.print("\nBinary value after swapping nibbles is ");
        
        int[] d = swapBinary(b);
        for(int i = 0;i <= d.length-1;i++){    
            System.out.print(d[i]);    
        } 

        double e = toDecimal(d);
        System.out.println("\nDecimal value of swapped nibbles is " + e);
    }
    public static int[] toBinary(int decimal){    
        int binary[] = new int[8];    
        int index = 0;    
        while(decimal > 0){    
            binary[index++] = decimal%2;    
            decimal = decimal/2;    
        }    
        
        // for(int i = index-1;i >= 0;i--){    
        //     System.out.print(binary[i]);    
        // }  
        // System.out.print("\n"); 
        binary = reverseBinary(binary);

        // for(int i = 0;i <= binary.length-1;i++){    
        //     System.out.print(binary[i]);    
        // }  

        // System.out.print("\n"); 
        return binary;
   }   
   public static double toDecimal(int[] binary){
        double decimal = 0;
        binary = reverseBinary(binary);

        // for(int i = 0;i <= binary.length-1;i++){    
        //     System.out.print(binary[i]);    
        // } 
        for(int i = 0; i <= binary.length-1; i++){
            decimal = decimal + (binary[i] * Math.pow(2, i));
        }
        
        return decimal;
   }

   public static int[] swapBinary(int[] binary){
        int[] swappedBinary = new int[binary.length];
        // swappedBinary = reverseBinary(binary);
        // System.out.print("\n");
        // for(int i = 0;i <= binary.length-1;i++){    
        //     System.out.print(binary[i]);    
        // } 
        for(int j = 0; j < binary.length; j++){
            if(j < binary.length/2)
                swappedBinary[j] = binary[(binary.length/2) +j];
            else if(j < binary.length)
                swappedBinary[j] = binary[j-(binary.length/2)];
        }
        
        return swappedBinary;
   }

   public static int[] reverseBinary(int[] binary){
        for(int i = 0; i < binary.length / 2; i++){
            int temp = binary[i];
            binary[i] = binary[binary.length - i - 1];
            binary[binary.length - i - 1] = temp;
        }
        return binary;
   }

}