package designPatterns.behavioral.observer.rsiExample;

public interface StockSubject {

	public void addObserver(StockObserver o);

	public void notifyAllObservers();
}
