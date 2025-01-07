import java.util.Scanner;

public class switchCondition {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the even number");
        int input=Integer.parseInt(sc.nextLine());
        
        if((input%2)==0){
            System.out.println("this is an even number");
        }else{
            System.out.println("this is an odd number");
        }

        switch(input){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println ("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("sunday");
        }

    }
    
}
