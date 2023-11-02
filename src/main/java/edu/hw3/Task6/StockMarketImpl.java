package edu.hw3.Task6;

import java.util.PriorityQueue;

class StockMarketImpl implements StockMarket {
    private PriorityQueue<Stock> stockQueue;

    StockMarketImpl() {
        stockQueue = new PriorityQueue<>(new PriceComparator());
    }

    @Override
    public void add(Stock stock) {
        stockQueue.add(stock);
    }

    @Override
    public void remove(Stock stock) {
        stockQueue.remove(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return stockQueue.peek();
    }
}
