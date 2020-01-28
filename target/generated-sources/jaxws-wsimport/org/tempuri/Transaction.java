
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountTrans" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DateTimeSendShetab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TraceNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TimeLocalTrans" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DateLocalTrans" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TypeOfPinInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantBankId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IssueBankId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RetrivalRefNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RefrenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CardAcqId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CardAcqName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AppStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShamsiDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tblName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationCardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalData_Transaction_P48" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalData_TransactionLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BillID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BillPaymentID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CardHolderIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantAdditionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationPrimaryAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", propOrder = {
    "messageTypeId",
    "cardNumber",
    "processingCode",
    "amountTrans",
    "dateTimeSendShetab",
    "traceNo",
    "timeLocalTrans",
    "dateLocalTrans",
    "typeOfPinInput",
    "terminalType",
    "merchantBankId",
    "issueBankId",
    "retrivalRefNo",
    "refrenceNumber",
    "response",
    "responseCode",
    "terminalId",
    "cardAcqId",
    "cardAcqName",
    "currencyCode",
    "merchantUrl",
    "merchantIP",
    "orderId",
    "appStatus",
    "failCode",
    "stateList",
    "updateTime",
    "createDateTime",
    "requestKey",
    "shamsiDate",
    "tblName",
    "destinationCardHolderName",
    "cardHolderEmailAddress",
    "destinationAccountNumber",
    "additionalDataTransactionP48",
    "secondAccNumber",
    "additionalDataTransactionLicense",
    "line",
    "billID",
    "billPaymentID",
    "cardHolderIP",
    "merchantAdditionalData",
    "destinationPrimaryAccNum"
})
public class Transaction {

    @XmlElement(name = "MessageTypeId")
    protected long messageTypeId;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "ProcessingCode")
    protected String processingCode;
    @XmlElement(name = "AmountTrans")
    protected long amountTrans;
    @XmlElement(name = "DateTimeSendShetab")
    protected String dateTimeSendShetab;
    @XmlElement(name = "TraceNo")
    protected int traceNo;
    @XmlElement(name = "TimeLocalTrans")
    protected long timeLocalTrans;
    @XmlElement(name = "DateLocalTrans")
    protected long dateLocalTrans;
    @XmlElement(name = "TypeOfPinInput")
    protected String typeOfPinInput;
    @XmlElement(name = "TerminalType")
    protected String terminalType;
    @XmlElement(name = "MerchantBankId")
    protected long merchantBankId;
    @XmlElement(name = "IssueBankId")
    protected long issueBankId;
    @XmlElement(name = "RetrivalRefNo")
    protected long retrivalRefNo;
    @XmlElement(name = "RefrenceNumber")
    protected String refrenceNumber;
    @XmlElement(name = "Response")
    protected String response;
    @XmlElement(name = "ResponseCode")
    protected int responseCode;
    @XmlElement(name = "TerminalId")
    protected long terminalId;
    @XmlElement(name = "CardAcqId")
    protected long cardAcqId;
    @XmlElement(name = "CardAcqName")
    protected String cardAcqName;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "MerchantUrl")
    protected String merchantUrl;
    @XmlElement(name = "MerchantIP")
    protected String merchantIP;
    @XmlElement(name = "OrderId")
    protected long orderId;
    @XmlElement(name = "AppStatus")
    protected String appStatus;
    @XmlElement(name = "FailCode")
    protected String failCode;
    @XmlElement(name = "StateList")
    protected String stateList;
    @XmlElement(name = "UpdateTime")
    protected String updateTime;
    @XmlElement(name = "CreateDateTime")
    protected String createDateTime;
    @XmlElement(name = "RequestKey")
    protected String requestKey;
    @XmlElement(name = "ShamsiDate")
    protected String shamsiDate;
    protected String tblName;
    @XmlElement(name = "DestinationCardHolderName")
    protected String destinationCardHolderName;
    @XmlElement(name = "CardHolderEmailAddress")
    protected String cardHolderEmailAddress;
    @XmlElement(name = "DestinationAccountNumber")
    protected String destinationAccountNumber;
    @XmlElement(name = "AdditionalData_Transaction_P48")
    protected String additionalDataTransactionP48;
    @XmlElement(name = "SecondAccNumber")
    protected String secondAccNumber;
    @XmlElement(name = "AdditionalData_TransactionLicense")
    protected String additionalDataTransactionLicense;
    @XmlElement(name = "Line", required = true, type = Integer.class, nillable = true)
    protected Integer line;
    @XmlElement(name = "BillID")
    protected long billID;
    @XmlElement(name = "BillPaymentID")
    protected long billPaymentID;
    @XmlElement(name = "CardHolderIP")
    protected String cardHolderIP;
    @XmlElement(name = "MerchantAdditionalData")
    protected String merchantAdditionalData;
    @XmlElement(name = "DestinationPrimaryAccNum")
    protected String destinationPrimaryAccNum;

    /**
     * Gets the value of the messageTypeId property.
     * 
     */
    public long getMessageTypeId() {
        return messageTypeId;
    }

    /**
     * Sets the value of the messageTypeId property.
     * 
     */
    public void setMessageTypeId(long value) {
        this.messageTypeId = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the processingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingCode() {
        return processingCode;
    }

    /**
     * Sets the value of the processingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingCode(String value) {
        this.processingCode = value;
    }

    /**
     * Gets the value of the amountTrans property.
     * 
     */
    public long getAmountTrans() {
        return amountTrans;
    }

    /**
     * Sets the value of the amountTrans property.
     * 
     */
    public void setAmountTrans(long value) {
        this.amountTrans = value;
    }

    /**
     * Gets the value of the dateTimeSendShetab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeSendShetab() {
        return dateTimeSendShetab;
    }

    /**
     * Sets the value of the dateTimeSendShetab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeSendShetab(String value) {
        this.dateTimeSendShetab = value;
    }

    /**
     * Gets the value of the traceNo property.
     * 
     */
    public int getTraceNo() {
        return traceNo;
    }

    /**
     * Sets the value of the traceNo property.
     * 
     */
    public void setTraceNo(int value) {
        this.traceNo = value;
    }

    /**
     * Gets the value of the timeLocalTrans property.
     * 
     */
    public long getTimeLocalTrans() {
        return timeLocalTrans;
    }

    /**
     * Sets the value of the timeLocalTrans property.
     * 
     */
    public void setTimeLocalTrans(long value) {
        this.timeLocalTrans = value;
    }

    /**
     * Gets the value of the dateLocalTrans property.
     * 
     */
    public long getDateLocalTrans() {
        return dateLocalTrans;
    }

    /**
     * Sets the value of the dateLocalTrans property.
     * 
     */
    public void setDateLocalTrans(long value) {
        this.dateLocalTrans = value;
    }

    /**
     * Gets the value of the typeOfPinInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfPinInput() {
        return typeOfPinInput;
    }

    /**
     * Sets the value of the typeOfPinInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfPinInput(String value) {
        this.typeOfPinInput = value;
    }

    /**
     * Gets the value of the terminalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * Sets the value of the terminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

    /**
     * Gets the value of the merchantBankId property.
     * 
     */
    public long getMerchantBankId() {
        return merchantBankId;
    }

    /**
     * Sets the value of the merchantBankId property.
     * 
     */
    public void setMerchantBankId(long value) {
        this.merchantBankId = value;
    }

    /**
     * Gets the value of the issueBankId property.
     * 
     */
    public long getIssueBankId() {
        return issueBankId;
    }

    /**
     * Sets the value of the issueBankId property.
     * 
     */
    public void setIssueBankId(long value) {
        this.issueBankId = value;
    }

    /**
     * Gets the value of the retrivalRefNo property.
     * 
     */
    public long getRetrivalRefNo() {
        return retrivalRefNo;
    }

    /**
     * Sets the value of the retrivalRefNo property.
     * 
     */
    public void setRetrivalRefNo(long value) {
        this.retrivalRefNo = value;
    }

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
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     */
    public long getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     */
    public void setTerminalId(long value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the cardAcqId property.
     * 
     */
    public long getCardAcqId() {
        return cardAcqId;
    }

    /**
     * Sets the value of the cardAcqId property.
     * 
     */
    public void setCardAcqId(long value) {
        this.cardAcqId = value;
    }

    /**
     * Gets the value of the cardAcqName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcqName() {
        return cardAcqName;
    }

    /**
     * Sets the value of the cardAcqName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcqName(String value) {
        this.cardAcqName = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the merchantUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantUrl() {
        return merchantUrl;
    }

    /**
     * Sets the value of the merchantUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantUrl(String value) {
        this.merchantUrl = value;
    }

    /**
     * Gets the value of the merchantIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantIP() {
        return merchantIP;
    }

    /**
     * Sets the value of the merchantIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantIP(String value) {
        this.merchantIP = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the appStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * Sets the value of the appStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStatus(String value) {
        this.appStatus = value;
    }

    /**
     * Gets the value of the failCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailCode() {
        return failCode;
    }

    /**
     * Sets the value of the failCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailCode(String value) {
        this.failCode = value;
    }

    /**
     * Gets the value of the stateList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateList() {
        return stateList;
    }

    /**
     * Sets the value of the stateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateList(String value) {
        this.stateList = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDateTime(String value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the requestKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestKey() {
        return requestKey;
    }

    /**
     * Sets the value of the requestKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestKey(String value) {
        this.requestKey = value;
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
     * Gets the value of the tblName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTblName() {
        return tblName;
    }

    /**
     * Sets the value of the tblName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTblName(String value) {
        this.tblName = value;
    }

    /**
     * Gets the value of the destinationCardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCardHolderName() {
        return destinationCardHolderName;
    }

    /**
     * Sets the value of the destinationCardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCardHolderName(String value) {
        this.destinationCardHolderName = value;
    }

    /**
     * Gets the value of the cardHolderEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderEmailAddress() {
        return cardHolderEmailAddress;
    }

    /**
     * Sets the value of the cardHolderEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderEmailAddress(String value) {
        this.cardHolderEmailAddress = value;
    }

    /**
     * Gets the value of the destinationAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAccountNumber() {
        return destinationAccountNumber;
    }

    /**
     * Sets the value of the destinationAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAccountNumber(String value) {
        this.destinationAccountNumber = value;
    }

    /**
     * Gets the value of the additionalDataTransactionP48 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDataTransactionP48() {
        return additionalDataTransactionP48;
    }

    /**
     * Sets the value of the additionalDataTransactionP48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDataTransactionP48(String value) {
        this.additionalDataTransactionP48 = value;
    }

    /**
     * Gets the value of the secondAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondAccNumber() {
        return secondAccNumber;
    }

    /**
     * Sets the value of the secondAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondAccNumber(String value) {
        this.secondAccNumber = value;
    }

    /**
     * Gets the value of the additionalDataTransactionLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDataTransactionLicense() {
        return additionalDataTransactionLicense;
    }

    /**
     * Sets the value of the additionalDataTransactionLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDataTransactionLicense(String value) {
        this.additionalDataTransactionLicense = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLine(Integer value) {
        this.line = value;
    }

    /**
     * Gets the value of the billID property.
     * 
     */
    public long getBillID() {
        return billID;
    }

    /**
     * Sets the value of the billID property.
     * 
     */
    public void setBillID(long value) {
        this.billID = value;
    }

    /**
     * Gets the value of the billPaymentID property.
     * 
     */
    public long getBillPaymentID() {
        return billPaymentID;
    }

    /**
     * Sets the value of the billPaymentID property.
     * 
     */
    public void setBillPaymentID(long value) {
        this.billPaymentID = value;
    }

    /**
     * Gets the value of the cardHolderIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderIP() {
        return cardHolderIP;
    }

    /**
     * Sets the value of the cardHolderIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderIP(String value) {
        this.cardHolderIP = value;
    }

    /**
     * Gets the value of the merchantAdditionalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAdditionalData() {
        return merchantAdditionalData;
    }

    /**
     * Sets the value of the merchantAdditionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAdditionalData(String value) {
        this.merchantAdditionalData = value;
    }

    /**
     * Gets the value of the destinationPrimaryAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPrimaryAccNum() {
        return destinationPrimaryAccNum;
    }

    /**
     * Sets the value of the destinationPrimaryAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPrimaryAccNum(String value) {
        this.destinationPrimaryAccNum = value;
    }

}
