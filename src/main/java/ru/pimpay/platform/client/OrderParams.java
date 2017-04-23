
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="currency" type="{urn:PlatformApiWsdl}currencyType"/&gt;
 *         &lt;element name="paymentFromRecipient" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="declaredOrderCost" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="estimatedDeliveryCost" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="deliveryService" type="{urn:PlatformApiWsdl}deliveryServiceType"/&gt;
 *         &lt;element name="deliveryServiceExternalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uniformPimpayDeliveryStatus" type="{urn:PlatformApiWsdl}uniformPimpayDeliveryStatusType"/&gt;
 *         &lt;element name="customDeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryServiceDeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="history" type="{urn:PlatformApiWsdl}DeliveryStatusHistoryItems"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderParams", propOrder = {

})
public class OrderParams {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyType currency;
    protected float paymentFromRecipient;
    protected float declaredOrderCost;
    protected Float estimatedDeliveryCost;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryServiceType deliveryService;
    @XmlElement(required = true)
    protected String deliveryServiceExternalId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UniformPimpayDeliveryStatusType uniformPimpayDeliveryStatus;
    @XmlElement(required = true)
    protected String customDeliveryStatus;
    protected String deliveryServiceDeliveryStatus;
    @XmlElement(required = true)
    protected DeliveryStatusHistoryItems history;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paymentFromRecipient property.
     * 
     */
    public float getPaymentFromRecipient() {
        return paymentFromRecipient;
    }

    /**
     * Sets the value of the paymentFromRecipient property.
     * 
     */
    public void setPaymentFromRecipient(float value) {
        this.paymentFromRecipient = value;
    }

    /**
     * Gets the value of the declaredOrderCost property.
     * 
     */
    public float getDeclaredOrderCost() {
        return declaredOrderCost;
    }

    /**
     * Sets the value of the declaredOrderCost property.
     * 
     */
    public void setDeclaredOrderCost(float value) {
        this.declaredOrderCost = value;
    }

    /**
     * Gets the value of the estimatedDeliveryCost property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEstimatedDeliveryCost() {
        return estimatedDeliveryCost;
    }

    /**
     * Sets the value of the estimatedDeliveryCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEstimatedDeliveryCost(Float value) {
        this.estimatedDeliveryCost = value;
    }

    /**
     * Gets the value of the deliveryService property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryServiceType }
     *     
     */
    public DeliveryServiceType getDeliveryService() {
        return deliveryService;
    }

    /**
     * Sets the value of the deliveryService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryServiceType }
     *     
     */
    public void setDeliveryService(DeliveryServiceType value) {
        this.deliveryService = value;
    }

    /**
     * Gets the value of the deliveryServiceExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceExternalId() {
        return deliveryServiceExternalId;
    }

    /**
     * Sets the value of the deliveryServiceExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceExternalId(String value) {
        this.deliveryServiceExternalId = value;
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

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryStatusHistoryItems }
     *     
     */
    public DeliveryStatusHistoryItems getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryStatusHistoryItems }
     *     
     */
    public void setHistory(DeliveryStatusHistoryItems value) {
        this.history = value;
    }

}
