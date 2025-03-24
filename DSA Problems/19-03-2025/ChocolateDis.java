import java.util.Scanner;
import java.util.Arrays;

public class ChocolateDis
{
    public static int chocolateDistribution(int arr[],int n,int m)
    {
        if(m>n)
        {
            return -1;
        }
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for(int i = 0;i <= n-m;i++)
        {
            int diff = arr[i+m-1]-arr[i];
            mindiff=Math.min(mindiff,diff);
        }
        return mindiff;
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        int m=sc.nextInt();
        
        System.out.println(chocolateDistribution(arr,n,m));

    }
}