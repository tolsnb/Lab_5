import java.util.Scanner;
public class NumCompare {
    public static void main(String[] args)
    {
        int numOne = 0;
        int numTwo = 0;
        String invalidOne = "";
        String invalidTwo = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number: ");

        if(in.hasNextInt())
        {
            numOne = in.nextInt();
            in.nextLine();
            System.out.println("Number one is " + numOne);
        }
        else
        {
            invalidOne = in.nextLine();
            in.nextLine();
            System.out.println("Rerun the program and enter a valid input");
        }

        System.out.println("Input the second number: ");

        if(in.hasNextInt())
        {
            numTwo = in.nextInt();
            in.nextLine();
            System.out.println("Number two is " + numTwo);
        }
        else
        {
            invalidTwo = in.nextLine();
            in.nextLine();
            System.out.println("Rerun the program and enter a valid input");
        }

        if(numOne == numTwo)
        {
            System.out.println("The two numbers are equal.");
        }
        else if (numOne > numTwo)
        {
            System.out.println(numOne + " is greater than " + numTwo);
        }
        else if (numOne < numTwo)
        {
            System.out.println(numOne + " is less than " + numTwo);
        }
        else
        {
            System.out.println("Rerun the program and input integers.");
        }
    }
}