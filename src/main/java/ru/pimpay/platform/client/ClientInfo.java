
package ru.pimpay.platform.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="tin" type="{urn:PlatformApiWsdl}tinType"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isMoneyTransferPossible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="paymentOrderPurpose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ordersCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientInfo", propOrder = {

})
public class ClientInfo {

    @XmlElement(required = true)
    protected String tin;
    protected String status;
    protected boolean isMoneyTransferPossible;
    @XmlElement(required = true)
    protected String paymentOrderPurpose;
    protected BigInteger ordersCount;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the isMoneyTransferPossible property.
     * 
     */
    public boolean isIsMoneyTransferPossible() {
        return isMoneyTransferPossible;
    }

    /**
     * Sets the value of the isMoneyTransferPossible property.
     * 
     */
    public void setIsMoneyTransferPossible(boolean value) {
        this.isMoneyTransferPossible = value;
    }

    /**
     * Gets the value of the paymentOrderPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderPurpose() {
        return paymentOrderPurpose;
    }

    /**
     * Sets the value of the paymentOrderPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderPurpose(String value) {
        this.paymentOrderPurpose = value;
    }

    /**
     * Gets the value of the ordersCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrdersCount() {
        return ordersCount;
    }

    /**
     * Sets the value of the ordersCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrdersCount(BigInteger value) {
        this.ordersCount = value;
    }

}
