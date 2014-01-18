import java.util.*;

public class GroupLeader {

	private String name;
	private HashSet<Student> Students;
	
	public GroupLeader(String name){
		this.name = name;
		Students = new HashSet<Student>();
	}
	
	public void add(Student stud){
		Students.add(stud);
	}
	
	public void showStudents(){
		Iterator<Student> studentIt = Students.iterator();
		while(studentIt.hasNext())
			System.out.print(studentIt.next());
	}
	
	public String name(){
		return name;
	}
	
	public HashSet<Student> Students(){
		return Students;
	}
	
	public boolean equals(Object obj){
		if (((GroupLeader) obj).name == this.name)
			return true;
		else
			return false;
	}
	
}
