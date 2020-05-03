import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] matrix = new int[a][b];
        int[][] matrixT = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                matrixT[i][j] = matrix[a-j-1][i];
            }
        }
        for (int[] row : matrixT) {
            for (int c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}