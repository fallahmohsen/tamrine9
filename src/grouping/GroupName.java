package grouping;

import java.util.*;
import java.util.stream.Collectors;

public class GroupName {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        ArrayList(name);

    }


    private static void ArrayList(List<String> names) {
        boolean flag = true;
        while (flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Do you want to add a new number,press 1 or not press 2");
                int selectedNumber = scanner.nextInt();
                if (selectedNumber == 1) {
                    System.out.print("plz enter your name: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.nextLine();
                    names.add(name);
                } else if (selectedNumber == 2) flag = false;
                else throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("wrong number plz enter 1 or 2.");
            }

        }
    }
}
