public class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] times = new int[24 * 60];
        for (String time : timePoints) {
            int index = time.indexOf(":");
            int hour = Integer.parseInt(time.substring(0, index));
            int min = Integer.parseInt(time.substring(index + 1));
            if(times[hour * 60 + min]++ > 0) return 0;
        }

        int first = -1, last = 0, min = Integer.MAX_VALUE;
        int prev = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] == 0) continue;
            if (first == -1) {
                first = i;
                prev = i;
            }
            else {
                min = Math.min(i - prev, min);
                prev = i;
                last = i;
            }
        }

        return Math.min(min, first + times.length - last);
    }
}
