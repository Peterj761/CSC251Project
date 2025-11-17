public class Policy
{
    private String policyNumber;
    private String providerName;
    private policyHolder policyHolder; // object for policyHolder

    private static int policyCount = 0; // Tracks Policy objects

    // Non-arg constructor
    public Policy()
    {
        this.policyNumber = "";
        this.providerName = "";
        this.policyHolder = new policyHolder();
    }

    // Constructor with args
    public Policy(String policyNumber, String providerName, policyHolder policyHolder)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;

        policyCount++;
    }

    // Getter policyCount 
    public static int getPolicyCount()
    {
        return policyCount;
    }
    public policyHolder getPolicyHolder()
    {
        return policyHolder;
    }

    // Calculate policy price
    public double getInsurancePrice()
    {
        double insuranceFee = 600;

        if (policyHolder.getAge() > 50)
        {
            insuranceFee += 75;
        }

        if (policyHolder.getSmokerStatus().equalsIgnoreCase("Smoker"))
        {
            insuranceFee += 100;
        }

        double bmi = policyHolder.getBmi();
        if (bmi > 35)
        {
            insuranceFee += (bmi - 35) * 20;
        }

        return insuranceFee;
    }

    // Getters
    public String getPolicyNumber()
    {
        return policyNumber;
    }

    public String getProviderName()
    {
        return providerName;
    }

    // toString method
    
    public String toString()
    {
        return  "Policy Number: " + policyNumber +
                "\nProvider Name: " + providerName +
                "\n" + policyHolder.toString() +
                String.format("\nPolicy Price: $%.2f", getInsurancePrice());
    }
}