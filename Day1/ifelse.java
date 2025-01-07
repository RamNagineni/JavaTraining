import java.util.Scanner;

public class ifelse {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the even number");
        int input=Integer.parseInt(sc.nextLine());
        
        if((input%2)==0){
            System.out.println("this is an even number");
        }else{
            System.out.println("this is an odd number");
        }

    }
    
}
