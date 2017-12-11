package design.patterns.examples.behavioral.iterator.first.core;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class SubjectListImpl implements Subject<String> {

    private final static int MAX_ELEMS = 10;
    private final List<String> data;

    public SubjectListImpl() {

        data = new LinkedList<>();

        IntStream.rangeClosed(0, MAX_ELEMS - 1).forEach(idx -> {
            data.add(Integer.toString(idx + 1));
        });
    }

    @Override
    public Iterator<String> getIterator() {
        return new SubjectIterator(data);
    }

    class SubjectIterator implements Iterator<String> {

        private final List<String> dataToIterate;
        private int position;

        SubjectIterator(List<String> dataToIterate) {
            this.dataToIterate = dataToIterate;
            position = 0;
        }

        @Override
        public String first() {
            return dataToIterate.get(0);
        }

        @Override
        public String last() {
            return dataToIterate.get(dataToIterate.size() - 1);
        }

        @Override
        public String next() {
            return dataToIterate.get(position++);
        }

        @Override
        public String current() {
            return dataToIterate.get(position);
        }

        @Override
        public boolean isDone() {
            return position >= dataToIterate.size();
        }

        @Override
        public void reset() {
            position = 0;
        }
    }
}
