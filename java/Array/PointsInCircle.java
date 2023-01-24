package Array;

// 1828. https://leetcode.cn/problems/queries-on-number-of-points-inside-a-circle/
public class PointsInCircle {
    public int[] countPoints(int[][] points, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];
        for (int j = 0; j < len; j++) {
            int num = 0;
            double cx = queries[j][0], cy = queries[j][1], r = queries[j][2];
            for (int i = 0; i < points.length; i++) {
                double x = points[i][0], y = points[i][1];
                double d = Math.sqrt((x - cx) * (x - cx) + (y - cy) * (y - cy));
                if (d <= r) {
                    num++;
                }
            }
            answer[j] = num;
        }
        return answer;
    }
}
