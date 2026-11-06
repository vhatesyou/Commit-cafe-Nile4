public class CommitCafe {

feature/brew
    private static String barista = "Nile"; 
    private static String title = "Master Brewer";

    private static String barista = "CoffeeBot"; // STUDENT_TODO_1A: Change name
    private static String title = "[Lead Barista]";
 main

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
feature/brew
        System.out.println("Brewing a delicious " + drink + " for our customers.");
        System.out.println("Fresh aroma filling the cafe!");

        System.out.println("CoffeeBot brewed " + drink + ". Merge conflicts taste better with espresso.");
        System.out.println("[BOT CHECK] drink length = " + drink.length());
 main
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " (" + title + ") brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
