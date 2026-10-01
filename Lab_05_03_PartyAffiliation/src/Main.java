public class Main
{
    public static void main(String[] args)
    {
        //Declaration
        String party = "0";

        //User Engagement Prompt
        System.out.println("Enter your party.");
        System.out.println("Other");
        party = "Other";

        if (party == "D")
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (party == "R")
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if (party == "I")
        {
            System.out.println("You get and Independent Individual!");
        }
        else
        {
            System.out.println("You get ... Something?");
        }
    }
}