package principale;

import java.util.ArrayList;
import java.util.List;

import dao.CategoryDAO;
import entities.Category;

public class Main {
	
	public static List<Category> categories = new ArrayList<Category>(); // notre source de données.

	public static void main(String[] args) {
		System.out.println("Welcome to our Library");
		
		
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

	}

}
