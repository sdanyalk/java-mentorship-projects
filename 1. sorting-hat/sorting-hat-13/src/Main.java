import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    /*
    * There are no specific TODOs in this exercise.
    * Run the program as-is and see how it is working.
    * Then go through the refactored code and bring up any question you might have.
    * This is the final outcome of how you would write menu-driven console program.
    * */
    static ArrayList<String> students = new ArrayList<>();
    public static void main(String[] args) {
        int optionNumberSelected;

        do {
            showMainMenu();

            Scanner scanner = new Scanner(System.in);
            optionNumberSelected = scanner.nextInt();

            switch (optionNumberSelected){
                case 1:
                    sortStudentInHouse();
                    break;
                case 2:
                    listStudents();
                    break;
                default: break;
            }

        } while (optionNumberSelected != 3);
    }

    public static String getHouseStudentBelongsTo(String studentPersonality, boolean isMuggleBorn) {
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
    public static void showMainMenu() {
        System.out.println("===========================================");
        System.out.println("Select option number from the menu below.");
        System.out.println("1. Sort Student");
        System.out.println("2. See sorted student list");
        System.out.println("3. Exit ceremony");
        System.out.println("===========================================");
    }
    public static void sortStudentInHouse() {
        String firstName;
        String lastName;
        String studentPersonality;
        boolean isMuggleBorn;
        String isMuggleBornStr;
        boolean isContinue;
        String isContinueStr;

        Scanner scanner = new Scanner(System.in);

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
            isMuggleBorn = isMuggleBornStr.equals("yes");

            String house = getHouseStudentBelongsTo(studentPersonality, isMuggleBorn);
            System.out.println("You belong in " + house + "!!!");

            students.add(firstName + " " + lastName + " - " + house);

            System.out.println("Do you wish to continue sorting another student? (yes/no)");
            isContinueStr = scanner.next();
            isContinue = isContinueStr.equals("yes");
        } while (isContinue);
    }
    public static void listStudents() {
        System.out.println("Here is the list of students sorted in houses:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
