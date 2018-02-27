package com.sd.serviceImpl;

import com.sd.dao.DeviceDao;
import com.sd.model.Device;
import com.sd.model.Pager;
import com.sd.service.DeviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vesper on 2017/9/13.
 */

@Service("deviceServiceImpl")
public class DeviceServiceImpl implements DeviceService {

    @Resource
    DeviceDao deviceDaoImpl;
    HttpSession session;
    HttpServletRequest request;

    @Override
    public List<Device> retriveDevice(String brand, String model, String version, String owner, String location) {
        List<Device> list = new ArrayList<Device>();

        list = this.deviceDaoImpl.retrive(brand, model, version, owner, location);
        if((list.size() > 0) && (list != null))
            return list;
        return Collections.emptyList();
    }

    @Override
    public void addDevice(Device device) {
        this.deviceDaoImpl.add(device);
    }

    @Override
    public void updateDevice(Device device) {
        this.deviceDaoImpl.update(device);
    }

    @Override
    public void deleteDevice(int id) {
        this.deviceDaoImpl.delete(id);
    }

    @Override
    public Device showDevice(int id) {
        return this.deviceDaoImpl.load(id);
    }

    @Override
    public Pager<Device> deviceList() {
        return this.deviceDaoImpl.retriveAll();
    }
}
