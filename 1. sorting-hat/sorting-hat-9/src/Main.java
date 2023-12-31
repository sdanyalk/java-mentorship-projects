import java.util.Scanner;

public class Main {
    // From the previous activity you can see we are successfully able to store student house information and display it.
    // But the information that is displayed is just a bunch of houses. We don't know which student belongs to which
    // house. In this activity we will gather more information.
    public static void main(String[] args) {
        String studentPersonality;
        // TODO 1: Create two string variables firstName and lastName. These will be used to store student's name.
        boolean isMuggleBorn;
        boolean isContinue;
        int studentCount;
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students will go through the Sorting Hat ceremony?");
        studentCount = scanner.nextInt();

        String[] students = new String[studentCount];

        do {
            // TODO 2: use sout to get student's first name and make use of firstName variable to store the input.

            // TODO 2: use sout to get student's last name and make use of lastName variable to store the input.

            System.out.println("Enter student personality from the following:");
            System.out.println("daring, bold, ambitious, determined, clever, wise");
            studentPersonality = scanner.next();

            System.out.println("Is student muggle born? (true/false)");
            isMuggleBorn = scanner.nextBoolean();

            String house = sortIntoHouse(studentPersonality, isMuggleBorn);
            System.out.println("You belong in " + house + "!!!");

            // TODO 3: update this to store first and last name with the house.
            // HINT: we have to use String concatenation here.
            // More info here: https://www.javatpoint.com/string-concatenation-in-java.
            // Use "+" operator
            students[index] = house;
            index++;

            System.out.println("Do you wish to continue sorting another student? (true/false)");
            isContinue = scanner.nextBoolean();
        } while (isContinue);

        System.out.println("Here is the list of students sorted in houses:");
        for (int i=0; i < students.length; i++) {
            System.out.println(students[i]);
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
