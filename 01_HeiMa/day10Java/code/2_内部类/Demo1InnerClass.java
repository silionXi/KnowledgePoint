class Demo1InnerClass {
	public static void main(String[] args) {
		//Inner i = new Inner();
		//i.print();
		//�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
		//Outer.Inner o = new Outer().new Inner();
		//o.print();

		Outer o = new Outer();
		o.method();
	}
}

class Outer {							//�ⲿ��
	//��Ա�ڲ���
	private int num = 10;
	private class Inner {				//�ڲ���
		public void print() {			//�ڲ���ĳ�Ա����
			System.out.println(Outer.this.num);
		}
	}

	public void method() {
		Inner i = new Inner();			//�����ڲ������
		i.print();						//�����ڲ��෽��
	}
}

