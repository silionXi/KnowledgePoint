class Demo4DuoTai {
	public static void main(String[] args) {
		ե֭�� z = new ե֭��();
		z.run(new ƻ��());
		z.run(new ����());
	}
}

class ˮ�� {
	public void ե֭() {
		System.out.println("եˮ��֭��");
	}
}

class ƻ�� extends ˮ�� {
	public void ե֭() {
		System.out.println("ե��һ��ƻ��֭��");
	}
}

class ���� extends ˮ�� {
	public void ե֭() {
		System.out.println("ե��һ������֭��");
	}
}

class ե֭�� {
	/*public void run(ƻ�� a) {		//ƻ�� a = new ƻ��();
		a.ե֭();
	}

	public void run(���� o) {		
		o.ե֭();
	}*/

	public void run(ˮ�� f) {		//ˮ�� f = new ƻ��();
		f.ե֭();
	}
}