class Demo3DuoTai {
	public static void main(String[] args) {
		Person p = new SuperMan();				//��������ָ���������(�Զ���������,����ת��)
		System.out.println(p.name);

		p.̸����();
		
		SuperMan sm = (SuperMan)p;				//����ת��
		sm.fly();
	}
}
class Person {
	String name = "Լ��";
	public void ̸����() {
		System.out.println("̸����");
	}
}

class SuperMan extends Person {
	String name = "����";

	public void ̸����() {
		System.out.println("̸�����ڵĴ���");
	}

	public void fly() {
		System.out.println("�ɳ�ȥ����");
	}
}