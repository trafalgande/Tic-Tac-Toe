import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().replaceAll("\\s+", "");
        String anotherStr = scanner.nextLine().replaceAll("\\s+", "");
        System.out.println(str.equals(anotherStr));
    }
}