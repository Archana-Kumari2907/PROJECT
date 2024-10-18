import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
        
        System.out.println("Unit Converter");
        System.out.println("Choose a conversion type:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Kilograms to Pounds");
        System.out.println("4. Pounds to Kilograms");
        System.out.println("5. Celsius to Fahrenheit");
        System.out.println("6. Fahrenheit to Celsius");
        System.out.println("7.exit");
         choice = scanner.nextInt();


        switch (choice) {
            case 1:
                System.out.print("Enter kilometers: ");
                double kilometers = scanner.nextDouble();
                double miles = kilometersToMiles(kilometers);
                System.out.println(kilometers + " km = " + miles + " miles");
                break;
            case 2:
                System.out.print("Enter miles: ");
                miles = scanner.nextDouble();
                kilometers = milesToKilometers(miles);
                System.out.println(miles + " miles = " + kilometers + " km");
                break;
            case 3:
                System.out.print("Enter kilograms: ");
                double kilograms = scanner.nextDouble();
                double pounds = kilogramsToPounds(kilograms);
                System.out.println(kilograms + " kg = " + pounds + " lbs");
                break;
            case 4:
                System.out.print("Enter pounds: ");
                pounds = scanner.nextDouble();
                kilograms = poundsToKilograms(pounds);
                System.out.println(pounds + " lbs = " + kilograms + " kg");
                break;
            case 5:
                System.out.print("Enter Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " °C = " + fahrenheit + " °F");
                break;
            case 6:
                System.out.print("Enter Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " °F = " + celsius + " °C");
                break;
            
             case 7:
             System.out.println("exit from program");   
             break;

           
            default:
                System.out.println("Invalid choice.");
        }

    
    
    }while(choice!=8);
}

    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}