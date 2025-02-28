/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: This program takes in patient info and prints patient info
 * Due: 2/27/25
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student.
 * Print your Name here: Sonse Ransibrahmanakul
 */

import java.util.Date;

public class PatientDriverApp {
    public static void main(String[] args) {
        //Creates patient
        Patient patient = new Patient(
                "Jenny", "Elaine", "Santori",
                "123 Main Street",
                "Bill Santori", "777-555-1212"
        );

        //Creates procedures
        Procedure procedure1 = new Procedure(
                "Physical Exam", new Date(), "Dr. Irvine", 3250.0
        );
        Procedure procedure2 = new Procedure(
                "X-ray", new Date(), "Dr. Jamison", 5500.43
        );
        Procedure procedure3 = new Procedure(
                "Blood Test", new Date(), "Dr. Smith", 1400.75
        );

        //Patient info display
        System.out.println("Patient Information:");
        System.out.println("Name: " 
            + patient.getFName() + " " 
            + patient.getMName() + " " 
            + patient.getLName());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("Emergency Contact: " 
            + patient.getEmergencyContactName() + " " 
            + patient.getEmergencyContactNumber());

        //displays info
        System.out.println("\nProcedure Information:");
        System.out.println("Procedure: Physical Exam");
        System.out.println("Name: " + procedure1.getProcedureName());
        System.out.println("Date: " + procedure1.getProcedureDate());
        System.out.println("Practitioner: " + procedure1.getPractitionerName());
        System.out.println("Charge: " + procedure1.getProcedureCharge());
        System.out.println("\nProcedure: X-Ray");
        System.out.println("Name: " + procedure2.getProcedureName());
        System.out.println("Date: " + procedure2.getProcedureDate());
        System.out.println("Practitioner: " + procedure2.getPractitionerName());
        System.out.println("Charge: " + procedure2.getProcedureCharge());
        System.out.println("\nProcedure: Blood Test");
        System.out.println("Name: " + procedure3.getProcedureName());
        System.out.println("Date: " + procedure3.getProcedureDate());
        System.out.println("Practitioner: " + procedure3.getPractitionerName());
        System.out.println("Charge: " + procedure3.getProcedureCharge());

        //calculates
        double totCharge = procedure1.getProcedureCharge() 
                         + procedure2.getProcedureCharge() 
                         + procedure3.getProcedureCharge();
        System.out.println("\nTotal Charges: $" + totCharge);

        //Student info
        System.out.println("\nStudent Name: Sonse Ransibrahmanakul");
        System.out.println("MC#: M1116938");
        System.out.println("Due Date: 2/27/25");
    }
}
