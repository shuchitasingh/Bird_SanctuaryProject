package bird;

public class Main {
		
	public static void main(String[] args) {
		
System.out.println("welcome  to bird sanctuary");

   BirdSancutaryManager birdSanctuaryManager  = new BirdSancutaryManager();

    	
        Duck duck = new Duck();
        Duck duck2 =new Duck();
        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();

        
        birdSanctuaryManager.add(duck);
        birdSanctuaryManager.add(duck2);
        birdSanctuaryManager.add(parrot);
        birdSanctuaryManager.add(penguin);
        
        birdSanctuaryManager.remove(duck);
        birdSanctuaryManager.remove(duck2);
        birdSanctuaryManager.remove(parrot);
        
        birdSanctuaryManager.printEatingBirds();
        birdSanctuaryManager.printFlayableBirds();
        birdSanctuaryManager.printSwimableBirds();
        
        System.out.println("Duck Count:"+Duck.count);
        System.out.println("Parrot Count:"+Parrot.count);
        System.out.println("Penguin Count:"+Penguin.count);
	}
}



    


