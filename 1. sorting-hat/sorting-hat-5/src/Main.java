import java.util.Scanner;

public class Main {
    // The program works and is able to run for more than one student, but it is now hard-coded again. Looks like
    // the only choice is that it will run for only 100 students. Headmaster says that this is ridiculous! The number
    // of first year students changes every year.
    // We need to find a better solution.
    // How about if we give the option to enter student details if they wish? otherwise shut down the program.
    // Let's see how to go about it.
    public static void main(String[] args) {
        String studentPersonality;
        boolean isMuggleBorn;
        // TODO 1: Create a new boolean variable, call it isContinue, and initialize it with the value true.

        // TODO 2: Replace the for loop with while loop.
        // See how to use while loop here: https://www.w3schools.com/java/java_while_loop.asp
        // Since while loop requires a condition, you would be using previously created boolean variable isContinue.
        // While loop will keep running until the condition becomes false.
        for (int i = 0; i < 100; i++) {
            System.out.println("Enter student personality from the following:");
            System.out.println("daring, bold, ambitious, determined, clever, wise");
            Scanner scanner = new Scanner(System.in);
            studentPersonality = scanner.nextLine();

            System.out.println("Is student muggle born? (true/false)");
            isMuggleBorn = scanner.nextBoolean();

            if (studentPersonality.equals("daring") || studentPersonality.equals("bold")) {
                System.out.println("You belong in Gryffindor!!!");
            } else if ((studentPersonality.equals("ambitious") || studentPersonality.equals("determined")) && isMuggleBorn == false) {
                System.out.println("You belong in Slytherin!!!");
            } else if (studentPersonality.equals("clever") || studentPersonality.equals("wise")) {
                System.out.println("You belong in Ravenclaw!!!");
            } else {
                System.out.println("You belong in Hufflepuff!!!");
            }

            // TODO 3: Using sout ask the user if they which to continue.
            // The answer should be true or false.
            // use scanner to read the value into isContinue.
        }
    }
}
