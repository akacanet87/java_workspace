class Duck{

	String name="Donald";
	int dage=3;

	static int age=3;					//	Ŭ���� ����( �ν��Ͻ��� �Ҽӵ��� �ʰ�
											//	Ŭ���� ������ �ҼӵǱ� ���� )

	public void test(){

		System.out.println("������ ���̴� "+age);			//	�ڱ����� ��� ��Ǫ���� static���� �ִٸ� �ҷ��� �� �ִ�.

	}

	public static void test2(){

		System.out.println("������ �̸��� "+name);

	}

	public static void main( String[] args){

		Duck d = new Duck();

		d.test();

		d.test2();						//	d�� ���� ����. test2�� static���� ���� �Ǿ��� ����

		//Duck.age=5;					//	��Ǫ���� ������ �����̹Ƿ� �̷��� ǥ���� ����

	}

}