package InheritanceObv;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public void read(int[][] a,int r,int c){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    public void multiplication(int a[][],int b[][],int c[][],int c1,int r1,int c2,int r2){
        if(c1==r2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
        }
    }
    public void display(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        Codechef cc=new Codechef();
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        cc.read(a,r1,c1);
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        cc.read(b,r2,c2);
        int c[][]=new int[r1][c2];
        cc.multiplication(a,b,c,c1,r1,c2,r2);
        cc.display(c);
    }
}

