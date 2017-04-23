package ru.pimpay.platform.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.pimpay.platform.client.AcceptClientParams;
import ru.pimpay.platform.client.ClientInfo;
import ru.pimpay.platform.client.PlatformApiPortType;

/**
 * Created by ermolaev on 23/04/17.
 */
public class AcceptClientImpl {

    private static final Logger LOGGER = LoggerFactory.getLogger(AcceptClientImpl.class);

    @Autowired
    private PlatformApiPortType platformApiPortType;

    public String acceptClient(String token, AcceptClientParams acceptClientParams) {
        ClientInfo clientInfo = platformApiPortType.acceptClient(token, acceptClientParams);

        String tin = clientInfo.getTin();
        LOGGER.info("tin={}", tin);
        return tin;
    }
}
