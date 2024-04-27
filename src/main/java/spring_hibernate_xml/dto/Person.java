package spring_hibernate_xml.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	private int id;
	private String name;
	private long phone;
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	PanCard card;
	
	

}
