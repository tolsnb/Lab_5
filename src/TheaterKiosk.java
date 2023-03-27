import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String invalid = "";
        System.out.println("What is your age?: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
            System.out.println("\nYour age is " + age);
        }
        else
        {
            invalid = in.nextLine();
            in.nextLine();
            System.out.println();
        }
        if(age != 0)
        {
            if(age <21)
            {
                System.out.println("You get no wrist band");
            }
            else if(age >= 21)
            {
                System.out.println("You get a wristband.");
            }
        }
    }
}