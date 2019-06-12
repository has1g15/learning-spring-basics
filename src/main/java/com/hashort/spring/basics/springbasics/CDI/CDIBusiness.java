package com.hashort.spring.basics.springbasics.CDI;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIBusiness {

    @Inject
    CDIDAO cdiDAO;

    public CDIDAO getCdiDAO() {
        return cdiDAO;
    }

    public void setCdiDAO(CDIDAO cdiDAO) {
        this.cdiDAO = cdiDAO;
    }

    public int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int[]  data = cdiDAO.getData();
        for (int value: data) {
            if(value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}
