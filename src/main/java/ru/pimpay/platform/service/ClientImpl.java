package ru.pimpay.platform.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.pimpay.platform.client.*;

/**
 * Created by ermolaev on 23/04/17.
 */
public class ClientImpl {

    @Autowired
    private PlatformApiPortType platformApiPortType;

    /**
     * Отправить информацию о клиенте в PimPay
     *
     * @param token
     * @param acceptClientParams
     * @return
     */
    public ClientInfo acceptClient(String token, AcceptClientParams acceptClientParams) {
        return platformApiPortType.acceptClient(token, acceptClientParams);
    }

    /**
     * Получить статус клиента
     *
     * @param token
     * @param tin
     * @return
     */
    public ClientInfo getClient(String token, String tin) {
        return platformApiPortType.getClient(token, tin);
    }

    /**
     * Добавить/обновить информацию по заказам
     *
     * @param token
     * @param orders
     * @return
     */
    public UpsertResultResponse upsertOrders(String token, Orders orders) {
        return platformApiPortType.upsertOrders(token, orders);
    }

    /**
     * Добавить/обновить информацию по историческим заказам
     *
     * @param token
     * @param orders
     * @return
     */
    public UpsertResultResponse upsertHistoricalOrders(String token, Orders orders) {
        return platformApiPortType.upsertHistoricalOrders(token, orders);
    }

    /**
     * Обновить часто меняющуюся информацию по заказам (статус/стоимость)
     *
     * @param token
     * @param ordersStates
     * @return
     */
    public UpdateStateResultResponse updateStateForOrders(String token, OrdersStates ordersStates) {
        return platformApiPortType.updateStateForOrders(token, ordersStates);
    }

    /**
     * Отправить сверку
     *
     * @param token
     * @param tin
     * @param id
     * @param paymentOrder
     * @param rows
     * @return
     */
    public boolean sendVerification(String token, String tin, String id, PaymentOrder paymentOrder, VerificationRows rows) {
        return platformApiPortType.sendVerification(token, tin, id, paymentOrder, rows);
    }

    /**
     * Получить статус переданной сверки
     *
     * @param token
     * @param id
     * @return
     */
    public VerificationStatusResponse getVerificationStatus(String token, String id) {
        return platformApiPortType.getVerificationStatus(token, id);
    }

    /**
     * Метод для проверки подписи, посылаемое в SOAP-заголовке
     *
     * @param token
     * @param id
     * @return
     */
    public boolean testHeaderSignature(String token, String id) {
        return platformApiPortType.testHeaderSignature(token);
    }

    /**
     * Получить информацию о платежах от Почты России по клиенту
     *
     * @param token
     * @param tin
     * @param postIds
     * @return
     */
    public RussianPostPaymentsResponse getRussianPostPayments(String token, String tin, PostIds postIds) {
        return platformApiPortType.getRussianPostPayments(token, tin, postIds);
    }

    /**
     * Получить информацию об ответах по претензиям от Почты России по номерам ШПИ
     *
     * @param token
     * @param tin
     * @param postIds
     * @return
     */
    public RussianPostClaimAnswersResponse getRussianPostClaimAnswers(String token, String tin, PostIds postIds) {
        return platformApiPortType.getRussianPostClaimAnswers(token, tin, postIds);
    }
}
