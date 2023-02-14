package dao;

import java.util.List;

import entities.Category;
import principale.Main;

public class CategoryDAO {

	// méthode pour l'insertion d'une catégorie dans la bd
	public static void addCategory(Category obj) {
		Main.categories.add(obj);
	}

	// méthode qui retourne toutes les catégories de la base
	public static List<Category> listCategories() {
	
		return Main.categories;
	}

	// méthode pour supprimer une catégorie de la bd
	public static void deleteCategory(Category obj) {
		// code pour la suppression de l'obj Category
	}

	// méthode pour mettre à jour une catégorie de la bd
	public static void updateCategory(int idCat, Category newObj) {
		// code de mise à jour d'une catégorie avec idCat
	}

}
