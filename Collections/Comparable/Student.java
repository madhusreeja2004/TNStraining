package Collections.Comparable;

public class Student implements Comparable<Student>{
	
	public int sid;
	public String name;
	public int age;
	//constructor
	public Student(int sid, String name, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	
	//greater->1,lesser-->-1,equals-->0
	public int compareTo(Student st) {
		if(age==st.age)
		return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
}