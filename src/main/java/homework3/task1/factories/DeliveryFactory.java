package homework3.task1.factories;

import homework3.task1.bigboxes.BigBox;
import homework3.task1.boxes.Box;
import homework3.task1.envelopes.Envelope;

public interface DeliveryFactory {
    Envelope createEnvelope();
    Box createBox();
    BigBox createBigBox();
}
