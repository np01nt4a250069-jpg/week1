
/**
 * Write a description of class W4T2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class W4T2
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num=obj.nextInt();
        if(num%2==0)
        {
        System.out.println("The num is even");
        }
        else
        {
            System.out.print("The num is odd");
        }
    }
}