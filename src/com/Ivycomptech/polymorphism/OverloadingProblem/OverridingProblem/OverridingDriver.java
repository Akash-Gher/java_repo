package com.Ivycomptech.polymorphism.OverloadingProblem.OverridingProblem;

public class OverridingDriver {

    public static void main(String[] args) {

        IPL ipl =new IPL();
        IPL  csk =new CSK();
        IPL  rcb =new RCB();
        IPL  mi =new MI();

        csk.tournamentWonBy();
        rcb.tournamentWonBy();
        mi.tournamentWonBy();



    }
}
