class Demo2Interface {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
		//System.out.println(Inter.num);
	}
}

interface Inter {
	 public static final int num = 10;				//�ӿ������еı������ǳ���

	 public abstract void print();					//�ӿ������еķ������ǳ����
}

class Demo implements Inter {
	public void print() {							//��д�ӿ��еķ���,Ȩ�ޱ�����public
		System.out.println("1111111111111");
	}
}
