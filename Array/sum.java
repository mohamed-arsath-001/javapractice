import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
             count+=arr[i];
            
        }
        System.out.println(count);
    }
}