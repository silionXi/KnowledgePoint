class Demo7Extends {
	public static void main(String[] args) {
		Iphone4s i = new Iphone4s();			//�����������,�ȴ������ҷ���,���û���Ҹ����
		i.siri();
		i.call();
	}
}

class Iphone4 {
	public void siri() {
		System.out.println("speak english");
	}

	public void call() {
		System.out.println("call");
	}

	public Iphone4(){}
}

class Iphone4s extends Iphone4 {
	public void siri() {
		super.siri();
		System.out.println("˵����");
	}

	public Iphone4s(){
		super();					//super()����this()��������ڹ��췽����
	}
}
