class Demo3Interface {
	public static void main(String[] args) {
		/*DemoE d = new DemoE();
		d.method();
		d.show();*/

		DemoG d = new DemoG();
	}
}

/*
������,����ӿ�,�ӿ���ӿڵĹ�ϵ
*/

interface DemoA {
	public void show();
} 

interface DemoB {
	public void method();
}

abstract class DemoC {
	public abstract void print();
}

/*class DemoD extends DemoC {				//������֮���Ǽ̳й�ϵ,ֻ�ܵ��̳�
}*/

/*class DemoE implements DemoA,DemoB {		//����ӿ�ֱ����ʵ�ֹ�ϵ,�ȿ��Ե�ʵ��Ҳ���Զ�ʵ��
	public void show() {
		System.out.println("show");
	}

	public void method() {
		System.out.println("method");
	}
}*/

interface DemoF extends DemoA,DemoB{		//�ӿںͽӿ�ֱ���Ǽ̳й�ϵ,�ȿ��Ե��̳�Ҳ���Զ�̳�

}

class DemoG implements DemoF {
	public void show() {
		System.out.println("show");
	}

	public void method() {
		System.out.println("method");
	}
}