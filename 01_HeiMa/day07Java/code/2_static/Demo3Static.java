class Demo3Static {
	public static void main(String[] args) {		//new String[] {11,22,33};
		for (int x = 0;x < args.length ;x++ ) {
			System.out.print(args[x] + " ");
		}
		
	}

	public static void main() {						//这个方法和主方法构成重载	
		System.out.println("1111111111111");
	}
}
