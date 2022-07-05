package lamda;

import java.util.Scanner;
import java.util.function.Predicate;

public class FirstAndLastWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("plz enter your  word: ");
        String word= scanner.nextLine();
        Predicate<String> checkWord=
                w -> w.substring(0,1).equals(w.substring(w.length()-1));
        if (checkWord.test(word)){
            System.out.println("Same word last and first");
        }else System.out.println("first and last word is not equal");
    }
}
