/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Feb 24, 2023
 */
package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pets")
public class Pets {
	@Id
	@GeneratedValue
	private int petId;
	private String name;
	private LocalDate birthday;
	private String species;
	private String breed;
	/**
	 * 
	 */
	public Pets() {
		super();
	}
	/**
	 * @param name
	 * @param birthday
	 * @param species
	 * @param breed
	 */
	public Pets(String name, LocalDate birthday, String species, String breed) {
		super();
		setName(name);
		setBirthday(birthday);
		setSpecies(species);
		setBreed(breed);
	}
	/**
	 * @return the petId
	 */
	public int getPetId() {
		return petId;
	}
	/**
	 * @param petId the petId to set
	 */
	public void setPetId(int petId) {
		this.petId = petId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the birthday
	 */
	public LocalDate getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}
	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}
	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", birthday=" + birthday + ", species=" + species + ", breed="
				+ breed + "]";
	}
	
	
}
