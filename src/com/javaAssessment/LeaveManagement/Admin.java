package com.javaAssessment.LeaveManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
/*
First Admin creates RA and after that RE can be created because in this system
without RA, RE can't be generated. Admin can view name and password of both employees (RA and RE).
 */
Scanner sc = new Scanner(System.in);
   // int total = 0;

                                                                                 //  Adds Reporting Authority
    protected void AddRA(ArrayList<Reporting_Authority> rmDetails,int total) {
        String scanName, scanPassword;

        for (int i = 0; i < total; i++) {
            System.out.println("\t\t\tReporting Authority");
            System.out.println("Enter name:");
            scanName = sc.next();
            boolean v = validateRA(scanName, rmDetails);
            if (!v) {
                System.out.println("Enter Password:");
                scanPassword = sc.next();

                rmDetails.add(new Reporting_Authority(scanName, scanPassword));
                System.out.println("Reporting Authority is Created \n");

            } else {
                break;
            }
        }
    }

    // it checks whether the new entered Reporting Manager exists or not
    private boolean validateRA(String scanName, ArrayList<Reporting_Authority> rmDetails) {
        for (Reporting_Authority getDetails : rmDetails) {

            if (scanName.equalsIgnoreCase(getDetails.GetNameRA()))

            {
                System.out.println("Employee already exists please Enter again\n");
                return true;
            }
        }
        return false;
    }

    // it adds regular employee

    public void AddRE(ArrayList<Employee> reDetails, ArrayList<Reporting_Authority> rmDetails, int total) {
        String scanName, scanPassword;

        for (int i = 0; i < total; i++) {
            System.out.println("\t\t  Regular employee");
            System.out.println("Enter name:");
            scanName = sc.next();
            System.out.println("Enter Password:");
            scanPassword = sc.next();
            boolean v = validateRE(scanName, scanPassword, reDetails);

            if (v) {
                break;
            } else {

                int leave = 24;
                int used = 0;
                int req = 0;
                System.out.println("\t\t\tRA LIST \n");

                for (Reporting_Authority getDetails : rmDetails) {
                    if (getDetails.GetNameRA() != null) {
                        System.out.println("Name is  " + getDetails.GetNameRA());
                    }
                }
                System.out.println("\n\nAssign RA");
                String mentor;
                String manager = sc.next();

                for (Reporting_Authority getDetails : rmDetails) {

                    if (manager.equalsIgnoreCase(getDetails.GetNameRA())) {

                        mentor = getDetails.GetNameRA();
                        reDetails.add(new Employee(scanName, scanPassword, leave, used, req, mentor));
                        System.out.println("Regular Employee Created \n");

                    }
                }

            }
        }
    }


    // it checks whether the new entered employee exists or not
    private boolean validateRE(String scanName, String scanPassword, ArrayList<Employee> reDetails) {
        for (Employee getDetails : reDetails) {


            if (scanName.equalsIgnoreCase(getDetails.getNameRE()) && scanPassword.equalsIgnoreCase(getDetails.getPassRE())) {
                System.out.println("Employee already exists please Enter again with different id or password\n");
                return true;
            }
        }
        return false;
    }

                                               // This function prints list of Reporting Authority with password
    public void viewRA(ArrayList<Reporting_Authority> rmDetails) {

        System.out.println("\t\t\tReporting Authority LIST \n");

        for (Reporting_Authority getDetails : rmDetails) {
            System.out.println("Name is  " + getDetails.GetNameRA() + "\t\tPassword is  " + getDetails.getPassRA());

        }
    }


                                            // This function prints list of Regular Employee with password
    protected void viewRE(ArrayList<Employee> reDetails) {

        System.out.println("\t\t\tRegular Employee LIST \n");

        for (Employee getDetails : reDetails) {
            System.out.println("Name is  " + getDetails.getNameRE() + "\t\tPassword is  " + getDetails.getPassRE() + "\t\tMentor: "
                    + getDetails.GetManager());

        }

    }

}
