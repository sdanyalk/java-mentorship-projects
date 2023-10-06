import java.util.Scanner;

public class Main {
    // The program runs fine but we can refactor our code a bit.
    // We know that when the program starts, there will always be one student information to enter.
    // So let's refactor the code a bit to factor that in.
    public static void main(String[] args) {
        String studentPersonality;
        boolean isMuggleBorn;
        // TODO 1: remove the assignment part. We want to just keep declaration part.
        // HINT: everything including and after "=" is considered assignment. Every before "=" is declaration.
        boolean isContinue = true;

        // We will replace while with do-while loop
        // https://www.geeksforgeeks.org/java-do-while-loop-with-examples/#

        // TODO 2: Replace while with do and remove the condition.
        // HINT: do {
        while (isContinue){
            System.out.println("Enter student personality from the following:");
            System.out.println("daring, bold, ambitious, determined, clever, wise");
            Scanner scanner = new Scanner(System.in);
            studentPersonality = scanner.nextLine();

            System.out.println("Is student muggle born? (true/false)");
            isMuggleBorn = scanner.nextBoolean();

            if (studentPersonality.equals("daring") || studentPersonality.equals("bold")) {
                System.out.println("You belong in Gryffindor!!!");
            } else if ((studentPersonality.equals("ambitious") || studentPersonality.equals("determined")) && !isMuggleBorn) {
                System.out.println("You belong in Slytherin!!!");
            } else if (studentPersonality.equals("clever") || studentPersonality.equals("wise")) {
                System.out.println("You belong in Ravenclaw!!!");
            } else {
                System.out.println("You belong in Hufflepuff!!!");
            }

            System.out.println("Do you wish to continue sorting another student? (true/false)");
            isContinue = scanner.nextBoolean();
        }
        // TODO 3: add while at the end here with the condition that you used previously on the top.
    }
}
