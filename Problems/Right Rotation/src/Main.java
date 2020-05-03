import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> initialState = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            initialState.add(Integer.valueOf(s));
        }
        int n = scanner.nextInt();
        int iterations;
        if (n > initialState.size()) {
            iterations = n % initialState.size();
        } else {
            iterations = n;
        }
        int index = 0;
        for (int i = initialState.size() - iterations; i < initialState.size(); i++) {
            result.add(index, initialState.get(i));
            index++;
        }
        for (int i = 0; index < initialState.size(); i++) {
            result.add(index, initialState.get(i));
            index++;
        }
        for (int e : result) {
            System.out.print(e + " ");
        }
    }
}