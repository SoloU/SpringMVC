package com.sd.dao;

import com.sd.model.Device;
import com.sd.model.Pager;

import java.util.List;

/**
 * Created by Vesper on 2017/9/13.
 */
public interface DeviceDao {
    List<Device> retrive(String brand, String model, String version, String owner, String location);
    void add(Device device);
    Pager<Device> retriveAll();
    Device load(int id);
    void update(Device device);
    void delete(int id);

}
