package javatests.payments.impl;

import javatests.payments.*;

public class PaymentProcessorImpl implements PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessorImpl(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public boolean makePayment(double amount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        if (response.getStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        } else {
            return false;
        }
    }
}
