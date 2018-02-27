package com.sd.controller;

import com.sd.datasource.DataSourceContextHolder;
import com.sd.datasource.DataSourceType;
import com.sd.model.TAppUxinBusiness;
import com.sd.service.TAppUxinBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Vesper on 2018/2/27.
 */

@Controller
public class TAppUxinBusinessController {

    @Autowired
    TAppUxinBusinessService tAppUxinBusinessServiceImpl;

    @RequestMapping(value="/tjDataAdd",method=RequestMethod.GET)
    public String tjPage()
    {
        return "tjDataAdd";
    }

    @RequestMapping(value = "/addTjData", method = RequestMethod.POST)
    public String addTAppUxinBusiness(@ModelAttribute("tAppUxinBusiness") TAppUxinBusiness tAppUxinBusiness, HttpServletRequest request) {
//        tAppUxinBusiness.setBusiness_num(Double.parseDouble("11"));

        DataSourceContextHolder.setDbType(DataSourceType.SOURCE_DATA);
        tAppUxinBusiness.setBiz_type(Integer.parseInt(request.getParameter("biz_Type")));
        tAppUxinBusiness.setPlatform(Integer.parseInt(request.getParameter("platform")));
        this.tAppUxinBusinessServiceImpl.addUxinData(tAppUxinBusiness);
        return "redirect:/tjDataAdd";
    }


}
