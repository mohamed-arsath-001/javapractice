import java.util.Scanner;

public class harshad{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int soc=0;
        int original=n;
        
        while(n>0){
            soc+=(n%10);
            n=n/10;
        }
        // System.out.println(soc);
     if(original%soc==0){
        System.out.println("its is a harshad number");
        }
    else{
        System.out.println("not a harshad number");
        } 
    }
}