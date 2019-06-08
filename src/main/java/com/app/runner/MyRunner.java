package com.app.runner;

import java.util.Set;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner{

	

	public void run(ApplicationArguments args) throws Exception 
	{
		/* Option Arguments */
		/* Read All Keys */
		Set<String> s = args.getOptionNames();
		System.out.println(s);
		
		/* One Key Related */
		List<String> lst = args.getOptionValues("profile");
		System.out.println(lst);
		
		/* Check for Key exist */
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));
		
		/* Non Option */
		List<String> nonop = args.getNonOptionArgs();
		System.out.println("hiii"+nonop);
		
		/* All Arguments */
		String [] arr = args.getSourceArgs();
		System.out.println(arr);
		System.out.println(Arrays.asList(arr));
		
	}

}
