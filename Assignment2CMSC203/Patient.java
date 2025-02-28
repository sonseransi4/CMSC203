/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: This class holds the Patient object data.
 * Due: 2/27/25
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student.
 * Print your Name here: Sonse Ransibrahmanakul
 */

public class Patient
{
    private String fName;
    private String mName;
    private String lName;
    private String address;
    private String ecName;    
    private String ecNumber;  

    public Patient(String fName, String mName, String lName, 
                   String address, String ecName, String ecNumber) 
                   {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.address = address;
        this.ecName = ecName;
        this.ecNumber = ecNumber;
    }
//getters and setters
    public String getFName()
    {
        return fName;
    }

    public void setFName(String fName) 
    {
        this.fName = fName;
    }

    public String getMName() 
    {
        return mName;
    }

    public void setMName(String mName) 
    {
        this.mName = mName;
    }

    public String getLName() 
    {
        return lName;
    }

    public void setLName(String lName) 
    {
        this.lName = lName;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getEmergencyContactName() 
    {
        return ecName;
    }

    public void setEmergencyContactName(String ecName)
    {
        this.ecName = ecName;
    }

    public String getEmergencyContactNumber() 
    {
        return ecNumber;
    }

    public void setEmergencyContactNumber(String ecNumber) 
    {
        this.ecNumber = ecNumber;
    }
}
