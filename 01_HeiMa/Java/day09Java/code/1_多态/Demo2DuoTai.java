class Demo2DuoTai {
	public static void main(String[] args) {
		/*Fu f = new Zi();
		System.out.println(f.num);

		Zi z = new Zi();
		System.out.println(z.num);*/

		Fu f = new Zi();
		//f.print();
		f.method();
		Fu.method();
	}
}
/*
��̬�е�
	��Ա����:���뿴���,���п����
	��Ա����:���뿴���,���п��ұ�(��̬��)
	��̬�ĳ�Ա����:���뿴���,���п����
	��̬�ĳ�Ա���������ڸ��ǵ�˵��

	ֻ�зǾ�̬�ĳ�Ա����,���뿴���(����)���п��ұ�(����)
*/
class Fu {
	int num = 10;

	public void print() {
		System.out.println("Fu");
	}

	public static void method() {
		System.out.println("Fu static");
	}
}

class Zi extends Fu {
	int num = 20;

	public void print() {
		System.out.println("Zi");
	}

	public static void method() {
		System.out.println("Zi static");
	}
}
