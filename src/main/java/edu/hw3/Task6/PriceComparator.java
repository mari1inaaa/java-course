package edu.hw3.Task6;

import java.util.Comparator;

class PriceComparator implements Comparator<Stock> {
    @Override
    public int compare(Stock stock1, Stock stock2) {
        return Double.compare(stock2.getPrice(), stock1.getPrice());
    }
}
