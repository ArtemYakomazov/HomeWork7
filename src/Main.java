//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Task 1
        System.out.println("Task 1");

        int saving = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i++;
            total = total + saving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        //Task 2
        System.out.println("Task 2");

        int number1 = 0;
        while (number1 < 10) {
            number1 = number1 + 1;
            System.out.print(number1 + " ");
        }
        System.out.println();
        int number2 = 10;
        for (; number2 > 0; number2--) {
            System.out.print(number2 + " ");
        }
        System.out.println();

        //Task 3
        System.out.println("Task 3");

        int born = 17;
        int death = 8;
        int totalPeople = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            totalPeople = totalPeople + 1000 * (born - death);
            System.out.println("Год " + year + ", численность населения составляет " + totalPeople);
        }

        //Task 4,5
        System.out.println("Task 4,5");

        int deposit = 15000;
        int totalMoney = 0;
        int month = 0;
        while (totalMoney < 12_000_000) {
            month++;
            totalMoney = (int) (totalMoney + totalMoney * 0.07);
            totalMoney = totalMoney + deposit;
            if (month % 6 == 0) {
                System.out.println(month + ", " + totalMoney);
            }
        }

        //Task 6
        System.out.println("Task 6");

        totalMoney = 0;
        month = 0;
        while (month < 9 * 12) {
            month++;
            totalMoney = (int) (totalMoney + totalMoney * 0.07);
            totalMoney = totalMoney + deposit;
            if (month % 6 == 0) {
                System.out.println(month + ", " + totalMoney);
            }
        }
        //Task 7
        System.out.println("Task 7");

        for (int day = 5; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        //Task 8
        System.out.println("Task 8");

        int yearNow = 2025;
        int year = 0;
        while (year <= 2100) {
            year = year + 79;
            if (year < (yearNow + 100) && year > (yearNow - 200)) {
                System.out.println(year);
            }
        }
    }
}