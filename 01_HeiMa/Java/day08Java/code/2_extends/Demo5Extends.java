class Fu {
	static {
		System.out.println("��̬�����Fu");
	}

	{
		System.out.println("��������Fu");
	}

	public Fu() {
		System.out.println("���췽��Fu");
	}
}

class Zi extends Fu {
	static {
		System.out.println("��̬�����Zi");
	}

	{
		System.out.println("��������Zi");
	}

	public Zi() {
		super();
		System.out.println("���췽��Zi");
	}
}


class Demo5Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
		/*
		1,Demo5Extends.class���ؽ��ڴ�
		2,��������ջ
		3,��Ҫִ��Zi z = new Zi();��仰,�������ڴ滹û�м���Zi.class
		4,Zi�̳���Fu,����Fu.class�ȼ��ؽ��ڴ�,ͬʱ����ľ�̬�����Ҳ���ؽ��ڴ�
		5,Zi.class���ؽ��ڴ�,ͬʱ����ľ�̬�����Ҳ���ؽ��ڴ�
		6,ִ��Zi��Ĺ��췽��,���๹�췽����������super,super����ʸ����еĹ��췽��
		7,�ڸ��๹�췽��ִ��֮ǰ,���ȿ��Ƿ��й�������,����ִ�й�������
		8,ִ�и��๹�췽��
		9,ִ�����๹�췽��,��ִ��֮ǰ�ῴ�Ƿ��й�������,����ִ��
		10,ִ�����๹�췽��
		*/
	}
}