

public class Buyer {
	String name;
	Basket basket;
	
	Buyer(String name,Basket basket){
		
		this.name=name;
		this.basket=basket;
		
		
	}
	
	String getBuyer(){
		return name;
		
	}
	Basket getBasket(){
		return basket;
		
	}
}
