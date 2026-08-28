class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if (!Character.isLetterOrDigit(arr[left])) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(arr[right])) {
                right--;
                continue;
            }

            // If characters don't match
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}