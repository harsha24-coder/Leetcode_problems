class Solution {
    public String toLowerCase(String s) {
       /* s = s.toLowerCase();
        return s;*/
        int i = 0;
        char[] arr = s.toCharArray();
        while( i< arr.length){
            if(arr[i] >= 'A' && arr[i] <='Z'){
                arr[i] = (char) (arr[i] + 32);
            }
             i++;
        }
        return new String(arr);
    }
}