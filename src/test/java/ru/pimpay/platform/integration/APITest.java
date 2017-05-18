package ru.pimpay.platform.integration;

import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.pimpay.platform.client.*;
import ru.pimpay.platform.service.APIImpl;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.soap.SOAPFaultException;

import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

/**
 * Created by ermolaev on 23/04/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/spring/cxf-client-integration.xml"})
public class APITest {

    public static final String TOKEN = "48115414881b3f9c91f2de2d296752c9d2f570d3bf703bd879c73a7343a140bf50d6e640";
    public static final String TIN = "7777777777";
    public static final String ENTITY_NAME = "OOO Test";
    public static final String SHOP_NAME = "Shop name";
    public static final String EMAIL = "asdasd@asd.ru";
    public static final String MOBILE = "89161234567";
    public static final String INCOMPLETE_ERROR = "Не указана ни одна из обазательных частей основной информации по заказу.";
    public static final String ORDER_ID = "34568942";
    public static final String SHOP_EXTERNAL_ID = "ПТ-2467";

    @Autowired
    private APIImpl service;

    @Test(expected = SOAPFaultException.class)
    //Выполнить тест для регистрации пользователя
    public void testAcceptClient() {
        AcceptClientParams client = new AcceptClientParams();
        client.setLegalEntityName(ENTITY_NAME);
        client.setTin(TIN);
        client.setShopName(SHOP_NAME);
        client.setEmail(EMAIL);
        client.setMobile(MOBILE);

        service.acceptClient(TOKEN, client);
    }

    @Test
    public void testGetClient() {
        ClientInfo clientInfo = service.getClient(TOKEN, TIN);

        assertEquals(TIN, clientInfo.getTin());
    }

    @Test
    public void testUpsertOrdersIncompleteError() {
        Orders orders = new Orders();
        Order order = new Order();
        order.setTin(TIN);
        orders.getOrder().add(order);
        UpsertResultResponse upsertResultResponse = service.upsertOrders(TOKEN, orders);

        assertEquals(upsertResultResponse.getOrders().getUpsertResultItem().get(0).getErrorMessage(), INCOMPLETE_ERROR);
    }

    @SneakyThrows
    @Test
    public void testUpsertOrders() {
        Orders orders = new Orders();
        Order order = new Order();
        order.setTin(TIN);
        order.setId(ORDER_ID);
        order.setShopExternalId(SHOP_EXTERNAL_ID);
        OrderBase orderBase = new OrderBase();
        OrderParams orderParams = new OrderParams();
        orderParams.setCurrency(CurrencyType.RUB);
        orderParams.setPaymentFromRecipient(1235.60f);
        orderParams.setDeclaredOrderCost(1235.60f);
        orderParams.setEstimatedDeliveryCost(200.35f);
        orderParams.setDeliveryService(DeliveryServiceType.B_2_CPL);
        orderParams.setDeliveryServiceExternalId("8190s7");
        orderParams.setUniformPimpayDeliveryStatus(UniformPimpayDeliveryStatusType.INTRANSIT);
        orderParams.setCustomDeliveryStatus("в_пути");
        orderParams.setDeliveryServiceDeliveryStatus("13 (В пути)");
        DeliveryStatusHistoryItems history = new DeliveryStatusHistoryItems();
        DeliveryStatusHistoryItem item = new DeliveryStatusHistoryItem();
        item.setDeliveryServiceDeliveryStatus("113 (В пути)");
        item.setTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
        item.setUniformPimpayDeliveryStatus(UniformPimpayDeliveryStatusType.INTRANSIT);
        item.setCustomDeliveryStatus("в_пути");
        history.getDeliveryStatusHistoryItem().add(item);
        orderParams.setHistory(history);
        orderBase.setParams(orderParams);
        order.setBase(orderBase);
        order.setCreatedAt(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
        orders.getOrder().add(order);
        UpsertResultResponse upsertResultResponse = service.upsertOrders(TOKEN, orders);

        assertEquals(upsertResultResponse.getOrders().getUpsertResultItem().get(0).getErrorMessage(), INCOMPLETE_ERROR);
    }
}