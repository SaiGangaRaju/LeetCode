class Solution {
    public List<Integer> numOfBurgers(int ts, int cs) {
        ArrayList<Integer> ls= new ArrayList();
        if(ts %2!=0){
            return ls;
        }
        int x,y;
        int a=4,b=2,c=ts,d=1,e=1,f=cs;
        x=((c*e)-(b*f))/((a*d)-(b*d));
        y=((a*f)-(c*d))/((a*d)-(b*d));
        if(x<0 || y<0){
            return ls;
        }
        ls.add(x);
        ls.add(y);
        return ls;
    }
}