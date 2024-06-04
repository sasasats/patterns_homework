package homework3.task1.factories;

import homework3.task1.bigboxes.BigBox;
import homework3.task1.bigboxes.SeaBigBox;
import homework3.task1.boxes.Box;
import homework3.task1.boxes.SeaBox;
import homework3.task1.envelopes.Envelope;
import homework3.task1.envelopes.SeaEnvelope;

public class SeaDeliveryFactory implements DeliveryFactory {
    @Override
    public Envelope createEnvelope() {
        return new SeaEnvelope();
    }

    @Override
    public Box createBox() {
        return new SeaBox();
    }

    @Override
    public BigBox createBigBox() {
        return new SeaBigBox();
    }
}
