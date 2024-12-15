class Solution {
    public String reverseVowels(String s) {
        char[]arr=s.toCharArray();
        String vowels="aeiouAEIOU";
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            while(i<j&& (!(vowels.contains(String.valueOf(s.charAt(i))))) )
            {
                i++;
            }
             while(i<j && (!(vowels.contains(String.valueOf(s.charAt(j))))) )
            {
                j--;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        String ans =new String(arr);
        return ans;
    }
}