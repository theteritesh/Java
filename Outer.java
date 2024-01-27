public class Outer{
	static int ao;
	Outer(){
		this.ao=10;
	}	
	public void displayOuter(){
		System.out.println("ao="+ao);
	}
	static class Inner{
		static int ai;
		Inner(){
			this.ai=20;
		}
		public void displayInner(){
			System.out.println("ai="+ai);
			System.out.println("ao="+ao);
		}
	}
	
	public static void main(String arg[]){
		Outer outer = new Outer();
 		outer.displayOuter();  
		
		Outer.Inner inner = new Inner();
		inner.displayInner();

		System.out.println(Outer.Inner.ai);	
		
		//inner.displayOuter();
	}
}