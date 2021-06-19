package javatests.payments;

import javatests.payments.impl.PaymentProcessorImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PaymentProcessorImplTest {
    @Test
    public void payment_is_correct() {
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcessor paymentProcessor = new PaymentProcessorImpl(paymentGateway);
        assertTrue(paymentProcessor.makePayment(10000));
    }

    @Test
    public void payment_is_wrong() {
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor paymentProcessor = new PaymentProcessorImpl(paymentGateway);
        assertFalse(paymentProcessor.makePayment(10000));
    }
}
