
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerificationRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="txs" type="{urn:PlatformApiWsdl}CustomTransactions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="oid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ptp" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="pfr" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="dc" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="cs" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="ins" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationRow", propOrder = {
    "txs"
})
public class VerificationRow {

    protected CustomTransactions txs;
    @XmlAttribute(name = "oid", required = true)
    protected String oid;
    @XmlAttribute(name = "ptp", required = true)
    protected float ptp;
    @XmlAttribute(name = "pfr")
    protected Float pfr;
    @XmlAttribute(name = "dc")
    protected Float dc;
    @XmlAttribute(name = "cs")
    protected Float cs;
    @XmlAttribute(name = "ins")
    protected Float ins;

    /**
     * Gets the value of the txs property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTransactions }
     *     
     */
    public CustomTransactions getTxs() {
        return txs;
    }

    /**
     * Sets the value of the txs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTransactions }
     *     
     */
    public void setTxs(CustomTransactions value) {
        this.txs = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOid(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the ptp property.
     * 
     */
    public float getPtp() {
        return ptp;
    }

    /**
     * Sets the value of the ptp property.
     * 
     */
    public void setPtp(float value) {
        this.ptp = value;
    }

    /**
     * Gets the value of the pfr property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPfr() {
        return pfr;
    }

    /**
     * Sets the value of the pfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPfr(Float value) {
        this.pfr = value;
    }

    /**
     * Gets the value of the dc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDc() {
        return dc;
    }

    /**
     * Sets the value of the dc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDc(Float value) {
        this.dc = value;
    }

    /**
     * Gets the value of the cs property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCs() {
        return cs;
    }

    /**
     * Sets the value of the cs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCs(Float value) {
        this.cs = value;
    }

    /**
     * Gets the value of the ins property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIns() {
        return ins;
    }

    /**
     * Sets the value of the ins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIns(Float value) {
        this.ins = value;
    }

}
