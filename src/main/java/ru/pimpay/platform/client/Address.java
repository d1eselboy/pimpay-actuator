
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="full" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kladr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {

})
public class Address {

    protected String full;
    protected String zipcode;
    protected String city;
    protected String kladr;
    protected String fias;

    /**
     * Gets the value of the full property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFull() {
        return full;
    }

    /**
     * Sets the value of the full property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFull(String value) {
        this.full = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the kladr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKladr() {
        return kladr;
    }

    /**
     * Sets the value of the kladr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKladr(String value) {
        this.kladr = value;
    }

    /**
     * Gets the value of the fias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFias() {
        return fias;
    }

    /**
     * Sets the value of the fias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFias(String value) {
        this.fias = value;
    }

}
