package com.sd.service;

import com.sd.model.Device;
import com.sd.model.Pager;

import java.util.List;

/**
 * Created by Vesper on 2017/9/13.
 */
public interface DeviceService {

    List<Device> retriveDevice(String brand, String model, String version, String owner, String location);
    void addDevice(Device device);
    void updateDevice(Device device);
    void deleteDevice(int id);
    Device showDevice(int id);
    Pager<Device> deviceList();
}
