package principale;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dao.CategoryDAO;
import dao.BookDAO;
import entities.Category;
import entities.Book;
public class Main {
	
	public static List<Category> categories = new ArrayList<Category>(); // notre source de données.

	public static List<Book> books = new ArrayList<Book>();
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to our Library");
		/*
		
		//System.out.println(categories);
		
		// Question 1 : Utiliser le CategoryDAO pour insérer une nouvelle catégorie dans la liste
		Category  c1 = new Category(1,"Développement",100);
		Category  c2 = new Category(2,"Histoire",10);
		
		CategoryDAO.addCategory(c1);
		CategoryDAO.addCategory(c2);
		System.out.println(CategoryDAO.listCategories());
		
		// Après suppression
		//CategoryDAO.deleteCategory(c1);
		//System.out.println(CategoryDAO.listCategories());
		
		//Mise à jour
		
		Category newCat = new Category();
		newCat.setTitre("Géographie");
		newCat.setNbLivres(3);
		newCat.setId(2);
		
		CategoryDAO.updateCategory(2, newCat);
		System.out.println(CategoryDAO.listCategories());
		*/
		
		
		Book b1 = new Book(1,"Java OCA",150,LocalDate.of(2022,10,10),1);
		Book b2 = new Book(2,"Java OCP",250,LocalDate.of(2022,10,10),1);
		BookDAO.addBook(b1);
		BookDAO.addBook(b2);
		
		System.out.println(BookDAO.listBooks());
	}

}
