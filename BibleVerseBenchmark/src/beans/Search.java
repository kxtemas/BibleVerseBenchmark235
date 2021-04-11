package beans;


import javax.faces.bean.ManagedBean; 
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class Search {

	String Book = "";
	String Chapter = "";
	String Verse = "";
	
	public Search(){
		this.Book = this.getBook();
		this.Chapter = this.getChapter();
		this.Verse = this.getVerse();
	}
	
	

	public String getBook() {
		return Book;
	}
//getters and setters
	public void setBook(String Name) {
		this.Book = Name;
	}

	public String getChapter() {
		return Chapter;
	}

	public void setChapter(String Chapter) {
		this.Chapter = Chapter;
	}

	public String getVerse() {
		return Verse;
	}

	public void setVerse(String Verse) {
		this.Verse = Verse;
	}
	
}