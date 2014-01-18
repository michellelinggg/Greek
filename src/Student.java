
import java.util.*;

public class Student {
	private String name;
	private int year;
	private ArrayList<House> Accepted;
	private ArrayDeque<House> Drop;
	
	public Student(String name, int year){
		this.name = name;
		this.year = year;
		Accepted = new ArrayList<House>();
		Drop = new ArrayDeque<House>(3);
	}
	
	public int listSize(){
		return Accepted.size();
	}
	
	public void add(House house){
		Accepted.add(house);
	}
	
	public void drop(House house){
		Drop.addLast(house);
	}
	
	public void remove(){
		House house = Drop.poll();
		Accepted.remove(house);
	}
	
	public void clearAll(){
		Accepted.clear();
	}

	public int hashCode(){
		return name.hashCode() + year;
	}
	
	public boolean equals(Object obj){
		return (((Student) obj).name == this.name) && (((Student) obj).year == this.year);
	}
}
