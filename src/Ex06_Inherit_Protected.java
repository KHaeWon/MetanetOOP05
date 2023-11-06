import kr.or.kosa.Pclass;

class Dclass{
	public int i;
	private int p;
	int s;//default
	protected int k;//default와 동일하게 굳이 쓸 필요가 없음.(protected : 상속이 아니면 사용하지 않는다.)
}

class Child2 extends Pclass{
	
	void method() {
		this.k=100;//상속관계에서 자식 함수는 부모의 protected 자원을 사용할 수 있다.(public인 Pclass라도)
	}
	
	//protected가 붙으면 재정의
	@Override
	protected void m() {
		super.m();
	}
	
}


public class Ex06_Inherit_Protected {

	public static void main(String[] args) {

		Pclass pc = new Pclass();
		
	}

}
