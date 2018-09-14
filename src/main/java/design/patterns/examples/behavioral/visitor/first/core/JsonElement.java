package design.patterns.examples.behavioral.visitor.first.core;

public class JsonElement implements Element {

    private final String json;

    public JsonElement() {
        json = "{'name':'john doe'}";
    }

    String getJson() {
        return json;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Note: double dispatch.
    }
}
