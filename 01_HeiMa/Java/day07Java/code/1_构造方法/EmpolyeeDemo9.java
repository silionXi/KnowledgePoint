class EmpolyeeDemo9 {
	public static void main(String[] args) {
		Employee e = new Employee("邦德","007",20000.00);
		e.work();
	}
}
/*
* A:案例演示
	* 需求：定义一个员工类Employee
	* 自己分析出几个成员，然后给出成员变量
		* 姓名,工号,工资
	* 构造方法，
		* 空参和有参的
	* getXxx()setXxx()方法，
	* 以及一个显示所有成员信息的方法。并测试。
		* work 
*/

class Employee {
	private String name;
	private String id;
	private double pay;

	public Employee() {}			//空参的构造方法

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
		System.out.println("我的姓名是:" + name + ",我的工号是:" + id + "我的薪水是:" + pay);
	}
}