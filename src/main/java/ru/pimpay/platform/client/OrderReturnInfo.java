
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReturnInfo", propOrder = {

})
public class OrderReturnInfo {

    protected Boolean isReturn;
    protected List<String> originOrderId;

    public Boolean getReturn() {
        return isReturn;
    }

    public void setReturn(Boolean aReturn) {
        isReturn = aReturn;
    }

    public List<String> getOriginOrderId() {
        if (originOrderId == null) {
            originOrderId = new ArrayList<String>();
        }
        return this.originOrderId;
    }
}
