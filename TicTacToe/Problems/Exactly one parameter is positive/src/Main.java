import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > 0) counter++;
        }
        System.out.println(counter == 1);
    }
}
