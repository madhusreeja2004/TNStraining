package Collections.Comparable;
import java.util.*;
public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Joyce",23));
		al.add(new Student(103,"Babu",22));
		al.add(new Student(102,"Giva",18));
		al.add(new Student(104,"Harsha",21));
		al.add(new Student(105,"Beena",23));
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.sid+" "+st.name+" "+st.age);
		}
		
		
	}
}

