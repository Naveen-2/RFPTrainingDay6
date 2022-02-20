import java.util.Scanner;

public class ToBinary{
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Please enter a decimal number: ");
        int a = input.nextInt();     
        input.close();  

        int[] b = toBinary(a);
        System.out.print("Binary value of "+a+" is ");
        for(int i = 0;i <= b.length-1;i++){    
            System.out.print(b[i]);    
        } 
    }

    public static int[] toBinary(int decimal){    
        int binary[] = new int[8];    
        int index = 0;    
        while(decimal > 0){    
            binary[index++] = decimal%2;    
            decimal = decimal/2;    
        }    
        
        binary = reverseBinary(binary);

        return binary;
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