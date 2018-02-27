package com.sd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Vesper on 2017/9/12.
 */

@Entity
@Table(name="device")
public class Device {


    private int id;
    private String brand;
    private String model;
    private String dpi;
    private String RAM;
    private String CPU;
    private String version;
    private String owner;
    private String date;
    private String department;
    private String location;
    private String note;

    public Device() {
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", dpi='" + dpi + '\'' +
                ", RAM='" + RAM + '\'' +
                ", CPU='" + CPU + '\'' +
                ", version='" + version + '\'' +
                ", owner='" + owner + '\'' +
                ", date=" + date +
                ", department='" + department + '\'' +
                ", location='" + location + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

//        if (getId() != null ? !getId().equals(device.getId()) : device.getId() != null) return false;
        if (getBrand() != null ? !getBrand().equals(device.getBrand()) : device.getBrand() != null) return false;
        if (getModel() != null ? !getModel().equals(device.getModel()) : device.getModel() != null) return false;
        if (getDpi() != null ? !getDpi().equals(device.getDpi()) : device.getDpi() != null) return false;
        if (getRAM() != null ? !getRAM().equals(device.getRAM()) : device.getRAM() != null) return false;
        if (getCPU() != null ? !getCPU().equals(device.getCPU()) : device.getCPU() != null) return false;
        if (getVersion() != null ? !getVersion().equals(device.getVersion()) : device.getVersion() != null)
            return false;
        if (getOwner() != null ? !getOwner().equals(device.getOwner()) : device.getOwner() != null) return false;
        if (getDate() != null ? !getDate().equals(device.getDate()) : device.getDate() != null) return false;
        if (getDepartment() != null ? !getDepartment().equals(device.getDepartment()) : device.getDepartment() != null)
            return false;
        if (getLocation() != null ? !getLocation().equals(device.getLocation()) : device.getLocation() != null)
            return false;
        return getNote() != null ? getNote().equals(device.getNote()) : device.getNote() == null;
    }

    @Override
    public int hashCode() {
        int result = 0;//= getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getBrand() != null ? getBrand().hashCode() : 0);
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + (getDpi() != null ? getDpi().hashCode() : 0);
        result = 31 * result + (getRAM() != null ? getRAM().hashCode() : 0);
        result = 31 * result + (getCPU() != null ? getCPU().hashCode() : 0);
        result = 31 * result + (getVersion() != null ? getVersion().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getDepartment() != null ? getDepartment().hashCode() : 0);
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        result = 31 * result + (getNote() != null ? getNote().hashCode() : 0);
        return result;
    }
}
