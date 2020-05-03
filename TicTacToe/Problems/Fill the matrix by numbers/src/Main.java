import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j + k) {
                        matrix[i][j] = k;
                        matrix[j][i] = k;
                    }
                }
            }
        }
        for (int[] row : matrix) {
            for (int c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
