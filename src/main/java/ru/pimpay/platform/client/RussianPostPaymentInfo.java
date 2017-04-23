
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RussianPostPaymentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RussianPostPaymentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postId" type="{urn:PlatformApiWsdl}russianPostIdType"/&gt;
 *         &lt;element name="payments" type="{urn:PlatformApiWsdl}RussianPostPayments" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RussianPostPaymentInfo", propOrder = {

})
public class RussianPostPaymentInfo {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String postId;
    protected RussianPostPayments payments;

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
     * Gets the value of the postId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostId() {
        return postId;
    }

    /**
     * Sets the value of the postId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostId(String value) {
        this.postId = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link RussianPostPayments }
     *     
     */
    public RussianPostPayments getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link RussianPostPayments }
     *     
     */
    public void setPayments(RussianPostPayments value) {
        this.payments = value;
    }

}
