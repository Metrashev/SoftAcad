package less.lesson09.extendsDemo;

public class SubClass extends MethodContainer {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		super.m1();
	}
	
	@Override
	public void m2() { // protected, public
		// TODO Auto-generated method stub
		super.m2();
	}
	
	@Override
	public void m3() { // default, protected, public.
		// TODO Auto-generated method stub
		super.m3();
	}
	
	protected void m4() { // not an override
		//super.m4();
	}
}
