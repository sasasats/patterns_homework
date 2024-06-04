package homework4.task2;

public class SomeComponent extends Component {
    public SomeComponent(Mediator mediator) {
        super(mediator);
    }

    public void doSomeAction() {
        System.out.println("Halal");
        send("Halal");
    }
}
