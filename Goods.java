

public class Goods {
	String name=null;
	int price=0;
	Goods(String name,int price){
		this.name=name;
		this.price=price;
	}
	void getGoods(){ 
	
		System.out.println("goods "+name);
		System.out.println("price= "+price);
		
	}
}
