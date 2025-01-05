import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int soc=0;

        while(n>0){
            soc+=(n%10);
            n=n/10;
        }
        System.out.println(soc); 
    }
}