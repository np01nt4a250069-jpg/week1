
/**
 * Write a description of class W4T4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W4T4
{
    public static void main(String[] args)
    {
        char grade='G';
        //switch case statements
        switch(grade)
        {
            case'A':System.out.println("Your marks is >=80");
            break;
            case'B':System.out.println("Your marks is >=60");
            break;
            case'C':System.out.println("Your marks is >=40");
            break;
            case'D':System.out.println("Your marks is >=35");
            break;
            case'F':System.out.println("You have failed");
            break;
            default:System.out.println("Inavlid Grade");
        }
        
    }
}