package com.hashort.spring.basics.springbasics.CDI;

import javax.inject.Named;

@Named
public class CDIDAO {

    public int[] getData() {
        return new int[] {5, 89, 100};
    }
}
