package ru.pimpay.platform.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.pimpay.platform.client.*;

/**
 * Created by ermolaev on 23/04/17.
 */
public class APIImpl {

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
}
