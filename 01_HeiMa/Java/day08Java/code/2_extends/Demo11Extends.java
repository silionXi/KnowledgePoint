/*
* A:è����������
* B:������ʾ
	* è�������̳а�

	è��:
		����:��ɫ,�ȵĸ���
		��Ϊ:�Է�,ץ����
	����:
		����:��ɫ,�ȵĸ���
		��Ϊ:�Է�,����
	������:
		��ͬ�����Ժ���Ϊ
		����:��ɫ,�ȵĸ���
		��Ϊ:�Է�

	1,��������(˽��)
	2,����ղκ��вι���(������û�з���ֵ����)
	3,setXxx��getXxx����(��������)
	4,������Ϊ(����)
*/
class Demo11Extends {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setColor("��");
		d1.setLeg(4);

		System.out.println(d1.getColor() + "," + d1.getLeg());

		Dog d2 = new Dog("��",2);
		System.out.println(d2.getColor() + "," + d2.getLeg());
	}
}

class Animal {
	private String color;
	private int leg;

	public Animal(){}

	public Animal(String color,int leg) {
		this.color = color;
		this.leg = leg;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String getColor() {
		return color;
	}

	public int getLeg() {
		return leg;
	}

	public void eat() {
		System.out.println("�Է�");
	}
}

class Cat extends Animal {
	public Cat(){}

	public Cat(String color,int leg) {
		super(color,leg);
	}

	public void catchMouse() {
		System.out.println("ץ����");
	}
}

class Dog extends Animal {
	public Dog(){}

	public Dog(String color,int leg) {
		super(color,leg);
	}

	public void lookHome() {
		System.out.println("����");
	}
}