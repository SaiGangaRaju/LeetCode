class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int preval = 0;
        int curval = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);         
            if (c == 'I') {
                curval = 1;
            } else if (c == 'V') {
                curval = 5;
            } else if (c == 'X') {
                curval = 10;
            } else if (c == 'L') {
                curval = 50;
            } else if (c == 'C') {
                curval = 100;
            } else if (c == 'D') {

                curval = 500;
            } else if (c == 'M') {
                curval = 1000;
            }
            
            if (curval < preval) {
                sum -= curval;
            } else {
                sum += curval;
                preval = curval;
            }
        }
        return sum;
    }
}
