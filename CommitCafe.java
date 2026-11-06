public class CommitCafe {

   private static String barista = "Nile"; // STUDENT_TODO_1A: Change name
    private static String title = "Master Brewer"; // STUDENT_TODO_1B: Add a nickname or title for the barista

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("CoffeeBot brewed " + drink + ". Merge conflicts taste better with espresso.");
        System.out.println("[BOT CHECK] drink length = " + drink.length());
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
