public class App {
    public static void main(String[] args) throws Exception {
        member platinum = new platinum("Son", 1500);
        System.out.println("Platinum info: ");
        platinum.display();

        member gold = new gold("Wat", 2500);
        System.out.println("Gold info: ");
        gold.display();

        member silver = new silver("Fill", 1300);
        System.out.println("Silver info: ");
        silver.display();
    }
}
