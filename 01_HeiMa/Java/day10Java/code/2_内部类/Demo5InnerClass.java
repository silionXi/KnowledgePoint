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
	/*class Inner implements Inter {				//�����ֵ��ڲ���ʵ���ⲿ�ӿ�
		public void show1() {
			System.out.println("show1");
		}

		public void show2() {
			System.out.println("show2");
		}
	}

	public void method() {
		Inter i = new Inner();						//��������ָ���������
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

		Inter i = new Inter() {					//�����ڲ��������дһ��������ʱ��ʹ��
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
