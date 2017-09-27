
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tin" type="{urn:PlatformApiWsdl}tinType"/&gt;
 *         &lt;element name="shopExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base" type="{urn:PlatformApiWsdl}OrderBase"/&gt;
 *         &lt;element name="createdAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="destinationAddress" type="{urn:PlatformApiWsdl}Address" minOccurs="0"/&gt;
 *         &lt;element name="recipient" type="{urn:PlatformApiWsdl}Recipient" minOccurs="0"/&gt;
 *         &lt;element name="items" type="{urn:PlatformApiWsdl}OrderItems" minOccurs="0"/&gt;
 *         &lt;element name="f103" type="{urn:PlatformApiWsdl}F103" minOccurs="0"/&gt;
 *         &lt;element name="moneyRecipient" type="{urn:PlatformApiWsdl}moneyRecipientType" minOccurs="0"/&gt;
 *         &lt;element name="claim" type="{urn:PlatformApiWsdl}Claim" minOccurs="0"/&gt;
 *         &lt;element name="deliveryTimeInDays" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="returnInfo" type="{urn:PlatformApiWsdl}OrderReturnInfo" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {

})
public class Order {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String tin;
    protected String shopExternalId;
    @XmlElement(required = true)
    protected OrderBase base;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    protected Address destinationAddress;
    protected Recipient recipient;
    protected OrderItems items;
    protected F103 f103;
    @XmlSchemaType(name = "string")
    protected MoneyRecipientType moneyRecipient;
    protected Claim claim;
    protected BigInteger deliveryTimeInDays;
    protected OrderReturnInfo returnInfo;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTin(String value) {
        this.tin = value;
    }

    /**
     * Gets the value of the shopExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopExternalId() {
        return shopExternalId;
    }

    /**
     * Sets the value of the shopExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopExternalId(String value) {
        this.shopExternalId = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link OrderBase }
     *     
     */
    public OrderBase getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBase }
     *     
     */
    public void setBase(OrderBase value) {
        this.base = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestinationAddress(Address value) {
        this.destinationAddress = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link Recipient }
     *     
     */
    public Recipient getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient }
     *     
     */
    public void setRecipient(Recipient value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItems }
     *     
     */
    public OrderItems getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItems }
     *     
     */
    public void setItems(OrderItems value) {
        this.items = value;
    }

    /**
     * Gets the value of the f103 property.
     * 
     * @return
     *     possible object is
     *     {@link F103 }
     *     
     */
    public F103 getF103() {
        return f103;
    }

    /**
     * Sets the value of the f103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link F103 }
     *     
     */
    public void setF103(F103 value) {
        this.f103 = value;
    }

    /**
     * Gets the value of the moneyRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyRecipientType }
     *     
     */
    public MoneyRecipientType getMoneyRecipient() {
        return moneyRecipient;
    }

    /**
     * Sets the value of the moneyRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyRecipientType }
     *     
     */
    public void setMoneyRecipient(MoneyRecipientType value) {
        this.moneyRecipient = value;
    }

    /**
     * Gets the value of the claim property.
     * 
     * @return
     *     possible object is
     *     {@link Claim }
     *     
     */
    public Claim getClaim() {
        return claim;
    }

    /**
     * Sets the value of the claim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim }
     *     
     */
    public void setClaim(Claim value) {
        this.claim = value;
    }

    public BigInteger getDeliveryTimeInDays() {
        return deliveryTimeInDays;
    }

    public void setDeliveryTimeInDays(BigInteger deliveryTimeInDays) {
        this.deliveryTimeInDays = deliveryTimeInDays;
    }

    public OrderReturnInfo getReturnInfo() {
        return returnInfo;
    }

    public void setReturnInfo(OrderReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
    }

}
