import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        int[][] matrix = new int[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < rows; i++) {
            if (k > 1) {
                for (int j = 0; j < seats - k + 1; j++) {
                    flag = true;
                    for (int l = 0; l < k; l++) {
                        if (matrix[i][j + l] != 0) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) break;
                }
            } else {
                for (int j = 0; j < seats; j++) {
                    if (matrix[i][j] == 0) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }
}