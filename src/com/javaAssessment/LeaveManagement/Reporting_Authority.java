package com.javaAssessment.LeaveManagement;
import java.util.ArrayList;
import java.util.Scanner;
public class Reporting_Authority {

    /*

    RA can view Employee's report which are under  network(i.e. RE that works under that RA).
 RA can also view report of all RE which are working under him/her.
     */

    /*
    	RA can view request, grant or reject request and also can view report.
	If RA grants the request then the total leave of the particular employee deduct otherwise
	the total leaves remain as it is.
     */

    //for RA every ID should be different

    String rmName, rmId;

    Scanner sc = new Scanner(System.in);

    public Reporting_Authority(String scanName, String scanPassword) {

        this.rmName = scanName;
        this.rmId = scanPassword;
    }



    //print all Employee name, available leaves and used leaves
    public void view(ArrayList<Employee> reDetails) {
        for (Employee getDetails : reDetails) {
            if (GetNameRA().equalsIgnoreCase(getDetails.GetManager())) {

                System.out.println("Name is  " + getDetails.getNameRE() + "\t\tAvailable leaves  " + getDetails.getLeaveRE()
                        + "\t\tUsed leaves  " + getDetails.getUsedLeaveRE() + "\n");
            }
        }

    }

    // print all the requests of employee who are under the logged in Reporting Manager
    public void requests(ArrayList<Employee> reDetails) {

        for (Employee getDetails : reDetails) {

            if (GetNameRA().equalsIgnoreCase(getDetails.GetManager())) {
                System.out.println("Name is  " + getDetails.getNameRE() + "\t\tRequesting for " + getDetails.getRequestedLeaveRE()
                        + " Days \n");

            }
        }

    }

    // Confirmation for leave to be given or not
    public void grant(ArrayList<Employee> reDetails) {

        for (Employee getDetails : reDetails) {
            if (getDetails.GetManager().equalsIgnoreCase(GetNameRA())) {
                System.out.println(
                        "Name is  " + getDetails.getNameRE() + "\t\tRequesting for  " + getDetails.getRequestedLeaveRE() + "\n");
                int a;
                System.out.println("""
                        1.Confirm\s
                        2.Reject
                        3.Don't change""");
                a = sc.nextInt();
                switch (a) {

                    // if RM confirms the request
                    case 1 -> {
                        int leave = getDetails.getLeaveRE();
                        int deduct = getDetails.getRequestedLeaveRE();
                        leave -= deduct;
                        getDetails.updateLeave(leave);
                        int used = getDetails.getUsedLeaveRE() + getDetails.getRequestedLeaveRE();
                        getDetails.setUsedLeaveRE(used);
                        getDetails.setRequest(0);
                        System.out.println("Leaves granted\n");
                    }

                    // if RM rejects the request
                    case 2 -> {
                        System.out.println("Leaves Rejected\n");
                        getDetails.setRequest(0);
                    }
                    // if RM selects pending option
                    case 3 -> System.out.println("Leaves are as it is\n");
                    default -> {
                    }
                }
            }
        }
    }

    // returns name of reporting manager
    protected String GetNameRA() {
        return this.rmName;
    }

    // returns password of reporting manager
    protected String getPassRA() {
        return this.rmId;
    }




}
