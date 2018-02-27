package com.sd.controller;

import com.sd.model.Device;
import com.sd.service.DeviceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Vesper on 2017/9/13.
 */

@Controller
public class DeviceController {
    @Resource
    DeviceService deviceServiceImpl;

    @RequestMapping(value = "/showDevice/{id}", method = RequestMethod.GET)
    public String showDevice(@PathVariable int id, Model model) {
        Device device = this.deviceServiceImpl.showDevice(id);
        model.addAttribute(device);
        return "showDevice";
    }

    @RequestMapping(value="/addDevice",method=RequestMethod.GET)
    public String userAdd()
    {
        return "addDevice";
    }


    @RequestMapping(value = "/addDevice", method = RequestMethod.POST)
    public String addDevice(@ModelAttribute("device") Device device) {
        this.deviceServiceImpl.addDevice(device);
        return "redirect:/deviceManage";
    }

    @RequestMapping(value = "/updateDevice/{id}", method = RequestMethod.GET)
    public String updateDevice(@PathVariable int id, Model model) {
        Device device = this.deviceServiceImpl.showDevice(id);
        model.addAttribute(device);
        return "updateDevice";
    }

    @RequestMapping(value = "/updateDevice", method = RequestMethod.POST)
    public String updateDevice(@ModelAttribute("device")Device device, HttpServletRequest request) {
        System.out.println(request.getCharacterEncoding());

        this.deviceServiceImpl.updateDevice(device);

        return "redirect:/updateDevice/" + device.getId();
    }

    @RequestMapping(value = "/updateDevice123")
    public String updateDevice123(Device device) {

        this.deviceServiceImpl.updateDevice(device);

        return "redirect:/updateDevice/" + device.getId();
    }

    @RequestMapping(value = "/delDevice/{id}", method = RequestMethod.GET)
    public String delDevice(@PathVariable int id) {
        this.deviceServiceImpl.deleteDevice(id);
        return "redirect:/deviceManage";
    }

    @RequestMapping(value = "/deviceManage", method = RequestMethod.GET)
    public String deviceManage(Model model) {
        model.addAttribute("pagers", this.deviceServiceImpl.deviceList());
        return "deviceManage";
    }


}
