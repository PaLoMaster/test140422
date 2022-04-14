package ru.geekbrains.koval;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        compareNumbers();

    }

            public static void printThreeWords() {
                System.out.println("Orange");
                System.out.println("Banana");
                System.out.println("Apple");
            }
    public static void checkSummSign() {
        int a = 2;
        int b = 4;
        if ((a + b) >= 0) {
            System.out.println("сумма положительна");
        } else {
            System.out.println("сумма отрицательна");
        }
    }

        public static void PrintColor () {
            int value = 20;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 && value <= 100) {
                System.out.println("Жёлтый");
            } else {
                System.out.println("Зелёный");
            }
        }

    public static void compareNumbers() {
        int a = 70, b = 42;
        if (a >= b) {
            System.out.println("a>=b");
        } else{
            System.out.println("a<b");
        }

    }
    }