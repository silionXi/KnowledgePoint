class Demo1Car {
	public static void main(String[] args) {
		Car c1 = new Car();					//c1�Ƕ��������
		//new Car();							//��������

		c1.color = "red";
		c1.num = 8;
		c1.run();

		new Car().color = "blue";			//���������Ƿ���Ե�������?���Ե���û������
		new Car().num = 4;
		new Car().run();					//���������Ƿ���Ե��÷���?����

		Car c2 = new Car();
		c2.print();
		c2.print();
		new Car().print();					//����������÷����ĺô�,ֻ�ǽ�ʡ�˴���
		new Car().print();					//�����ͬһ��������ε���,�����������ֵĶ���
		new Car().print();					//��Ϊ��������ᴴ���������,�˷ѿռ�
	}
}

class Car {
	String color;
	int num;

	public void run() {
		System.out.println(color + "," + num);
	}

	public void print() {
		System.out.println("11111111111111111111111111");
	}
}
