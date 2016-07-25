class Computer{

	int memory = 256;			//	 Computer의 소유, main에서 읽어오지 못함. Computer 클래스가 죽을 때 같이 죽음

	public void turnOn(){

		System.out.println("컴퓨터를 켭니다");

	}

	public static void main( String[] args){									//	실행부를 먼저 건드리므로 가장 먼저 실행 됨.

		int k=5;					// main 메서드 소유이다. 지역변수

		Computer c = new Computer();

		System.out.println("k의 값은 "+k);
		System.out.println("c의 값은 "+c);

		//	c는 k와 틀리게 데이터를 직접 담지 않고,
		//	객체 데이터의 메모리 상의 위치인 주소값만을
		//	보유하고 있다고 하여, 참조변수(reference)라 한다.

		System.out.println(c.memory);

		c.turnOn();

	
	}

}