package Practice;

public class StudentObjectTest {

	String s;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.setName("지병천");
		s.setAge(28);
		
		Result();
		Result(s);

	}
	
	static void Result(Student S) {
		System.out.println("성명 = "+S.getName()+", 나이 = "+S.getAge());		
	}
	
	static void Result() {
		System.out.println("overloading test");
	}

}
