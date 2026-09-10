import java.util.ArrayList;

class Solution {
    public static int[] solution(int[] p, int[] s) {
        int len = p.length;
        ArrayList<Integer> arr = new ArrayList<>();

        int idx = 0;
        int total = 0;
        while (true) {
            int cnt = 0;
            toComplete(p, s, len, idx);
            for (int i = idx; i < len; i++) {
                if (p[i] >= 100) {
                    cnt++;

                    if (i == len - 1) {
                        total += cnt;
                        arr.add(cnt);
                    }
                } else {
                    arr.add(cnt);
                    total += cnt;
                    idx = i;
                    cnt = 0;
                    break;
                }

            }

            if (total == len) {
                break;
            }
        }

        int[] retArr = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            retArr[i] = arr.get(i);
        }

        return retArr;
    }

    public static void toComplete(int[] p, int[] s, int len, int idx) {
        while (true) {
            if (p[idx] >= 100) {
                break;
            }

            for (int i = idx; i < len; i++) {
                p[i] += s[i];
            }

        }
    }
}