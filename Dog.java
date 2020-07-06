public class Dog extends Animal //inherit from the class Animal.
{private String d;
public Dog (String name) {
	d=name;
}
public void introduceYourself() {
System.out.println("Woof. I am a dog. My name is"+ d +".");
}
}
