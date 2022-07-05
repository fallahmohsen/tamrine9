package lamda;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Average {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("plz enter your first number:");
                double number1 = scanner.nextDouble();
                System.out.println("plz enter your second number:");
                double number2 = scanner.nextDouble();
                BiFunction<Double, Double, Double> average = (a, b) -> (a + b) / 2;
                System.out.println("average is :" + average.apply(number1, number2));
                break;
            } catch (InputMismatchException e) {
                System.out.println("wrong number");
            }
        }
    }
}
