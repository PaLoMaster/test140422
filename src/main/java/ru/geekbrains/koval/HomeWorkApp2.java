package ru.geekbrains.koval;

public class HomeWorkApp2<y, v> {
    public static void main(String[] args) {
        System.out.println(within10and20(10, 3));
        positiveOrNegative(100);
        System.out.println(negativeOrPositive(23));
        PrintMyText("pleasant viewing!", 5);
        System.out.println(leapOrNon(2022));
    }

    public static boolean within10and20(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(int d) {
        if (d >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    public static boolean negativeOrPositive(int x){
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void PrintMyText(String word, int times) {
        int i;
        for( i = 0; i < times; i++){
            System.out.println(word);
        }
    }

    public static boolean leapOrNon(int g) {
    if(((g % 4 == 0) && (g % 100 != 0)) || (g % 400 == 0)) {
            return true;
        }
        else  {
            return false;
        }
    }
}

