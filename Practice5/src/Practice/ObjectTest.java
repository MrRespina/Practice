package Practice;

public class ObjectTest {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		Chicken r = new Chicken();
		NewDog nd = new NewDog("Doong");
		
		//nullPointerException Test(Dog)
		d.bark();
		d.eat();
		d.move();
		System.out.println();
		
		//Main Test(Dog)
		d.setName("Maru");
		d.bark();
		d.eat();
		d.move();
		System.out.println();
		
		//Main Test(Cat)
		c.setName("Hodu");
		c.bark();
		c.eat();
		c.move();
		System.out.println();
		
		//Main Test(Chicken),
		r.setName("Rooster");
		r.bark();
		r.eat();
		r.move();
		r.layEgg();
		System.out.println();
		
		//Constructor Test. NewDog 객체 생성 시 생성자로 Doong 변수를 전달했기 때문에 따로 setName을 사용할 필요가 없음.
		nd.bark();
		nd.eat();
		nd.move();
		
	}
	
}
