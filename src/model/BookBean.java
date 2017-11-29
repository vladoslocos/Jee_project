package model;

public class BookBean implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private int nbrCopy;
	private int nbrBorrowed;
	
	public BookBean() {
		
	}

	public BookBean(String title, String author, int nbrCopy, int nbrBorrowed) {
		super();
		this.title = title;
		this.author = author;
		this.nbrCopy = nbrCopy;
		this.nbrBorrowed = nbrBorrowed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNbrCopy() {
		return nbrCopy;
	}

	public void setNbrCopy(int nbrCopy) {
		this.nbrCopy = nbrCopy;
	}

	public int getNbrBorrowed() {
		return nbrBorrowed;
	}

	public void setNbrBorrowed(int nbrBorrowed) {
		this.nbrBorrowed = nbrBorrowed;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", nbrCopy=" + nbrCopy + ", nbrBorrowed=" + nbrBorrowed
				+ "]";
	}

}
