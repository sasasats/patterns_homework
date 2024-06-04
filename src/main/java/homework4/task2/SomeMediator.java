package homework4.task2;

public class SomeMediator implements Mediator {
    private SomeComponent someComponent;
    private AnotherComponent anotherComponent;

    public void setSomeComponent(SomeComponent someComponent) {
        this.someComponent = someComponent;
    }

    public void setAnotherComponent(AnotherComponent anotherComponent) {
        this.anotherComponent = anotherComponent;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof SomeComponent) {
            // do something
        } else if (sender instanceof AnotherComponent) {
            // and again
        } else {
            System.out.println("Wrong");
        }
    }
}
