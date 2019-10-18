package cn.qst.sale.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Purchase implements Serializable {

    private Integer purId;

    private String supName;

    private String comName;
    private Integer purNum;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date purDate;

    private Double payMoney;

    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getPurId() {
        return purId;
    }

    public void setPurId(Integer purId) {
        this.purId = purId;
    }

    public String getSupName() {
        return supName;
    }


    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    public Date getPurDate() {
        return purDate;
    }

    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getPurNum() {
        return purNum;
    }

    public void setPurNum(Integer purNum) {
        this.purNum = purNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", purId=").append(purId);
        sb.append(", supName=").append(supName);
        sb.append(", comName=").append(comName);
        sb.append(", purDate=").append(purDate);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}