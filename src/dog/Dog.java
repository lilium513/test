package dog;

public class Dog {
	private String nakigoe = "ワン、ワンワン";
	private String name;

	public Dog() {
		name = "犬山";
	}

	public Dog(String name) {
		this.name = name;
	}

	public void naku() {
		System.out.println(name + ": " + nakigoe);
	}
}
