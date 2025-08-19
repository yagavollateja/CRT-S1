public class Solution {
    public static int[] multiply(int[] a, int[] b, int n)
    {
        int al = a.length;
        int bl = b.length;
        // Write your code here
        int res[] = new int[al+bl-1];
        for(int i=0;i<al;i++){
            for(int j=0;j<bl;j++){
                res[i+j]+=a[i]*b[j];
            }
        }
        return res;
    }
}

