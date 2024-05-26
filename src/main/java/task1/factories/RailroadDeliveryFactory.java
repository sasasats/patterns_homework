package task1.factories;

import task1.bigboxes.BigBox;
import task1.bigboxes.RailroadBigBox;
import task1.boxes.Box;
import task1.boxes.RailroadBox;
import task1.envelopes.Envelope;
import task1.envelopes.RailroadEnvelope;

public class RailroadDeliveryFactory implements DeliveryFactory {
    @Override
    public Envelope createEnvelope() {
        return new RailroadEnvelope();
    }

    @Override
    public Box createBox() {
        return new RailroadBox();
    }

    @Override
    public BigBox createBigBox() {
        return new RailroadBigBox();
    }
}
