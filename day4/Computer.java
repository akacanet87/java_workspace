class Computer{

	int memory = 256;			//	 Computer�� ����, main���� �о���� ����. Computer Ŭ������ ���� �� ���� ����

	public void turnOn(){

		System.out.println("��ǻ�͸� �մϴ�");

	}

	public static void main( String[] args){									//	����θ� ���� �ǵ帮�Ƿ� ���� ���� ���� ��.

		int k=5;					// main �޼��� �����̴�. ��������

		Computer c = new Computer();

		System.out.println("k�� ���� "+k);
		System.out.println("c�� ���� "+c);

		//	c�� k�� Ʋ���� �����͸� ���� ���� �ʰ�,
		//	��ü �������� �޸� ���� ��ġ�� �ּҰ�����
		//	�����ϰ� �ִٰ� �Ͽ�, ��������(reference)�� �Ѵ�.

		System.out.println(c.memory);

		c.turnOn();

	
	}

}