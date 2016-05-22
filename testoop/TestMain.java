package testoop;

public class TestMain{
	public static void main(String[] args) {
		A a = new A(100);
		B b = new B(100);

		System.out.println("A.value=" + a.getValue()); // prints A.value=100
		System.out.println("B.value=" + b.getValue()); // prints B.value=100

		/* Your code here */
		ListenerA aList=new ListenerA() {
			
			@Override
			public void valueChangedA(int newValue) {
				System.out.println("A value -"+b.getValue()+" "+newValue);
				if(b.getValue()!=newValue)
					b.setValue(newValue);
				//a.setValue(newValue);
			}
		};
		ListenerB bList=new ListenerB() {
			
			@Override
			public void valueChangedB(int newValue) {
				System.out.println("B value -"+a.getValue()+" "+newValue);
				if(a.getValue()!=newValue)
					a.setValue(newValue);
			}
		};
		
		a.addChangeListener(aList);
		b.addChangeListener(bList);
		
		a.setValue(101);

		System.out.println("A.value=" + a.getValue()); // prints A.value=101
		System.out.println("B.value=" + b.getValue()); // should print
														// B.value=101

		b.setValue(201);

		System.out.println("A.value=" + a.getValue()); // should print
														// A.value=201
		System.out.println("B.value=" + b.getValue()); // prints B.value=201
	}

	
}
