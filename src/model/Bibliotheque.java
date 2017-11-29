package model;

import java.util.ArrayList;

public class Bibliotheque {

	private ArrayList<Utilisateurs> users;
	private ArrayList<BookBean> books;

	public Bibliotheque() {
		super();

		// By default, for the first part of the project, create 4 users, 2 members
		this.users = new ArrayList<Utilisateurs>();
		Utilisateurs librarian1 = new Bibliothecaire();
		Utilisateurs librarian2 = new Bibliothecaire();
		Utilisateurs member1 = new Adherent();
		Utilisateurs member2 = new Adherent();

		this.users.add(librarian1);
		this.users.add(librarian2);
		this.users.add(member1);
		this.users.add(member2);

		// By default, for the first part of the project, create 5 books
		// Eventually add date of publication
		this.books = new ArrayList<BookBean>();
		BookBean book1 = new BookBean("Le petit prince", "Antoine de Saint-Exupéry", 10, 0);
		BookBean book2 = new BookBean("Petit livre rouge", "Mao Zedong", 3, 0);
		BookBean book3 = new BookBean("Harry Potter and the Philosopher's Stone", "J.K Rowling", 20, 0);
		BookBean book4 = new BookBean("Alice au pays des merveilles", "Lewis Carroll", 12, 0);
		BookBean book5 = new BookBean("Millenium", "Stieg Larsson", 7, 0);

		this.books.add(book1);
		this.books.add(book2);
		this.books.add(book3);
		this.books.add(book4);
		this.books.add(book5);

	}

	public ArrayList<Utilisateurs> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<Utilisateurs> users) {
		this.users = users;

	}

	public ArrayList<BookBean> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<BookBean> books) {
		this.books = books;
	}

}
