import java.util.Scanner;

public class TemperatureConversion{
    public static void main(String[] args) {

        System.out.println("1. Fahrenheit to Celsius \n 2. Celsius to Fahrenheit");
        System.out.print("Please select an option: ");
        Scanner input = new Scanner(System.in);     
        int option = input.nextInt();
        
        if(option == 1){
            System.out.print("Enter the temperature in Fahrenheit to convert: ");
            int temperature = input.nextInt();
            temperatureConversion(temperature, option);
        } else if(option == 2){
            System.out.print("Enter the temperature in Celsius to convert: ");
            int temperature = input.nextInt();
            temperatureConversion(temperature, option);
        } else{
            System.out.println("Invalid Selection.");
        }
        input.close();
    }
    static void temperatureConversion(int temperature, int option){

        if(option == 1){
            double toCelsius = (temperature - 32) * 5/9; 
            System.out.print(temperature + " degree Fahrenheit is equal to " + toCelsius + " degree Celsius.");
        } else if (option == 2){
            double toFahrenheit = (temperature * 9/5) + 32;
            System.out.print(temperature + " degree Celsius is equal to " + toFahrenheit + " degree Fahrenheit.");
        }
       
    }
}