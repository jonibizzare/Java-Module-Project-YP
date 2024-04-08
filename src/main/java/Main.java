import java.util.HashMap;
import java.util.Scanner;
public class Main {
    static int peopleAvailable;
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Double> itemList = new HashMap<>();
    static Item item = new Item();
    static BillCalculator billCalculator = new BillCalculator();

    public static void main(String[] args) {
        start();
        item.addItem();
        nextItemAndBreak();
    }
    public static void start() {
        System.out.println("Добро пожаловать в Калькулятор счёта v1.0 \nНа сколько человек необходимо разделить счёт?");
        while (true) {
            sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                peopleAvailable = sc.nextInt();
                if (peopleAvailable > 1) {
                    break;
                } else {
                    System.out.println("Недостаточно людей для разделения счёта, пожалуйста повторите попытку.");
                }
            } else {
                System.out.println("Неправильный формат ввода! Повторите попытку.");
            }
        }
    }
    public static void nextItemAndBreak() {
        while (true) {
            System.out.println("Хотите добавить ещё один товар? \nВведите название товара или введите \"Завершить\"- чтобы посчитать результат.");
            String moreItems = sc.next();
            if (moreItems.equalsIgnoreCase("Завершить")) {
                item.showItemsAdded();
                billCalculator.calculate();
                System.out.println("\nСпасибо что воспользовались этой программой!\nЗавершение работы...");
                break;
            } else {
                item.addAnotherItem(moreItems);
            }
        }
    }
}
