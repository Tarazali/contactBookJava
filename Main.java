import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String[] args) {

		ArrayList <Contact> memory = null;

		try{

			ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("memory.taraz"));
			memory = (ArrayList<Contact>)inStream.readObject();
			inStream.close();

		}catch(Exception e){

			System.out.println("MEMORY DOESN'T EXIST, CREATING NEW MEMORY INSTANCE");
			memory = new ArrayList<Contact>();

		}				
		
		boolean check = true;

		Scanner in = new Scanner(System.in);

		while(check){

			System.out.println(" PRESS [1] TO ADD CONTACT ");
			System.out.println(" PRESS [2] TO LIST CONTACT ");
			System.out.println(" PRESS [3] TO DELETE CONTACT");
			System.out.println(" PRESS [0] EXIT ");

			String choice = in.next();

			if(choice.equals("0")){
				
				try{

					ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("memory.taraz"));
					outStream.writeObject(memory);
					outStream.close();

				}catch(Exception e){
					System.out.println("Couldn't save data");
				}

				check = false;

			}else if(choice.equals("1")){

				System.out.println("INSERT NAME : ");
				String n = in.next();
				System.out.println("INSERT PHONE : ");
				String p = in.next();

				Contact cn = new Contact(memory.size()+1,n,p,true);
				memory.add(cn);		
				System.out.println("CONTACT ADDED SUCCESSFULLY!!!");

			}else if(choice.equals("2")){

				for(int i=0;i<memory.size();i++){

					if(memory.get(i).getActive()){
						
						System.out.println(memory.get(i).getFullData());

					}

				}

			}else if(choice.equals("3")){

				System.out.println("INSERT ID : ");	
				int id = in.nextInt();

				for(int i=0;i<memory.size();i++){

					if(id == memory.get(i).getId()){
						memory.get(i).setActive(false);
						System.out.println("CONTACT DELETED");
					}

				}

			}else{
				System.out.println("INVALID COMMAND!!!");
			}

		}		

	}
}