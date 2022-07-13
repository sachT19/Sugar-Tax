import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        // Ask the user for the grams of sugar
        Scanner input = new Scanner(System.in);
        System.out.println("How many grams of sugar have you eatern today?");
        int sugar = input.nextInt();
        
        // Use a boolean expression to print if they can eat more sugar
        boolean moreSugar = sugar < 30;
        System.out.println("You can eat more sugar: " + moreSugar);
    }
}
