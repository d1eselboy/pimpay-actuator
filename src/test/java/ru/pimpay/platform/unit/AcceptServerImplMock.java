package ru.pimpay.platform.unit;

import ru.pimpay.platform.client.*;

/**
 * Created by ermolaev on 23/04/17.
 */
public class AcceptServerImplMock implements PlatformApiPortType {

    @Override
    public ClientInfo acceptClient(String token, AcceptClientParams client) {
        ObjectFactory factory = new ObjectFactory();
        ClientInfo clientInfo = factory.createClientInfo();
        clientInfo.setTin(client.getTin());

        return clientInfo;
    }

    @Override
    public RussianPostPaymentsResponse getRussianPostPayments(String token, String tin, PostIds postIds) {
        return null;
    }

    @Override
    public UpdateStateResultResponse updateStateForOrders(String token, OrdersStates ordersStates) {
        return null;
    }

    @Override
    public boolean testHeaderSignature(String token) {
        return false;
    }

    @Override
    public String invokeUsingContainer(String token, String requestContainer, String requestSignature) {
        return null;
    }

    @Override
    public UpsertResultResponse upsertHistoricalOrders(String token, Orders orders) {
        return null;
    }

    @Override
    public ClientInfo getClient(String token, String tin) {
        return null;
    }

    @Override
    public boolean testContainerSignature(String token, String container, String signature) {
        return false;
    }

    @Override
    public UpsertResultResponse upsertOrders(String token, Orders orders) {
        return null;
    }

    @Override
    public boolean sendVerification(String token, String tin, String id, PaymentOrder paymentOrder, VerificationRows rows) {
        return false;
    }

    @Override
    public RussianPostClaimAnswersResponse getRussianPostClaimAnswers(String token, String tin, PostIds postIds) {
        return null;
    }

    @Override
    public VerificationStatusResponse getVerificationStatus(String token, String id) {
        return null;
    }
}
