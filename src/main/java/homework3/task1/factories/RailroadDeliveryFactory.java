package homework3.task1.factories;

import homework3.task1.bigboxes.BigBox;
import homework3.task1.bigboxes.RailroadBigBox;
import homework3.task1.boxes.Box;
import homework3.task1.boxes.RailroadBox;
import homework3.task1.envelopes.Envelope;
import homework3.task1.envelopes.RailroadEnvelope;

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
