class Solution {
    public static int abs(int x) {
        return x>0?x:-x;
    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for(int i=1;i<points.length;i++) {
            res+= Math.max(abs(points[i][0]-points[i-1][0]),abs(points[i][1]-points[i-1][1]));
        }
        return res;
    }
}