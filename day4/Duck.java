class Duck{

	String name="Donald";
	int dage=3;

	static int age=3;					//	클래스 변수( 인스턴스에 소속되지 않고
											//	클래스 원본에 소속되기 때문 )

	public void test(){

		System.out.println("오리의 나이는 "+age);			//	자기한테 없어도 거푸집에 static으로 있다면 불러올 수 있다.

	}

	public static void test2(){

		System.out.println("오리의 이름은 "+name);

	}

	public static void main( String[] args){

		Duck d = new Duck();

		d.test();

		d.test2();						//	d는 생략 가능. test2가 static으로 선언 되었기 때문

		//Duck.age=5;					//	거푸집이 보유한 변수이므로 이러한 표현이 가능

	}

}