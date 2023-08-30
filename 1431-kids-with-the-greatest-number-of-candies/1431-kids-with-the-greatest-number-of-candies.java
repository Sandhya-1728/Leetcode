class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int m=candies[0];
        for(int i=1;i<candies.length;i++){
            if(m<candies[i]){
                m=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            l.add(candies[i]+extraCandies >=m);
        }
        return l;
    }
}