class Demo2Abstract {
	public static void main(String[] args) {
		����Ⱥ С���� = new ����Ⱥ();
		С����.�Թ�();
	}
}

/*
��������
*/

abstract class �������� {
	public abstract void �Թ�();			//����һ�ֹ���,ǿ��������д
}

class ����Ⱥ extends �������� {
	public void �Թ�() {
		System.out.println("��ǩ");
	}
}

class ��ƽ֮ extends �������� {
	public void �Թ�() {
		System.out.println("ָ�׵�");
	}
}

class �������� extends �������� {
	public void �Թ�() {
		System.out.println("����,����ֱ��");
	}
}