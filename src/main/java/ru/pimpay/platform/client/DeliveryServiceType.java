
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deliveryServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="logibox"/&gt;
 *     &lt;enumeration value="pek"/&gt;
 *     &lt;enumeration value="axiomus"/&gt;
 *     &lt;enumeration value="b2cpl"/&gt;
 *     &lt;enumeration value="boxberry"/&gt;
 *     &lt;enumeration value="cse"/&gt;
 *     &lt;enumeration value="dpd"/&gt;
 *     &lt;enumeration value="ems"/&gt;
 *     &lt;enumeration value="im_logistics"/&gt;
 *     &lt;enumeration value="maxima_express"/&gt;
 *     &lt;enumeration value="pick_point"/&gt;
 *     &lt;enumeration value="pony"/&gt;
 *     &lt;enumeration value="post"/&gt;
 *     &lt;enumeration value="qiwi_post"/&gt;
 *     &lt;enumeration value="sdek"/&gt;
 *     &lt;enumeration value="beta"/&gt;
 *     &lt;enumeration value="spsr"/&gt;
 *     &lt;enumeration value="accord_post"/&gt;
 *     &lt;enumeration value="beta_post"/&gt;
 *     &lt;enumeration value="top_delivery"/&gt;
 *     &lt;enumeration value="maxi_post"/&gt;
 *     &lt;enumeration value="reworker"/&gt;
 *     &lt;enumeration value="shop_logistics"/&gt;
 *     &lt;enumeration value="hermes"/&gt;
 *     &lt;enumeration value="lenod"/&gt;
 *     &lt;enumeration value="aplix"/&gt;
 *     &lt;enumeration value="kit"/&gt;
 *     &lt;enumeration value="fsd"/&gt;
 *     &lt;enumeration value="great_express"/&gt;
 *     &lt;enumeration value="vestovoy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "deliveryServiceType")
@XmlEnum
public enum DeliveryServiceType {

    @XmlEnumValue("logibox")
    LOGIBOX("logibox"),
    @XmlEnumValue("pek")
    PEK("pek"),
    @XmlEnumValue("axiomus")
    AXIOMUS("axiomus"),
    @XmlEnumValue("b2cpl")
    B_2_CPL("b2cpl"),
    @XmlEnumValue("boxberry")
    BOXBERRY("boxberry"),
    @XmlEnumValue("cse")
    CSE("cse"),
    @XmlEnumValue("dpd")
    DPD("dpd"),
    @XmlEnumValue("ems")
    EMS("ems"),
    @XmlEnumValue("im_logistics")
    IM_LOGISTICS("im_logistics"),
    @XmlEnumValue("maxima_express")
    MAXIMA_EXPRESS("maxima_express"),
    @XmlEnumValue("pick_point")
    PICK_POINT("pick_point"),
    @XmlEnumValue("pony")
    PONY("pony"),
    @XmlEnumValue("post")
    POST("post"),
    @XmlEnumValue("qiwi_post")
    QIWI_POST("qiwi_post"),
    @XmlEnumValue("sdek")
    SDEK("sdek"),
    @XmlEnumValue("beta")
    BETA("beta"),
    @XmlEnumValue("spsr")
    SPSR("spsr"),
    @XmlEnumValue("accord_post")
    ACCORD_POST("accord_post"),
    @XmlEnumValue("beta_post")
    BETA_POST("beta_post"),
    @XmlEnumValue("top_delivery")
    TOP_DELIVERY("top_delivery"),
    @XmlEnumValue("maxi_post")
    MAXI_POST("maxi_post"),
    @XmlEnumValue("reworker")
    REWORKER("reworker"),
    @XmlEnumValue("shop_logistics")
    SHOP_LOGISTICS("shop_logistics"),
    @XmlEnumValue("hermes")
    HERMES("hermes"),
    @XmlEnumValue("lenod")
    LENOD("lenod"),
    @XmlEnumValue("aplix")
    APLIX("aplix"),
    @XmlEnumValue("kit")
    KIT("kit"),
    @XmlEnumValue("fsd")
    FSD("fsd"),
    @XmlEnumValue("great_express")
    GREAT_EXPRESS("great_express"),
    @XmlEnumValue("vestovoy")
    VESTOVOY("vestovoy");
    private final String value;

    DeliveryServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryServiceType fromValue(String v) {
        for (DeliveryServiceType c: DeliveryServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
