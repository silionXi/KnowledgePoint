class Demo8 {
	public static void main(String[] args) {
		Demo d = new Demo();
		int num = d.add(30,40);
		System.out.println(num);
	}
}

class Demo {
	int a;
	int b;

	//��ʽһ���
	/*public int add() {
		int a = 10;
		int b = 20;
		return a + b;
	}*/
	
	//��ʽ�����
	/*public int add(int a,int b) {
		return a + b;
	}*/

	//��ʽ�����

	public int add(int a,int b) {
		this.a = a;
		this.b = b;

		return this.a + this.b;
	}

	/*
	��Ա�����;ֲ�����
	��Ա���������ڶ���,Ҫ���Ƿ��Ƕ��������,������,�˵�����,�����
	�ֲ����������뷽��,Ҫ������ִ�е�ʱ��,�Ƿ���Ҫ,�����Ҫ�Ͷ���,�ô��Ƿ������к����ʧ
	*/
}
