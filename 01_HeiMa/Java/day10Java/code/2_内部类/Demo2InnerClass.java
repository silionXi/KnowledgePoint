class Demo2InnerClass {
	public static void main(String[] args) {
		//�ⲿ����.�ڲ����� ������ = �ⲿ����.�ڲ������;
		/*Outer.Inner oi = new Outer.Inner();
		oi.print();

		Outer.Inner.method();*/

	}
}

class Outer {
	static class Inner {
		public void print() {
			System.out.println("Hello World!");
		}

		public static void method() {
			System.out.println("method");
		}
	}

	/*class Inner2 {							//�Ǿ�̬�ĳ�Ա�ڲ����в����Զ��徲̬�ĳ�Ա
		public static void run() {
			System.out.println("run");
		}
	}*/
}