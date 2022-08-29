public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача №1");
        int days = 5;
        byte ball = 14;
        short degreeCelsius = -30;
        long distanceBetweenCities = 1500L;
        float result = 0.61f;
        double speedOfCar = 140.15;
        System.out.println("Значение переменной days с типом int равно " + days + ".");
        System.out.println("Значение переменной ball с типом byte равно " + ball + ".");
        System.out.println("Значение переменной degreeCelsius с типом short равно " + degreeCelsius + ".");
        System.out.println("Значение переменной distanceBetweenCities с типом long равно " + distanceBetweenCities + ".");
        System.out.println("Значение переменной result с типом float равно " + result + ".");
        System.out.println("Значение переменной speedOfCar с типом double равно " + speedOfCar + ".");

        // Задача 2
        System.out.println("Задача №2");
        byte tree = 67;
        short meaning = -159;
        int power = 27897;
        long weight = 987_678_965_549L;
        float temperature = 27.12f;
        double height = 569;
        boolean treeIsOld= tree > 100;
        char amount = 44;
        System.out.println("2" + amount + "786");

        // Задача 3
        System.out.println("Задача №3");
        byte pupilsInClassA = 23;
        byte pupilsInClassB = 27;
        byte pupilsInClassC = 30;
        int totalNumberOfPupils = pupilsInClassA + pupilsInClassB + pupilsInClassC;
        short amountOfSheets = 480;
        int sheetsPerPupil = amountOfSheets / totalNumberOfPupils;
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги.");

        // Задача 4
        System.out.println("Задача №4");
        byte capacityPerMinute = 16/2;
        int capacityIn20Minutes = capacityPerMinute * 20;
        int capacityIn24Hours = capacityPerMinute * 60 * 24;
        int capacityIn3Days = capacityIn24Hours * 3;
        int capacityIn1Month = capacityIn24Hours * 30; // в месяце 30 дней
        System.out.println("За 20 минут машина произвела " + capacityIn20Minutes + " бутылок.");
        System.out.println("За сутки машина произвела " + capacityIn24Hours + " бутылок.");
        System.out.println("За 3 дня машина произвела " + capacityIn3Days + " бутылок.");
        System.out.println("За 1 месяц машина произвела " + capacityIn1Month + " бутылок.");

        // Задача 5
        System.out.println("Задача №5");
        byte totalCans = 120;
        byte whiteColourCansFor1Classroom = 2;
        byte brownColourCansFor1Classroom = 4;
        int totalClassrooms = totalCans / (whiteColourCansFor1Classroom + brownColourCansFor1Classroom);
        int whiteColourCansTotal = totalClassrooms * whiteColourCansFor1Classroom;
        int brownColourCansTotal = totalClassrooms * brownColourCansFor1Classroom;
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + whiteColourCansTotal + " банок белой краски и " + brownColourCansTotal + " банок коричневой краски.");

        // Задача 6
        System.out.println("Задача №6");
        byte oneBananaWeight = 80;
        byte milkWeight_100ml = 105;
        byte oneIceCreamWeight = 100;
        byte oneEggWeight = 70;
        float breakfastWeightInGrams = oneBananaWeight * 5 + milkWeight_100ml * 2 + oneIceCreamWeight * 2 + oneEggWeight * 4;
        float breakfastWeightInKilograms = breakfastWeightInGrams / 1000;
        System.out.println("Масса завтрака = " + breakfastWeightInKilograms + " кг.");

        // Задача 7
        System.out.println("Задача №7");
        short goalOfWeightLoss = 7;
        float weightLossPerDay1 = 0.25f;
        float weightLossPerDay2 = 0.5f;
        float daysForWeightLoss1 = goalOfWeightLoss / weightLossPerDay1;
        float daysForWeightLoss2 = goalOfWeightLoss / weightLossPerDay2;
        System.out.println("Если спортсмен будет терять каждый день по 250 граммов, то на похудение на 7 кг уйдет " + daysForWeightLoss1 + " дней.");
        System.out.println("Если спортсмен будет терять каждый день по 500 граммов, то на похудение на 7 кг уйдет " + daysForWeightLoss2 + " дней.");
        float averageWeightLossPerDay = (weightLossPerDay1 + weightLossPerDay2) / 2;
        System.out.println("Средняя потеря веса в день - " + averageWeightLossPerDay * 1000 + " граммов.");
        float daysAverage = goalOfWeightLoss / averageWeightLossPerDay;
        System.out.println("Для похудения на 7 кг в среднем может понадобиться " + daysAverage + " дней.");

        // Задача 8
        System.out.println("Задача №8");
        int monthSalaryMasha = 67760;
        int monthSalaryDenis = 83690;
        int monthSalaryKristina = 76230;
        double newMonthSalaryMasha = monthSalaryMasha * 1.1;
        double newMonthSalaryDenis = monthSalaryDenis * 1.1;
        double newMonthSalaryKristina = monthSalaryKristina * 1.1;
        double yearSalaryGrowthMasha = (newMonthSalaryMasha * 12) - (monthSalaryMasha * 12);
        double yearSalaryGrowthDenis = (newMonthSalaryDenis * 12) - (monthSalaryDenis * 12);
        double yearSalaryGrowthKristina = (newMonthSalaryKristina * 12) - (monthSalaryKristina * 12);
        System.out.println("Маша теперь получает " + newMonthSalaryMasha + " руб. в месяц. Годовой доход вырос на " + yearSalaryGrowthMasha + " руб.");
        System.out.println("Денис теперь получает " + newMonthSalaryDenis + " руб. в месяц. Годовой доход вырос на " + yearSalaryGrowthDenis + " руб.");
        System.out.println("Кристина теперь получает " + newMonthSalaryKristina + " руб. в месяц. Годовой доход вырос на " + yearSalaryGrowthKristina + " руб.");
    }
}