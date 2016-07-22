class Flower{

	String color;
	String name;
	boolean thorn;

	public void blossom( String color, String name, boolean thorn ){

		System.out.print(color+"색의 "+name+"에는 ");

		if (thorn){	

			System.out.println("가시가 있다.");

		}else{

			System.out.println("가시가 없다");

		}

	}

}