
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RussianPostPaymentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RussianPostPaymentsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="tin" type="{urn:PlatformApiWsdl}tinType"/&gt;
 *         &lt;element name="russianPostPaymentsInfo" type="{urn:PlatformApiWsdl}RussianPostPaymentsInfo" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RussianPostPaymentsResponse", propOrder = {

})
public class RussianPostPaymentsResponse {

    @XmlElement(required = true)
    protected String tin;
    protected RussianPostPaymentsInfo russianPostPaymentsInfo;

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
     * Gets the value of the russianPostPaymentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RussianPostPaymentsInfo }
     *     
     */
    public RussianPostPaymentsInfo getRussianPostPaymentsInfo() {
        return russianPostPaymentsInfo;
    }

    /**
     * Sets the value of the russianPostPaymentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RussianPostPaymentsInfo }
     *     
     */
    public void setRussianPostPaymentsInfo(RussianPostPaymentsInfo value) {
        this.russianPostPaymentsInfo = value;
    }

}
