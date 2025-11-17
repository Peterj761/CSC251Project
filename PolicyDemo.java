import java.util.ArrayList;
import java.util.Scanner;

public class PolicyDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int another = 2;
        ArrayList<Policy> project = new ArrayList<>();

        while (another == 2)
        {
            System.out.println("Please enter your policy number:");
            String policyNumber = keyboard.nextLine();

            System.out.println("Please enter the name of your provider:");
            String providerName = keyboard.nextLine();

            System.out.println("Please enter your first name:");
            String firstName = keyboard.nextLine();

            System.out.println("Please enter your last name:");
            String lastName = keyboard.nextLine();

            String smokerStatus;
            while (true)
            {
                System.out.println("Please enter (Smoker or Non Smoker):");
                smokerStatus = keyboard.nextLine();
                if (smokerStatus.equalsIgnoreCase("smoker") || smokerStatus.equalsIgnoreCase("non smoker"))
                    break;
                else
                    System.out.println("Invalid; please enter (Smoker or Non Smoker)");
            }

            System.out.println("Please enter your age:");
            int age = keyboard.nextInt();
            while (age < 0)
            {
                System.out.println("Please enter a valid number:");
                age = keyboard.nextInt();
            }

            System.out.println("Please enter your height (in inches):");
            double height = keyboard.nextDouble();
            while (height <= 0)
            {
                System.out.println("Please enter a valid number:");
                height = keyboard.nextDouble();
            }

            System.out.println("Please enter your weight (in pounds):");
            double weight = keyboard.nextDouble();
            while (weight <= 0)
            {
                System.out.println("Please enter a valid number:");
                weight = keyboard.nextDouble();
            }

            keyboard.nextLine(); 

            // Create policyHolder object
            policyHolder holder = new policyHolder(firstName, lastName, age, smokerStatus, height, weight);

            // Create Policy object
            Policy policy = new Policy(policyNumber, providerName, holder);
            project.add(policy);

            // ask if user wants to add another entry
            System.out.println("Would you like to add another entry? (Y/N)");
            String goAgain = keyboard.nextLine();
            if (goAgain.equalsIgnoreCase("N"))
                another = 1;
            else
                another = 2;

            System.out.println("\n----------------------------------------\n");
        }

        // output all entries
        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (Policy policy : project)
        {
            // Use Policy's toString method
            System.out.println(policy.toString());
            System.out.println("\n========================================\n");

            if (policy.getPolicyHolder().getSmokerStatus().equalsIgnoreCase("smoker"))
                smokerCount++;
            else
                nonSmokerCount++;
        }

        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}