package homework3.task1.factories;

import homework3.task1.bigboxes.AirBigBox;
import homework3.task1.bigboxes.BigBox;
import homework3.task1.boxes.AirBox;
import homework3.task1.boxes.Box;
import homework3.task1.envelopes.AirEnvelope;
import homework3.task1.envelopes.Envelope;

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
