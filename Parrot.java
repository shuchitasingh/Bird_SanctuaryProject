package bird;

public  class Parrot extends Bird implements Flyable {
   public static int count;
	public void eat() {
		System.out.println("parrot can eat");
	}
	
	public void fly() {
		System.out.println("parrot can fly");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
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