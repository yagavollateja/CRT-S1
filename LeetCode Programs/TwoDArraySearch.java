import java.util.*;
class Codechef
{
    public static boolean searchOf(int[][] a,int t){
        int r=a.length;
        int c=a[0].length;
        int s=0;
        int e=(c*r)-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int ele=a[mid/c][mid%c];
            if(t==ele){
                return true;
            }
            else if(ele>t){
                e=mid-1;
            }else{
                s=mid+1;
            }
            
        }
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int t=sc.nextInt();
        sc.close();
        if(x==0||y==0){
            System.out.println("NO");
            return;
        }
        int a[][]=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.printf("Enter a element[%d][%d]:",i,j);
                a[i][j]=sc.nextInt();
            }
        }
        if(searchOf(a,t)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
	}
}

