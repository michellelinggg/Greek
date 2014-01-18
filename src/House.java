import java.util.*;

public class House {
	private String name;
	private PriorityQueue<Student> Preferred;
	
	public House(String name){
		this.name = name;
		Preferred = new PriorityQueue<Student>();
	}
	
	public void add(Student stud){
		Preferred.add(stud);
	}
	
	public Student check(){
		return Preferred.peek();
	}
	
	public Student getStudent(){
		return Preferred.poll();
	}
	
	public String name(){
		return name;
	}
	
	public int hashCode(){
		return name.hashCode();
	}
	
	public boolean equals(Object obj){
		return (((House) obj).name == this.name);
	}
}
