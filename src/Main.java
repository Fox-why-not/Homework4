public class Main {
        public static void main(String[] args) {
int age = 20;
if (age >= 18) {
        System.out.println("Если возраст человека равен " + age + ", то поздравляем, теперь ему надо работать работу и платить налоги.");
} else {
        System.out.println("Если возраст человека равен " + age + ", то ему  не надо вставать в 5 утра на работу!");
}

int temp = 17;
if (temp <= 5) {
        System.out.println("На улице холодно, нужно надеть шапку.");
} else {
        System.out.println("Сегодня тепло, можно идти без шапки.");
}

int speed = 59;
if (speed > 60) {
        System.out.println("Придется заплатить штраф.");
} else {
        System.out.println("Можно ездить спокойно.");
}

int age1 = 20;
if (age1 >= 2 && age1 <= 6) {
        System.out.println("Если человеку " + age1 + " лет, то ему нужно ходить в детский сад.");
}
if (age1 >= 7 && age1 <= 17) {
        System.out.println("Если человеку " + age1 + " лет, то ему нужно ходить в школу.");
}
if (age1 >= 18 && age1 <= 24) {
        System.out.println("Если человеку " + age1 + " то его место в университете.");
}
if (age1 > 24) {
        System.out.println(" Если человеку " + age1 + " лет, то ему пора ходить на работу.");
                }

int age2 = 20;
if (age2 < 5) {
        System.out.println("Если возраст ребенка равен" + age2 + " лет, то ему нельзя кататься на атракционе. ");
}
if (age2 >= 5 && age2 < 14) {
        System.out.println("Если возраст ребенка равен" + age2 + " лет, то ему можно кататься только в сопровождении взрослого.");
}
if (age2 > 14) {
        System.out.println("Если возраст ребенка равен " + age2 + " лет, то ему можно кататься без сопровождения взрослых.");
}

int total = 120;
int seats = 60;
int place = 86;
if (place > total) {
System.out.println("Мест нет");
        } else {
        if (place > seats) {
System.out.println("Стоим");
        } else {
System.out.println("Сидим");
        }
}

int one =1;
int two = 2;
int three = 3;
if (one > two && one > three) {
        System.out.println(one);
} else {
        if (two > three) {
                System.out.println(two);
        } else {
                System.out.println(three);
        }
}
        }
}