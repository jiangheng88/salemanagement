package cn.qst.sale.entity;

import java.io.Serializable;

public class Commodity implements Serializable {
    private Integer comId;
    private String comName;
    private Double comPrice;
    private String comCoding;
    private String comClass;
    private Integer isdelete;
    private Repertory repertory;
    public Repertory getRepertory() {
        return repertory;
    }
    public void setRepertory(Repertory repertory) {
        this.repertory = repertory;
    }

    private static final long serialVersionUID = 1L;
    public Integer getComId() {
        return comId;
    }
    public void setComId(Integer comId) {
        this.comId = comId;
    }


    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    public Double getComPrice() {
        return comPrice;
    }

    public void setComPrice(Double comPrice) {
        this.comPrice = comPrice;
    }

    public String getComCoding() {
        return comCoding;
    }


    public void setComCoding(String comCoding) {
        this.comCoding = comCoding == null ? null : comCoding.trim();
    }

    public String getComClass() {
        return comClass;
    }

    public void setComClass(String comClass) {
        this.comClass = comClass == null ? null : comClass.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }


    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Commodity() {
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "comId=" + comId +
                ", comName='" + comName + '\'' +
                ", comPrice=" + comPrice +
                ", comCoding='" + comCoding + '\'' +
                ", comClass='" + comClass + '\'' +
                ", isdelete=" + isdelete +
                ", repertory=" + repertory +
                '}';
    }
}