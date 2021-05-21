import java.util.Scanner;
public class Atm
{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your pin number");
        int x = sc.next().charAt(0);
        System.out.println("press 'b' for balance check");
        System.out.println("press 'w' for withdraw check");
        System.out.println("press 'e' for exit ");
        char a = sc.next().charAt(0);
        switch(a){
            case 'b':
            int y=1000;
            System.out.println("your balance is "+y);
            break;
            case 'w':
            System.out.println("how much money you want to withdraw");
            int z = sc.nextInt();
            if(z>10000){
                System.out.println("you don not have sufficient balance");
            }
            else{
                System.out.println("you have withdraw" +z);
                int e = 1000 -z;
                System.out.println("your current amount is" +e);}
                break;
                case 'e':
                System.out.println("exit nai gareyko ho?");
                break;
            }
            System.out.println("Thank You");
        }
    }
                