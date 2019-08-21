package com.nt.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.CollegeForMap;
import com.nt.beans.StudentForList;
import com.nt.beans.StudentNotFoundException;
import com.nt.beans.UserForSet;

public class CollectionTest{
	//create logger instance
	private static final Logger logger =LogManager.getLogger(CollectionTest.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//create ioc container and load applicationContext file		
ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
//get student object by calling getbean method on ctx
StudentForList list=ctx.getBean("st",StudentForList.class);
//get college object by calling getbean method on ctx
		
CollegeForMap map=ctx.getBean("clg",CollegeForMap.class);
//get User object by calling getbean method on ctx
UserForSet set=ctx.getBean("user",UserForSet.class);
PropertyConfigurator.configure("src/main/resources/application.properties");
//printing all classes object info here
/*System.out.println(list);
	System.out.println(set);
	System.out.println(map);
*/

//printing all classes object info using logger message.
	logger.info(list);
	logger.info(set);
	logger.info(map);
	logger.debug("set");
	logger.error("list");
	logger.fatal("map");
	logger.warn("list");
	logger.trace("map");
	List<String> names=	list.getNames();

	//apply exception handling to check wheather student names are exceeded than 5 or not
	if(list.toString().isEmpty())
	{
		logger.info("Student list is empty");
	}
	else
	{
	for(String str:names)
	{
		if(str.length()>5) {
			throw new StudentNotFoundException("Student name should not be exceed 5");
		}
		else if(str.length()==5)
			throw new StudentNotFoundException("Student name length is good");
		else
			logger.info(str);
	}
	}

	}
	
}
