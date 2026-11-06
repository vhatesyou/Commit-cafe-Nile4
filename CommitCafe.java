public class CommitCafe {

    private static String barista = "Nile"; 
    private static String title = "Master Brewer";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("Brewing a delicious " + drink + " for our customers.");
        System.out.println("Fresh aroma filling the cafe!");
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
