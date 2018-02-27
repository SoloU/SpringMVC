package com.sd.model;

import javax.persistence.*;

/**
 * Created by Vesper on 2018/2/26.
 */

@Entity
@Table(name="t_app_uxin_business")
public class TAppUxinBusiness {
    private int id;
    private int biz_type;
    @Column(name="platform",columnDefinition="bit default 0 ",nullable=true)
    private int platform;
    @Column(name="version_code",columnDefinition="bit default 0 ",nullable=true)
    private String version_code;
    @Column(name="business_num",columnDefinition="bit default 0 ",nullable=true)
    private double business_num;
    @Column(name="week_num",columnDefinition="bit default 0 ",nullable=true)
    private int week_num;
    @Column(name="new_add",columnDefinition="bit default 0 ",nullable=true)
    private int new_add;
    @Column(name="fix_num",columnDefinition="bit default 0 ",nullable=true)
    private int fix_num;
    @Column(name="p1_num",columnDefinition="bit default 0 ",nullable=true)
    private int p1_num;
    @Column(name="p2_num",columnDefinition="bit default 0 ",nullable=true)
    private int p2_num ;
    @Column(name="business_time",columnDefinition="bit default 0 ",nullable=true)
    private String business_time;
    @Column(name="success_rate",columnDefinition="bit default 0 ",nullable=true)
    private int success_rate;
    @Column(name="create_time",columnDefinition="bit default 0 ",nullable=true)
    private String create_time;
    @Column(name="update_time",columnDefinition="bit default 0 ",nullable=true)
    private int update_time;

    public TAppUxinBusiness() {
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBiz_type() {
        return biz_type;
    }

    public void setBiz_type(int biz_type) {
        this.biz_type = biz_type;
    }

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public String getVersion_code() {
        return version_code;
    }

    public void setVersion_code(String version_code) {
        this.version_code = version_code;
    }

    public double getBusiness_num() {
        return business_num;
    }

    public void setBusiness_num(double business_num) {
        this.business_num = business_num;
    }

    public int getWeek_num() {
        return week_num;
    }

    public void setWeek_num(int week_num) {
        this.week_num = week_num;
    }

    public int getNew_add() {
        return new_add;
    }

    public void setNew_add(int new_add) {
        this.new_add = new_add;
    }

    public int getFix_num() {
        return fix_num;
    }

    public void setFix_num(int fix_num) {
        this.fix_num = fix_num;
    }

    public int getP1_num() {
        return p1_num;
    }

    public void setP1_num(int p1_num) {
        this.p1_num = p1_num;
    }

    public int getP2_num() {
        return p2_num;
    }

    public void setP2_num(int p2_num) {
        this.p2_num = p2_num;
    }

    public String getBusiness_time() {
        return business_time;
    }

    public void setBusiness_time(String business_time) {
        this.business_time = business_time;
    }

    public int getSuccess_rate() {
        return success_rate;
    }

    public void setSuccess_rate(int success_rate) {
        this.success_rate = success_rate;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(int update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "TAppUxinBusiness{" +
                "id=" + id +
                ", biz_type=" + biz_type +
                ", platform=" + platform +
                ", version_code='" + version_code + '\'' +
                ", business_num=" + business_num +
                ", week_num=" + week_num +
                ", new_add=" + new_add +
                ", fix_num=" + fix_num +
                ", p1_num=" + p1_num +
                ", p2_num=" + p2_num +
                ", business_time='" + business_time + '\'' +
                ", success_rate=" + success_rate +
                ", create_time='" + create_time + '\'' +
                ", update_time=" + update_time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TAppUxinBusiness)) return false;

        TAppUxinBusiness TAppUxinBusiness = (com.sd.model.TAppUxinBusiness) o;

        if (getId() != TAppUxinBusiness.getId()) return false;
        if (getBiz_type() != TAppUxinBusiness.getBiz_type()) return false;
        if (getPlatform() != TAppUxinBusiness.getPlatform()) return false;
        if (Double.compare(TAppUxinBusiness.getBusiness_num(), getBusiness_num()) != 0) return false;
        if (getWeek_num() != TAppUxinBusiness.getWeek_num()) return false;
        if (getNew_add() != TAppUxinBusiness.getNew_add()) return false;
        if (getFix_num() != TAppUxinBusiness.getFix_num()) return false;
        if (getP1_num() != TAppUxinBusiness.getP1_num()) return false;
        if (getP2_num() != TAppUxinBusiness.getP2_num()) return false;
        if (getSuccess_rate() != TAppUxinBusiness.getSuccess_rate()) return false;
        if (getUpdate_time() != TAppUxinBusiness.getUpdate_time()) return false;
        if (getVersion_code() != null ? !getVersion_code().equals(TAppUxinBusiness.getVersion_code()) : TAppUxinBusiness.getVersion_code() != null)
            return false;
        if (getBusiness_time() != null ? !getBusiness_time().equals(TAppUxinBusiness.getBusiness_time()) : TAppUxinBusiness.getBusiness_time() != null)
            return false;
        return getCreate_time() != null ? getCreate_time().equals(TAppUxinBusiness.getCreate_time()) : TAppUxinBusiness.getCreate_time() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + getBiz_type();
        result = 31 * result + getPlatform();
        result = 31 * result + (getVersion_code() != null ? getVersion_code().hashCode() : 0);
        temp = Double.doubleToLongBits(getBusiness_num());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getWeek_num();
        result = 31 * result + getNew_add();
        result = 31 * result + getFix_num();
        result = 31 * result + getP1_num();
        result = 31 * result + getP2_num();
        result = 31 * result + (getBusiness_time() != null ? getBusiness_time().hashCode() : 0);
        result = 31 * result + getSuccess_rate();
        result = 31 * result + (getCreate_time() != null ? getCreate_time().hashCode() : 0);
        result = 31 * result + getUpdate_time();
        return result;
    }
}
