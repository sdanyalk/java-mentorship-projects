import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String studentPersonality;
        String firstName;
        String lastName;
        boolean isMuggleBorn;
        boolean isContinue;
        int studentCount;
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students will go through the Sorting Hat ceremony?");
        studentCount = scanner.nextInt();

        String[] students = new String[studentCount];

        do {
            System.out.println("Enter student's first name:");
            firstName = scanner.next();

            System.out.println("Enter student's last name:");
            lastName = scanner.next();

            System.out.println("Enter student personality from the following:");
            System.out.println("daring, bold, ambitious, determined, clever, wise");
            studentPersonality = scanner.next();

            System.out.println("Is student muggle born? (true/false)");
            isMuggleBorn = scanner.nextBoolean();

            String house = sortIntoHouse(studentPersonality, isMuggleBorn);
            System.out.println("You belong in " + house + "!!!");

            students[index] = firstName + " " + lastName + " - " + house;
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
