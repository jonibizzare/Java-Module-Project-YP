import java.util.Scanner;

public class Item {
    Scanner sc = new Scanner(System.in);
    Format format = new Format();
    String itemName = "";
    Double itemCost;

    public void addItem() {
        System.out.println("Пожалуйста, введите название товара :");
        itemName = sc.next();
        while (true) {
            System.out.println("Введите стоимость данного товара в формате 'Рубли,Копейки' :");
            sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                itemCost = sc.nextDouble();
                if (itemCost > 0) {
                    Main.itemList.put(itemName, itemCost);
                    System.out.println("Товар \"" + itemName + "\" стоимостью " + format.fix(itemCost, "Рубль", "Рубля", "Рублей") + " успешно дабавлен! \n");
                    break;
                } else {
                    System.out.println("Товар не может иметь отрицательную стоимость или стоить 0!");
                }
            } else {
                System.out.println("Неправильный формат ввода! Повторите попытку.");
            }
        }
    }

    public void addAnotherItem(String next) {
        itemName = next;
        while (true) {
            System.out.println("Введите стоимость данного товара в формате 'Рубли,Копейки' :");
            sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                itemCost = sc.nextDouble();
                if (itemCost > 0) {
                    Main.itemList.put(itemName, itemCost);
                    System.out.println("Товар \"" + itemName + "\" стоимостью " + format.fix(itemCost, "Рубль", "Рубля", "Рублей") + " успешно дабавлен! \n");
                    break;
                } else {
                    System.out.println("Товар не может иметь отрицательную стоимость или стоить 0!");
                }
            } else {
                System.out.println("Неправильный формат ввода! Повторите попытку.");
            }
        }
    }

    public void showItemsAdded() {
        int index = 0;
        System.out.println("Добавленные товары: \n");
        for (String next : Main.itemList.keySet()) {
            double nextValue = Main.itemList.get(next);
            index = index + 1;
            System.out.println(index + ". " + next + " стоимостью " + format.fix(nextValue, "Рубль", "Рубля", "Рублей") + ".\n");
        }
    }
}