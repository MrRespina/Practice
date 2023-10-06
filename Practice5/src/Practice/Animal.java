package Practice;

public interface Animal{
	
	//Use Animal interface
	//abstract method를 만들어둠으로써 차후에 interface를 구현함(implements).
	public abstract void setName(String name);
	public abstract void verif(String name,String pattern);
	public abstract void bark();
	public abstract void move();
	public abstract void eat();

}
