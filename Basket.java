

public class Basket {
	String name;
	Goods[] goods=new Goods[10];
	Basket(String name,Goods[] goods){
		
		this.name=name;
		this.goods=goods;
	}
	void getGoods(){
		for(Goods a:goods){
			a.getGoods();
		}
	}
	
	Goods[] getGoogsArr(){return goods;}
}
