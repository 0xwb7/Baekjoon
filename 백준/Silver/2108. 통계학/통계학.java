import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int avg = Math.round((float) sum(arr) / n);
        int mid = arr[n / 2];
        int mode = getMode(arr);
        int range = Math.abs(arr[0] - arr[n - 1]);

        sb.append(avg).append("\n").append(mid).append("\n").append(mode).append("\n").append(range).append("\n");

        System.out.println(sb);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int getMode(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = Collections.max(map.values());

        List<Integer> maxKeys = map.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        Collections.sort(maxKeys);

        if (maxKeys.size() == 1) {
            return maxKeys.get(0);
        } else {
            return maxKeys.get(1);
        }
    }
}
