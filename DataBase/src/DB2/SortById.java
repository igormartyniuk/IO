package DB2;

import java.util.Comparator;

public class SortById implements Comparator<Shop>{

	@Override
	public int compare(Shop o1, Shop o2) {
		
		int result = Integer.parseInt(o1.getId());
		int result2 = Integer.parseInt(o2.getId());
		
	    if(result>result2){
	    	return 1;
	    }else if(result<result2){
	    	return -1;
	    }
		return 0;
	}

	
	
	
}
