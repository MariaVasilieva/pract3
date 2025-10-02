package task1;

/**
 * Abstract Decorator — stores a reference to another Message object
 * and delegates method calls to it.
 */
abstract class MessageDecorator implements Message {
    protected Message message;

    /**
     * Creates a decorator that wraps another Message object.
     * @param message the message to be decorated
     */
    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent();
    }
}

