public class Main {
        public static void main(String[] args) {
int age = 20;
if (age >= 18) {
        System.out.println("Если возраст человека равен " + age + ", человек совершеннолетний");
} else {
        System.out.println("Если возраст человека равен " + age + ", не достиг совершеннолетия");
}

int temp = 17;
if (temp <= 5) {
        System.out.println("На улице холодно, нужно надеть шапку.");
} else {
        System.out.println("Сегодня тепло, можно идти без шапки.");
}

int speed = 59;
if (speed > 60) {
        System.out.println("Если скорость равняется " + speed +", то придется заплатить штраф.");
} else {
        System.out.println("Если скорость равняется " + speed + ", то можно ездить спокойно.");
}

int age1 = 20;
if (age1 >= 2 && age1 <= 6) {
        System.out.println("Если возраст человека равен " + age1 + " лет, то ему нужно ходить в детский сад.");
}
if (age1 >= 7 && age1 <= 17) {
        System.out.println("Если возраст человека равен " + age1 + " лет, то ему нужно ходить в школу.");
}
if (age1 >= 18 && age1 <= 24) {
        System.out.println("Если возраст человека равен " + age1 + " лет, то ему нужно ходить в университет.");
}
if (age1 > 24) {
        System.out.println("Если возраст человека равен " + age1 + " лет, то ему нужно ходить на работу.");
                }

int age2 = 20;
if (age2 < 5) {
        System.out.println("Если возраст ребенка равен" + age2 + " лет, то ему нельзя кататься на атракционе. ");
}
if (age2 >= 5 && age2 < 14) {
        System.out.println("Если возраст ребенка равен" + age2 + " лет, то ему можно кататься на аттракционе в сопровождении.");
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