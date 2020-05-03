import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counterM = 0;
        int counterZ = 0;
        int counterO = 0;
        for (int i = 0; i < n; i++) {
            switch (scanner.nextInt()) {
                case -1:
                    counterM++;
                    break;
                case 0:
                    counterZ++;
                    break;
                case 1:
                    counterO++;
                    break;
            }
        }
        System.out.println(counterZ + " " + counterO + " " + counterM);
    }
}