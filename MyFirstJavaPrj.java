public class MyFirstJavaPrj {
	public static void main(String args[]){
		System.out.println("Wowwww........... This is my MyFirstJavaProject");
		tempMethod();

		MyFirstJavaPrj obj1 = new MyFirstJavaPrj();
		obj1.singSong();
	}
	public static void tempMethod(){
		System.out.println(" Hip Hip Hurray! I am being invoked by mainMethod() ");
	}

	public static void singSong(){
		System.out.println(" \n\n Sing a Song! Polling is Expensive Method!! ");
	}	
} 
