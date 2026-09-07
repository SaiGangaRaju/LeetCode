class Solution {
    public double[] convertTemperature(double celsius) {
        double a1,a2;
        a1=celsius+273.15;
        a2=celsius*1.80+32.00;
        double arr[]={a1,a2};
        return arr;
    }
}