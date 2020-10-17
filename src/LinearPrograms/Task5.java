package LinearPrograms;

public class Task5 {

    static int sec, min, hours;

    public static void main(String[] args) {
        System.out.println(calculateSec(86399));
    }

    public static String calculateSec(int T) {
        sec = T % 60;
        min = ((T - sec) / 60) % 60;
        hours = (((T - min) / 60) / 60) % 24;
        return (hours + "ч " + min + "мин " + sec + "с ");
    }
}
