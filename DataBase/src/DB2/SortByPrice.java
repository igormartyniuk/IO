package DB2;

import java.util.Comparator;

public class SortByPrice implements Comparator<Shop> {

	@Override
	public int compare(Shop o1, Shop o2) {
		int price1 = Integer.parseInt(o1.getPrice());
		int price2 = Integer.parseInt(o2.getPrice());
		
	    if(price1>price2){
	    	return 1;
	    }else if(price1<price2){
	    	return -1;
	    }
		return 0;
	}

}
