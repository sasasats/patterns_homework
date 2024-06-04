package homework4.task2;

public class AnotherComponent extends Component {
    public AnotherComponent(Mediator mediator) {
        super(mediator);
    }

    public void doAnotherAction() {
        System.out.println("Haram");
        send("Haram");
    }
}
