public class Project_Peter_Jordan
{
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private double age;
   private String smokerStatus;
   private double height;
   private double weight;
   

   
  public Project_Peter_Jordan()
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
  public Project_Peter_Jordan(String pNum, String pName, String f, String l, double a, String sStatus, double h, double w)
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
  public double getBmi()
  {
    
     
      return (weight * 703)/(height * height);
      
  }
  public double getInsurancePrice()
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
      
  }
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
  public double getAge()
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