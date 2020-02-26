package tp1.bean;

class Main {
	public static void main(String[] args) 
		{ 
		Test obj1 = new Test(); 
		System.out.println(obj1.x + " " + obj1.y); 
		Test obj2 = obj1;
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.x+" "+obj1.y); 
		System.out.println(obj2.x+" "+obj2.y); 
		}
}
