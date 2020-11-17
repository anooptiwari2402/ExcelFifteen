package com.model;

public class ModelTable {

    private Object sno                 ;
    private Object transactionID       ;
    private Object transactionDate     ;
    private Object method              ;
    private Object paymentData         ;
    private Object paymentStatus       ;
    private Object ssoId               ;
    private Object firstName           ;
    private Object lastNameAddress     ;
    private Object address             ;
    private Object city                ;
    private Object state               ;
    private Object zip                 ;
    private Object country             ;
    private Object mobile              ;
    private Object email               ;
    private Object currency            ;
    private Object amount              ;
    private Object packageType         ;
    public ModelTable() {

    }
    public ModelTable(Object sno, Object transactionID, Object transactionDate, Object method, Object paymentData,
                      Object paymentStatus, Object ssoId, Object firstName, Object lastNameAddress, Object address, Object city,
                      Object state, Object zip, Object country, Object mobile, Object email, Object currency, Object amount,
                      Object packageType) {

        this.sno = sno;
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.method = method;
        this.paymentData = paymentData;
        this.paymentStatus = paymentStatus;
        this.ssoId = ssoId;
        this.firstName = firstName;
        this.lastNameAddress = lastNameAddress;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.mobile = mobile;
        this.email = email;
        this.currency = currency;
        this.amount = amount;
        this.packageType = packageType;
    }
    public Object getSno() {
        return sno;
    }
    public void setSno(Object sno) {
        this.sno = sno;
    }
    public Object getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(Object transactionID) {
        this.transactionID = transactionID;
    }
    public Object getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Object transactionDate) {
        this.transactionDate = transactionDate;
    }
    public Object getMethod() {
        return method;
    }
    public void setMethod(Object method) {
        this.method = method;
    }
    public Object getPaymentData() {
        return paymentData;
    }
    public void setPaymentData(Object paymentData) {
        this.paymentData = paymentData;
    }
    public Object getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(Object paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public Object getSsoId() {
        return ssoId;
    }
    public void setSsoId(Object ssoId) {
        this.ssoId = ssoId;
    }
    public Object getFirstName() {
        return firstName;
    }
    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }
    public Object getLastNameAddress() {
        return lastNameAddress;
    }
    public void setLastNameAddress(Object lastNameAddress) {
        this.lastNameAddress = lastNameAddress;
    }
    public Object getAddress() {
        return address;
    }
    public void setAddress(Object address) {
        this.address = address;
    }
    public Object getCity() {
        return city;
    }
    public void setCity(Object city) {
        this.city = city;
    }
    public Object getState() {
        return state;
    }
    public void setState(Object state) {
        this.state = state;
    }
    public Object getZip() {
        return zip;
    }
    public void setZip(Object zip) {
        this.zip = zip;
    }
    public Object getCountry() {
        return country;
    }
    public void setCountry(Object country) {
        this.country = country;
    }
    public Object getMobile() {
        return mobile;
    }
    public void setMobile(Object mobile) {
        this.mobile = mobile;
    }
    public Object getEmail() {
        return email;
    }
    public void setEmail(Object email) {
        this.email = email;
    }
    public Object getCurrency() {
        return currency;
    }
    public void setCurrency(Object currency) {
        this.currency = currency;
    }
    public Object getAmount() {
        return amount;
    }
    public void setAmount(Object amount) {
        this.amount = amount;
    }
    public Object getPackageType() {
        return packageType;
    }
    public void setPackageType(Object packageType) {
        this.packageType = packageType;
    }
    @Override
    public String toString() {
        return "ModelTable [sno=" + sno + ", transactionID=" + transactionID + ", transactionDate=" + transactionDate
                + ", method=" + method + ", paymentData=" + paymentData + ", paymentStatus=" + paymentStatus
                + ", ssoId=" + ssoId + ", firstName=" + firstName + ", lastNameAddress=" + lastNameAddress
                + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
                + country + ", mobile=" + mobile + ", email=" + email + ", currency=" + currency + ", amount=" + amount
                + ", packageType=" + packageType + "]";
    }


}
