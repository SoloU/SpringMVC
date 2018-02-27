package com.sd.serviceImpl;

import com.sd.dao.TAppUxinBusinessDao;
import com.sd.datasource.DataSourceContextHolder;
import com.sd.datasource.DataSourceType;
import com.sd.model.Pager;
import com.sd.model.TAppUxinBusiness;
import com.sd.service.TAppUxinBusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vesper on 2018/2/26.
 */

@Service("tAppUxinBusinessServiceImpl")
public class TAppUxinBusinessServiceImpl implements TAppUxinBusinessService {

    @Resource
    TAppUxinBusinessDao tAppUxinBusinessDaoImpl;
    HttpSession session;
    HttpServletRequest request;


    @Override
    public List<TAppUxinBusiness> retriveUxinData(int biz_type, int platform, String business_time, int success_rate) {
        DataSourceContextHolder.setDbType(DataSourceType.SOURCE_DATA);
        List<TAppUxinBusiness> list = new ArrayList<TAppUxinBusiness>();

        list = this.tAppUxinBusinessDaoImpl.retrive(biz_type, platform, business_time, success_rate);
        if((list.size() > 0) && (list != null))
            return list;
        return Collections.emptyList();
    }

    @Override
    public void addUxinData(TAppUxinBusiness tAppUxinBusiness) {
        DataSourceContextHolder.setDbType(DataSourceType.SOURCE_DATA);
        this.tAppUxinBusinessDaoImpl.add(tAppUxinBusiness);
    }

    @Override
    public void updateUxinData(TAppUxinBusiness tAppUxinBusiness) {
        DataSourceContextHolder.setDbType(DataSourceType.SOURCE_DATA);
        this.tAppUxinBusinessDaoImpl.update(tAppUxinBusiness);
    }

    @Override
    public void deleteUxinData(int id) {
        DataSourceContextHolder.setDbType(DataSourceType.SOURCE_DATA);
        this.tAppUxinBusinessDaoImpl.delete(id);
    }

    @Override
    public TAppUxinBusiness showUxinData(int id) {
        DataSourceContextHolder.setDbType(DataSourceType.SOURCE_DATA);
        return this.tAppUxinBusinessDaoImpl.load(id);
    }

    @Override
    public Pager<TAppUxinBusiness> UxinDataList() {
        DataSourceContextHolder.setDbType(DataSourceType.SOURCE_DATA);
        return this.tAppUxinBusinessDaoImpl.retriveAll();
    }
}
