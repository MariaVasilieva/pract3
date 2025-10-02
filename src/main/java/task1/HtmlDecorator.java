package task1;

/**
 * Concrete Decorator — adds HTML formatting to a message.
 */
public class HtmlDecorator extends MessageDecorator {
    /**
     * Constructor for the HTML decorator.
     * @param message the message to be decorated with HTML tags
     */
    public HtmlDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return "<html><body>" + super.getContent() + "</body></html>";
    }
}
