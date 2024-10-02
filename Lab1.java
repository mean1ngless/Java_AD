import java.util.Random;

public class Lab1 {
    public static void main(String[] args) {
        // Task 1: Calculate C-n for choosing tasks
        int c5 = 1;
        int c7 = 1;
        int c11 = 1;

        // Task 2: Transpose matrix C
        byte[][] b = generateMatrix(5, 6); // генерація матриці В, обрав розмірність 5х6
        byte[][] c = transposeMatrix(b); // транспонування матриці В

        // Task 4
        int sum = calculateMinElements(c); // розрахунок суми мін. елементів з кожного рядка

        System.out.println("Lab 1: `Масиви в мові програмування Java`");
        System.out.println("\nЗгенерована матриця B:");
        printMatrix(b);
        System.out.println("\nМатриця С (Транспонована В):");
        printMatrix(c);
        System.out.println("\nСума найменших елементів кожного рядка матриці С:\n" + sum);
    }

    public static byte[][] transposeMatrix(byte[][] matrix) { // метод для транспонування матриці
        int rows = matrix.length;
        int cols = matrix[0].length;
        byte[][] transposed = new byte[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void printMatrix(byte[][] matrix) { // метод для виведення матриці у консоль
        for (byte[] row : matrix) {
            for (byte element : row) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }
    }

    public static byte[][] generateMatrix(int rows, int cols) { // генерація матриці
        byte[][] matrix = new byte[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (byte) random.nextInt(256);
            }
        }

        return matrix;
    }

    public static int calculateMinElements(byte[][] matrix) { // метод для розрахунків суми мінімальних елементів рядків матриці
        int sum = 0;
        int minElement;
        for (byte[] row : matrix) {
            minElement = row[0];
            for (byte element : row) {
                if (element < minElement) {
                    minElement = element;
                }
            }
            sum += minElement;
        }
        return sum;
    }
}