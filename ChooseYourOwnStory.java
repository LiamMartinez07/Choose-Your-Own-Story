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

                // Not ready
                else if (answer.equals("no")) {
                        System.out
                                        .println(
                                                        "Perfect! Now that you're awake, do you want to go back to sleep, or study for school? Respond with 'sleep' or 'study'");

                        String sleepOrStudyDecision = sc.nextLine();

                        // Not ready, sleep
                        if (sleepOrStudyDecision.equals("sleep")) {
                                System.out.println(
                                                "You've decided to sleep, gaining 5 health points, and gaining 10 fun points!");
                                healthPoints += 5;
                                funPoints += 10;
                                System.out.println("You have a total of " + healthPoints
                                                + " health points, and a total of " + funPoints
                                                + " fun points!");
                                System.out.println(
                                                "Now that you're done with your early morning decisions, do you want to eat breakfast? Respond with 'yes' or 'no'");
                                String eatBreakfastOrNo = sc.nextLine();

                                // not ready, sleep, breakfast yes
                                if (eatBreakfastOrNo.equals("yes")) {
                                        System.out.println(
                                                        "Good job you healthy individual! What food would you like to eat? Respond with 'cheerios' or 'raw fish'.");
                                        String breakfastChoice = sc.nextLine();

                                        // not ready, sleep, breakfast yes, cheerios
                                        if (breakfastChoice.equals("cheerios")) {
                                                System.out.println(
                                                                "Fine. You can sacrifice fun for health if you want... Not what I would do though. You've gained 5 health points but lost 10 fun points.");
                                                healthPoints += 5;
                                                funPoints -= 10;
                                                System.out.println(
                                                                "You have a total of " + healthPoints
                                                                                + " health points, and a total of "
                                                                                + funPoints
                                                                                + " fun points!");
                                                // Concert starts
                                                System.out.println(
                                                                "Now you decide to go see a Lorna Shore concert. Once you arrive, you have a decision: Do you stay in the back of the venue or try to go up to the front? Respond with 'back' or 'front'.");
                                                String concertLocation = sc.nextLine();

                                                // not ready, sleep, breakfast yes, cheerios, concert back
                                                if (concertLocation.equals("back")) {
                                                        System.out.println(
                                                                        "Congratulations, you've managed to avoid getting hurt, however you've had significantly less fun...");
                                                        healthPoints += 5;
                                                        funPoints -= 25;
                                                        System.out.println(
                                                                        "You have a total of " + healthPoints
                                                                                        + " health points, and a total of "
                                                                                        + funPoints
                                                                                        + " fun points!");

                                                        // not ready, sleep, breakfast yes, cheerios, concert front
                                                } else if (concertLocation.equals("front")) {
                                                        System.out.println(
                                                                        "There we go! You know how to have fun! Unfortunately, while you were watching the show a 250 lbs man who was croudsurfing falls on you, injuring your toe.");
                                                        healthPoints -= 10;
                                                        funPoints += 30;
                                                        System.out.println(
                                                                        "You have a total of " + healthPoints
                                                                                        + " health points, and a total of "
                                                                                        + funPoints
                                                                                        + " fun points!");
                                                        System.out.println(
                                                                        "Another decision awaits: You're in the front, should you go in the Mosh pit or try to push to the front railing to see the band better? Respond with 'mosh' or 'railing'");

                                                        // not ready, sleep, breakfast yes, cheerios, concert front,
                                                        // mosh
                                                        String moshOrFront = sc.nextLine();

                                                        if (moshOrFront.equals("mosh")) {
                                                                System.out.println(
                                                                                "Well, you had a lot of fun, but caught a flying elbow in the face... Gotta put on some muscle for next time, I guess.");
                                                                healthPoints -= 20;
                                                                funPoints += 30;
                                                                System.out.println(
                                                                                "You have a total of " + healthPoints
                                                                                                + " health points, and a total of "
                                                                                                + funPoints
                                                                                                + " fun points!");

                                                        }

                                                        // not ready, sleep, breakfast yes, cheerios, concert front,
                                                        // railing
                                                        else if (moshOrFront.equals("railing")) {
                                                                System.out.println(
                                                                                "You push to the railing and get the best view in the whole concert, without having to take on the fearsome mosh pit!");
                                                                System.out.println(
                                                                                "Congratulations, if you went down this path you had the most fun possible! Wheeeeeeeeeeee! You ended with a total amount of "
                                                                                                + funPoints
                                                                                                + " fun points and "
                                                                                                + healthPoints
                                                                                                + " health points!");
                                                        } else {
                                                                System.out.println(
                                                                                "Wrong answer. You died. Try again.");
                                                        }
                                                } else {
                                                        System.out.println("Wrong answer. You died. Try again.");
                                                }

                                                // not ready, sleep, breakfast yes, fish
                                        } else if (breakfastChoice.equals("raw fish")) {
                                                System.out.println(
                                                                "You're pretty adventurous. Unfortunately you have lost 30 health points due to food poisoning, but at least in the hospital you had a lot of fun playing video games!");
                                                healthPoints -= 30;
                                                funPoints += 20;
                                                System.out.println(
                                                                "You have a total of " + healthPoints
                                                                                + " health points, and a total of "
                                                                                + funPoints
                                                                                + " fun points!");

                                                // Concert starts
                                                System.out.println(
                                                                "Now you decide to go see a Lorna Shore concert. Once you arrive, you have a decision: Do you stay in the back of the venue or try to go up to the front? Respond with 'back' or 'front'.");
                                                String concertLocation = sc.nextLine();

                                                // not ready, sleep, breakfast yes, fish, concert back
                                                if (concertLocation.equals("back")) {
                                                        System.out.println(
                                                                        "Congratulations, you've managed to avoid getting hurt, however you've had significantly less fun...");
                                                        healthPoints += 5;
                                                        funPoints -= 25;
                                                        System.out.println(
                                                                        "You have a total of " + healthPoints
                                                                                        + " health points, and a total of "
                                                                                        + funPoints
                                                                                        + " fun points!");

                                                        // not ready, sleep, breakfast yes, fish, concert front
                                                } else if (concertLocation.equals("front")) {
                                                        System.out.println(
                                                                        "There we go! You know how to have fun! Unfortunately, while you were watching the show a 250 lbs man who was croudsurfing falls on you, injuring your toe.");
                                                        healthPoints -= 10;
                                                        funPoints += 30;
                                                        System.out.println(
                                                                        "You have a total of " + healthPoints
                                                                                        + " health points, and a total of "
                                                                                        + funPoints
                                                                                        + " fun points!");
                                                        System.out.println(
                                                                        "Another decision awaits: You're in the front, should you go in the Mosh pit or try to push to the front railing to see the band better? Respond with 'mosh' or 'railing'");

                                                        // not ready, sleep, breakfast yes, cheerios, concert front,
                                                        // mosh
                                                        String moshOrFront = sc.nextLine();

                                                        if (moshOrFront.equals("mosh")) {
                                                                System.out.println(
                                                                                "Well, you had a lot of fun, but caught a flying elbow in the face... Gotta put on some muscle for next time, I guess.");
                                                                healthPoints -= 20;
                                                                funPoints += 30;
                                                                System.out.println(
                                                                                "You have a total of " + healthPoints
                                                                                                + " health points, and a total of "
                                                                                                + funPoints
                                                                                                + " fun points!");

                                                                // not ready, sleep, breakfast yes, cheerios, concert
                                                                // front, railing
                                                        } else if (moshOrFront.equals("railing")) {
                                                                System.out.println(
                                                                                "You push to the railing and get the best view in the whole concert, without having to take on the fearsome mosh pit!");
                                                                System.out.println(
                                                                                "Congratulations, you ended with a total amount of "
                                                                                                + funPoints
                                                                                                + " fun points and "
                                                                                                + healthPoints
                                                                                                + " health points!");
                                                        } else {
                                                                System.out.println(
                                                                                "Wrong answer. You died. Try again.");
                                                        }
                                                } else {
                                                        System.out.println("Wrong answer. You died. Try again.");
                                                }
                                        } else {
                                                System.out.println("Wrong answer. You died. Try again.");
                                        }
                                }
                                // not ready, sleep, breakfast no
                                else if (eatBreakfastOrNo.equals("no")) {
                                        System.out.println(
                                                        "What!?! Breakfast is the most important meal of the day, don't you know that? Because of this lack of nutrition your body starts to atrophy, and you lose significant health points and fun points...");
                                        healthPoints -= 45;
                                        funPoints -= 25;
                                        System.out.println(
                                                        "You have a total of " + healthPoints
                                                                        + " health points, and a total of " + funPoints
                                                                        + " fun points!");
                                        // Concert starts
                                        System.out.println(
                                                        "Now you decide to go see a Lorna Shore concert. Once you arrive, you have a decision: Do you stay in the back of the venue or try to go up to the front? Respond with 'back' or 'front'.");
                                        String concertLocation = sc.nextLine();

                                        // not ready, sleep, breakfast no, concert back
                                        if (concertLocation.equals("back")) {
                                                System.out.println(
                                                                "Congratulations, you've managed to avoid getting hurt, however you've had significantly less fun...");
                                                healthPoints += 5;
                                                funPoints -= 25;
                                                System.out.println(
                                                                "You have a total of " + healthPoints
                                                                                + " health points, and a total of "
                                                                                + funPoints
                                                                                + " fun points!");

                                                // not ready, sleep, breakfast no, concert front
                                        } else if (concertLocation.equals("front")) {
                                                System.out.println(
                                                                "There we go! You know how to have fun! Unfortunately, while you were watching the show a 250 lbs man who was croudsurfing falls on you, injuring your toe.");
                                                healthPoints -= 10;
                                                funPoints += 30;
                                                System.out.println(
                                                                "You have a total of " + healthPoints
                                                                                + " health points, and a total of "
                                                                                + funPoints
                                                                                + " fun points!");
                                                System.out.println(
                                                                "Another decision awaits: You're in the front, should you go in the Mosh pit or try to push to the front railing to see the band better? Respond with 'mosh' or 'railing'");

                                                // not ready, sleep, breakfast no, concert front, mosh
                                                String moshOrFront = sc.nextLine();

                                                if (moshOrFront.equals("mosh")) {
                                                        System.out.println(
                                                                        "Well, you had a lot of fun, but caught a flying elbow in the face... Gotta put on some muscle for next time, I guess.");
                                                        healthPoints -= 20;
                                                        funPoints += 30;
                                                        System.out.println(
                                                                        "You have a total of " + healthPoints
                                                                                        + " health points, and a total of "
                                                                                        + funPoints
                                                                                        + " fun points!");

                                                }

                                                // not ready, sleep, breakfast no, concert front, railing
                                                else if (moshOrFront.equals("railing")) {
                                                        System.out.println(
                                                                        "You push to the railing and get the best view in the whole concert, without having to take on the fearsome mosh pit!");
                                                        System.out.println(
                                                                        "Congratulations, if you went down this path you had the most fun possible! Wheeeeeeeeeeee! You ended with a total amount of "
                                                                                        + funPoints
                                                                                        + " fun points and "
                                                                                        + healthPoints
                                                                                        + " health points!");
                                                } else {
                                                        System.out.println("Wrong answer. You died. Try again.");
                                                }

                                        } else {
                                                System.out.println("Wrong answer. You died. Try again.");
                                        }
                                } else {
                                        System.out.println("Wrong answer. You died. Try again.");
                                }
                        }
                        // not ready, study
                        else if (sleepOrStudyDecision.equals("study")) {
                                System.out
                                                .println("You've decided to study, gaining 20 confidence points, but losing 10 health points");
                                healthPoints -= 10;
                                confidencePoints += 20;
                                System.out.println("You have a total of " + healthPoints
                                                + " health points, and a total of " + funPoints
                                                + " fun points!");

                                System.out.println(
                                                "Now that you're done with your early morning decisions, do you want to eat breakfast? Respond with 'yes' or 'no'");
                                String eatBreakfastOrNo = sc.nextLine();

                                // not ready, study, breakfast yes
                                if (eatBreakfastOrNo.equals("yes")) {
                                        System.out.println(
                                                        "Good job you healthy individual! What food would you like to eat? Respond with 'cheerios' or 'raw fish'.");
                                        String breakfastChoice = sc.nextLine();

                                        // not ready, study, breakfast yes, cheerios
                                        if (breakfastChoice.equals("cheerios")) {
                                                System.out.println(
                                                                "Fine. You can sacrifice fun for health if you want... Not what I would do though. You've gained 5 health points but lost 10 fun points.");
                                                healthPoints += 5;
                                                funPoints -= 10;
                                                System.out.println(
                                                                "You have a total of " + healthPoints
                                                                                + " health points, and a total of "
                                                                                + funPoints
                                                                                + " fun points!");
                                                // Concert starts
                                                System.out.println(
                                                                "Now you decide to go see a Lorna Shore concert. Once you arrive, you have a decision: Do you stay in the back of the venue or try to go up to the front? Respond with 'back' or 'front'.");
                                                String concertLocation = sc.nextLine();

                                                // not ready, sleep, breakfast yes, cheerios, concert back
                                                if (concertLocation.equals("back")) {
                                                        System.out.println(
                                                                        "Congratulations, you've managed to avoid getting hurt, however you've had significantly less fun...");
                                                        healthPoints += 5;
                                                        funPoints -= 25;
                                                        System.out.println(
                                                                        "You have a total of " + healthPoints
                                                                                        + " health points, and a total of "
                                                                                        + funPoints
                                                                                        + " fun points!");

                                                        // not ready, sleep, breakfast yes, cheerios, concert front
                                                } else if (concertLocation.equals("front")) {
                                                        System.out.println(
                                                                        "There we go! You know how to have fun! Unfortunately, while you were watching the show a 250 lbs man who was croudsurfing falls on you, injuring your toe.");
                                                        healthPoints -= 10;
                                                        funPoints += 30;
                                                        System.out.println(
                                                                        "You have a total of " + healthPoints
                                                                                        + " health points, and a total of "
                                                                                        + funPoints
                                                                                        + " fun points!");
                                                        System.out.println(
                                                                        "Another decision awaits: You're in the front, should you go in the Mosh pit or try to push to the front railing to see the band better? Respond with 'mosh' or 'railing'");

                                                        // not ready, sleep, breakfast yes, cheerios, concert
                                                        // front,
                                                        // mosh
                                                        String moshOrFront = sc.nextLine();

                                                        if (moshOrFront.equals("mosh")) {
                                                                System.out.println(
                                                                                "Well, you had a lot of fun, but caught a flying elbow in the face... Gotta put on some muscle for next time, I guess.");
                                                                healthPoints -= 20;
                                                                funPoints += 30;
                                                                System.out.println(
                                                                                "You have a total of "
                                                                                                + healthPoints
                                                                                                + " health points, and a total of "
                                                                                                + funPoints
                                                                                                + " fun points!");

                                                                // not ready, sleep, breakfast yes, cheerios,
                                                                // concert
                                                                // front, railing
                                                        } else if (moshOrFront.equals("railing")) {
                                                                System.out.println(
                                                                                "You push to the railing and get the best view in the whole concert, without having to take on the fearsome mosh pit!");
                                                                System.out.println(
                                                                                "Congratulations, you ended with a total amount of "
                                                                                                + funPoints
                                                                                                + " fun points and "
                                                                                                + healthPoints
                                                                                                + " health points!");
                                                        }

                                                        // not ready, study, breakfast yes, fish
                                                } else if (breakfastChoice.equals("raw fish")) {
                                                        System.out.println(
                                                                        "You're pretty adventurous. Unfortunately you have lost 30 health points due to food poisoning, but at least in the hospital you had a lot of fun playing video games!");
                                                        healthPoints -= 30;
                                                        funPoints += 20;
                                                        System.out.println(
                                                                        "You have a total of " + healthPoints
                                                                                        + " health points, and a total of "
                                                                                        + funPoints
                                                                                        + " fun points!");
                                                        // Concert starts
                                                        System.out.println(
                                                                        "Now you decide to go see a Lorna Shore concert. Once you arrive, you have a decision: Do you stay in the back of the venue or try to go up to the front? Respond with 'back' or 'front'.");
                                                        concertLocation = sc.nextLine();

                                                        // not ready, study, breakfast yes, fish, concert back
                                                        if (concertLocation.equals("back")) {
                                                                System.out.println(
                                                                                "Congratulations, you've managed to avoid getting hurt, however you've had significantly less fun...");
                                                                healthPoints += 5;
                                                                funPoints -= 25;
                                                                System.out.println(
                                                                                "You have a total of "
                                                                                                + healthPoints
                                                                                                + " health points, and a total of "
                                                                                                + funPoints
                                                                                                + " fun points!");

                                                                // not ready, study, breakfast yes, fish,
                                                                // concert front
                                                        } else if (concertLocation.equals("front")) {
                                                                System.out.println(
                                                                                "There we go! You know how to have fun! Unfortunately, while you were watching the show a 250 lbs man who was croudsurfing falls on you, injuring your toe.");
                                                                healthPoints -= 10;
                                                                funPoints += 30;
                                                                System.out.println(
                                                                                "You have a total of "
                                                                                                + healthPoints
                                                                                                + " health points, and a total of "
                                                                                                + funPoints
                                                                                                + " fun points!");
                                                                System.out.println(
                                                                                "Another decision awaits: You're in the front, should you go in the Mosh pit or try to push to the front railing to see the band better? Respond with 'mosh' or 'railing'");

                                                                // not ready, study, breakfast yes, cheerios,
                                                                // concert
                                                                // front, mosh
                                                                String moshOrFront = sc.nextLine();

                                                                if (moshOrFront.equals("mosh")) {
                                                                        System.out.println(
                                                                                        "Well, you had a lot of fun, but caught a flying elbow in the face... Gotta put on some muscle for next time, I guess.");
                                                                        healthPoints -= 20;
                                                                        funPoints += 30;
                                                                        System.out.println(
                                                                                        "You have a total of "
                                                                                                        + healthPoints
                                                                                                        + " health points, and a total of "
                                                                                                        + funPoints
                                                                                                        + " fun points!");

                                                                        // not ready, study, breakfast yes,
                                                                        // cheerios,
                                                                        // concert front, railing
                                                                } else if (moshOrFront.equals("railing")) {
                                                                        System.out.println(
                                                                                        "You push to the railing and get the best view in the whole concert, without having to take on the fearsome mosh pit!");
                                                                        System.out.println(
                                                                                        "Congratulations, you ended with a total amount of "
                                                                                                        + funPoints
                                                                                                        + " fun points and "
                                                                                                        + healthPoints
                                                                                                        + " health points!");
                                                                }
                                                        }
                                                }
                                        }

                                        // otherwise
                                        else {
                                                System.out.println("Wrong answer. You died. Try again.");
                                        }

                                } else if (eatBreakfastOrNo.equals("no")) {
                                        System.out.println(
                                                        "What!?! Breakfast is the most important meal of the day, don't you know that? Because of this lack of nutrition your body starts to atrophy, and you lose significant health points and fun points...");
                                        healthPoints -= 45;
                                        funPoints -= 25;
                                        System.out.println(
                                                        "You have a total of " + healthPoints
                                                                        + " health points, and a total of " + funPoints
                                                                        + " fun points!");
                                        // Concert starts
                                        System.out.println(
                                                        "Now you decide to go see a Lorna Shore concert. Once you arrive, you have a decision: Do you stay in the back of the venue or try to go up to the front? Respond with 'back' or 'front'.");
                                        String concertLocation = sc.nextLine();

                                        // not ready, sleep, breakfast no, concert back
                                        if (concertLocation.equals("back")) {
                                                System.out.println(
                                                                "Congratulations, you've managed to avoid getting hurt, however you've had significantly less fun...");
                                                healthPoints += 5;
                                                funPoints -= 25;
                                                System.out.println(
                                                                "You have a total of " + healthPoints
                                                                                + " health points, and a total of "
                                                                                + funPoints
                                                                                + " fun points!");

                                                // not ready, sleep, breakfast no, concert front
                                        } else if (concertLocation.equals("front")) {
                                                System.out.println(
                                                                "There we go! You know how to have fun! Unfortunately, while you were watching the show a 250 lbs man who was croudsurfing falls on you, injuring your toe.");
                                                healthPoints -= 10;
                                                funPoints += 30;
                                                System.out.println(
                                                                "You have a total of " + healthPoints
                                                                                + " health points, and a total of "
                                                                                + funPoints
                                                                                + " fun points!");
                                                System.out.println(
                                                                "Another decision awaits: You're in the front, should you go in the Mosh pit or try to push to the front railing to see the band better? Respond with 'mosh' or 'railing'");

                                                // not ready, sleep, breakfast no, concert front, mosh
                                                String moshOrFront = sc.nextLine();

                                                if (moshOrFront.equals("mosh")) {
                                                        System.out.println(
                                                                        "Well, you had a lot of fun, but caught a flying elbow in the face... Gotta put on some muscle for next time, I guess.");
                                                        healthPoints -= 20;
                                                        funPoints += 30;
                                                        System.out.println(
                                                                        "You have a total of " + healthPoints
                                                                                        + " health points, and a total of "
                                                                                        + funPoints
                                                                                        + " fun points!");

                                                }

                                                // not ready, sleep, breakfast no, concert front, railing
                                                else if (moshOrFront.equals("railing")) {
                                                        System.out.println(
                                                                        "You push to the railing and get the best view in the whole concert, without having to take on the fearsome mosh pit!");
                                                        System.out.println(
                                                                        "Congratulations, if you went down this path you had the most fun possible! Wheeeeeeeeeeee! You ended with a total amount of "
                                                                                        + funPoints
                                                                                        + " fun points and "
                                                                                        + healthPoints
                                                                                        + " health points!");
                                                }

                                                else {
                                                        System.out.println("Wrong answer. You died. Try again.");
                                                }
                                        } else {
                                                System.out.println("Wrong answer. You died. Try again.");
                                        }
                                } else {
                                        System.out.println("Wrong answer. You died. Try again.");
                                }
                        }
                }
        }
}
