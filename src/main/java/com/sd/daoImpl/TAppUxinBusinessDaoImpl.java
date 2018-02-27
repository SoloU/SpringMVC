package com.sd.daoImpl;

import com.sd.dao.TAppUxinBusinessDao;
import com.sd.model.PageConstants;
import com.sd.model.Pager;
import com.sd.model.TAppUxinBusiness;
import org.hibernate.Query;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vesper on 2018/2/26.
 */

@Repository("tAppUxinBusinessDaoImpl")
public class TAppUxinBusinessDaoImpl implements TAppUxinBusinessDao {

    @Resource
    HibernateTemplate hibernateTemplate;

    @Override
    public List<TAppUxinBusiness> retrive(int biz_type, int platform, String business_time, int success_rate) {
        List<TAppUxinBusiness> tAppUxinBusiness = new ArrayList<TAppUxinBusiness>();

        tAppUxinBusiness = (List<TAppUxinBusiness>) hibernateTemplate.find("from TAppUxinBusiness as d where d.biz_type = " + biz_type + " or d.platform = " + platform + " or d.business_time = '" + business_time + "' or d.success_rate = " + success_rate);

        if ((tAppUxinBusiness.size() > 0) && (tAppUxinBusiness != null))
            return tAppUxinBusiness;
        return Collections.emptyList();
    }

    @Override
    public void add(TAppUxinBusiness tAppUxinBusiness) {
        hibernateTemplate.save(tAppUxinBusiness);
    }

    @Override
    public Pager<TAppUxinBusiness> retriveAll() {
        Pager<TAppUxinBusiness> pager = new Pager<TAppUxinBusiness>();
        int size = PageConstants.getSize();
        int offset = PageConstants.getOffset();
        long total = (long)this.hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("select count(*) from TAppUxinBusiness").uniqueResult();
        Query query = this.hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("from TAppUxinBusiness");
        query.setFirstResult(offset).setMaxResults(size);
        List<TAppUxinBusiness> tAppUxinBusinesses = query.list();
        pager.setDatas(tAppUxinBusinesses);
        pager.setOffset(offset);
        pager.setSize(size);
        pager.setTotal(total);

        return pager;
    }

    @Override
    public TAppUxinBusiness load(int id) {
        return hibernateTemplate.load(TAppUxinBusiness.class, id);
    }

    @Override
    public void update(TAppUxinBusiness tAppUxinBusiness) {
        hibernateTemplate.update(tAppUxinBusiness);
    }

    @Override
    public void delete(int id) {
        TAppUxinBusiness tAppUxinBusiness = this.load(id);
        hibernateTemplate.delete(tAppUxinBusiness);
    }
}
