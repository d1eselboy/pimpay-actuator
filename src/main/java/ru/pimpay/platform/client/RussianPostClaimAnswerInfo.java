
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RussianPostClaimAnswerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RussianPostClaimAnswerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postId" type="{urn:PlatformApiWsdl}russianPostIdType"/&gt;
 *         &lt;element name="isFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inClaim" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="details" type="{urn:PlatformApiWsdl}Details"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RussianPostClaimAnswerInfo", propOrder = {

})
public class RussianPostClaimAnswerInfo {

    protected String id;
    @XmlElement(required = true)
    protected String postId;
    protected boolean isFound;
    protected boolean inClaim;
    @XmlElement(required = true)
    protected Details details;

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
     * Gets the value of the isFound property.
     * 
     */
    public boolean isIsFound() {
        return isFound;
    }

    /**
     * Sets the value of the isFound property.
     * 
     */
    public void setIsFound(boolean value) {
        this.isFound = value;
    }

    /**
     * Gets the value of the inClaim property.
     * 
     */
    public boolean isInClaim() {
        return inClaim;
    }

    /**
     * Sets the value of the inClaim property.
     * 
     */
    public void setInClaim(boolean value) {
        this.inClaim = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link Details }
     *     
     */
    public Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link Details }
     *     
     */
    public void setDetails(Details value) {
        this.details = value;
    }

}
