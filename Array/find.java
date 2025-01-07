import java.util.*;
public class find{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();

        }
        boolean found = false;
        for(int i=0;i<n;i++){
            // for(int j=0;j<n;j++){
                if(value==arr[i]){
                    found = true;
                    break;
                }
                
        }
        if(found){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        }
    }