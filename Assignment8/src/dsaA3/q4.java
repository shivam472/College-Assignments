package dsaA3;

class Box<T>
{
	T a, b;
	Box(T a, T b)
	{
		this.a = a;
		this.b = b;
		System.out.println("" + this.a + this.b);
	}
}
public class q4 {

	public static void main(String[] args) {
		Box<String> ob = new Box<String>("abc", "def");
		Box<Integer> ob1 = new Box<Integer>(1, 5);
		Box<Object> ob2 = new Box<Object>(1, 2);
		

	}

}
