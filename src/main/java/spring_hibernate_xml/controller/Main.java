package spring_hibernate_xml.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_hibernate_xml.dao.PersonDao;
import spring_hibernate_xml.dto.Person;



public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("person.xml");
		PersonDao dao=(PersonDao) context.getBean("dao");
		
		Person person=(Person) context.getBean("per");
		
		//dao.savePerson(person);
		//dao.getPerson(2);
		//dao.updateBoth(4, person);
		dao.deletePerson(4);
		

	}

}
