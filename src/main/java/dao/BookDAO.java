package dao;

import java.util.List;

import entities.Book;
import principale.Main;

public class BookDAO {

	// méthode pour l'insertion d'un Book dans la bd
		public static void addBook(Book obj) {
			Main.books.add(obj);
		}

		// méthode qui retourne toutes les Book de la base
		public static List<Book> listBooks() {
		
			return Main.books;
		}
		
}
