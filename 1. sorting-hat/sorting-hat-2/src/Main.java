public class Main {
    // Headmaster Dumbledore has requested few more student personalities to be added in determination
    // of which school house the students belong. Update the program based on the new requirements.
    public static void main(String[] args) {
        int studentPersonality = 1;

        // TODO 1. Create 3 more personalities like before: bold, determined, and wise.
        int daring = 1;
        int ambitious = 2;
        int clever = 3;

        // TODO 2. Update the IF statement based on:
        //        If the student is daring or bold, print "You belong in Gryffindor!!!"
        if (studentPersonality == daring) {
            System.out.println("You belong in Gryffindor!!!");
        }
        // TODO 3. Update the IF statement based on:
        //      If the student is ambitious or determined, print "You belong in Slytherin!!!"
        else if (studentPersonality == ambitious || studentPersonality == determined) {
            System.out.println("You belong in Slytherin!!!");
        }
        // TODO 4. Update the IF statement based on:
        //        If the student is clever or wise, print "You belong in Ravenclaw!!!"
        else if (studentPersonality == clever) {
            System.out.println("You belong in Ravenclaw!!!");
        } else {
            System.out.println("You belong in Hufflepuff!!!");
        }

        // TODO 5. Test the above statements by manually changing the values of studentPersonality to output each
        // print statement.

        // TODO Challenge:
        // Headmaster Dumbledore has added a strict condition for House Slytherin. The condition is that if the
        // student is muggle born (parents of student are muggles) they cannot be part of the Slytherin House,
        // even if they show Slytherin house personality (like ambitious and determined).
        // This requires updating the IF condition for Slytherin and adding a
        // clause where the student is NOT muggle born.
        //----------------------------------------------------------------------------------
        // Give it a try before looking at the HINT section below.
        //----------------------------------------------------------------------------------


        // HINT:
        // 1. Create a boolean variable isMuggleBorn and set it to false.
        // 2. Update the IF statement to add a clause which checks to see that isMuggleBorn is false.
        // 3. Since this is strict rule that needs to be always met, we cannot use the OR (||) logical operator.
    }
}
