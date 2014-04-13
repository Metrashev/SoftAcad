package less.lesson10.abstractDemo;

public class Demo {
	public static void main(String[] args) {
		SubClass2 sc2 = new SubClass2();
		sc2.method0();
		sc2.method1();
		sc2.method2();
		sc2.method3();
		sc2.method4();
		sc2.method5();
		sc2.method6();
		sc2.method7();
		
		SuperAbstractClass sac = new SubClass2();
		sac.method0();
		sac.method1();
		sac.method2();
		sac.method3();
		sac.method4();
		sac.method5();
		sac.method6();
		sac.method7();
		
		SubClass4 sc4 = new SubClass4();
		sc4.superMethodHere();
		sc4.method0();
	}
}
