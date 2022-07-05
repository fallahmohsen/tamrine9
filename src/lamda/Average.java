package lamda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Average {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("plz enter your first number:");
        double number1= scanner.nextDouble();
        System.out.println("plz enter your second number:");
        double number2= scanner.nextDouble();
        BiFunction<Double,Double,Double> average= (a, b) -> (a+b)/2;
        System.out.format("The average of two numbers %.2f and %.2f is equal to %.2f.",
                number1,number2,average.apply(number1,number2));
    }
}
