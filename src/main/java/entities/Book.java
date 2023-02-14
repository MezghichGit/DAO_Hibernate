package entities;

import java.time.LocalDate;

public class Book {
	
	private int id;
	private String titre;
	private double prix;
	private LocalDate dateEdition;
	private int idCat;
	@Override
	public String toString() {
		return "Book [id=" + id + ", titre=" + titre + ", prix=" + prix + ", dateEdition=" + dateEdition + ", idCat="
				+ idCat + "]";
	}
	public Book(int id, String titre, double prix, LocalDate dateEdition, int idCat) {
		super();
		this.id = id;
		this.titre = titre;
		this.prix = prix;
		this.dateEdition = dateEdition;
		this.idCat = idCat;
	}
	
	public Book() {
		
	}


}
