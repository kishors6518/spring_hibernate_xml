package spring_hibernate_xml.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PanCard {
	@Id
	private int id;
	private String name;
	private String address;
	
	
	

}
