class Demo2This {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.setBrand("����");
		p.setPrice(2480);
		p.setColor("��ɫ");

		System.out.println("������������" + p.getBrand() + "�ֻ�,�۸���:" + p.getPrice() + ",��ɫ��:" + p.getColor());

		p.call();
		p.sendMessage();
		p.playGame();
	}
}
/*
����ֻ���д��һ����׼�࣬Ȼ�󴴽�������Թ��ܡ�
*/

class Phone {
	private String brand;			//Ʒ��
	private int price;				//�۸�
	private String color;			//��ɫ

	public void setBrand(String brand) {		//setXxx����,�޸�ֵ
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {					//getXxx����,��ȡֵ
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

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