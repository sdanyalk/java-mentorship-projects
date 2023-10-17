import java.util.Scanner;

public class Main {
    // TODO 1 - Before making any changes, run the MainTest.java file.
    // You should see the output in RED, saying that the tests FAILED.
    // Once you complete this activity, we should have GREEN or successful tests.
    // Make sure the tests run and fail. We need to make sure they are setup correctly.
    public static void main(String[] args) {
        String studentPersonality;
        boolean isMuggleBorn;
        boolean isContinue;

        do {
            System.out.println("Enter student personality from the following:");
            System.out.println("daring, bold, ambitious, determined, clever, wise");
            Scanner scanner = new Scanner(System.in);
            studentPersonality = scanner.nextLine();

            System.out.println("Is student muggle born? (true/false)");
            isMuggleBorn = scanner.nextBoolean();

            String house = sortIntoHouse(studentPersonality, isMuggleBorn);
            System.out.println("You belong in " + house + "!!!");

            System.out.println("Do you wish to continue sorting another student? (true/false)");
            isContinue = scanner.nextBoolean();
        } while (isContinue);
    }

    public static String sortIntoHouse(String studentPersonality, boolean isMuggleBorn) {
        String house = null;

        // TODO 2 - From previous activities, move the IF statements below.
        // TODO 3 - Replace the print statements with making use of the above String variable house.
        // HINT - you will assign the house variable with one of the 4 houses, depending on the IF statement
        // For example, inside the first IF statement, instead of print statement, you will do --> house = "Gryffindor";
        // Do the same for rest of the IF statements.

        // TODO 4 - Once the above steps are completed, run the MainTest.java file again. This time you should see 12
        // tests in GREEN color showing they are successful.

        // This is called Unit Testing. Unit tests allow us to test the flow of the program without manually running
        // each scenario.

        return house;
    }
}
