import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static void insertionSort(int n,int arr[])
    {
        for(int i=0;i<n;i++)
        {
            int k = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > k)
            {
                arr[j+1] = arr[j];
                j--;
                arr[j+1] = k;
            }
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        insertionSort(n,arr);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}