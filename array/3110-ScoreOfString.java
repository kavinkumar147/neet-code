class Solution {
    public int scoreOfString(String s) {
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=(int) s.charAt(i);
        }
        int sum=0;
        for(int i=0;i<s.length() -1;i++){
        int diff=Math.abs(arr[i]-arr[i+1]);
        sum=sum+diff;
        
        }
        return sum;
    }
}
