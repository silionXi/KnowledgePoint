class Demo1Interface {
	public static void main(String[] args) {
		Inter i = new Demo();
		i.print();
	}
}

interface Inter {
	public abstract void print();
	
	/*public void method() {				//����: �ӿڷ������ܴ�������
		System.out.println("aaa");			//�ӿ������еķ������ǳ����
	}*/
}

class Demo implements Inter {
	public void print() {
		System.out.println("print");
	}
}
