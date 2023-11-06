import kr.or.kosa.Bird;

class Bi extends Bird{

	
	//moveFast()를 쓰기 위해서는 반드시 재정의를 해야 한다.
	//protected이기 때문이다.
	@Override
	protected void moveFast() {
		super.moveFast();//상속 관계에선는 public
	}
	
	
}

class Ostrich extends Bird{
	//날지 못하는 새가 있을 수 있음. 그런 걸 위해서 protected로 메소드 해놓은 거임 다르게 쓰라고
	//특수화, 구체화
	void run() {
		System.out.println("run...");
	}

	//즉 protected -> 상속관계에서 함수를 재정의함으로써 다르게 표현할 수 있게 하는 것
	@Override
	protected void moveFast() {
		run();
	}
	
	
}

public class Ex07_Inherit_Protected {

	public static void main(String[] args) {

		Bi bi = new Bi();
		bi.fly();
		//bi.moveFast();재정의 전에는 사용 불가
		bi.moveFast();
		
		Ostrich o = new Ostrich();
		o.fly();
		o.moveFast();
	}

}
