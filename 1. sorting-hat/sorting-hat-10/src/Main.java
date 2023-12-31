import java.util.Scanner;

public class Main {
    // You might have noticed that we need to know number of students before hand. This is required for array size.
    // If we don't have a number, we cannot create an array. In this activity we will look at a more advance
    // data structure that doesn't require size to be defined beforehand. This is called ArrayList.
    // Read more about ArrayList: https://www.w3schools.com/java/java_arraylist.asp
    public static void main(String[] args) {
        String studentPersonality;
        String firstName;
        String lastName;
        boolean isMuggleBorn;
        boolean isContinue;
        // TODO 1: We don't need studentCount and index variables since we won't be using the array. Remove these vars.
        int studentCount;
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        // TODO 2: Remove the next two lines since we won't be asking about number of students.
        System.out.println("How many students will go through the Sorting Hat ceremony?");
        studentCount = scanner.nextInt();

        // TODO 3: Instead of an array of students, change this to ArrayList. See the previous article.
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

            // TODO 4: Since we are using ArrayList, replace this with "add()" function of ArrayList
            students[index] = firstName + " " + lastName + " - " + house;
            // TODO 5: Remove index variable. We don't need it.
            index++;

            System.out.println("Do you wish to continue sorting another student? (true/false)");
            isContinue = scanner.nextBoolean();
        } while (isContinue);

        System.out.println("Here is the list of students sorted in houses:");
        // TODO 6: Update the for loop for ArrayList.
        // HINT: See section "Loop Through an ArrayList" of the above article.
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
