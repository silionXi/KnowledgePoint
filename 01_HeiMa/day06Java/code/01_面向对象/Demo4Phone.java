class Demo4Phone {
	public static void main(String[] args) {
		Phone p = new Phone();						//���������������С����
		p.brand = "����";							//�������Ե�ʱ�����û������
		p.price = 14999;
		p.color = "��ջ�";

		p.call();									//���÷�����ʱ�����������

		System.out.println("����һ��" + p.brand + "�ֻ�,�۸���:" + p.price + ",��ɫ��:" + p.color);
	}
}

/*
 ����:Ʒ��(brand)�۸�(price)
* ��Ϊ:��绰(call),����Ϣ(sendMessage)����Ϸ(playGame)
*/

class Phone {
	String brand;
	int price;
	String color;

	public void call() {
		System.out.println("��绰");
	}

	public void sendMessage() {
		System.out.println("����Ϣ");
	}

	public void playGame() {
		System.out.println("����Ϸ");
	}
}