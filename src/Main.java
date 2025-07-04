public class Main {
    public static void main(String[] args) {
        int myInt = 60000;
        byte myByte = 70;
        short myShort = 28000;
        long myLong = 15000000;
        float myFloat = 4.5f;
        double myDouble = 8.5;
        System.out.println("Значение переменной myInt с типом int равно" + myInt);
        System.out.println("Значение переменной myByte с типом byte равно" + myByte);
        System.out.println("Значение переменной myShort с типом short равно" + myShort);
        System.out.println("Значение переменной myLong с типом long равно" + myLong);
        System.out.println("Значение переменной myFloat с типом float равно" + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно" + myDouble);

        System.out.println("Задача №2");
        double value1 = 27.12;
        long value2 = 987678965549L;
        double value3 = 2.786;
        int value4 = 569;
        short value5 = -159;
        short value6 = 27897;
        byte value7 = 67;
        System.out.println("Значение переменной value1 с типом double равно " + value1);
        System.out.println("Значение переменной value2 с типом long равно " + value2);
        System.out.println("Значение переменной value3 с типом double равно " + value3);
        System.out.println("Значение переменной value4 с типом int равно " + value4);
        System.out.println("Значение переменной value5 с типом short равно " + value5);
        System.out.println("Значение переменной value6 с типом short равно " + value6);
        System.out.println("Значение переменной value7 с типом byte равно " + value7);

        System.out.println("Задача №3");
        int lPavlovna = 23;
        int aSergeevna = 27;
        int eAleksandrovna = 30;
        int notebook = 480;
        int massPeople = lPavlovna + aSergeevna + eAleksandrovna;
        int countingNumber = notebook / massPeople;
        System.out.println("На каждого ученика рассчитано  " + countingNumber + "листов бумаги");

        System.out.println("Задача №4");
        int bottlesPerMinute = 16 / 2;
        int twentyMinutes = bottlesPerMinute * 20;
        int perDay = bottlesPerMinute * 60 * 24;
        int threeDays = perDay * 3;
        int oneMonth = perDay * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок");

        System.out.println("Задача №5");
        int totalCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int cansPerClass = whitePerClass + brownPerClass;
        int numberOfClasses = totalCans / cansPerClass;
        int whiteCans = whitePerClass * numberOfClasses;
        int brownCans = brownPerClass * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски.");

        System.out.println("Задача №6");
        int bananasWeight = 5 * 80;
        double milkWeight = 200 / 100.0 * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;

        double totalWeightGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalWeightKilograms = totalWeightGrams / 1000.0;

        System.out.println("Вес завтрака в граммах: " + totalWeightGrams);
        System.out.println("Вес завтрака в килограммах: " + totalWeightKilograms);

        System.out.println("Задача №7");
        double weightToLoseKg = 7;
        double weightToLoseInGrams = weightToLoseKg * 1000;

        double dailyLossLow = 250;
        double daysForLowLoss = (weightToLoseInGrams / dailyLossLow);

        double dailyLossHigh = 500;
        double daysForHighLoss = (weightToLoseInGrams / dailyLossHigh);

        double averageDays = (daysForLowLoss + daysForHighLoss) / 2;
        System.out.println("При потере 250 грамм в день понадобится "+ daysForLowLoss + " дней.");
        System.out.println("При потере 500 грамм в день понадобится" +  daysForHighLoss  + "дней.");
        System.out.println(" В среднем понадобится около" + averageDays + " дней.");

        System.out.println("Задача №8");
        double salaryMasha = 67760;
        double salarySupplementMasha = (salaryMasha / 100) *10;
        double increaseInincomeperyearMasha = salarySupplementMasha * 12;
        double finalSalaryMasha = salaryMasha  + salarySupplementMasha;

        double salaryWithoutBonusMasha = salaryMasha * 12;
        double salaryWithBonusMasha = finalSalaryMasha * 12;
        double annualSalaryDifferenceMasha = salaryWithBonusMasha - salaryWithoutBonusMasha;
        System.out.println("Маша теперь получает" + finalSalaryMasha + " рублей. Годовой доход вырос на"+ increaseInincomeperyearMasha + "рублей");

        double salaryDen = 83690;
        double salarySupplementDen = (salaryDen/ 100) *10;
        double finalSalaryDen = salaryDen  + salarySupplementDen;
        double increaseInincomeperyearDen = salarySupplementDen * 12;
        double salaryWithoutBonusDen = salaryDen * 12;
        double salaryWithBonusDen = finalSalaryDen * 12;
        double annualSalaryDifferenceDen = salaryWithBonusDen - salaryWithoutBonusDen;
        System.out.println("Денис теперь получает" + finalSalaryDen + " рублей. Годовой доход вырос на"+ increaseInincomeperyearDen+ "рублей");

        double salaryKris = 76230;
        double salarySupplementKris = (salaryKris/ 100) *10;
        double finalSalaryKris = salaryKris  + salarySupplementKris;
        double increaseInincomeperyearKris = salarySupplementKris * 12;
        double salaryWithoutBonusKris = salaryKris * 12;
        double salaryWithBonusKris = finalSalaryKris * 12;
        double incomeDifferenceKris = salaryWithBonusKris - salaryWithoutBonusKris;
        System.out.println("Кристина теперь получает" + finalSalaryKris + " рублей.Годовой доход вырос на"+ increaseInincomeperyearKris+ "рублей");
    }
}