import java.util.Scanner;

public class star2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){ //row
            for(int j=n;j>=i;j--){ //column
                System.out.print("*");
             
            }
            System.out.println();

           
        }
    }
}