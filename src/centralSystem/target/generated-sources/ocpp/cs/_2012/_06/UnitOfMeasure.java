
package ocpp.cs._2012._06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UnitOfMeasure.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfMeasure"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Wh"/&gt;
 *     &lt;enumeration value="kWh"/&gt;
 *     &lt;enumeration value="varh"/&gt;
 *     &lt;enumeration value="kvarh"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="kW"/&gt;
 *     &lt;enumeration value="var"/&gt;
 *     &lt;enumeration value="kvar"/&gt;
 *     &lt;enumeration value="Amp"/&gt;
 *     &lt;enumeration value="Volt"/&gt;
 *     &lt;enumeration value="Celsius"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnitOfMeasure")
@XmlEnum
public enum UnitOfMeasure {

    @XmlEnumValue("Wh")
    WH("Wh"),
    @XmlEnumValue("kWh")
    K_WH("kWh"),
    @XmlEnumValue("varh")
    VARH("varh"),
    @XmlEnumValue("kvarh")
    KVARH("kvarh"),
    W("W"),
    @XmlEnumValue("kW")
    K_W("kW"),
    @XmlEnumValue("var")
    VAR("var"),
    @XmlEnumValue("kvar")
    KVAR("kvar"),
    @XmlEnumValue("Amp")
    AMP("Amp"),
    @XmlEnumValue("Volt")
    VOLT("Volt"),
    @XmlEnumValue("Celsius")
    CELSIUS("Celsius");
    private final String value;

    UnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitOfMeasure fromValue(String v) {
        for (UnitOfMeasure c: UnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
