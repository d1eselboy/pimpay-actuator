package ru.pimpay.platform.integration;

import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.pimpay.platform.client.*;
import ru.pimpay.platform.service.ClientImpl;

import javax.xml.ws.soap.SOAPFaultException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by ermolaev on 23/04/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/spring/cxf-client-integration.xml"})
public class ClientTest extends BaseTest {

    @Autowired
    private ClientImpl service;

    @Test(expected = SOAPFaultException.class)
    //Выполнить тест после регистрации пользователя
    public void testAcceptClient() {
        service.acceptClient(TOKEN, client);
    }

    @Test
    public void testGetClient() {
        ClientInfo clientInfo = service.getClient(TOKEN, TIN);
        assertEquals(TIN, clientInfo.getTin());
    }

    @Test
    public void testUpsertOrdersIncompleteError() {
        UpsertResultResponse upsertResultResponse = service.upsertOrders(TOKEN, simpleOrders);
        assertEquals(upsertResultResponse.getOrders().getUpsertResultItem().get(0).getErrorMessage(), INCOMPLETE_ERROR);
    }

    @Test
    public void testUpsertOrders() {
        UpsertResultResponse upsertResultResponse = service.upsertOrders(TOKEN, upsertOrders);
        assertEquals(upsertResultResponse.getOrders().getUpsertResultItem().get(0).getStatus(), UpsertResultStatus.OK);
    }

    @Test
    public void testUpsertHistoricalOrders() {
        UpsertResultResponse upsertResultResponse = service.upsertHistoricalOrders(TOKEN, upsertOrders);
        assertEquals(upsertResultResponse.getOrders().getUpsertResultItem().get(0).getStatus(), UpsertResultStatus.OK);
    }

    @Test
    public void testUpdateStateForOrders() {
        UpdateStateResultResponse upsertResultResponse = service.updateStateForOrders(TOKEN, ordersStates);
        assertEquals(upsertResultResponse.getOrders().getUpdateStateResultItem().get(0).getStatus(), UpdateStateResultStatus.OK);
    }

    @Test
    public void testSendVerification() {
        assertTrue(service.sendVerification(TOKEN, TIN, ORDER_ID, paymentOrder, verificationRows));
    }
}