package Collections.Comparator;
import java.util.*;
public class Esal implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		//24k,35k,28k,38
		if(e1.esal==e2.esal)
		return 0;
		else if(e1.esal>e2.esal)
			return 1;
		else
			return -1;
		
	}
}

