public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task 1
        System.out.println("Task 7");
        int sum = 15000;
        int deposit = 0;
        while (deposit <= 2_459_000) {
            deposit = deposit + sum;
            System.out.println(deposit);
        }
        //task 2
        System.out.println("Task 2");
        int numbersA = 0;
        while (numbersA < 10) {
            numbersA = numbersA + 1;
            System.out.print(numbersA + " ");
        }
        System.out.println();
        int numbersB = 11;
        for (; numbersB > 1; ) {
            numbersB = numbersB - 1;
            System.out.print(numbersB + " ");
        }
        System.out.println();
        //task 3
        System.out.println("Task 3");
        int y = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            int birthRate = 17 * y / 1000;
            int deathRate = 8 * y / 1000;
            y = y + birthRate - deathRate;
            System.out.println("Год " + i + ", численность населения составляет " + y);
        }
        //task 4
        System.out.println("Task 4");
        int salary = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total / 100 * 7;
            total = total + salary;
            System.out.println("Месяц " + i + " " + total);
        }
        //task 5
        System.out.println("Task 5");
        int salary1 = 15000;
        int total1 = 0;
        int e = 0;
        for (; total1 < 12_000_000; e++) {
            total1 = total1 + total1 / 100 * 7;
            total1 = total1 + salary1;
            if (e % 6 == 0) {
                System.out.println("Месяц " + e + " " + total1);
            }
        }
        //task 6
        System.out.println("Task 6");
//        double salary2 = 15000;
//        double total2 = 0;
//        double rate = 0.07;
//        for (double b = 0; b < 9; b++) {
//            total2 = total2 * rate + salry2;
//            // total2 = total2 + total2 / 100 * 7;
//            total2 = total2 + salary2;
//            if (b % 0.5 == 0) {
//                System.out.printf("");
//            }
        //       }
        double deposit1 = 15_000;
        double total2 = 0;
        int year1 = 9 * 12;
        double percent1 = 0.07;
        int x = 0;
        for (; x < year1; x++) {
            // year1 = year1 * 12;
            total2 = total2 + deposit1;
            total2 = total2 + deposit1 * percent1;
            if (x % 6 == 0) {
                System.out.printf("Месяц %d Накопление %2f\n", x, total2);
            }
        }
//task 7
        System.out.println("Task 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + " -е число.Необходимо подготовить отчет");
            friday += 7;
        }
        //task 8
        System.out.println("Task 8");
        int yearComet = 2024 - 200;
        int year2Comet = 2024 + 100;
        int year = yearComet;
        for (; year < year2Comet; ) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
            year++;
        }
    }
}
