package com.sd.service;

import com.sd.model.Pager;
import com.sd.model.TAppUxinBusiness;

import java.util.List;

/**
 * Created by Vesper on 2018/2/26.
 */
public interface TAppUxinBusinessService {

    List<TAppUxinBusiness> retriveUxinData(int biz_type, int platform, String business_time, int success_rate);
    void addUxinData(TAppUxinBusiness tAppUxinBusiness);
    void updateUxinData(TAppUxinBusiness tAppUxinBusiness);
    void deleteUxinData(int id);
    TAppUxinBusiness showUxinData(int id);
    Pager<TAppUxinBusiness> UxinDataList();
}
