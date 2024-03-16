public class Main {
    public static void main(String[] args) {

        // Задача 1
        byte apple = 63;
        System.out.println("Значение переменной apple c типом byte равно " + apple);
        short mango = 4386;
        System.out.println("Значение переменной mango c типом short равно " + mango);
        int orange = 26791056;
        System.out.println("Значение переменной orange c типом int равно " + orange);
        long lemon = 4257016943518L;
        System.out.println("Значение переменной lemon c типом long равно " + lemon);
        float averageRatingOne = 8.4562f;
        System.out.println("Значение переменной averageRatingOne c типом float равно " + averageRatingOne);
        double averageRatingTwo = 36.487629483;
        System.out.println("Значение переменной averageRatingTwo c типом double равно " + averageRatingTwo);

        // Задача 2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        //Задача 3
        byte classOne = 23;
        byte classTwo = 27;
        byte classThree = 30;
        int totalStudent = classOne + classTwo + classThree;
        System.out.println("Всего "+ totalStudent + " учеников");
        int paper = 480;
        int paperForStudent = paper / totalStudent;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

        // Задача 4
        byte quantityBottle = 16;
        byte time = 2;
        int productivity = quantityBottle / time; // производительность за 1 минуту
        System.out.println("Количество бутылок в минуту " + productivity + " штук");
        int oneTime = 20; // 20 минут
        int oneProductivity = productivity * oneTime;
        System.out.println("За " + oneTime + " минут машина произвела " + oneProductivity + " штук бутылок");
        int twoTime = 60 * 24; // количество минут в сутках
        int twoProductivity = productivity * twoTime;
        System.out.println("За сутки (" + twoTime + " минут) машина произвела " + twoProductivity + " штук бутылок");
        int threeTime = twoTime * 3; // количесвтто минут в 3 сутках
        int threeProductivity = productivity * threeTime;
        System.out.println("За 3 дня (" + threeTime + " минут) машина произвела " + threeProductivity + " штук бутылок");
        int fourTime = twoTime * 31; // колчество минут в месяце
        int fourProductivity = productivity * fourTime;
        System.out.println("За месяц (" + fourTime + " минут) машина произвела " + fourProductivity + " штук бутылок");

        // Задача 5
        byte totalCan = 120;
        byte whiteCan = 2;
        byte brownCan = 4;
        int quantityClass = totalCan / (whiteCan + brownCan);
        System.out.println("В школе " + quantityClass + " классов");
        int whiteCanSchool = quantityClass * whiteCan;
        int brownCanSchool = quantityClass * brownCan;
        System.out.println("В школе, где " + quantityClass + " классов, нужно " + whiteCanSchool + " банок белой краски и " + brownCanSchool + " банок коричневой краски");

        // Задача 6
        byte banana = 5;
        int milk = 200;
        byte iceCream = 2;
        byte egg = 4;
        int bananaBreakfast = banana * 80;
        System.out.println(bananaBreakfast + " грамм банана необходимо для завтрака");
        int milkBreakfast = milk / 100 * 105;
        System.out.println(milkBreakfast + " грамм молока необходимо для завтрака");
        int iceCreamBreakfast = iceCream * 100;
        System.out.println(iceCreamBreakfast + " грамм мороженого необходимо для завтрака");
        int eggBreakfast = egg * 70;
        System.out.println(eggBreakfast + " грамм яиц необходимо для завтрака");
        int breakfastG = bananaBreakfast + milkBreakfast + iceCreamBreakfast + eggBreakfast;
        System.out.println("Вес завтрака "+ breakfastG + " грамм");
        float breakfastKg = breakfastG / 1000f;
        System.out.println("Вес завтрака "+ breakfastKg + " килограмм");

        // Задача 7
        int weightFall = 7000;
        int weightFallOne = 250;
        int weightFallTwo = 500;
        int daysOne = weightFall / weightFallOne;
        System.out.println("Потребуется " + daysOne + " дней при похудениии на " + weightFallOne + " грамм ежедневно");
        int daysTwo = weightFall / weightFallTwo;
        System.out.println("Потребуется " + daysTwo + " дней при похудениии на " + weightFallTwo + " грамм ежедневно");
        int daysAverage = (daysOne + daysTwo) / 2;
        System.out.println("В среднем, для похудения потребуется " + daysAverage + " день");

        //Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float salaryUp = 1.1f;
        byte year = 12;
        float newSalaryMasha = salaryMasha * salaryUp;
        float salaryMashaYear = salaryMasha * year;
        float newSalaryMashaYear = newSalaryMasha * year;
        float difSalaryMasha = newSalaryMashaYear - salaryMashaYear;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + difSalaryMasha + " рублей");
        float newSalaryDenis = salaryDenis * salaryUp;
        float salaryDenisYear = salaryDenis * year;
        float newSalaryDenisYear = newSalaryDenis * year;
        float difSalaryDenis = newSalaryDenisYear - salaryDenisYear;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + difSalaryDenis + " рублей");
        float newSalaryKristina = salaryKristina * salaryUp;
        float salaryKristinaYear = salaryKristina * year;
        float newSalaryKristinaYear = newSalaryKristina * year;
        float difSalaryKristina = newSalaryKristinaYear - salaryKristinaYear;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + difSalaryKristina + " рублей");
    }
}