package String;

public class Permutation {
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            int n = s1.length(), m = s2.length();
            if(n!=m) return false;
            int[] arr = new int[26];
            for(int i = 0; i < n; i++){
                arr[s1.charAt(i)-'a']++;
                arr[s2.charAt(i)-'a']--;
            }
            for(int i : arr){
                if(i!=0) return false;
            }
            return true;
    
        }
    }
}
