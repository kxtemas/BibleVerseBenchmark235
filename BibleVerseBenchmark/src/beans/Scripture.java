package beans;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean

public class Scripture {

	private String scripture;
	//sets the scricpture up
	public Scripture() {
		this.scripture = this.getScripture();
	}

	public Scripture(String scripture) {
		this.scripture = scripture;
	}
//getter
	public String getScripture() {
		return scripture;
	}
//setter
	public void setScripture(String scripture) {
		this.scripture = scripture;
	}

	
}
