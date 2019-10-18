package cn.qst.sale.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Sell implements Serializable {

    private Integer sellId;

    private String clientName;

    private String sellName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sellDate;

    private Double sellNumber;

    private Double receiptMoney;

    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getSellId() {
        return sellId;
    }

    public void setSellId(Integer sellId) {
        this.sellId = sellId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getSellName() {
        return sellName;
    }

    public void setSellName(String sellName) {
        this.sellName = sellName == null ? null : sellName.trim();
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    public Double getSellNumber() {
        return sellNumber;
    }

    public void setSellNumber(Double sellNumber) {
        this.sellNumber = sellNumber;
    }

    public Double getReceiptMoney() {
        return receiptMoney;
    }

    public void setReceiptMoney(Double receiptMoney) {
        this.receiptMoney = receiptMoney;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sellId=").append(sellId);
        sb.append(", clientName=").append(clientName);
        sb.append(", sellName=").append(sellName);
        sb.append(", sellDate=").append(sellDate);
        sb.append(", sellNumber=").append(sellNumber);
        sb.append(", receiptMoney=").append(receiptMoney);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}