import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");
        float number1 = 0;
        float number2 = 0;
        float result = 0;
        String operation = "";
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        number2 = input.nextFloat();
        System.out.print("Enter the operation (+ - * /): ");
        operation = input.next();

        switch (operation){
            case "+":
                result = number1 + number2;
                System.out.println(number1 + " + " +number2 + " = "+result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " +number2 + " = "+result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " +number2 + " = "+result);
                break;
            case "/":
                if (number2 == 0) System.out.println("Cannot divide by 0! Math error!");
                else {
                result = number1 / number2;
                System.out.println(number1 + " / " +number2 + " = "+result);}
                break;
            default:
                System.out.println("Invalid Operation! Try again please!");
        }

    }
}