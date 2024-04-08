public class BillCalculator {
    Format format = new Format();

    public void calculate() {
        double sum = 0.0;
        for (String next : Main.itemList.keySet()) {
            sum = sum + Main.itemList.get(next);
        }
        System.out.printf("Общая сумма всех товаров " + format.fix(sum, "Рубль", "Рубля", "Рублей") + " .\n\nВсего людей участвует : " + Main.peopleAvailable + "\nКаждый человек должен заплатить " + format.fix(sum / Main.peopleAvailable, "Рубль", "Рубля", "Рублей"));
    }
}

