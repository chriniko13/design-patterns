package design.patterns.examples.creational.prototype.first.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.Set;

public class QuotesFetcher implements Cloneable {

    private Set<String> quotes;

    public QuotesFetcher() {
        quotes = new LinkedHashSet<>();
    }

    public void fetch() throws Exception {

        final Path quotesFilepath = Paths.get(this.getClass().getClassLoader().getResource("quotes.txt").toURI());

        boolean exists = Files.exists(quotesFilepath);
        if (!exists) {
            throw new IllegalStateException("quotes.txt filename does not exist.");
        }

        try (BufferedReader bufferedReader = Files.newBufferedReader(quotesFilepath)) {

            final StringBuilder sb = new StringBuilder();

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                if (line.isEmpty()) {

                    quotes.add(sb.toString());
                    sb.delete(0, sb.length());

                } else {

                    sb.append(line).append(" ");

                }
            }

        } catch (IOException e) {
            e.printStackTrace(System.err);
        }

    }

    public Set<String> getQuotes() {
        return quotes;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        QuotesFetcher quotesFetcher = new QuotesFetcher();
        quotesFetcher.quotes = this.quotes;

        return quotesFetcher;
    }
}
