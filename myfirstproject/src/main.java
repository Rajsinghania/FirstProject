import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       for(int i=1;i<=n;i++){
       
        for(int j=1;j<=i;j++){
            System.out.print("* ");
            
        }
        
        System.out.println();
        
       }
       
    }
    
}
