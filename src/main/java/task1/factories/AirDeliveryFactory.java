package task1.factories;

import task1.bigboxes.AirBigBox;
import task1.bigboxes.BigBox;
import task1.boxes.AirBox;
import task1.boxes.Box;
import task1.envelopes.AirEnvelope;
import task1.envelopes.Envelope;

public class AirDeliveryFactory implements DeliveryFactory {
    @Override
    public Envelope createEnvelope() {
        return new AirEnvelope();
    }

    @Override
    public Box createBox() {
        return new AirBox();
    }

    @Override
    public BigBox createBigBox() {
        return new AirBigBox();
    }
}
