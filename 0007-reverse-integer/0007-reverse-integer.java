class Solution {
    public int reverse(int x) {
        long s=0;
        int rem=0;
        int t=x;
        while(t!=0){
            rem=t%10;
            s=(s*10)+rem;
            t/=10;
        }
        if(s > Integer.MAX_VALUE || s < Integer.MIN_VALUE)
            return 0;
        return (int)s;
    }
}