import java.util.Scanner;

public class diamond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){ //row
            for(int space=1;space<=n-i;space++){ //spacing
                System.out.print(" ");
             
            }
            for(int j=1;j<=(2*i -1);j++){ //column
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){ //row
            for(int space=1;space<=n-i;space++){ //spacing
                System.out.print(" ");
             
            }
            for(int j=n;j>=(2*i -1);j--){ //column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
        

        


           
        
    
    