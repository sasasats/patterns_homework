package task1.envelopes;

public class AirEnvelope implements Envelope {
    @Override
    public void deliver() {
        System.out.println("Deliver the envelope by air...");
    }
}
