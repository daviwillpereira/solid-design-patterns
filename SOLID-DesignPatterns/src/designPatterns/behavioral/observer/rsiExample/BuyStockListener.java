package designPatterns.behavioral.observer.rsiExample;

public class BuyStockListener implements StockObserver {

	@Override
	public void update(float price) {
		if (price < 95) {
			System.out.println("Buying stock beacause the S(t) price is low... ");
		}
	}

}
