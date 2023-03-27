import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menu = "D - Democrats / R - Republicans / I - Independent";
        String partyChoice = "";
        System.out.println("Enter your party choice:");
        System.out.println("\n" + menu);
        if(in.hasNext())
        {
            partyChoice = in.nextLine();
            System.out.println("\nYou chose " + partyChoice);
        }
        partyChoice = partyChoice.toUpperCase();
        System.out.println("Simulating for your choice [" + partyChoice + "]");
        switch (partyChoice)
        {
            case "D":
                System.out.println("You get a Democratic Donkey");
                break;
            case "R":
                System.out.println("You get a Republican Elephant");
                break;
            case "I":
                System.out.println("You get an Independent Person");
                break;
            default:
                System.out.println("You get something else");
        }
    }
}