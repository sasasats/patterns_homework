package task1.factories;

import task1.bigboxes.BigBox;
import task1.bigboxes.SeaBigBox;
import task1.boxes.Box;
import task1.boxes.SeaBox;
import task1.envelopes.Envelope;
import task1.envelopes.SeaEnvelope;

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
