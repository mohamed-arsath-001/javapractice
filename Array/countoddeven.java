import java.util.*;
public class countoddeven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        int[] arr=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                even++;


            }
            else{
                odd++;
            }

        }
        System.out.println(odd);
        System.out.println(even);

    }
}