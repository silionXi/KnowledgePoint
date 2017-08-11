class Demo5InnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}

interface Inter {
	public void show1();
	public void show2();
}

class Outer {
	/*class Inner implements Inter {				//有名字的内部类实现外部接口
		public void show1() {
			System.out.println("show1");
		}

		public void show2() {
			System.out.println("show2");
		}
	}

	public void method() {
		Inter i = new Inner();						//父类引用指向子类对象
		i.show1();
		i.show2();
	}*/

	public void method() {
		/*new Inter() {
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show1();

		new Inter() {
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show2();*/

		Inter i = new Inter() {					//匿名内部类最好重写一个方法的时候使用
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		};
		i.show1();
		i.show2();
	}
}
