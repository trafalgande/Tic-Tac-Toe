import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res;
        int d = a - b;
        if ((h - b) % d == 0) {
            res = (h - b) / d;
        } else {
            res = (h - b) / d + 1;
        }
        System.out.println(res);
    }
}
