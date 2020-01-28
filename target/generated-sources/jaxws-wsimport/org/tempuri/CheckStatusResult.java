
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CheckStatusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckStatusResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefrenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankReciptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewlyCommitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FailCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TraceNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ShamsiDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RealTransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AppStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AppStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppStatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckStatusResult", propOrder = {
    "refrenceNumber",
    "bankReciptNumber",
    "newlyCommitted",
    "failCode",
    "responseCode",
    "traceNo",
    "shamsiDate",
    "realTransactionDateTime",
    "appStatus",
    "appStatusDescription",
    "appStatusCode",
    "customerCardNumber",
    "cardHolderAccNumber",
    "cardHolderName"
})
public class CheckStatusResult {

    @XmlElement(name = "RefrenceNumber")
    protected String refrenceNumber;
    @XmlElement(name = "BankReciptNumber")
    protected String bankReciptNumber;
    @XmlElement(name = "NewlyCommitted")
    protected boolean newlyCommitted;
    @XmlElement(name = "FailCode")
    protected int failCode;
    @XmlElement(name = "ResponseCode")
    protected String responseCode;
    @XmlElement(name = "TraceNo")
    protected long traceNo;
    @XmlElement(name = "ShamsiDate")
    protected String shamsiDate;
    @XmlElement(name = "RealTransactionDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar realTransactionDateTime;
    @XmlElement(name = "AppStatus")
    protected int appStatus;
    @XmlElement(name = "AppStatusDescription")
    protected String appStatusDescription;
    @XmlElement(name = "AppStatusCode")
    protected int appStatusCode;
    @XmlElement(name = "CustomerCardNumber")
    protected String customerCardNumber;
    @XmlElement(name = "CardHolderAccNumber")
    protected String cardHolderAccNumber;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;

    /**
     * Gets the value of the refrenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefrenceNumber() {
        return refrenceNumber;
    }

    /**
     * Sets the value of the refrenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefrenceNumber(String value) {
        this.refrenceNumber = value;
    }

    /**
     * Gets the value of the bankReciptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankReciptNumber() {
        return bankReciptNumber;
    }

    /**
     * Sets the value of the bankReciptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankReciptNumber(String value) {
        this.bankReciptNumber = value;
    }

    /**
     * Gets the value of the newlyCommitted property.
     * 
     */
    public boolean isNewlyCommitted() {
        return newlyCommitted;
    }

    /**
     * Sets the value of the newlyCommitted property.
     * 
     */
    public void setNewlyCommitted(boolean value) {
        this.newlyCommitted = value;
    }

    /**
     * Gets the value of the failCode property.
     * 
     */
    public int getFailCode() {
        return failCode;
    }

    /**
     * Sets the value of the failCode property.
     * 
     */
    public void setFailCode(int value) {
        this.failCode = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the traceNo property.
     * 
     */
    public long getTraceNo() {
        return traceNo;
    }

    /**
     * Sets the value of the traceNo property.
     * 
     */
    public void setTraceNo(long value) {
        this.traceNo = value;
    }

    /**
     * Gets the value of the shamsiDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShamsiDate() {
        return shamsiDate;
    }

    /**
     * Sets the value of the shamsiDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShamsiDate(String value) {
        this.shamsiDate = value;
    }

    /**
     * Gets the value of the realTransactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealTransactionDateTime() {
        return realTransactionDateTime;
    }

    /**
     * Sets the value of the realTransactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRealTransactionDateTime(XMLGregorianCalendar value) {
        this.realTransactionDateTime = value;
    }

    /**
     * Gets the value of the appStatus property.
     * 
     */
    public int getAppStatus() {
        return appStatus;
    }

    /**
     * Sets the value of the appStatus property.
     * 
     */
    public void setAppStatus(int value) {
        this.appStatus = value;
    }

    /**
     * Gets the value of the appStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStatusDescription() {
        return appStatusDescription;
    }

    /**
     * Sets the value of the appStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStatusDescription(String value) {
        this.appStatusDescription = value;
    }

    /**
     * Gets the value of the appStatusCode property.
     * 
     */
    public int getAppStatusCode() {
        return appStatusCode;
    }

    /**
     * Sets the value of the appStatusCode property.
     * 
     */
    public void setAppStatusCode(int value) {
        this.appStatusCode = value;
    }

    /**
     * Gets the value of the customerCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCardNumber() {
        return customerCardNumber;
    }

    /**
     * Sets the value of the customerCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCardNumber(String value) {
        this.customerCardNumber = value;
    }

    /**
     * Gets the value of the cardHolderAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderAccNumber() {
        return cardHolderAccNumber;
    }

    /**
     * Sets the value of the cardHolderAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderAccNumber(String value) {
        this.cardHolderAccNumber = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

}
