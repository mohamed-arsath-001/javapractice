import java.util.*;
public class magic_number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mag=25;
        int n=sc.nextInt();
        // int i=0;
        while(n !=mag){
            if(n>mag){
                System.out.println("too high");
               
            }
            else if(n<mag){
                System.out.println("too low");
               
            }
            else{
                System.out.println("correct guess");
            }
            break;
            // int n=sc.nextInt();
        }

    }
}