import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prev = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();
            if (current > prev) {
                prev = current;
            }
            else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}