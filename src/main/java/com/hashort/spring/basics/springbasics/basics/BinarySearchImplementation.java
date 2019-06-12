package com.hashort.spring.basics.springbasics.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Component
//@Scope("prototype") =
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    //Can autowire by name or @Primary. Autowiring by name (uses type as well as name):
    //private SortAlgorithm bubbleSortAlgorithm;
    //@Primary has higher precedence than autowiring by name

    //Constructor Injection - all mandatory dependencies should be autowired this way
    public BinarySearchImplementation(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    /*//Setter Injection - optional dependencies autowired this way
    @Autowired
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    //No setter or constructor defaults to setter autowiring

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }

    /*public int binarySearch(int[] numbers, int numberToSearchFor) {
        int [] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);
        return 3;
    }*/

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy");
    }
}
