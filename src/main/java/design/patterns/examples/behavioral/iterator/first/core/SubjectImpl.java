package design.patterns.examples.behavioral.iterator.first.core;

import java.util.stream.IntStream;

public class SubjectImpl implements Subject<String> {


    private final static int MAX_ELEMS = 10;
    private final String data[] = new String[MAX_ELEMS];

    public SubjectImpl() {
        IntStream.rangeClosed(0, MAX_ELEMS - 1).forEach(idx -> {
            data[idx] = Integer.toString(idx + 1);
        });
    }


    @Override
    public Iterator<String> getIterator() {
        return new SubjectIterator(data);
    }

    class SubjectIterator implements Iterator<String> {

        private final String[] dataToIterate;
        private int position;

        SubjectIterator(String[] dataToIterate) {
            this.dataToIterate = dataToIterate;
            position = 0;
        }

        @Override
        public String first() {
            return dataToIterate[0];
        }

        @Override
        public String last() {
            return dataToIterate[dataToIterate.length - 1];
        }

        @Override
        public String next() {
            return dataToIterate[position++];
        }

        @Override
        public String current() {
            return dataToIterate[position];
        }

        @Override
        public boolean isDone() {
            return position >= dataToIterate.length;
        }

        @Override
        public void reset() {
            position = 0;
        }
    }
}
