class Demo2Static {
	public static void main(String[] args) {
		//Test t = new Test();
		//t.print1();

		Test.print2();
		//method();								//method�����Ǿ�̬��,ֱ���ܵ���,����Ϊϵͳ��Ĭ�ϼ�������.
		Demo2Static.method();
	}

	public static void method() {
		System.out.println();
	}
}

class Test {
	int num1 = 10;
	static int num2 = 20;

	/*public void print1() {					//�Ǿ�̬�ĳ�Ա�������Է��ʾ�̬�ĳ�Ա
		System.out.println(num1);
		System.out.println(num2);
	}*/

	public static void print2() {				//��̬�������ܷ��ʷǾ�̬�ĳ�Ա
		//System.out.println(this.num1);
		System.out.println(num2);				//��ֻ̬�ܷ��ʾ�̬
	}
}
