class Solution {
    public double angleClock(int hour, int min) {
        double ans= Math.abs((30*hour)+(0.5*min)-(6*min));
        return Math.min(ans,360-ans);
    }
}