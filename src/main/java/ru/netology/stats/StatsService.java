package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSale(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int mohthBellowAverage(long[] sales) {
        long average = averageSale(sales);
        int counter = 0;

        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }

        }
        return counter;
    }

    public int mohthOverAverage(long[] sales) {
        long average = averageSale(sales);
        int counter = 0;

        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }

        }
        return counter;
    }

}