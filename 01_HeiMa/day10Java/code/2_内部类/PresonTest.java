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
		//��ε���PersonDemo�е�method������?
		PersonDemo pd = new PersonDemo ();
		pd.method(new Person(){
			public void show() {
				System.out.println("11111111111");
			}
		});
	}
}