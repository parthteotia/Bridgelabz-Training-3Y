import java.util.Random;
import java.util.Scanner;

/**
 * This program performs basic matrix operations: addition, subtraction,
 * and multiplication on randomly generated matrices.
 */
public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--- Matrix Manipulation Program ---");

        // Define dimensions for addition and subtraction (matrices must be same size)
        int addSubRows = random.nextInt(3) + 2; // Random rows between 2 and 4
        int addSubCols = random.nextInt(3) + 2; // Random cols between 2 and 4

        // --- Matrix Creation ---
        System.out.println("\nGenerating two random matrices for addition/subtraction...");
        int[][] matrixA = createRandomMatrix(addSubRows, addSubCols);
        int[][] matrixB = createRandomMatrix(addSubRows, addSubCols);

        System.out.println("\nMatrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        // --- Addition ---
        System.out.println("\n--- 1. Matrix Addition (A + B) ---");
        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        if (sumMatrix != null) {
            System.out.println("Result:");
            printMatrix(sumMatrix);
        }

        // --- Subtraction ---
        System.out.println("\n--- 2. Matrix Subtraction (A - B) ---");
        int[][] diffMatrix = subtractMatrices(matrixA, matrixB);
        if (diffMatrix != null) {
            System.out.println("Result:");
            printMatrix(diffMatrix);
        }
        
        // --- Multiplication ---
        // For multiplication, cols of first matrix must equal rows of second.
        System.out.println("\n\nGenerating two new compatible matrices for multiplication...");
        int mulRowsA = random.nextInt(2) + 2; // Random rows for C (2-3)
        int mulColsA_RowsB = random.nextInt(2) + 3; // Common dimension (3-4)
        int mulColsB = random.nextInt(2) + 2; // Random cols for D (2-3)

        int[][] matrixC = createRandomMatrix(mulRowsA, mulColsA_RowsB);
        int[][] matrixD = createRandomMatrix(mulColsA_RowsB, mulColsB);

        System.out.println("\nMatrix C (" + mulRowsA + "x" + mulColsA_RowsB + "):");
        printMatrix(matrixC);
        
        System.out.println("\nMatrix D (" + mulColsA_RowsB + "x" + mulColsB + "):");
        printMatrix(matrixD);

        System.out.println("\n--- 3. Matrix Multiplication (C * D) ---");
        int[][] prodMatrix = multiplyMatrices(matrixC, matrixD);
        if (prodMatrix != null) {
            System.out.println("Result:");
            printMatrix(prodMatrix);
        }
        
        scanner.close();
    }

    /**
     * Creates a matrix of a given size with random integer values between 0 and 9.
     * @param rows The number of rows for the matrix.
     * @param cols The number of columns for the matrix.
     * @return The randomly generated 2D integer array (matrix).
     */
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random numbers from 0-9
            }
        }
        return matrix;
    }

    /**
     * Adds two matrices. Returns null if matrices have different dimensions.
     * @param matrixA The first matrix.
     * @param matrixB The second matrix.
     * @return The resulting sum matrix, or null if the operation is not possible.
     */
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Error: Matrices must have the same dimensions for addition.");
            return null;
        }
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    /**
     * Subtracts the second matrix from the first. Returns null if matrices have different dimensions.
     * @param matrixA The first matrix (minuend).
     * @param matrixB The second matrix (subtrahend).
     * @return The resulting difference matrix, or null if the operation is not possible.
     */
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Error: Matrices must have the same dimensions for subtraction.");
            return null;
        }
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    /**
     * Multiplies two matrices. Returns null if they are not compatible.
     * @param matrixA The first matrix.
     * @param matrixB The second matrix.
     * @return The resulting product matrix, or null if the operation is not possible.
     */
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        if (colsA != rowsB) {
            System.out.println("Error: The number of columns in the first matrix must equal the number of rows in the second.");
            return null;
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
    
    /**
     * A utility method to print a matrix to the console.
     * @param matrix The 2D integer array to be printed.
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
