/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.ipg.samplecode;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceRef;
import org.tempuri.CheckStatusResult;
import org.tempuri.MerchantUtility;

/**
 *
 * @author nsafari
 */
@ManagedBean
@SessionScoped
public class Purchase {

    static{
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        @Override
        public void checkClientTrusted(X509Certificate[] certs, String authType) {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] certs, String authType) {
        }
    }};
        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            ;
        }
    }
    
    @WebServiceRef
    private MerchantUtility service;
    private String merchantId;
    private String terminalId;
    private String transKey;
    private int orderId;
    private int amount;
    private String returnURL;
    private String serviceURL;
    private String result;
    private Holder<String> paymentUtilityResult;
    private Holder<String> requestKey;
    private CheckStatusResult checkStatusResult;

    /**
     * Creates a new instance of Purchase
     */
    public Purchase() {
        this.merchantId = "111207130";
        this.terminalId = "17990001";
        this.orderId = 150;
        this.amount = 1031;
        this.transKey = "41157CASB1";
        this.returnURL = "http://localhost:8080/SIC.IPG.SampleCode/Commit.xhtml";
        this.serviceURL = "https://bmiutility.bmi.ir";
        this.paymentUtilityResult = new Holder<String>();
        this.requestKey = new Holder<String>();        
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Holder<String> getPaymentUtilityResult() {
        return paymentUtilityResult;
    }

    public void setPaymentUtilityResult(Holder<String> PaymentUtilityResult) {
        this.paymentUtilityResult = PaymentUtilityResult;
    }

    public Holder<String> getRequestKey() {
        return requestKey;
    }

    public void setRequestKey(Holder<String> RequestKey) {
        this.requestKey = RequestKey;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getReturnURL() {
        return returnURL;
    }

    public void setReturnURL(String returnURL) {
        this.returnURL = returnURL;
    }

    public String getServiceURL() {
        return serviceURL;
    }

    public void setServiceURL(String serviceURL) {
        this.serviceURL = serviceURL;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTransKey() {
        return transKey;
    }

    public void setTransKey(String transKey) {
        this.transKey = transKey;
    }

    public String submit() {
        PaymentUtil(paymentUtilityResult, requestKey);
        result = paymentUtilityResult.value;
        return "Post";
    }

    public void PaymentUtil(Holder<String> PaymentUtilityResult, Holder<String> RequestKey) {
        try { // Call Web Service Operation
            org.tempuri.MerchantUtilitySoap port = service.getMerchantUtilitySoap();
            String cardAcqID = this.merchantId;
            long amountTrans = this.amount;
            long orderid = this.orderId;
            String transactionKey = this.transKey;
            String terminalid = this.terminalId;
            String redirectURL = this.returnURL;
            port.paymentUtility(cardAcqID, amountTrans, orderid, transactionKey, terminalid, redirectURL, PaymentUtilityResult, RequestKey);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public CheckStatusResult getCheckStatusResult() {
        if (this.checkStatusResult == null) {
            this.getStatus();
        }
        return this.checkStatusResult;
    }

    public void setCheckStatusResult(CheckStatusResult checkStatusResult) {
        this.checkStatusResult = checkStatusResult;
    }

    public CheckStatusResult CheckRequestStatus() {
        try { // Call Web Service Operation
            org.tempuri.MerchantUtilitySoap port = service.getMerchantUtilitySoap();
            return port.checkRequestStatusResult(this.orderId, this.merchantId, this.terminalId, this.transKey, this.requestKey.value, this.amount);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void getStatus() {
        this.checkStatusResult = this.CheckRequestStatus();
    }
}
