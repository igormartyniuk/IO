package DB2;

import java.util.Comparator;

public class SortByNumber implements Comparator<Shop> {

	@Override
	public int compare(Shop o1, Shop o2) {
		int number1 = Integer.parseInt(o1.getNumber());
		int number2 = Integer.parseInt(o2.getNumber());
		
	    if(number1>number2){
	    	return 1;
	    }else if(number1<number2){
	    	return -1;
	    }
		return 0;
	}

	
	
}
