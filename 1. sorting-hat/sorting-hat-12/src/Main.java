import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String studentPersonality;
        String firstName;
        String lastName;
        boolean isMuggleBorn;
        String isMuggleBornStr;
        boolean isContinue;
        String isContinueStr;

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        do {
            System.out.println("Enter student's first name:");
            firstName = scanner.next();

            System.out.println("Enter student's last name:");
            lastName = scanner.next();

            System.out.println("Enter student personality from the following:");
            System.out.println("daring, bold, ambitious, determined, clever, wise");
            studentPersonality = scanner.next();

            System.out.println("Is student muggle born? (yes/no)");
            isMuggleBornStr = scanner.next();
            if (isMuggleBornStr.equals("yes")) {
                isMuggleBorn = true;
            } else {
                isMuggleBorn = false;
            }

            String house = sortIntoHouse(studentPersonality, isMuggleBorn);
            System.out.println("You belong in " + house + "!!!");

            students.add(firstName + " " + lastName + " - " + house);

            System.out.println("Do you wish to continue sorting another student? (yes/no)");
            isContinueStr = scanner.next();
            if (isContinueStr.equals("yes")) {
                isContinue = true;
            } else {
                isContinue = false;
            }
        } while (isContinue);

        System.out.println("Here is the list of students sorted in houses:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public static String sortIntoHouse(String studentPersonality, boolean isMuggleBorn) {
        String house;

        if (studentPersonality.equals("daring") || studentPersonality.equals("bold")) {
            house = "Gryffindor";
        } else if ((studentPersonality.equals("ambitious") || studentPersonality.equals("determined")) && !isMuggleBorn) {
            house = "Slytherin";
        } else if (studentPersonality.equals("clever") || studentPersonality.equals("wise")) {
            house = "Ravenclaw";
        } else {
            house = "Hufflepuff";
        }

        return house;
    }
}
