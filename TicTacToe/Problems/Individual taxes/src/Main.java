import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] annual = new double[n];
        double[] taxes = new double[n];
        double[] income = new double[n];
        for (int i = 0; i < n; i++) {
            annual[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            taxes[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            income[i] = annual[i] * taxes[i] / 100;
        }
        HashMap<Integer, Double> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
           hashMap.put(i, income[i]);
        }
        Map.Entry<Integer, Double> max = null;
        for (Map.Entry<Integer, Double> entry : hashMap.entrySet()) {
            if (max == null || entry.getValue().compareTo(max.getValue()) > 0) {
                max = entry;
            }
        }
        assert max != null;
        System.out.println(max.getKey()+1);
    }
}