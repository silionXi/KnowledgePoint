class Demo3InnerClass {
	public static void main(String[] args) {
		//Outer o = new Outer();
		//o.method();

		Outer o = new Outer();
		o.method();
	}
}

class Outer {										//�ⲿ��
	public void method() {							//�ⲿ��ĳ�Ա����
		final int num = 10;
		class Inner {								//�ֲ��ڲ���
			public void show() {					//�ֲ��ڲ����еĳ�Ա����
				System.out.println(num);
			}
		}

		Inner i = new Inner();
		i.show();
	}

}
