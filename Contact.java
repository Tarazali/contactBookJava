import java.io.*;
public class Contact implements Serializable{
	
	private int id;
	private String name;
	private String phone;
	private boolean active;
	private String surname;
	private String address;

	public Contact(int i,String n,String p,boolean a, String s, String ad){
		
		this.id = i;
		this.name = n;
		this.phone = p;
		this.active = a;
		this.surname = s;
		this.address = ad;
	}

	public Contact(){

		this.id = 0;
		this.name = "--------";
		this.phone = "--------";
		this.active = true;
		this.surname = "--------";
		this.address = "--------";
	}

	public void setAddress(String ad){
		this.address = ad;
	}

	public void setSurname(String s){
		this.surname = s;
	}

	public void setId(int i){
		this.id = i;
	}

	public void setName(String n){
		this.name = n;
	}

	public void setPhone(String p){
		this.phone = p;
	}

	public void setActive(boolean a){
		this.active = a;
	}

	public String getAddress(){
		return this.address;
	}

	public String getSurname(){
		return this.surname;
	}

	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getPhone(){
		return this.phone;
	}
	public boolean getActive(){
		return this.active;
	}

	public String getFullData(){
		return getId()+" - "+getName()+" - "+getPhone();
	}



}








