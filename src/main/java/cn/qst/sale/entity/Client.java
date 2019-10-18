package cn.qst.sale.entity;

import java.io.Serializable;

public class Client implements Serializable {

    private Integer clientId;
    private String clientName;
    private String clientCompany;
    private String clientAddress;
    private String clientIntroduce;
    private String clientEmail;
    private String clientPhone;
    private String clientRecord;
    private String clientAppraise;
    private String clientImg;
    private Integer isdelete;
    private Sell sell;

    public String getClientIntroduce() {
        return clientIntroduce;
    }

    public void setClientIntroduce(String clientIntroduce) {
        this.clientIntroduce = clientIntroduce;
    }

    public String getClientImg() {
        return clientImg;
    }

    public void setClientImg(String clientImg) {
        this.clientImg = clientImg;
    }

    private static final long serialVersionUID = 1L;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getClientCompany() {
        return clientCompany;
    }

    public void setClientCompany(String clientCompany) {
        this.clientCompany = clientCompany;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress == null ? null : clientAddress.trim();
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone == null ? null : clientPhone.trim();
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientRecord() {
        return clientRecord;
    }


    public void setClientRecord(String clientRecord) {
        this.clientRecord = clientRecord == null ? null : clientRecord.trim();
    }

    public String getClientAppraise() {
        return clientAppraise;
    }


    public void setClientAppraise(String clientAppraise) {
        this.clientAppraise = clientAppraise == null ? null : clientAppraise.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }


    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Sell getSell() {
        return sell;
    }

    public void setSell(Sell sell) {
        this.sell = sell;
    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", clientCompany='" + clientCompany + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientIntroduce='" + clientIntroduce + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientRecord='" + clientRecord + '\'' +
                ", clientAppraise='" + clientAppraise + '\'' +
                ", clientImg='" + clientImg + '\'' +
                ", isdelete=" + isdelete +
                ", sell=" + sell +
                '}';
    }
}