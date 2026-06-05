import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int arr[] = new int[N];
	        for(int i=0;i<N;i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        int A = sc.nextInt();
	        int res = arr[A-1];
	        for(int i=0;i<N;i++)
	        {
	            for(int j=0;j<N;j++)
	            {
	                if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
	            }
	        }
	        System.out.print(res);
	}
}
