package tictactoe;

import javax.print.attribute.standard.Finishings;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] c = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
/*

        String input = scanner.nextLine().replaceAll("_", " ");
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('O', 0);
        hashMap.put('X', 0);
        for (Map.Entry entry : hashMap.entrySet()) {
            for (char ch : input.toCharArray()) {
                if (entry.getKey().equals(ch)) {
                    int prev = (int) entry.getValue();
                    entry.setValue(prev + 1);
                }
            }
        }
        String temp = input;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = temp.charAt(j);
            }
            temp = temp.substring(3);
        }
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("---------");
*/

        /*if (Math.abs(hashMap.get('X') - hashMap.get('O')) > 1) {
            System.out.println("Impossible");
            return;
        }
        */
        int a;
        int b;
        int iteration = 1;
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("---------");
        while (true) {

            System.out.print("Enter the coordinates: ");
            String line = scanner.nextLine();
            if (line.matches(".*\\d.*")) {
                a = Integer.parseInt(line.split(" ")[0]);
                b = Integer.parseInt(line.split(" ")[1]);
                if (a > 3 || a < 1 || b > 3 || b < 1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    char[][] rotated = rotate(c);
                    if (rotated[a - 1][b - 1] != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        if (iteration % 2 == 0) {
                            rotated[a - 1][b - 1] = 'O';
                        } else {
                            rotated[a - 1][b - 1] = 'X';
                        }
                        c = deRotate(rotated);
                        iteration++;
                        System.out.println("---------");
                        for (int i = 0; i < 3; i++) {
                            System.out.print("| ");
                            for (int j = 0; j < 3; j++) {
                                System.out.print(c[i][j] + " ");
                            }
                            System.out.print("|\n");
                        }
                        System.out.println("---------");
                        if (winCondition(c)) {
                            c = new char[][]{
                                    {' ', ' ', ' '},
                                    {' ', ' ', ' '},
                                    {' ', ' ', ' '}};
                            break;
                        }
                    }
                }

            } else {
                System.out.println("You should enter numbers!");
            }
        }
    }

    public static char[][] rotate(char[][] initialState) {
        int n = initialState.length;
        char[][] rotated = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[i][j] = initialState[n - j - 1][i];
            }
        }
        return rotated;
    }

    public static char[][] deRotate(char[][] initialState) {
        int n = initialState.length;
        char[][] rotated = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][i] = initialState[i][n - j - 1];
            }
        }
        return rotated;
    }

    public static boolean winCondition(char[][] c) {
        boolean won = false;
        char winner = ' ';
        for (int i = 0; i < 3; i++) {
            if (c[i][0] == c[i][1] && c[i][0] == c[i][2]) {
                if (winner == ' ')
                    winner = c[i][0];

            }
            if (c[0][i] == c[1][i] && c[0][i] == c[2][i]) {
                if (winner == ' ')
                    winner = c[0][i];

            }
            if (c[0][0] == c[1][1] && c[0][0] == c[2][2]) {
                winner = c[0][0];

            }
            if (c[0][2] == c[1][1] && c[0][2] == c[2][0]) {
                winner = c[0][2];
            }
        }
        if (winner != ' ') {
            System.out.println(winner + " wins");
            won = true;
        }
        return won;
    }
}
