class Demo6Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show1();
		z.show2();
	}
}

class Fu {
	public void show1() {
		System.out.println("show1");
	}
}

class Zi extends Fu {
	
	public void show1() {						//�����ĸ�д(��д)
		super.show1();							//��䶼��Ҫ�����ڷ�����
		System.out.println("Zi show1");			//����Ӹ��෽��������д,����ʸ���ķ�����Ҫ��super.
	}

	public void show2() {
		System.out.println("show2");
	}

}
