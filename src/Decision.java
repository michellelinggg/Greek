import java.util.*;

public class Decision {
	
	public static void houseAdd(House house){
		while (house.check() != null){
			Student Girl = house.getStudent();
			Girl.add(house);
		}
	}
	
	
	public static void studentListReduce(ArrayList<Student> Students, int size){
		for (int i = 0; i<Students.size(); i++){
			while (Students.get(i).listSize() > size){
				Students.get(i).remove();
			}
				
		}
	}
	
	public static void studentAdd(House house, Student student){
		student.drop(house);
	}
	
	public static void houseAdd(House house, Student student){
		house.add(student);
	}
	
}
