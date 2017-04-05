package core_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DB {

//	Map <ID, Person> map = new HashMap <> ();
	Map <Integer, Person> map = new HashMap <> ();
	
	
	public void addPerson(){
		
		Set<Entry<Integer, Person>> setMap = map.entrySet();
		Iterator<Entry<Integer, Person>> iter = setMap.iterator();
		System.out.println("enter id number");
		int idNamber = Main.scanner.nextInt();
		
		boolean tryId = true;
		while (iter.hasNext()) {
			Entry<Integer, Person> temp = iter.next();

			if (temp.getKey() == idNamber) {
				tryId = false;
				break;

			}
		}
		
		if(tryId == true){
			System.out.println("enter person's name");
			String personName = Main.scanner.next();
			
			System.out.println("enter person's age");
			int personAge = Main.scanner.nextInt();
			
			map.put(idNamber, new Person(personName, personAge));
		}else if(tryId == false){
			System.out.println("Please try another ID");
		}
		
	}
	
	
	
	public void removePerson() {
		
		Set<Entry<Integer, Person>> setMap = map.entrySet();
		Iterator<Entry<Integer, Person>> iter = setMap.iterator();
		System.out.println("enter id number");
		int idNamber = Main.scanner.nextInt();
		
		while (iter.hasNext()) {
			Entry<Integer, Person> temp = iter.next();

			if (temp.getKey() == idNamber) {
				String name = temp.getValue().getName();
				int age = temp.getValue().getAge();
				
				map.remove(new Person(name, age));

			}

		}
		for (Entry<Integer, Person> entry : setMap) {
			System.out.println(entry.getKey().intValue()+ " "
					+ entry.getValue().getName() +" - "
					+ entry.getValue().getAge());
		}

	}
	


	public void showDataBase() throws IOException{
		File file = new File("DataBase.txt");
		file.createNewFile();
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file);
		Set<Entry<Integer, Person>> setMap = map.entrySet();
		int tmp;
		for (Entry<Integer, Person> entry : setMap) {
			System.out.println(entry.getKey().intValue()+ " "
					+ entry.getValue().getName() +" - "
					+ entry.getValue().getAge());
			
		}
		
	
	}
	
	
	public void updateDataBase(){

		Set<Entry<Integer, Person>> setMap = map.entrySet();
		Iterator<Entry<Integer, Person>> iter = setMap.iterator();
		System.out.println("enter id number");
		int idNamber = Main.scanner.nextInt();
		
		while (iter.hasNext()) {
			Entry<Integer, Person> temp = iter.next();

			if (temp.getKey() == idNamber) {
				System.out.println("enter new name");
				String newName = Main.scanner.next();
				temp.getValue().setName(newName);
				
				System.out.println("enter new age");
				int newAge = Main.scanner.nextInt();
				temp.getValue().setAge(newAge);

			}

		}
		
	}
	
	public void findByIdNumber(){
		
		
		Set<Entry<Integer, Person>> setMap = map.entrySet();
		Iterator<Entry<Integer, Person>> iter = setMap.iterator();
		System.out.println("enter id number");
		int idNamber = Main.scanner.nextInt();
		
		while (iter.hasNext()) {
			Entry<Integer, Person> temp = iter.next();

			if (temp.getKey() == idNamber) {
				
				System.out.println(temp.getValue().getName() + " "+ temp.getValue().getAge());

			}

		}
	}
	
	public void exit() {
		System.exit(0);

	}
	
	
	public void menu() throws IOException{
		
		while(true){
			map.put(1, new Person("igor", 23));
			map.put(2, new Person("oleg", 25));
			map.put(3, new Person("dima", 32));
			
			System.out.println("press 1 to show data");
			System.out.println("press 2 to find by id number");
			System.out.println("press 3 to remove by id number");
			System.out.println("press 4 to add new into data");
			System.out.println("press 5 to update information");
			System.out.println("press 6 exit");
			
			int choise = Main.scanner.nextInt();
			switch (choise) {
				case 1:{
					showDataBase();
					System.out.println(" ");
					break;
				}
				
				case 2:{
					findByIdNumber();
					System.out.println(" ");
					break;
				}
				
				case 3:{
					removePerson();
					System.out.println(" ");
					break;
				}
				
				case 4:{
					addPerson();
					System.out.println(" ");
					break;
				}
				
				case 5:{
					updateDataBase();
					System.out.println(" ");
					break;
				}
				
				case 6:{
					exit();
					break;
				}
					
	
				default:
					System.out.println("wrong, try again");
					break;
				}
		}
		
		
	}
	
	
	
	
	
}
