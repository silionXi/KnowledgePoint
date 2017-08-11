abstract class Person {
	public abstract void show();
}

class PersonDemo {
	public void method(Person p) {
		p.show();
	}
	
}
/*
Person p = new Person(){
			public void show() {
				System.out.println("11111111111");
			}
		}
*/
class PersonTest {
	public static void main(String[] args) {
		//如何调用PersonDemo中的method方法呢?
		PersonDemo pd = new PersonDemo ();
		pd.method(new Person(){
			public void show() {
				System.out.println("11111111111");
			}
		});
	}
}