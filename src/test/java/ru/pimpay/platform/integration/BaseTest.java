package ru.pimpay.platform.integration;

import lombok.extern.slf4j.Slf4j;
import ru.pimpay.platform.client.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.GregorianCalendar;

/**
 * Created by ermolaev on 23/04/17.
 */
@Slf4j
public class BaseTest {

    public static XMLGregorianCalendar date = null;

    static {
        try {
            date = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        } catch (DatatypeConfigurationException e) {
            log.error("Static test objects initialization failed. Problem with date " + e.getMessage());
        }
    }

    public static final String TOKEN = "48115414881b3f9c91f2de2d296752c9d2f570d3bf703bd879c73a7343a140bf50d6e640";
    public static final String TIN = "7777777777";
    public static final String ENTITY_NAME = "OOO Test";
    public static final String SHOP_NAME = "Shop name";
    public static final String EMAIL = "asdasd@asd.ru";
    public static final String MOBILE = "89161234567";
    public static final String INCOMPLETE_ERROR = "Не указана ни одна из обазательных частей основной информации по заказу.";
    public static final String ORDER_ID = "34568942";
    public static final String SHOP_EXTERNAL_ID = "ПТ-2467";
    public static final float COST = 1235.60f;
    public static final String IN_TRANSIT_113 = "113 (В пути)";
    public static final String IN_TRANSIT = "в_пути";

    public static AcceptClientParams client;
    public static Orders simpleOrders;
    public static Orders upsertOrders;
    public static OrdersStates ordersStates;
    public static PaymentOrder paymentOrder;
    public static VerificationRows verificationRows;
    public static PostIds postIds;

    static {
        client = new AcceptClientParams();
        client.setLegalEntityName(ENTITY_NAME);
        client.setTin(TIN);
        client.setShopName(SHOP_NAME);
        client.setEmail(EMAIL);
        client.setMobile(MOBILE);
    }

    static {
        simpleOrders = new Orders();
        Order simpleOrder = new Order();
        simpleOrder.setTin(TIN);
        simpleOrders.getOrder().add(simpleOrder);
    }

    static {
        upsertOrders = new Orders();

        Order order = new Order();
        order.setTin(TIN);
        order.setId(ORDER_ID);
        order.setShopExternalId(SHOP_EXTERNAL_ID);

        OrderBase orderBase = new OrderBase();
        OrderParams orderParams = new OrderParams();
        orderParams.setCurrency(CurrencyType.RUB);
        orderParams.setPaymentFromRecipient(COST);
        orderParams.setDeclaredOrderCost(COST);
        orderParams.setEstimatedDeliveryCost(200.35f);
        orderParams.setDeliveryService(DeliveryServiceType.B_2_CPL);
        orderParams.setDeliveryServiceExternalId("8190s7");
        orderParams.setUniformPimpayDeliveryStatus(UniformPimpayDeliveryStatusType.INTRANSIT);
        orderParams.setCustomDeliveryStatus(IN_TRANSIT);
        orderParams.setDeliveryServiceDeliveryStatus(IN_TRANSIT_113);

        DeliveryStatusHistoryItems history = new DeliveryStatusHistoryItems();
        DeliveryStatusHistoryItem item = new DeliveryStatusHistoryItem();
        item.setDeliveryServiceDeliveryStatus(IN_TRANSIT_113);
        item.setTime(date);
        item.setUniformPimpayDeliveryStatus(UniformPimpayDeliveryStatusType.INTRANSIT);
        item.setCustomDeliveryStatus(IN_TRANSIT);
        history.getDeliveryStatusHistoryItem().add(item);

        orderParams.setHistory(history);
        orderBase.setParams(orderParams);
        order.setBase(orderBase);

        Address address = new Address();
        address.setCity("Владимир");
        address.setFull("600035, Россия, Владимирская область, г. Владимир, ул. Мира, д. 7, кв. 77");
        address.setZipcode("600035");
        order.setDestinationAddress(address);

        order.setCreatedAt(date);

        Recipient recipient = new Recipient();
        recipient.setFio("Иванов Иван Иванович");
        recipient.setPhone(MOBILE);
        recipient.setEmail(EMAIL);
        order.setRecipient(recipient);

        F103 f103 = new F103();
        f103.setDate(date);
        f103.setNumber(new BigInteger("158"));
        order.setF103(f103);

        order.setMoneyRecipient(MoneyRecipientType.DELIVERY_SERVICE);

        Claim claim = new Claim();
        claim.setTin(TIN);
        claim.setPaymentDate(date);
        claim.setPaymentSum(3250.20f);
        claim.setTermType(ClaimTermType.FED);
        order.setClaim(claim);

        OrderItems orderItems = new OrderItems();
        OrderItem orderItem = new OrderItem();
        orderItem.setName("Подушка надувная");
        orderItem.setValue(1200.50f);
        orderItem.setCount(new BigInteger("2"));
        orderItem.setWeight(0.1f);
        orderItem.setCategory("дорожные аксессуары");
        orderItems.getOrderItem().add(orderItem);
        order.setItems(orderItems);

        upsertOrders.getOrder().add(order);

    }

    static {
        ordersStates = new OrdersStates();
        OrderState orderState = new OrderState();
        orderState.setCost(COST);
        orderState.setId(ORDER_ID);
        orderState.setUniformPimpayDeliveryStatus(UniformPimpayDeliveryStatusType.INTRANSIT);
        orderState.setCustomDeliveryStatus(IN_TRANSIT);
        orderState.setDeliveryServiceDeliveryStatus(IN_TRANSIT_113);
        orderState.setTime(date);
        ordersStates.getOrderState().add(orderState);

    }

    static {
        paymentOrder = new PaymentOrder();
        paymentOrder.setDate(date);
        paymentOrder.setNum(new BigInteger("703"));
        paymentOrder.setSum(COST);
    }

    static {
        verificationRows = new VerificationRows();
        VerificationRow verificationRow = new VerificationRow();
        verificationRow.setOid("ORD-12356");
        verificationRow.setPtp(1500.25f);
        verificationRow.setPfr(1705.25f);
        verificationRow.setDc(200f);
        verificationRow.setCs(5.00f);
        verificationRow.setIns(1.00f);
        CustomTransactions сustomTransactions = new CustomTransactions();
        CustomTransaction customTransaction = new CustomTransaction();
        customTransaction.setVal(15.50f);
        customTransaction.setCmt("СМС оповещение");
        сustomTransactions.getCustomTransaction().add(customTransaction);
        verificationRow.setTxs(сustomTransactions);
        verificationRows.getVerificationRow().add(verificationRow);
    }

    static {
        postIds = new PostIds();
        String postId = "10100081809664";
        postIds.getRussianPostIdType().add(postId);
    }
}