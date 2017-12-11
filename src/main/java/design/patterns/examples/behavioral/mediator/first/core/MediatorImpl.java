package design.patterns.examples.behavioral.mediator.first.core;

import design.patterns.examples.behavioral.mediator.first.domain.Info;

import java.util.LinkedList;
import java.util.List;

public class MediatorImpl implements Mediator<String> {

    private final List<Info> infos;

    public MediatorImpl() {
        this.infos = new LinkedList<>();
    }

    @Override
    public void send(String data) {
        infos.forEach(info -> info.display(data));
    }

    public void register(Info info) {
        infos.add(info);
    }
}
