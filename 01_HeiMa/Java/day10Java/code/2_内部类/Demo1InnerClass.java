class Demo1InnerClass {
	public static void main(String[] args) {
		//Inner i = new Inner();
		//i.print();
		//外部类名.内部类名 对象名 = 外部类对象.内部类对象;
		//Outer.Inner o = new Outer().new Inner();
		//o.print();

		Outer o = new Outer();
		o.method();
	}
}

class Outer {							//外部类
	//成员内部类
	private int num = 10;
	private class Inner {				//内部类
		public void print() {			//内部类的成员方法
			System.out.println(Outer.this.num);
		}
	}

	public void method() {
		Inner i = new Inner();			//创建内部类对象
		i.print();						//调用内部类方法
	}
}

