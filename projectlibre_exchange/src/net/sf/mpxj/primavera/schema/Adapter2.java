//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.02 at 12:16:58 PM BST 
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2 extends XmlAdapter<String, Date>
{

   @Override public Date unmarshal(String value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.parseTime(value));
   }

   @Override public String marshal(Date value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.printTime(value));
   }

}
