class Demo3Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}

class Fu {
	int num1 = 10;
	int num2 = 30;
}

class Zi extends Fu {
	int num2 = 20;

	public void show() {				//�ͽ�ԭ��,�Լ��оͲ��ø����
		System.out.println(super.num1);
		System.out.println(this.num2);
		//System.out.println(super.num2);	//super���Ե��ø���ĳ�Ա����
	}
}

/*
this��super������
1.this���Է����Լ��ĳ�Ա����,Ҳ���Է��ʸ���ĳ�Ա����(����û�������Ա����)
  superֻ�ܷ��ʸ���ĳ�Ա����
*/
