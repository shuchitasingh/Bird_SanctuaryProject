package bird;

public  class Penguin extends Bird implements Swimable {
	public static int count;
	public void swim() {
		System.out.println("penguin can  swim");
		}
	public void eat() {
		System.out.println("penguin can eat");
	}
	
	public int getCount() {
		return count;
	}
	
	public int incrementCount() {
		 return count+=1;
	}
	public int decrementCount() {
		 return count-=1;
   }
}
