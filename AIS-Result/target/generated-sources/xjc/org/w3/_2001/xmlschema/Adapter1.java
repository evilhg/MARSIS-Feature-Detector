//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.01 at 03:15:25 AM CEST 
//


package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Float>
{


    public Float unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseFloat(value));
    }

    public String marshal(Float value) {
        return (cz.cuni.mff.peckam.ais.result.JAXBValueConverter.printFloatThreeDecimals(value));
    }

}
