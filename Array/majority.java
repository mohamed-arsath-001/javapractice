import java.util.*;
public class majority{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i])
                count++;
            }
        
    if(count>=n/2)
    System.out.print(arr[i]);
    break;
        }

    }
}