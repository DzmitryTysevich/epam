package com.epam.task.module2.arraysOfArrays;
import static com.epam.task.Utils.MatrixUtil.getRandomMatrix;
import static com.epam.task.Utils.PrintMatrixUtil.printMatrix;
public class Task1 {
    public static void main(String[] args) {
        Task1 oddColumnsRunner = new Task1();
        oddColumnsRunner.run();
    }
    /**
     * Runs a task.
     */
    public void run() {
        int[][] randomMatrix = getRandomMatrix();
        int[][] oddColumnsMatrix = getOddColumnMatrix(randomMatrix);
        printMatrix(oddColumnsMatrix);
    }
    /**
     * Gets a new matrix where odd columns are equal to odd columns in the input matrix
     * where an odd column of the input matrix has a first element bigger then a last one.
     * Other columns are filled with zero values.
     *
     * @param matrix  a matrix
     * @return a odd columns matrix.
     */
    public int[][] getOddColumnMatrix(int[][] matrix) {
        int oddLineSize = matrix.length;
        int oddColumnSize = matrix[0].length;
        int[][] oddColumnMatrix = new int[oddLineSize][oddColumnSize];
        for (int columnNumber = 1; columnNumber <= oddColumnSize; columnNumber++) {
            if (isNotEven(columnNumber) && isFirstElementBiggerLastOne(matrix, getIndex(columnNumber))) {
                copyColumn(matrix, oddColumnMatrix, getIndex(columnNumber));
            }
        }
        return oddColumnMatrix;
    }
    /**
     * Copies column by index from an input matrix to an output matrix.
     *
     * @param input an input matrix.
     * @param output an output matrix.
     * @param columnIndex an column index of an input matrix column being copied.
     */
    private void copyColumn(int[][] input, int[][] output, int columnIndex) {
        for (int lineCount = 0; lineCount < input.length; lineCount++) {
            output[lineCount][columnIndex] = input[lineCount][columnIndex];
        }
    }
    /**
     * Checks if first element in a specified column is bigger then a last one.
     *
     * @param matrix a specified matrix
     * @param columnIndex a column of the matrix
     * @return a flag
     */
    private boolean isFirstElementBiggerLastOne(int[][] matrix, int columnIndex) {
        return getFirstElementInColumn(matrix, columnIndex) > getLastElementInColumn(matrix, columnIndex);
    }
    private int getIndex(int columnNumber) {
        return columnNumber - 1;
    }
    private int getFirstElementInColumn(int[][] matrix, int columnIndex) {
        return matrix[0][columnIndex];
    }
    private int getLastElementInColumn(int[][] matrix, int columnIndex) {
        return matrix[matrix.length - 1][columnIndex];
    }
    private boolean isNotEven(int column) {
        return column % 2 != 0;
    }
}