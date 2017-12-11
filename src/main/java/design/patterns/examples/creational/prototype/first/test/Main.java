package design.patterns.examples.creational.prototype.first.test;

import design.patterns.examples.creational.prototype.first.core.QuotesFetcher;

public class Main {

    public static void main(String[] args) {

        //creation...
        QuotesFetcher quotesFetcher = new QuotesFetcher();
        quotesFetcher.fetch(); // Important: we call this only one time.

        //display...
        quotesFetcher.getQuotes().stream().limit(4).forEach(quote -> System.out.println(quote + "\n"));

        System.out.println("\n-------------------");

        //cloning...
        try {

            QuotesFetcher quotesFetcherClone1 = (QuotesFetcher) quotesFetcher.clone();
            quotesFetcherClone1.getQuotes().stream().limit(4).forEach(quote -> System.out.println(quote + "\n"));

            System.out.println("\n-------------------");

            QuotesFetcher quotesFetcherClone2 = (QuotesFetcher) quotesFetcher.clone();
            quotesFetcherClone2.getQuotes().stream().limit(4).forEach(quote -> System.out.println(quote + "\n"));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
