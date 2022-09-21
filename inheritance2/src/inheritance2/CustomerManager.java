package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//
		//
		System.out.println("müşteri eklendi");
		logger.log();
	}

}


/*
public void add() {
	//
	//
	System.out.println("müşteri eklendi");
	DatabaseLogger logger = new DatabaseLogger();
    logger.log();
}

bunu yapmadık çünkü somut sınıf newlenmez
*/

