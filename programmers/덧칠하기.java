import java.util.Arrays;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);

        for (int i = 0; i < section.length; i++) {
            int paint = section[i] - 1;
            arr[paint] = false;
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isPainted = arr[i];

            if (!isPainted) {
                answer++;
                
                for (int j = 0; j < m; j++) {
                    if (i + j >= n) {
                        break;
                    }
                    
                    arr[i + j] = true;
                }
            }
        }

        return answer;
    }
}
