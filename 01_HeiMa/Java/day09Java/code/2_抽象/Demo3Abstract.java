class Demo3Abstract {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.print();					//ֱ�ӵ��������е�print����
		z.method();
		Fu f = new Zi();
		f.print();					//���뿴����,���п�����
		f.method();
	}
}

abstract class Fu {
	public abstract void print();	//���󷽷�������������д��ʹ��

	public void method() {			//�ǳ��󷽷��������ֱ�Ӽ̳���
		System.out.println("Hello World!");
	}
}

class Zi extends Fu {
	public void print() {
		System.out.println("Zi");
	}
}