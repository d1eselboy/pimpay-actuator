package ru.pimpay.platform.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.pimpay.platform.client.AcceptClientParams;
import ru.pimpay.platform.client.ClientInfo;
import ru.pimpay.platform.client.PlatformApiPortType;

/**
 * Created by ermolaev on 23/04/17.
 */
public class AcceptClientImpl {

    @Autowired
    private PlatformApiPortType platformApiPortType;

    public ClientInfo acceptClient(String token, AcceptClientParams acceptClientParams) {
        return platformApiPortType.acceptClient(token, acceptClientParams);
    }
}
