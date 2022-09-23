package com.javaAssessment.LeaveManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class LeaveDriver {
    //public static final LeaveDriver LEAVE = new LeaveDriver();
    //leave management menu


    Login l;
    ArrayList<Reporting_Authority> RMDetails = new ArrayList<>();
    ArrayList<Employee> REDetails = new ArrayList<>();

    // constructor for initializing objects
    LeaveDriver() {
        l = new Login();
    }

    public static void main(String[] args) throws  Exception{
        // new Leave_Main();
        LeaveDriver LEAVE = new LeaveDriver();
        LEAVE.Display();
    }

    // void Display();
    void Display() {

        Scanner sc = new Scanner(System.in);
        String name, password;
        int a, total;

        System.out.println(
                """
                        Select any one for login procedure

                        1.Admin\s
                        2.Reporting Authority\s
                        3.Employee""");
        try {
            a = sc.nextInt();

            System.out.println("Enter Username or ID");
            name = sc.next();
            System.out.println("Enter Password");
            password = sc.next();
            switch (a) {
                case 1:
                    Admin admin = l.checkAdmin(name, password); // Login validation for Admin

                    if (admin == null) {
                        Display();
                    }
                    while (true) {

                        System.out.println("""

                                Press 1 to ADD Emp.
                                Press 2 to View Report of RA
                                Press 3 to View Report of RE
                                Press 4 to LOGOUT""");

                        a = sc.nextInt();

                        switch (a) {

                            case 1:
                                System.out.println("Press 1 to add Reporting Manager || press 2 to add Regular Employee");

                                a = sc.nextInt();

                                if (a == 1) { // Creates Reporting Manager

                                    System.out.println("how many employees you want to create??");
                                    total = sc.nextInt();
                                    assert admin != null;
                                    admin.AddRA(RMDetails, total);
                                    continue;
                                } else if (a == 2) { // Creates Regular Employee

                                    System.out.println("how many employees you want to create??");
                                    total = sc.nextInt();
                                    assert admin != null;
                                    admin.AddRE(REDetails, RMDetails, total);
                                    continue;
                                } else {

                                    System.out.println("Enter valid choice");
                                    continue;
                                }

                            case 2: // View report of Reporting Authority
                                assert admin != null;
                                admin.viewRA(RMDetails);

                                continue;
                            case 3: // View report of Regular Employee
                                assert admin != null;
                                admin.viewRE(REDetails);

                                continue;
                            case 4: // Display is called for logout
                                Display();
                            default:
                        }

                    }
                case 2:
                    // Login validation for Reporting Manager
                    Reporting_Authority rLogin = l.MatchRA(name, password, RMDetails);

                    if (rLogin != null) {
                        System.out.println("Welcome" + name);
                    } else {
                        Display();
                    }

                    while (true) {

                        int c;
                        System.out.println("1.View Report\n2.View Requests\n3.Grant\n4.Logout");
                        c = sc.nextInt();
                        // View his/her Employee's leave report
                        if (c == 1) {
                            assert rLogin != null;
                            rLogin.view(REDetails);
                        } else if (c == 2) { // View request of his/her allocated employee

                            assert rLogin != null;
                            rLogin.requests(REDetails);
                        } else if (c == 3) { // Call the Grant method for Accepting or Rejecting or Pending request

                            assert rLogin != null;
                            rLogin.grant(REDetails);
                        }

                        else if (c == 4)
                            Display();

                    }
                case 3:
                    // Login validation for Employee

                    Employee e = l.MatchRE(name, password, REDetails);

                    if (e != null) {
                        System.out.println("Welcome " + name);

                        while (true) {
                            int b, req;
                            System.out.println(
                                    """
                                            1. View  Leaves
                                            2. Apply for leave application
                                            3. Logout""");
                            b = sc.nextInt();
                            switch (b) {
                                case 1 -> // case 1: Viewing his/her available leave

                                        e.viewLeave();
                                case 2 -> { // case 2: requesting leave

                                    System.out.println("Your total leaves are:" + e.getLeaveRE());
                                    System.out.println("\nHow many leaves do you want");
                                    req = sc.nextInt();
                                    e.reqLeave(req);
                                }
                                case 3 -> // case 2: Logout

                                        Display();
                                default -> {
                                }
                            }
                        }
                    }
                default:
                    System.out.println("Enter valid number");
                    Display();

            }
        } catch (Exception e) {
            System.out.println("EXCEPTION Occurred");
            Display();
        }
        sc.close();

    }


}
