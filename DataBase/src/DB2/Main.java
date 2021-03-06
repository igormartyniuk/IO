package DB2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Main {

	static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) throws IOException {	
		
		List <Shop> list = new ArrayList<Shop>();
		File file = new File("shop.txt");
		
		while(true){
			System.out.println("enter 1 - add item");
			System.out.println("enter 2 - show items");
			System.out.println("enter 3 - delete items");
			System.out.println("enter 4 - sort");
			System.out.println("enter 5 - update information");
			System.out.println("enter 6 - exit");
			int choise = scanner.nextInt();
			
			switch (choise) {
			
			case 1:{
				System.out.println("enter ID");
				String id = scanner.next();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        File f = new File("shop.txt");
		        BufferedReader fin = new BufferedReader(new FileReader(f));
		        String line;

		        String id1= null;
		        boolean contains = false;
		        		        	
		        	while ((line = fin.readLine()) != null){
		        		String [] data = line.split(", ");	    
		        		

			        		for (int i = 0; i < data.length; i++) {
			        			id1 = data[0];
			        			int chislo = Integer.parseInt(data[0]);
			        			int chislo1 = Integer.parseInt(id);
				        		if(chislo == chislo1){
				        			contains = true;
				        			
				        		}
				        		
		        			
		        			
		        		}
			        		
		        	}
		        	
		        	if(contains == true){
		        		
		        		System.out.println("this id already exists");
		        		System.out.println(" ");
		        		
		        		
		        		
		        	}else{
		        		String idfinal = id + ", ";
		        		
		        		System.out.println("enter numbers of item");
						String number = scanner.next() + ", ";
						
						System.out.println("enter item name");
						String item = scanner.next() + ", ";
						
						System.out.println("enter price");
						String price = scanner.next() + "\n";
						
						
						
						FileOutputStream out = new FileOutputStream(file, true);
			
						byte [] ids = idfinal.getBytes();
						byte [] numbers = number.getBytes();
						byte [] items = item.getBytes();
						byte [] prices = price.getBytes();
						
						out.write(ids);
						out.write(numbers);
						out.write(items);
						out.write(prices);
		        	}
				
				
				break;
			}
			
			case 2:{

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        File f = new File("shop.txt");
		        BufferedReader fin = new BufferedReader(new FileReader(f));
		        String line;

		        String id= null;
		        String number= null;
				String item= null;
				String price = null;
		        	
				while ((line = fin.readLine()) != null){
	        		String [] data = line.split(", ");	    
	        		
	        		for (int i = 0; i < data.length; i++) {
	        			
					}
	        		id = data[0];
	        		number = data[1];
	        		item = data[2];
	        		price = data[3];
	        		list.add(new Shop(id, item, price, number));	        		
	        		}
				
				System.out.println("enter 1 - show all");
				System.out.println("enter 2 - show by id");
				choise = scanner.nextInt();
				
				switch (choise) {
				case 1:{
			        System.out.println(" ");
			        System.out.println(list.toString());
			        break;
				}
				
				case 2:{
					System.out.println("enter id");
					String myId = scanner.next();
					for (Shop shop : list) {
						if(myId.equalsIgnoreCase(shop.getId())){
							System.out.println(shop);
						}
					}
					
				}
					

				default:
					break;
				}
				
				
	        

//	        
	        list.clear();
//	        
//	        
//			}
			
				break;
			}	
			case 3:{
				System.out.println("enter ID");
				String id = scanner.next();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        File f = new File("shop.txt");
		        BufferedReader fin = new BufferedReader(new FileReader(f));
		        String line;

		        String id1= null;
		        String number= null;
				String item= null;
				String price = null;
		        	
		        	while ((line = fin.readLine()) != null){
		        		String [] data = line.split(", ");	    
		        		
		        		for (int i = 0; i < data.length; i++) {
		        			
						}
		        		id1 = data[0];
		        		number = data[1];
		        		item = data[2];
		        		price = data[3];
		        		list.add(new Shop(id1, item, price, number));	        		
		        		}
		        
		        java.util.Iterator<Shop> iter= list.iterator();
		        while (iter.hasNext()) {
					if(id.equalsIgnoreCase(iter.next().getId())){
						iter.remove();
					}
					
					
					
				}
		        
		        for (Shop shop : list) {
		        	FileOutputStream out = new FileOutputStream(file);
					
					byte [] ids = (shop.getId()+", ").getBytes();
					byte [] numbers = (shop.getNumber()+", ").getBytes();
					byte [] items = (shop.getItem()+", ").getBytes();
					byte [] prices = (shop.getPrice()+"\n").getBytes();
					
					out.write(ids);
					out.write(numbers);
					out.write(items);
					out.write(prices);
				}

		        System.out.println(" ");
		        System.out.println(list);
		        
		        list.clear();
		        
		        

		      
				break;
			}
			case 4:{
	
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        File f = new File("shop.txt");
		        BufferedReader fin = new BufferedReader(new FileReader(f));
		        String line;

		        String id1= null;
		        String number= null;
				String item= null;
				String price = null;
		        	
		        while ((line = fin.readLine()) != null){
		        	String [] data = line.split(", ");	    
		        		
		        	for (int i = 0; i < data.length; i++) {
		        			
					}
		        	id1 = data[0];
		        	number = data[1];
		        	item = data[2];
		        	price = data[3];
		        	list.add(new Shop(id1, item, price, number));	
		        }
		        System.out.println("enter 1 - sort by id");
		        System.out.println("enter 2 - sort by price");
		        System.out.println("enter 3 - sort by number");
		        choise = scanner.nextInt();
		        
			        switch (choise) {
					case 1:{
						 Collections.sort(list, new SortById());
					     System.out.println(" ");
					     System.out.println(list);
					     break;
					}
					case 2:{
						Collections.sort(list, new SortByPrice());
					     System.out.println(" ");
					     System.out.println(list);
					     break;
					}
					case 3:{
						Collections.sort(list, new SortByNumber());
					     System.out.println(" ");
					     System.out.println(list);
					     break;
					}
					

				default:
					break;
				}
		        	
		        list.clear();

				break;
			}
			
			case 5:{
				System.out.println("enter ID");
				String id = scanner.next();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        File f = new File("shop.txt");
		        BufferedReader fin = new BufferedReader(new FileReader(f));
		        String line;

		        String id1= null;
		        String number= null;
				String item= null;
				String price = null;
		        	
		        	while ((line = fin.readLine()) != null){
		        		String [] data = line.split(", ");	    
		        		
		        		for (int i = 0; i < data.length; i++) {
		        			
						}
		        		id1 = data[0];
		        		number = data[1];
		        		item = data[2];
		        		price = data[3];
		        		list.add(new Shop(id1, item, price, number));	        		
		        	}
		        
		        for (Shop shop : list) {
		        	if(id.equalsIgnoreCase(shop.getId())){
		        	System.out.println("enter new item name");
					String newItem = scanner.next();
					shop.setItem(newItem);
					
					System.out.println("enter new item price");
					String newPrice = scanner.next();
					shop.setPrice(newPrice);
					
					System.out.println("enter new item number");
					String newNumber = scanner.next();
					shop.setNumber(newNumber);
		        	}
				}
		        
		        for (Shop shop : list) {
		        	
					
					byte [] ids = (shop.getId()+", ").getBytes();
					byte [] numbers = (shop.getNumber()+", ").getBytes();
					byte [] items = (shop.getItem()+", ").getBytes();
					byte [] prices = (shop.getPrice()+"\n").getBytes();
					byte [] enter = "\n".getBytes();
					
					FileOutputStream out = new FileOutputStream(file);
					out.write(ids);
					out.write(numbers);
					out.write(items);
					out.write(prices);
					out.write(enter);
				}

		        System.out.println(" ");
		        System.out.println(list);
		        
		        list.clear();

				break;
			}
			
			case 6:{
				System.exit(0);
				break;
			}
				
	
			default:{
				System.out.println("wrong input, try again");
				break;
			}
			
			}
			
		}
		
		
		
		
	}

}
