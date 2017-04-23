
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="postId" type="{urn:PlatformApiWsdl}russianPostIdType" minOccurs="0"/&gt;
 *         &lt;element name="params" type="{urn:PlatformApiWsdl}OrderParams" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBase", propOrder = {
    "postId",
    "params"
})
public class OrderBase {

    protected String postId;
    protected OrderParams params;

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
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link OrderParams }
     *     
     */
    public OrderParams getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderParams }
     *     
     */
    public void setParams(OrderParams value) {
        this.params = value;
    }

}
