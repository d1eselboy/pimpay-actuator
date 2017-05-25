package ru.pimpay.platform.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
@ContextConfiguration(locations = {"classpath:/META-INF/spring/cxf-client.xml"})
public class ClientTest extends BaseTest {

    @Value("${pimpay.token}")
    public String token;

    @Autowired
    private ClientImpl service;

    @Test
    public void testHeaderSignature() {
        assertTrue(service.testHeaderSignature(token, ORDER_ID));
    }

    @Test(expected = SOAPFaultException.class)
    //Выполнить тест после регистрации пользователя
    public void testAcceptClient() {
        service.acceptClient(token, client);
    }

    @Test
    public void testGetClient() {
        assertEquals(TIN, service.getClient(token, TIN).getTin());
    }

    @Test
    public void testUpsertOrdersIncompleteError() {
        UpsertResultResponse upsertResultResponse = service.upsertOrders(token, simpleOrders);
        assertEquals(INCOMPLETE_ERROR, upsertResultResponse.getOrders().getUpsertResultItem().get(0).getErrorMessage());
    }

    @Test
    public void testUpsertOrders() {
        UpsertResultResponse upsertResultResponse = service.upsertOrders(token, upsertOrders);
        assertEquals(UpsertResultStatus.OK, upsertResultResponse.getOrders().getUpsertResultItem().get(0).getStatus());
    }

    @Test
    public void testUpsertHistoricalOrders() {
        UpsertResultResponse upsertResultResponse = service.upsertHistoricalOrders(token, upsertOrders);
        assertEquals(UpsertResultStatus.OK, upsertResultResponse.getOrders().getUpsertResultItem().get(0).getStatus());
    }

    @Test
    public void testUpdateStateForOrders() {
        UpdateStateResultResponse upsertResultResponse = service.updateStateForOrders(token, ordersStates);
        assertEquals(UpdateStateResultStatus.OK, upsertResultResponse.getOrders().getUpdateStateResultItem().get(0).getStatus());
    }

    @Test
    public void testSendVerification() {
        assertTrue(service.sendVerification(token, TIN, ORDER_ID, paymentOrder, verificationRows));
    }

    @Test
    public void testGetVerificationStatus() {
        assertEquals(VerificationStatusType.PENDING, service.getVerificationStatus(token, ORDER_ID).getStatus());
    }

    @Test
    public void testGetRussianPostPayments() {
        assertEquals(TIN, service.getRussianPostPayments(token, TIN, postIds).getTin());
    }

    @Test
    public void testGetRussianPostClaimAnswers() {
        assertEquals(TIN, service.getRussianPostClaimAnswers(token, TIN, postIds).getTin());
    }
}