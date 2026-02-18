import java.util.Scanner;
public class SwitchCaseExample
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
    int size;
    System.out.print("Enter a size:");
    size = sc.nextInt();
switch(size){
            case 1:
                System.out.println("Extra Small");
                break;
            case 2:
                System.out.println("Small");
                break;
            case 3:
                System.out.println("Medium");
                break;
            case 4:
                System.out.println("Large");
                break;
            case 5:
                System.out.println("Extra Large");
                break;
            default:
                System.out.println("Invalid size number");
        }
    }
}