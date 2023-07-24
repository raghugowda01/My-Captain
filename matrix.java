public class MatrixOperations {
    public static void main(String[] args) {
        int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

        int rows = a.length;
        int columns = a[0].length;

        int[][] sumResult = matrixAddition(a, b, rows, columns);
        int[][] productResult = matrixMultiplication(a, b, rows, columns);

        System.out.println("Matrix Addition Result:");
        printMatrix(sumResult);

        System.out.println("\nMatrix Multiplication Result:");
        printMatrix(productResult);
    }

    public static int[][] matrixAddition(int[][] a, int[][] b, int rows, int columns) {
        int[][] sumResult = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumResult[i][j] = a[i][j] + b[i][j];
            }
        }

        return sumResult;
    }

    public static int[][] matrixMultiplication(int[][] a, int[][] b, int rows, int columns) {
        int[][] productResult = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < rows; k++) {
                    productResult[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return productResult;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
