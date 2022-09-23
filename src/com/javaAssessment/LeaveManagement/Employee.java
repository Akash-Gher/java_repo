package com.javaAssessment.LeaveManagement;



public class Employee {
/*
	RE can apply for leave and can view leave.
 */
    //RE can have same ID but password should be different


    String rename, repass, manager;
    int reLeave, usedLeave, requestLeave;


    public Employee(String rename, String rePass, int leave, int usedLeave, int requestedLeave, String manager) {
        this.rename = rename;
        this.repass = rePass;
        this.reLeave = leave;
        this.usedLeave = usedLeave;
        this.requestLeave = requestedLeave;
        this.manager = manager;

    }



                                                                    // fetch available leaves
    public void viewLeave() {

        System.out.println("Your free leaves are :" + getLeaveRE());
    }

                                                                    // method for requesting leave
    public void reqLeave(int request) {

        // it checks if requested no. of leaves are available or not
        if (request > getLeaveRE()) {
            System.out.println("Sufficient leaves are not available\n");
        } else {
            System.out.println("Requested for " + request + "days");
            setRequest(request);

        }

    }

                                                           // set the value of total leaves of regular employee
    protected void setRequest(int request) {
        this.requestLeave = request;
    }

                                                          //  name of regular employee
    protected String getNameRE() {
        return this.rename;
    }

                                                         //  password of regular employee
    protected String getPassRE() {
        return this.repass;
    }

                                                      // returns remaining leaves of regular employee
    protected int getLeaveRE() {
        return this.reLeave;
    }

                                                    //  used leaves of regular employee
    protected int getUsedLeaveRE() {
        return this.usedLeave;
    }

                                                     // setting the value of used leaves of regular employee
    protected void setUsedLeaveRE(int used) {
        this.usedLeave = used;
    }


    // returns no. of requesting leave
    protected int getRequestedLeaveRE() {
        return this.requestLeave;
    }

    // updating the value of total leaves of regular employee
    protected void updateLeave(int update) {
        this.reLeave = update;
    }

    // returns the mentor name of regular employee
    protected String GetManager() {
        return this.manager;
    }


}
