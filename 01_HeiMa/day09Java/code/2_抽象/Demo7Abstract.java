class Demo7Abstract {
	public static void main(String[] args) {
		//Zi z = new Zi();
		//z.print();
	}
}

abstract class Fu {
	//private abstract void print();		//Demo7Abstract.java:9: ����: �Ƿ������η����: abstract��private
										//private��˽�в������࿴��,abstract�ǳ������Ϊ����������д,����ì�ܵ�
	//static abstract void print();		//Demo7Abstract.java:11: ����: �Ƿ������η����: abstract��static
										//��̬���εķ���,����ֱ������.����,������.���ó��󷽷���û�������

	final abstract void print();		//Demo7Abstract.java:14: ����: �Ƿ������η����: abstract��final
										//final�����յ�,���εķ�������������д,��abstract���εķ�������Ϊ����������д

}

class Zi extends Fu {
	public void print() {
		System.out.println("Hello World!");
	}
}