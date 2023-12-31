import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Let us make our application a little more user friendly.
    // At two points in the application we are asking user a question and expecting them to answer with: true or false.
    // Non-technical people don't understand what this means.
    // A better way would be to ask them a question and expect: yes or no.
    // Let us update the application to capture yes/no answer.
    public static void main(String[] args) {
        String studentPersonality;
        String firstName;
        String lastName;
        boolean isMuggleBorn;
        // TODO 1: Create a new String var called isMuggleBornStr.
        boolean isContinue;
        // TODO 2: Create a new String var called isContinueStr.

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

            // TODO 3: Update the end of the question statement with (yes/no) instead.
            System.out.println("Is student muggle born? (true/false)");
            // TODO 4: We want to capture yes/no now instead of true/false.
            // For that we cannot use nextBoolean() anymore since yes/no will be String
            // Using the isMuggleBornStr, replace the below to capture yes or no.
            isMuggleBorn = scanner.nextBoolean();

            // TODO 5: Now we need to capture yes/no to true/false.
            // use an IF statement to convert yes/no to true/false
            // This will done like: If isMuggleBornStr equals "yes" then set isMuggleBorn to true. Otherwise

            String house = sortIntoHouse(studentPersonality, isMuggleBorn);
            System.out.println("You belong in " + house + "!!!");

            students.add(firstName + " " + lastName + " - " + house);

            // TODO 6: Do the same thing here that you did in TODO 6.
            System.out.println("Do you wish to continue sorting another student? (true/false)");
            isContinue = scanner.nextBoolean();
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
