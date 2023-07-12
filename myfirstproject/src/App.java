import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int spc=n/2;
       int st=1;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=spc;j++){
            System.out.print(" ");

        }
        for(int k=1;k<=st;k++){
            System.out.print("* ");
        }
        if(i<=n/2){
            spc--;
            st +=2;
        }else{
            spc +=2;
            st--;

        }
        System.out.println( );

       }
    }
}
