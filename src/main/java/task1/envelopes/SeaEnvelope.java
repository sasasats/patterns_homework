package task1.envelopes;

public class SeaEnvelope implements Envelope {
    @Override
    public void deliver() {
        System.out.println("Deliver the envelope by sea...");
    }
}
