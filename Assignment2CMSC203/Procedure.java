/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: This class holds the Procedure object data.
 * Due: 2/27/25
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student.
 * Print your Name here: Sonse Ransibrahmanakul
 */

import java.util.Date;

public class Procedure {
    private String procName;
    private Date procDate;
    private String pracName;    
    private double procCharge;  

    public Procedure(String procedureName, Date procedureDate, 
                     String practitionerName, double procedureCharge) 
                     {
        this.procName = procedureName;
        this.procDate = procedureDate;
        this.pracName = practitionerName;
        this.procCharge = procedureCharge;
    }
//getters and setters
    public String getProcedureName() 
    {
        return procName;
    }

    public void setProcedureName(String procedureName) 
    {
        this.procName = procedureName;
    }

    public Date getProcedureDate() 
    {
        return procDate;
    }

    public void setProcedureDate(Date procedureDate) 
    {
        this.procDate = procedureDate;
    }

    public String getPractitionerName() 
    {
        return pracName;
    }

    public void setPractitionerName(String practitionerName) 
    {
        this.pracName = practitionerName;
    }

    public double getProcedureCharge() 
    {
        return procCharge;
    }

    public void setProcedureCharge(double procedureCharge) 
    {
        this.procCharge = procedureCharge;
    }
}
