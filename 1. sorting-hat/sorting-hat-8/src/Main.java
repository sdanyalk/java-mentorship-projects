import java.util.Scanner;
public class Main {
    // In this exercise we are going to store the house information in an array.
    public static void main(String[] args) {
        String studentPersonality;
        boolean isMuggleBorn;
        boolean isContinue;
        // TODO 1 - create two integer variables called studentCount and index. Assign 0 to index as default value.

        // TODO 2 - Move the initialization of Scanner object here.
        // HINT - From the code in the do-while-loop copy the line: Scanner scanner = new Scanner(System.in);
        // Remove that copied line from the do-while-loop

        // TODO 3 - Ask the user how many students do they want to enter for the Sorthing Hat Ceremony.
        // TODO 4 - store the answer in the newly created variable studentCount.

        // TODO 5 - Create a String array called students, and set the size of the array by using studentCount
        // HINT - see section "Instantiating an Array in Java" in https://www.geeksforgeeks.org/arrays-in-java/#

        do {
            System.out.println("Enter student personality from the following:");
            System.out.println("daring, bold, ambitious, determined, clever, wise");
            studentPersonality = scanner.next();

            System.out.println("Is student muggle born? (true/false)");
            isMuggleBorn = scanner.nextBoolean();

            String house = sortIntoHouse(studentPersonality, isMuggleBorn);
            System.out.println("You belong in " + house + "!!!");

            // TODO 6 - Assign the value from the variable house to the student array.
            // You will have to make use of variables index and house.
            // TODO 7 - increment the value of variable index by 1.

            System.out.println("Do you wish to continue sorting another student? (true/false)");
            isContinue = scanner.nextBoolean();
        } while (isContinue);

        // TODO 8 - Use a for loop to print the values of the array students.
        // HINT - see section "Accessing Java Array Elements using for Loop" in https://www.geeksforgeeks.org/arrays-in-java/#
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

    // HINT - If you are stuck anywhere check "sorting-hat-9"
}
