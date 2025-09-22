import java.util.Scanner;

public class project1Demo
{
   public static void main(String[] args)
   {
       Scanner keyboard = new Scanner(System.in);//gets the keyboard scanner
       
       String policyNumber;
       
       System.out.println("Please enter your policy number");//gets the policy number from the user
       policyNumber = keyboard.nextLine();
       
       String providerName;
       System.out.println("Please enter the name of your provider");//gets the provider from the user

       providerName = keyboard.nextLine();
       
       String firstName;
       System.out.println("Please enter your first name");//gets the users firdt name
       firstName = keyboard.nextLine();
       
       String lastName;
       System.out.println("Please enter your last name");//gets the users last name
       lastName = keyboard.nextLine();
       
        String smokerStatus;
 
       while(true)
       {
         
         System.out.println("Please enter (Smoker or Non Smoker)");//propmts the user to type whether or not they smoke
         smokerStatus = keyboard.nextLine();
         if (smokerStatus.equalsIgnoreCase("smoker") || smokerStatus.equalsIgnoreCase("Non smoker"))//ensures that the user can only type either "smoker" or "non Smoker"
         {
            break;
         }
         else
         {
            System.out.println(" invalid; please enter (smoker or Non smoker)");
         }  
            
       }
       int age;
       System.out.println("please enter your age");//gets the age of the user
       age = keyboard.nextInt();
       if (age < 0)
       {
         System.out.println("Please enter a valid number");//ensures that the user can only type numbers above 0
         age = keyboard.nextInt();
         
       }
       
       double height;
       System.out.println("please enter your height");//gets the height of the user
       height = keyboard.nextDouble();
       if (height < 0)
       {
         System.out.println("Please enter a valid number");//ensures that the user can only type numbers above 0
         height = keyboard.nextDouble();
       }
        
       double weight;//gets the weight of the user
       System.out.println("please enter your weight");//ensures that the user can only type numbers above 0
       weight = keyboard.nextDouble();
       if (weight < 0)
       {
         System.out.println("Please enter a valid number");
         weight = keyboard.nextDouble();
       }
       
       
        Project_Peter_Jordan policy = new Project_Peter_Jordan(policyNumber, providerName, firstName, lastName, age, smokerStatus, height, weight);//calls in the Project class
        
        System.out.println("policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider name: " + policy.getProviderName());
        System.out.println("First name: " + policy.getFirstName());
        System.out.println("Last name: " + policy.getLastName());
        System.out.println("age :  " + policy.getAge());
        System.out.println("smoker status: " + policy.getSmokerStatus());
        System.out.println("height: " + policy.getHeight());
        System.out.println("BMI: " + policy.getBmi());
        System.out.println("Price: " + policy.getInsurancePrice());
       } 

       

       
       
       

   
}