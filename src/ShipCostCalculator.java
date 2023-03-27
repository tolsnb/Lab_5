import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String invalidInput = "";
        double salePrice = 0;
        double shipPrice = 0;
        double totalPrice = 0;
        System.out.println("Please enter the price of your purchase: ");

        if(in.hasNextDouble())
        {
            salePrice = in.nextDouble();
            in.nextLine();
            System.out.println("\nThe price of the sale: $" + salePrice);
        }
        else
        {
            invalidInput = in.nextLine();
            System.out.println("Enter a valid input (double)");
        }

        if (salePrice >= 100)
        {
            shipPrice = 0;
            totalPrice = shipPrice + salePrice;
            System.out.println("The price of shipping is free and the total price is $" + totalPrice + ".");
        } else if (salePrice < 100)
        {
            shipPrice = salePrice * 0.02;
            totalPrice = shipPrice + salePrice;
            System.out.println("The price of shipping is $" + shipPrice + " and the total price is $" + totalPrice + ".");
        }
        else
        {
            System.out.println("Invalid input!");
        }
    }
}