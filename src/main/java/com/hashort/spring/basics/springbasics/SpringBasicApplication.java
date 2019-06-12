package com.hashort.spring.basics.springbasics;

import com.hashort.spring.basics.springbasics.basics.BinarySearchImplementation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootBasicApplication
@Configuration
@ComponentScan
public class SpringBasicApplication {

	//1 - What are the beans? (@Component)
	//2 - What are the dependencies of a bean (@Autowired)
	//3 - Where to search for beans? - No need if in same package

	public static void main(String[] args) {

//		BinarySearchImplementation binarySearch = new BinarySearchImplementation(new BubbleSortAlgorithm());
//		-> redundant as spring will manage beans
//		BinarySearchImplementation binarySearch = new BinarySearchImplementation(new QuickSortAlgorithm());

		try(AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringBasicApplication.class)) {

//				(SpringBoot)
//				SpringApplication.run(SpringBasicApplication.class, args);

			//Get binary search bean from spring application context
			BinarySearchImplementation binarySearch =
					applicationContext.getBean(BinarySearchImplementation.class);

			BinarySearchImplementation binarySearchScopeExample =
					applicationContext.getBean(BinarySearchImplementation.class);

			System.out.println(binarySearch);
			System.out.println(binarySearchScopeExample);

			int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
			System.out.println(result);
		}
	}

}
