
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
    protected List<String> originOrderIds;

    public Boolean getReturn() {
        return isReturn;
    }

    public void setReturn(Boolean aReturn) {
        isReturn = aReturn;
    }

    public List<String> getOriginOrderIds() {
        if (originOrderIds == null) {
            originOrderIds = new ArrayList<String>();
        }
        return this.originOrderIds;
    }
}
