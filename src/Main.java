import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Doses doseBase = new Doses();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Головне меню програми:");
            System.out.println("1. Додати дозу");
            System.out.println("2. Переглянути сумарну накопичену дозу");
            System.out.println("3. Видалити сумарну накопичену дозу");
            System.out.println("4. Закрити програму");
            System.out.print("Зробіть свій вибір:\n");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введіть отриману дозу");
                    int dose = scanner.nextInt();
                    doseBase.setDose(dose);
                    break;
                case 2:
                    System.out.println("Сумарна накопичена доза: " + doseBase.getDose() + "\n");
                    break;
                case 3:
                    System.out.println("Сумарна накопичена доза буде видалена, ви впевненні?");
                    System.out.println("Будь ласка, введіть ТАК чи НІ");
                    String choice2 = scanner.next();
                    switch (choice2) {
                        case "ТАК":
                            doseBase.setDose(0);
                            System.out.println("Сумарна накопичена доза була видалена.");
                            System.out.println("Сумарна накопичена доза: " + doseBase.getDose() + "\n");
                            break;
                        case "НІ":
                            System.out.println("Сумарна накопичена доза не була видалена.");
                            System.out.println("Сумарна накопичена доза: " + doseBase.getDose() + "\n");
                            break;
                        default:
                            System.out.println("Невірний вибір. Будь ласка, введіть ТАК чи НІ\n");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Невірний вибір. Будь ласка, введіть номер від 1 до 4.\n");
            }
        }
    }
}