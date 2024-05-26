package task1.factories;

import task1.bigboxes.BigBox;
import task1.boxes.Box;
import task1.envelopes.Envelope;

public interface DeliveryFactory {
    Envelope createEnvelope();
    Box createBox();
    BigBox createBigBox();
}
