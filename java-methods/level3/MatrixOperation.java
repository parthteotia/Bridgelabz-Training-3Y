import java.util.Random;

public class MatrixOperation {

    // Method to create a random matrix with given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1; // Random values between 1 and 10
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to find the transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        if (matrix.length == 3 && matrix[0].length == 3) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                   matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                   matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        } else {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            int det = determinant2x2(matrix);
            if (det == 0) {
                throw new IllegalArgumentException("Matrix is not invertible (determinant is zero)");
            } else {
                double[][] inverse = new double[2][2];
                inverse[0][0] = matrix[1][1] / (double) det;
                inverse[0][1] = -matrix[0][1] / (double) det;
                inverse[1][0] = -matrix[1][0] / (double) det;
                inverse[1][1] = matrix[0][0] / (double) det;
                return inverse;
            }
        } else {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        if (matrix.length == 3 && matrix[0].length == 3) {
            int det = determinant3x3(matrix);
            if (det == 0) {
                throw new IllegalArgumentException("Matrix is not invertible (determinant is zero)");
            } else {
                double[][] adjugate = new double[3][3];
                adjugate[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
                adjugate[0][1] = matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2];
                adjugate[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];

                adjugate[1][0] = matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2];
                adjugate[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
                adjugate[1][2] = matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2];

                adjugate[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
                adjugate[2][1] = matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1];
                adjugate[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

                double[][] inverse = new double[3][3];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        inverse[i][j] = adjugate[i][j] / det;
                    }
                }
                return inverse;
            }
        } else {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }
    }

    // Main function to test the methods
    public static void main(String[] args) {
        // Create random 2x2 matrix
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        // Transpose of 2x2 matrix
        System.out.println("Transpose of 2x2 Matrix:");
        displayMatrix(transpose(matrix2x2));

        // Determinant of 2x2 matrix
        System.out.println("Determinant of 2x2 Matrix: " + determinant2x2(matrix2x2));

        // Inverse of 2x2 matrix
        System.out.println("Inverse of 2x2 Matrix:");
        double[][] inverse2x2 = inverse2x2(matrix2x2);
        for (double[] row : inverse2x2) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Create random 3x3 matrix
        int[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("3x3 Matrix:");
        displayMatrix(matrix3x3);

        // Transpose of 3x3 matrix
        System.out.println("Transpose of 3x3 Matrix:");
        displayMatrix(transpose(matrix3x3));

        // Determinant of 3x3 matrix
        System.out.println("Determinant of 3x3 Matrix: " + determinant3x3(matrix3x3));

        // Inverse of 3x3 matrix
        System.out.println("Inverse of 3x3 Matrix:");
        double[][] inverse3x3 = inverse3x3(matrix3x3);
        for (double[] row : inverse3x3) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
