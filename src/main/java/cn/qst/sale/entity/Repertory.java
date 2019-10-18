package cn.qst.sale.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Repertory implements Serializable {

    private Integer repId;

    private String repName;
    private String comName;

    private Double comAmount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date inDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date outDate;

    private String supName;

    private Integer isdelete;

    private Supplier supplier;

    private Commodity commodity;

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    private static final long serialVersionUID = 1L;

    public Integer getRepId() {
        return repId;
    }

    public void setRepId(Integer repId) {
        this.repId = repId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    public Double getComAmount() {
        return comAmount;
    }

    public void setComAmount(Double comAmount) {
        this.comAmount = comAmount;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Date getOutDate() {
        return outDate;
    }


    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Repertory() {
    }

    @Override
    public String toString() {
        return "Repertory{" +
                "repId=" + repId +
                ", repName='" + repName + '\'' +
                ", comName='" + comName + '\'' +
                ", comAmount=" + comAmount +
                ", inDate=" + inDate +
                ", outDate=" + outDate +
                ", supName='" + supName + '\'' +
                ", isdelete=" + isdelete +
                ", supplier=" + supplier +
                ", commodity=" + commodity +
                '}';
    }
}