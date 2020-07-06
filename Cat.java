public class Cat extends Animal //inherit from the class Animal.
{
	private String c;
	public Cat (String name) {
		c=name;
	}
public void introduceYourself() {
	System.out.println("Meow. I am a cat. My name is"+ c);
}
}
