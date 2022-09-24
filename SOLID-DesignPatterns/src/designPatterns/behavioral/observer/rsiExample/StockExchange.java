package designPatterns.behavioral.observer.rsiExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements StockSubject {

	// S(0) = $100 - and we do a random walk
	private float price = 100;
	private Random random;
	private List<StockObserver> observerList;

	public StockExchange() {
		this.random = new Random();
		this.observerList = new ArrayList<>();
	}

	@Override
	public void addObserver(StockObserver o) {
		observerList.add(o);
	}
	
	@Override
	public void notifyAllObservers() {
		for (StockObserver o : observerList) {
			o.update(price);
		}
	}
	
	// use observer pattern
	// monitor the stock prices at time t S(t)
	// < 95 - Buy that given stock
	// > 105 - Sell that given stock

	public void start() {

		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

			// generate the next S(t+1) random stock price
			price = price + 2 * random.nextFloat();
			notifyAllObservers();
			System.out.println(price);
		}
	}

}
