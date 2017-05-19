
package ru.pimpay.platform.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryStatusHistoryItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryStatusHistoryItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryStatusHistoryItem" type="{urn:PlatformApiWsdl}DeliveryStatusHistoryItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryStatusHistoryItems", propOrder = {
    "deliveryStatusHistoryItem"
})
public class DeliveryStatusHistoryItems {

    @XmlElement(name = "item")
    protected List<DeliveryStatusHistoryItem> deliveryStatusHistoryItem;

    /**
     * Gets the value of the deliveryStatusHistoryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryStatusHistoryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryStatusHistoryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryStatusHistoryItem }
     * 
     * 
     */
    public List<DeliveryStatusHistoryItem> getDeliveryStatusHistoryItem() {
        if (deliveryStatusHistoryItem == null) {
            deliveryStatusHistoryItem = new ArrayList<DeliveryStatusHistoryItem>();
        }
        return this.deliveryStatusHistoryItem;
    }

}
