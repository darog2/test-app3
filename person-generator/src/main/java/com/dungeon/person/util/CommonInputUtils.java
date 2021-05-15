package com.dungeon.person.util;

import java.util.Random;
import java.util.Scanner;

public class CommonInputUtils {
    private static CommonInputUtils instance = null;
    private final Scanner scanner;
    private final Random random;
    private CommonInputUtils() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public static CommonInputUtils getInstance() {
        if (null == instance) {
            instance = new CommonInputUtils();
        }
        return instance;
    }

    public String readLine(String comment) {
        System.out.print(comment + ": ");
        return scanner.nextLine();

    }

    public int randomInt(int max) {
        return random.nextInt(max);

    }

    public int readInt(String comment) {
        String line;
        String fullLine;
        boolean isCorrect;
        do {
            System.out.print(comment + ": ");
            fullLine = scanner.nextLine();
            if (fullLine.startsWith("-") || fullLine.startsWith("+")) {
                line = fullLine.substring(1);
            } else {
                line = fullLine;
            }
            isCorrect = true;
            if (line.isEmpty()) {
                isCorrect = false;
            } else {
                char[] symbols = line.toCharArray();
                for (int i = 0; i < symbols.length; i++) {
                    if (!Character.isDigit(symbols[i])) {

                        isCorrect = false;
                        break;
                    }
                }
            }
            if (!isCorrect) {
                System.out.println("incorrect input, try again");
            }
        } while (!isCorrect);
        return Integer.parseInt(fullLine);
    }

    public double readDouble(String comment) {
        String line;
        String fullLine;
        boolean isCorrect;
        do {
            System.out.print(comment + ": ");
            fullLine = scanner.nextLine();
            if (fullLine.startsWith("-") || fullLine.startsWith("+")) {
                line = fullLine.substring(1);
            } else {
                line = fullLine;
            }
            boolean isPointFound = false;
            isCorrect = true;
            if (line.isEmpty() || line.equals(".")) {
                isCorrect = false;
            } else {
                char[] symbols = line.toCharArray();
                for (int i = 0; i < symbols.length; i++) {
                    if (!Character.isDigit(symbols[i])) {
                        if (symbols[i] == '.') {
                            if (isPointFound) {
                                isCorrect = false;
                                break;
                            } else {
                                isPointFound = true;
                            }
                        } else {
                            isCorrect = false;
                            break;
                        }
                    }
                }
            }
            if (!isCorrect) {
                System.out.println("incorrect input, try again");
            }
        } while (!isCorrect);
        return Double.parseDouble(fullLine);
    }

    public int[] readIntArray() {
        int size = readInt("введите размер массива");
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = readInt("введите " + i + " элемент массива");
        }
        return result;
    }

    public double[] readDoubleArray() {
        int size = readInt("введите размер массива");
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = readDouble("введите " + i + " элемент массива");
        }
        return result;
    }

    public String[] readStringArray() {
        int size = readInt("введите размер массива");
        String[] result = new String[size];
        for (int i = 0; i < size; i++) {
            result[i] = readLine("введите " + i + " элемент массива");
        }
        return result;
    }

    public int[] createRandomIntArray(int size, int min, int max) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(max - min + 1) + min;
        }
        return result;

    }

    public int[] createRandomIntArray() {
        int size = readInt("введите размер массива");
        int min = readInt("введите минимальное значение рандома");
        int max = readInt("введите максимальное значение рандома");
        return createRandomIntArray(size, min, max);
    }

}
