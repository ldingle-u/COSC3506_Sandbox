public class Person {
	int age;
	int height;
	String name;
	
	public Person() {
		this(18, 160, "NoName");
	}
	
	public Person(int age, int height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
}
