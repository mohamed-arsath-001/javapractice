import java.util.*;
public class evenodd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);


        }
        }

    }
}