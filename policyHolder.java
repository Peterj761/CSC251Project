public class policyHolder
{
    private String firstName;
    private String lastName;
    private int age;
    private String smokerStatus;
    private double height;
    private double weight;

    // Non-arg constructor
    public policyHolder()
    {
        firstName = "";
        lastName = "";
        age = 0;
        smokerStatus = "Non Smoker";
        height = 0;
        weight = 0;
    }

    // Constructor with args
    public policyHolder(String firstName, String lastName, int age, String smokerStatus, double height, double weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokerStatus = smokerStatus;
        this.height = height;
        this.weight = weight;
    }

    // Calculate BMI
    public double getBmi()
    {
        return (weight * 703) / (height * height);
    }

  
    // Getters
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

    // toString method
    
    public String toString()
    {
        return  "Policyholder's First Name: " + firstName +
                "\nPolicyholder's Last Name: " + lastName +
                "\nPolicyholder's Age: " + age +
                "\nPolicyholder's Smoking Status (Y/N): " + smokerStatus +
                "\nPolicyholder's Height: " + height + " inches" +
                "\nPolicyholder's Weight: " + weight + " pounds" +
                String.format("\nPolicyholder's BMI: %.2f", getBmi());
    }
}