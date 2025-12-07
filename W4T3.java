
/**
 * Write a description of class W4T3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class W4T3
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Please enter your marks");
        double marks=obj.nextFloat();
        if(marks>=80 && marks<=100)
        {
            System.out.println("The grade is A");
        }
        else if(marks>=60)
        {
            System.out.println("The grade is B");
        }
        else if(marks>=40)
        {
            System.out.println("The grade is C");
        }
        else if(marks>=35)
        {
            System.out.print("The grade is D");
        }
        else if(marks<35)
        {
            System.out.print("Non graded");
        }
        else
        {
            System.out.println("Inavlid marks");
        }
}
}