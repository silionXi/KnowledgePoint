class EmpolyeeDemo9 {
	public static void main(String[] args) {
		Employee e = new Employee("���","007",20000.00);
		e.work();
	}
}
/*
* A:������ʾ
	* ���󣺶���һ��Ա����Employee
	* �Լ�������������Ա��Ȼ�������Ա����
		* ����,����,����
	* ���췽����
		* �ղκ��вε�
	* getXxx()setXxx()������
	* �Լ�һ����ʾ���г�Ա��Ϣ�ķ����������ԡ�
		* work 
*/

class Employee {
	private String name;
	private String id;
	private double pay;

	public Employee() {}			//�ղεĹ��췽��

	public Employee(String name, String id, double pay) {
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public double getPay() {
		return pay;
	}

	public void work() {
		System.out.println("�ҵ�������:" + name + ",�ҵĹ�����:" + id + "�ҵ�нˮ��:" + pay);
	}
}