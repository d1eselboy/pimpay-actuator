package ru.pimpay.platform.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.pimpay.platform.client.*;

import javax.jws.WebParam;

/**
 * Created by ermolaev on 23/04/17.
 */
public class ClientImpl {

    @Autowired
    private PlatformApiPortType platformApiPortType;

    public ClientInfo acceptClient(String token, AcceptClientParams acceptClientParams) {
        return platformApiPortType.acceptClient(token, acceptClientParams);
    }

    public ClientInfo getClient(String token, String tin) {
        return platformApiPortType.getClient(token, tin);
    }

    public UpsertResultResponse upsertOrders(String token, Orders orders) {
        return platformApiPortType.upsertOrders(token, orders);
    }

    public UpsertResultResponse upsertHistoricalOrders(String token, Orders orders) {
        return platformApiPortType.upsertHistoricalOrders(token, orders);
    }

    public UpdateStateResultResponse updateStateForOrders(String token, OrdersStates ordersStates) {
        return platformApiPortType.updateStateForOrders(token, ordersStates);
    }

    public boolean sendVerification(String token, String tin, String id, PaymentOrder paymentOrder, VerificationRows rows) {
        return platformApiPortType.sendVerification(token, tin, id, paymentOrder, rows);
    }
}
