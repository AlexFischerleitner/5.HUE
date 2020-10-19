package net.htlgrieskirchen.pos3.sudoku;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/* Please enter here an answer to task four between the tags:
 * <answerTask4>
 *    Hier sollte die Antwort auf die Aufgabe 4 stehen.
 * </answerTask4>
 */
public class SudokuSolver implements ISodukoSolver {
    private int [][] inputSudoku;
    
    public SudokuSolver() {
        inputSudoku = new int[9][9];
    }

    @Override
    public final int[][] readSudoku(File file) {

        try {
            inputSudoku = Files.lines(file.toPath())
                    .map(s -> s.split(";"))
                    .map(a -> new int[]{Integer.parseInt(a[0]),
                Integer.parseInt(a[1]),
                Integer.parseInt(a[2]),
                Integer.parseInt(a[3]),
                Integer.parseInt(a[4]),
                Integer.parseInt(a[5]),
                Integer.parseInt(a[6]),
                Integer.parseInt(a[7]),
                Integer.parseInt(a[8])})
                    .toArray(int[][]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputSudoku;
    }

    @Override
    public boolean checkSudoku(int[][] rawSudoku) {
        for (int i = 0; i <= 8; i++) {

        }
        return false; // delete this line!
    }

    @Override
    public int[][] solveSudoku(int[][] rawSudoku) {
        // implement this method
        return new int[0][0]; // delete this line!
    }

    @Override
    public int[][] solveSudokuParallel(int[][] rawSudoku) {
        // implement this method
        return new int[0][0]; // delete this line!
    }

    // add helper methods here if necessary
}
