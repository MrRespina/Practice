package Practice;

public class Dog implements Animal {

	String name;

	@Override
	public void bark() {
		verif(name,"bark");
	}

	@Override
	public void move() {		
		verif(name,"move");
	}

	@Override
	public void eat() {
		verif(name,"eat");
	}

	@Override
	public void setName(String name) {		
		this.name = name;
	}

	@Override
	public void verif(String n,String p) throws NullPointerException{
		
		String s;
		try {
			s=n;
			if(n!=null||s.equals("")) {
				System.out.println("Dog "+n+" "+p);
			}
		}catch(Exception e) {
			System.out.println("이름을 먼저 입력해주세요!");
		}
		
	}

}
