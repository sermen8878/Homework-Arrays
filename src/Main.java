public class Main {
    public static void main(String[] args) {
        // Задача 1: Объявление массивов
        int[] intArray = new int[3]; // Целочисленный массив
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = {1.57, 7.654, 9.986}; // Массив дробных чисел

        String[] stringArray = {"Java", "Python", "C++"}; // Произвольный массив строк

        // Задача 2: Вывод элементов массивов по порядку
        System.out.println("Задача 2:");
        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        System.out.println();

        // Задача 3: Вывод элементов массивов в обратном порядке
        System.out.println("Задача 3:");
        printArrayReverse(intArray);
        printArrayReverse(doubleArray);
        printArrayReverse(stringArray);
        System.out.println();

        // Задача 4: Преобразование нечетных чисел в четные
        System.out.println("Задача 4:");
        makeEven(intArray);
        printArray(intArray);
    }

    // Метод для вывода элементов массива по порядку
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Метод для вывода элементов массива в обратном порядке
    public static void printArrayReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printArrayReverse(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printArrayReverse(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Метод для преобразования нечетных чисел в четные
    public static void makeEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
    }
}