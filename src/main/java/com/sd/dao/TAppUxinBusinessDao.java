package com.sd.dao;

import com.sd.model.Pager;
import com.sd.model.TAppUxinBusiness;

import java.util.List;

/**
 * Created by Vesper on 2018/2/26.
 */
public interface TAppUxinBusinessDao {
    List<TAppUxinBusiness> retrive(int biz_type, int platform, String business_time, int success_rate);
    void add(TAppUxinBusiness tAppUxinBusiness);
    Pager<TAppUxinBusiness> retriveAll();
    TAppUxinBusiness load(int id);
    void update(TAppUxinBusiness tAppUxinBusiness);
    void delete(int id);
}
