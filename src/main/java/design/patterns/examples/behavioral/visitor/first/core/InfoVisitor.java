package design.patterns.examples.behavioral.visitor.first.core;

public class InfoVisitor implements Visitor {

    @Override
    public void visit(TextElement textElement) {

        String text = textElement.getText();
        if (text.contains("some")) {
            System.out.println("processing for text ---> OK");
        } else {
            System.out.println("processing for text ---> oops!");
        }
    }

    @Override
    public void visit(JsonElement jsonElement) {
        String json = jsonElement.getJson();
        if (json.contains("john")) {
            System.out.println("processing for json ---> OK");
        } else {
            System.out.println("processing for json ---> oops!");
        }
    }
}
