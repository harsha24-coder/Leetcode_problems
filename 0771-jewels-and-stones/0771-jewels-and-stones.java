class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jarr = jewels.toCharArray();
        char[] sarr = stones.toCharArray();
        int count = 0;
        for(int i = 0; i < sarr.length; i++){
            int j=0;
        while(j < jarr.length){
            if(sarr[i] == jarr[j]){
            count++;
            
            }
            j++;
        }
        }
        return count;
    }
}