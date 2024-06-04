package homework4.task2;

public abstract class Component {
    private final Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String event) {
        mediator.notify(this, event);
    }
}
