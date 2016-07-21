import java.io.*;
public class Contact implements Serializable{
	
	private int id;
	private String name;
	private String phone;
	private boolean active;

	public Contact(int i,String n,String p,boolean a){
		
		this.id = i;
		this.name = n;
		this.phone = p;
		this.active = a;

	}

	public Contact(){

		this.id = 0;
		this.name = "--------";
		this.phone = "--------";
		this.active = true;

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








