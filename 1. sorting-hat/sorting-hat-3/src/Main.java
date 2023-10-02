public class Main {
    // The program is hard-coded. In this update we will take input from user and then sort the student into their
    // respective houses.
    public static void main(String[] args) {
        // TODO 1. Change the data type from int to String and remove the assignment (i.e. "= 1" part).
        int studentPersonality = 1;

        // TODO 2. We won't be needing any of these variables. Go ahead and remove them
        int daring = 1, bold = 4;
        int ambitious = 2, determined = 5;
        int clever = 3;

        boolean isMuggleBorn = false;

        // TODO 3. Use Scanner class to take input from the user
        // See if you can figure out using https://www.w3schools.com/java/java_user_input.asp
        // If you need help, the following TODOs guide you setting it up.

        // TODO 4. System out asking the user to enter personality.
        // TODO 5. Initialize the Scanner object.
        // HINT: This is done by: Scanner scanner = new Scanner(System.in);

        // TODO 6. Read the scanner input and save it to studentPersonality variable.
        // HINT: this is done by: studentPersonality = scanner.nextLine();

        // TODO 7. Update the IF statement. Since now studentPersonality variable is of type String, we need to update
        // the comparision.
        if (studentPersonality == daring || studentPersonality == bold) {
            System.out.println("You belong in Gryffindor!!!");
        }
        // TODO 8. Update the IF statement.
        else if ((studentPersonality == ambitious || studentPersonality == determined) && isMuggleBorn == false) {
            System.out.println("You belong in Slytherin!!!");
        }
        // TODO 9. Update the IF statement.
        else if (studentPersonality == clever) {
            System.out.println("You belong in Ravenclaw!!!");
        } else {
            System.out.println("You belong in Hufflepuff!!!");
        }

        // TODO 10. Test the above statements by entering personalities in the intelliJ console. You might have to
        // click on the console once you run the program.

        // TODO 11. If you are using the "==" operator in the above IF statements, is the program working as intended?
        // If it is not working as intended, why? Look into "string comparision in java". Here is some help article:
        // https://www.baeldung.com/java-compare-strings

        // How would you go about fixing it?
        // HINT: use .equals method instead of ==

        // TODO Challenge:
        // We have removed hard-coding when it comes to student personalities. Great job on completing that!
        // But there is still one more variable that is hard-coded.
        // See if you can get input from user for isMuggleBorn variable and remove hard-coding from the program completly!
        //----------------------------------------------------------------------------------
        // Give it a try before looking at the HINT section below.
        //----------------------------------------------------------------------------------


        // HINT:
        // 1. Update boolean variable isMuggleBorn to remove the default assignment (remove "= false" part in declaration).
        // 2. System out the question for example: "Is the student muggle born?".
        // 3. Use scanner to read boolean value by using scanner.nextBoolean()
        // 4. Assign the value from point 3 to isMuggleBorn variable.
        // 5. Test out the code.
    }
}
