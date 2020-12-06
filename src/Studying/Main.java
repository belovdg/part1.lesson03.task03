package Studying;

public class Main {

    public static void main(String[] args) {
        int sec=3600;
        int min=60; // секунд в минуте
        int hour=60; // минут в часе
        int calculation = sec/min/hour;
        System.out.println(sec + " сек" + " = " + calculation + " час");
    }
}
