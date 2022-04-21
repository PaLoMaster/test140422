package ru.geekbrains.koval;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        compareNumbers(70, 42);
        checkSummSign(2, 4);
    }

            public static void printThreeWords() {
                System.out.println("Orange");
                System.out.println("Banana");
                System.out.println("Apple");
            }
    public static void checkSummSign(int a, int b) {
        if ((a + b) >= 0) {
            System.out.println("сумма положительна");
        } else {
            System.out.println("сумма отрицательна");
        }
    }

        public static void printColor(int value) {
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value <= 100) {
                System.out.println("Жёлтый");
            } else {
                System.out.println("Зелёный");
            }
        }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else{
            System.out.println("a<b");
        }

    }
    }