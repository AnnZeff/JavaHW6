package ru.netology.stats;

public class StatsService {
    public long calculateTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long calculateAverageSale(long[] sales) {
        long AverageSale = calculateTotalSale(sales) / sales.length;
        return AverageSale;

    }

    public int getMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMaximum] <= sales[i]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int getMonthMinimumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMaximum] >= sales[i]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int countMonthesBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int countMonthesUnderAverage(long[] sales) {
        int counter = 0;
        long averageSale = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
