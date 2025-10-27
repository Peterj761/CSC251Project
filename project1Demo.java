import java.util.ArrayList;
import java.util.Scanner;

public class project1Demo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int another = 2;
        ArrayList<Project_Peter_Jordan> project = new ArrayList<>();

        while (another == 2)
        {
            String policyNumber;
            System.out.println("Please enter your policy number:");
            policyNumber = keyboard.nextLine();

            String providerName;
            System.out.println("Please enter the name of your provider:");
            providerName = keyboard.nextLine();

            String firstName;
            System.out.println("Please enter your first name:");
            firstName = keyboard.nextLine();

            String lastName;
            System.out.println("Please enter your last name:");
            lastName = keyboard.nextLine();

            String smokerStatus;
            while (true)
            {
                System.out.println("Please enter (Smoker or Non Smoker):");
                smokerStatus = keyboard.nextLine();
                if (smokerStatus.equalsIgnoreCase("smoker") || smokerStatus.equalsIgnoreCase("non smoker"))
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid; please enter (Smoker or Non Smoker)");
                }
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

            keyboard.nextLine(); // clear leftover newline

            // create and add to ArrayList
            Project_Peter_Jordan policy = new Project_Peter_Jordan(policyNumber, providerName, firstName, lastName, age, smokerStatus, height, weight);
            project.add(policy);

            // ask if user wants to add another
            System.out.println("Would you like to add another entry? (Y/N)");
            String goAgain = keyboard.nextLine();

            if (goAgain.equalsIgnoreCase("N"))
            {
                another = 1;
            }
            else if (goAgain.equalsIgnoreCase("Y"))
            {
                another = 2;
                System.out.println("\n----------------------------------------\n");
            }
            else
            {
                another = 1;
            }
        }

        // output all entries
        int smokerCount = 0;
        int nonSmokerCount = 0;

       

        for (Project_Peter_Jordan policy : project)
        {
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("First Name: " + policy.getFirstName());
            System.out.println("Last Name: " + policy.getLastName());
            System.out.println("Age: " + policy.getAge());
            System.out.println("Smoker Status: " + policy.getSmokerStatus());
            System.out.println("Height: " + policy.getHeight());
            System.out.println("Weight: " + policy.getWeight());
            System.out.printf("BMI: %.2f%n", policy.getBmi());
            System.out.printf("Policy Price: $%.2f%n", policy.getInsurancePrice());
            System.out.println("\n========================================\n");

            if (policy.getSmokerStatus().equalsIgnoreCase("smoker"))
                smokerCount++;
            else
                nonSmokerCount++;
        }

        System.out.println("Number of Policyholders that are smokers: " + smokerCount);
        System.out.println("Number of Policyholders that are non-smokers: " + nonSmokerCount);
    }
}