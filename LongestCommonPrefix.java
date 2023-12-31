//Leetcode 14. Longest Common Prefix
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] A) {
        StringBuilder result = new StringBuilder();
        //int n=A.length();
        Arrays.sort(A);
        //Get the first and last strings
        char[] first = A[0].toCharArray();
        char[] last = A[A.length - 1].toCharArray();
        //start comparing
        for(int i=0;i<first.length;i++)
        {
            if(first[i]!=last[i])
            break;
            result.append(first[i]);
        }
        return result.toString();
    }
}
