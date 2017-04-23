
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uniformPimpayDeliveryStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="uniformPimpayDeliveryStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pending"/&gt;
 *     &lt;enumeration value="prepared"/&gt;
 *     &lt;enumeration value="intransit"/&gt;
 *     &lt;enumeration value="stored"/&gt;
 *     &lt;enumeration value="delivered"/&gt;
 *     &lt;enumeration value="partialReturn"/&gt;
 *     &lt;enumeration value="return"/&gt;
 *     &lt;enumeration value="lost"/&gt;
 *     &lt;enumeration value="error"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "uniformPimpayDeliveryStatusType")
@XmlEnum
public enum UniformPimpayDeliveryStatusType {

    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("prepared")
    PREPARED("prepared"),
    @XmlEnumValue("intransit")
    INTRANSIT("intransit"),
    @XmlEnumValue("stored")
    STORED("stored"),
    @XmlEnumValue("delivered")
    DELIVERED("delivered"),
    @XmlEnumValue("partialReturn")
    PARTIAL_RETURN("partialReturn"),
    @XmlEnumValue("return")
    RETURN("return"),
    @XmlEnumValue("lost")
    LOST("lost"),
    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    UniformPimpayDeliveryStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UniformPimpayDeliveryStatusType fromValue(String v) {
        for (UniformPimpayDeliveryStatusType c: UniformPimpayDeliveryStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
