class Solution {
    public int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
        int mins;
        if (targetSeconds > 5999) {
            mins = 99;
        } else {
            mins = targetSeconds / 60;
        }
        int secs = targetSeconds - mins * 60;
        int ans = Integer.MAX_VALUE;
        while (secs < 100) {
            ans = Math.min(ans, cost(startAt, moveCost, pushCost, mins, secs));
            mins--;
            secs += 60;
        }
        return ans;
    }
    public int cost(int startAt, int moveCost, int pushCost, int mins, int secs) {
        String s = String.valueOf(mins * 100 + secs);
        int total = 0;
        char cur = (char) ('0' + startAt);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == cur) {
                total += pushCost;
            } else {
                total += moveCost;
                total += pushCost;
                cur = ch;
            }
        }
        return total;
    }
}