class Demo4InnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}

interface Inter {
	public void print();
}

class Outer {
	/*class Inner implements Inter {					//�����ֵ��ڲ���ʵ���ⲿ�ӿ�
		public void print() {
			System.out.println("Hello World!");
		}
	}

	public void method() {
		//Inner i = new Inner();
		//i.print();
		new Inner().print();
	}*/
	/*
	new �ӿڻ�����(){
		��Ҫ��д�ķ���
	}
	*/
	public void method() {
		new Inter(){
			public void print() {
				System.out.println("print");
			}
		}.print();
	}
}
