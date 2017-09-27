
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReturnInfo", propOrder = {

})
public class OrderReturnInfo {

    protected Boolean isReturn;
    protected OrderIds originOrderIds;

    public Boolean getReturn() {
        return isReturn;
    }

    public void setReturn(Boolean aReturn) {
        isReturn = aReturn;
    }

    public OrderIds getOriginOrderIds() {
        return originOrderIds;
    }

    public void setOriginOrderIds(OrderIds originOrderIds) {
        this.originOrderIds = originOrderIds;
    }
}
