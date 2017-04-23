
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeliveryStatusHistoryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryStatusHistoryItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="uniformPimpayDeliveryStatus" type="{urn:PlatformApiWsdl}uniformPimpayDeliveryStatusType"/&gt;
 *         &lt;element name="customDeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryServiceDeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryStatusHistoryItem", propOrder = {

})
public class DeliveryStatusHistoryItem {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UniformPimpayDeliveryStatusType uniformPimpayDeliveryStatus;
    @XmlElement(required = true)
    protected String customDeliveryStatus;
    protected String deliveryServiceDeliveryStatus;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the uniformPimpayDeliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UniformPimpayDeliveryStatusType }
     *     
     */
    public UniformPimpayDeliveryStatusType getUniformPimpayDeliveryStatus() {
        return uniformPimpayDeliveryStatus;
    }

    /**
     * Sets the value of the uniformPimpayDeliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniformPimpayDeliveryStatusType }
     *     
     */
    public void setUniformPimpayDeliveryStatus(UniformPimpayDeliveryStatusType value) {
        this.uniformPimpayDeliveryStatus = value;
    }

    /**
     * Gets the value of the customDeliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomDeliveryStatus() {
        return customDeliveryStatus;
    }

    /**
     * Sets the value of the customDeliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomDeliveryStatus(String value) {
        this.customDeliveryStatus = value;
    }

    /**
     * Gets the value of the deliveryServiceDeliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceDeliveryStatus() {
        return deliveryServiceDeliveryStatus;
    }

    /**
     * Sets the value of the deliveryServiceDeliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceDeliveryStatus(String value) {
        this.deliveryServiceDeliveryStatus = value;
    }

}
