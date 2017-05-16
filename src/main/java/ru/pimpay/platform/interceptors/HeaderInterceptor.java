package ru.pimpay.platform.interceptors;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by aleksandr on 26.03.15.
 */
public class HeaderInterceptor extends AbstractSoapInterceptor {
    public HeaderInterceptor() {
        super(Phase.PRE_STREAM_ENDING);
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        Method method = message.getExchange().get(Method.class);

        if (null != method) {

            Map<String, List<String>> reqHeaders = CastUtils.cast((Map<?, ?>) message.get(Message.PROTOCOL_HEADERS));

            if (reqHeaders == null) {
                reqHeaders = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            }

            if (reqHeaders.size() == 0) {
                message.put(Message.PROTOCOL_HEADERS, reqHeaders);
            }

            reqHeaders.put("Test-header", Collections.singletonList((String) message.getExchange().get("SIGN")));

        }
    }
}