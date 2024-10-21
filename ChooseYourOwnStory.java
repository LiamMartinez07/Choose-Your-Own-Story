import java.util.Scanner;

public class ChooseYourOwnStory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating the variables
        int healthPoints = 100;
        int funPoints = 0;
        int confidencePoints = 0;

        // Explaining the story
        System.out.println(
                "You are asleep. When you wake up you will have to try to maximize your fun and confidence throughout the day while minimizing the health you lose. Are you ready? Respond with 'yes' or 'no.'");
        String answer = sc.nextLine();
        // decision one
        if (answer.equals("yes")) {
            System.out.println("You died. Next time don't be ready, scammer.");
        }
        // decision one, line one
        else if (answer.equals("no")) {
            System.out
                    .println(
                            "Perfect! Now that you'nore awake, do you want to go back to sleep, or study for school? Respond with 'sleep' or 'study'");
            // decision one, line two
            String sleepOrStudyDecision = sc.nextLine();
            // decision two, line one
            if (sleepOrStudyDecision.equals("sleep")) {
                System.out.println("You've decided to sleep, gaining 5 health points, and gaining 10 fun points!");
                healthPoints += 5;
                funPoints += 10;
                System.out.println(
                        "Now that you're done with your early morning decisions, do you want to eat breakfast? Respond with 'yes' or 'no'");
                String eatBreakfastOrNO = sc.nextLine();
                // decision three, line one
                if (eatBreakfastOrNo.equals("yes")) {
                    System.out.println(
                            "Good job you healthy individual! What food would you like to eat? Respond with 'cheerios' or 'raw fish'.");
                }
            }
            // decision two, line two
            else if (sleepOrStudyDecision.equals("study")) {
                System.out
                        .println("You've decided to study, gaining 20 confidence points, but losing 10 health points");
                healthPoints -= 10;
                confidencePoints += 20;

                System.out.println(
                        "Now that you're done with your early morning decisions, do you want to eat breakfast? Respond with 'yes' or 'no'");
                String eatBreakfastOrNO = sc.nextLine();
            }

            // otherwise
            else {
                System.out.println("Wrong answer. You died. Try again.");
            }

        }

        else {
            System.out.println("Wrong answer. You died. Try again.");
        }

    }
}
