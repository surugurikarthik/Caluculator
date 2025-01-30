import java.util.Scanner;
public class Caluculator
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum;
        int Difference;
        int product;
        int quotient;
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("enter second number:");
        int b=sc.nextInt();
        System.out.println("Arithmetic Operations");
        System.out.println("1.Additioin");
        System.out.println("2.SUbtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.EXIT");
        System.out.print("enter your choice:");
        int choice;
        int c=sc.nextInt();
        switch(c){
            case 1:
            sum = a+b;
            System.out.println("Addition:" + sum);
            break;
            case 2:
            Difference = a-b;
            System.out.println("Subtraction:" + Difference);
             break;
            
            case 3:
            product=a*b;
            System.out.println("Mltiplication:" + product );
            break;
            case 4:
            quotient=a/b;
            System.out.println("division:" + quotient);
            break;
            default:
            System.out.println("invalid choice");
            break;
            


            

        }
        sc.close();

    }
}
