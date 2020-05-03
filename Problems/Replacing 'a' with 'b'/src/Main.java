import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (char c : str.toCharArray()) {
            if (c == 'a') c = 'b';
            System.out.print(c);
        }

    }
}