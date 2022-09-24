package designPatterns.behavioral.observer.rsiExample;

public class SellStockListener implements StockObserver {

	@Override
	public void update(float price) {
		if (price > 105) {
			System.out.println("Selling the stock because the S(t) price is too high... ");
		}
	}

}
