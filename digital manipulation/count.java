import java.util.Scanner;

public class count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;

        while(n>0){
            // soc+=(n%10);
            n=n/10;
            count++;
        }
        System.out.print(count); 
    }
}