import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0)
	    {
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
	            for(int j=0;j<N-i-1;j++)
	            {
	                if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
	            }
	        }
	        for(int i=0;i<N;i++)
	        {
	            if(arr[i] == res)
	            {
	                System.out.println(i+1);
	            }
	        }
	        
	        
	    }
	    

	}
}
