import java.io.Serializable;

<<<<<<< HEAD
public class phonebook implements Serializable {
	private String name;
	private String phonenumber;	
=======
public class phonebook implements Serializable{

	private String name;	//�й�
	private String phonenumber;	//�̸�
	 
	//private static int studentCount=0; 			// number of Students
>>>>>>> refs/remotes/origin/master
	
	public phonebook(String name, String phonenumber) {
		this.name = name;
		this.phonenumber = phonenumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String toString() {
		String description;
		description = name+"\t"+phonenumber;
		
		return description;
	}
}
