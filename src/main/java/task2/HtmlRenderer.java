package task2;

/**
 * Concrete Renderer — renders messages as HTML.
 */
public class HtmlRenderer implements Renderer {
    @Override
    public String render(String title, String text) {
        return "<html><body><h1>" + title + "</h1><p>" + text + "</p></body></html>";
    }
}
