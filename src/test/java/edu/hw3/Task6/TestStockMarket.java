package edu.hw3.Task6;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class TestStockMarket {
    @Test
    void mostValuablePrice() {
        StockMarket stockMarket = new StockMarketImpl();
        Stock stock1 = new Stock("stock1", 100.0);
        Stock stock2 = new Stock("stock2", 120.0);
        Stock stock3 = new Stock("stock3", 90.0);
        stockMarket.add(stock1);
        stockMarket.add(stock2);
        stockMarket.add(stock3);
        Stock mostValuableStock = stockMarket.mostValuableStock();
        assertThat(mostValuableStock.getPrice()).isEqualTo(120.0);
    }

    @Test
    void mostValuableName() {
        StockMarket stockMarket = new StockMarketImpl();
        Stock stock1 = new Stock("stock1", 100.0);
        Stock stock2 = new Stock("stock2", 120.0);
        Stock stock3 = new Stock("stock3", 90.0);
        stockMarket.add(stock1);
        stockMarket.add(stock2);
        stockMarket.add(stock3);
        Stock mostValuableStock = stockMarket.mostValuableStock();
        assertThat(mostValuableStock.getName()).isEqualTo("stock2");
    }
}
