/*
final�����յ�
final����������,�����ͱ���
final���ε���,�����Ա��̳�(���˼�ͥ)
final���εķ���,�����Ա���д
final���εı���,�ֳ�֮Ϊ����
*/
class Demo1Final {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.method();
	}
}

/*final class Fu {
	public  void method() {
		System.out.println("���ʵײ��ļ�");
	}
}*/

class Zi /*extends Fu*/ {
	final double PI = 3.14;
	public void method() {
		System.out.println("����,���Ҹɵ���");
	}
}
