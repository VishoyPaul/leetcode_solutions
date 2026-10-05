class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0; i<n/2; i++){
            int back = n-1-i;
            char temp = s[i];
            s[i] = s[back];
            s[back] = temp;
        }
    }
}