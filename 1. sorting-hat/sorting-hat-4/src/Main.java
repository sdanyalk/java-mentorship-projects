import java.util.Scanner;

public class Main {
    // The sorting hat program currently works only on ONE student. Headmaster Dumblebdore mentioned that there can be
    // 100 first year students that need to be sorted.
    // Lets update the program to loop through 100 students.

    public static void main(String[] args) {
        String studentPersonality;
        boolean isMuggleBorn;

        // TODO 1: Add a for loop that runs 100 times asking the same question.
        // all the code below will come inside the for loop
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
    }
}
