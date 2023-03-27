import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int BirthMonth = 0;
        String invalid = "";
        System.out.println("Please enter your birth month: ");
        if(in.hasNextInt())
        {
            BirthMonth = in.nextInt();
            in.nextLine();
            System.out.println("\nYou said your birth month is " + BirthMonth);
        }
        else
        {
            invalid = in.nextLine();
            System.out.println("\nYou said your birth month was " + invalid);
            System.out.println("Run the program again and enter your birth month in the form of an integer.");
        }
        if(BirthMonth >= 1 && BirthMonth <= 12)
        {
            System.out.println("Your birth month is " + BirthMonth);
        }
        else if (BirthMonth != 0)
        {
            System.out.println("Rerun the program and enter a valid input!");
        }
    }
}