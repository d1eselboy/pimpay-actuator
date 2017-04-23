
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomTransaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="val" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="cmt" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomTransaction", propOrder = {

})
public class CustomTransaction {

    @XmlAttribute(name = "val", required = true)
    protected float val;
    @XmlAttribute(name = "cmt", required = true)
    protected String cmt;

    /**
     * Gets the value of the val property.
     * 
     */
    public float getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     */
    public void setVal(float value) {
        this.val = value;
    }

    /**
     * Gets the value of the cmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmt() {
        return cmt;
    }

    /**
     * Sets the value of the cmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmt(String value) {
        this.cmt = value;
    }

}
