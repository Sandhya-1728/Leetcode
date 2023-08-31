class Solution {
    public String reverseVowels(String s) {
        char k[]=s.toCharArray();
        int n=0;
        int m=s.length()-1;
        String v="aeiouAEIOU";
        while(n<m){
            while(n<m && v.indexOf(k[n])==-1){
                n+=1;
            }
            while(n<m && v.indexOf(k[m])==-1){
                m-=1;
            }
            char t=k[n];
            k[n]=k[m];
            k[m]=t;
            n+=1;
            m-=1;
        }
        String str=new String(k);
        return str;
    }
}