import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (true) {
            int a = scanner.nextInt();
            if (a == 0) break;
            res += a;
        }
        System.out.println(res);
    }
}