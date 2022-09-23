package com.javaAssessment.LeaveManagement;

import java.util.ArrayList;

public class Login {
    //authentication


                                                                           // Validation of Admin
    public Admin checkAdmin(String name, String password) {
        if (name.equalsIgnoreCase("Admin") && password.equals("123")) {

            System.out.println("Welcome  " + name + "\n");
            return new Admin();
        }
        return null;
    }

                                                                     // Validation of Reporting Manager
    public Reporting_Authority MatchRA(String name, String password, ArrayList<Reporting_Authority> rmDetails) {
        for (Reporting_Authority getDetails : rmDetails) {
            if (name.equalsIgnoreCase(getDetails.GetNameRA()) && password.equals(getDetails.getPassRA())) {

                return getDetails;
            }
        }

        return null;
    }

    // Validation of Regular Employee
    public Employee MatchRE(String name, String password, ArrayList<Employee> reDetails) {
        for (Employee getDetails : reDetails) {
            if (name.equalsIgnoreCase(getDetails.getNameRE()) && password.equals(getDetails.getPassRE())) {

                return getDetails;
            }
        }
        return null;
    }
}
