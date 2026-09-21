class Solution {
    int n;
    public String longestPalindrome(String s) {
      int max=0;
      int start=0;
      int end=0;
      n=s.length();
      for(int i=0;i<s.length();i++){
        int len1=expand(s,i,i);
        int len2=expand(s,i,i+1);
        int len=Math.max(len1,len2);
        
        if(len>max){
            start=i-(len-1)/2;
            end=i+len/2;
            max=len;
        }

      }
      return s.substring(start,end+1);
    }
    public int expand(String s,int left,int right){

       
        while(left>=0&&right<n&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}