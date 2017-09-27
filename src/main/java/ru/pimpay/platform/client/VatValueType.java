
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VatValueType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VatValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="vat_18"/&gt;
 *     &lt;enumeration value="vat_10"/&gt;
 *     &lt;enumeration value="vat_0"/&gt;
 *     &lt;enumeration value="vat_no"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "VatValueType")
@XmlEnum
public enum VatValueType {

    @XmlEnumValue("vat_18")
    VAT_18("vat_18"),
    @XmlEnumValue("vat_10")
    VAT_10("vat_10"),
    @XmlEnumValue("vat_0")
    VAT_0("vat_0"),
    @XmlEnumValue("vat_no")
    VAT_NO("vat_no");
    private final String value;

    VatValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VatValueType fromValue(String v) {
        for (VatValueType c: VatValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
