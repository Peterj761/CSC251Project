public class Project_Peter_Jordan
{                                     //declaring instance variable
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokerStatus;
   private double height;
   private double weight;
   

   
  public Project_Peter_Jordan()// non arg constructor
  {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokerStatus = "Non Smoker";
      height = 0;
      weight = 0;
      
  }
  public Project_Peter_Jordan(String pNum, String pName, String f, String l, int a, String sStatus, double h, double w) //constructor with args
  {
      policyNumber = pNum;
      providerName = pName;
      firstName = f;
      lastName = l;
      age = a;
      smokerStatus = sStatus;
      height = h;
      weight = w;
      
      
      
  }
  public double getBmi()//calculates the BMI
  {
    
     
      return (weight * 703)/(height * height);
      
  }
  public double getInsurancePrice()//Calculares the insurabce price
  {
      double insuranceFee = 600;
      if (age < 50)
      {
         insuranceFee += 75;
      }
      if (smokerStatus.equalsIgnoreCase("Smoker"))
      {
         insuranceFee += 100;
      }
      double bmi = getBmi();
      if (bmi > 35)
      {
         insuranceFee =+ (bmi - 35) * 20;
         
      }
      return insuranceFee;
      
  }//getter methods
  public String getPolicyNumber()
  {
      return policyNumber;
  }
  public String getProviderName()
  {
      return providerName;
  }
  public String getFirstName()
  {
      return firstName;
  }
  public String getLastName()
  {
      return lastName;
  }
  public int getAge()
  {
      return age;
  }
  public String getSmokerStatus()
  {
      return smokerStatus;
  }
  public double getHeight()
  {
      return height;
  }
  public double getWeight()
  {
      return weight;
  }
}