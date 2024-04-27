package spring_hibernate_xml.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import spring_hibernate_xml.dto.Person;

public class PersonDao {
	
	public EntityManager getManager()
	{
		 return Persistence.createEntityManagerFactory("kishor").createEntityManager();
		 
	}
	public void savePerson(Person person)
	{
		EntityManager manager=getManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		//manager.persist(person.getACard());
		manager.persist(person);
		transaction.commit();
	}
	public void getPerson(int id)
	{
		EntityManager manager=getManager();
		Person person=manager.find(Person.class, id);
		if(person!=null)
		{
			System.out.println(person);
		}
		else
		{
			
		}
		
	}
	public void deletePerson(int id)
	{
		EntityManager manager=getManager();
		Person person=manager.find(Person.class, id);
		if(person!=null)
		{
			EntityTransaction transaction=manager.getTransaction();
			
			transaction.begin();
		    manager.remove(person);
			transaction.commit();
		}
		else
		{
			System.out.println("Person not found");
		}
	}
	public void updateBoth(int id, Person person)
	{
		EntityManager manager=getManager();
		Person person2=manager.find(Person.class, id);
		if(person2!=null)
		{
			EntityTransaction transaction=manager.getTransaction();
			
			person.setId(id);
			person.getCard().setId(person2.getCard().getId());
			
			transaction.begin();
			//manager.merge(person.getACard());
			manager.merge(person);
			transaction.commit();
			
		}
		else
		{
			System.out.println("Person not found");
		}
		
	}

}
