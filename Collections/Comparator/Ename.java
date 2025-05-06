package Collections.Comparator;
import java.util.*;
public class Ename implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		//Allen,Giva,Booby
				return e1.ename.compareTo(e2.ename);
	}
}
