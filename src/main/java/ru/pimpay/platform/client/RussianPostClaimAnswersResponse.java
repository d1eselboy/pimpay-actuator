
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RussianPostClaimAnswersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RussianPostClaimAnswersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="tin" type="{urn:PlatformApiWsdl}tinType"/&gt;
 *         &lt;element name="russianPostClaimAnswersInfo" type="{urn:PlatformApiWsdl}RussianPostClaimAnswersInfo" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RussianPostClaimAnswersResponse", propOrder = {

})
public class RussianPostClaimAnswersResponse {

    @XmlElement(required = true)
    protected String tin;
    protected RussianPostClaimAnswersInfo russianPostClaimAnswersInfo;

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
     * Gets the value of the russianPostClaimAnswersInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RussianPostClaimAnswersInfo }
     *     
     */
    public RussianPostClaimAnswersInfo getRussianPostClaimAnswersInfo() {
        return russianPostClaimAnswersInfo;
    }

    /**
     * Sets the value of the russianPostClaimAnswersInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RussianPostClaimAnswersInfo }
     *     
     */
    public void setRussianPostClaimAnswersInfo(RussianPostClaimAnswersInfo value) {
        this.russianPostClaimAnswersInfo = value;
    }

}
