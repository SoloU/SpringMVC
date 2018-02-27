package com.sd.daoImpl;

import com.sd.dao.DeviceDao;
import com.sd.model.Device;
import com.sd.model.PageConstants;
import com.sd.model.Pager;
import org.hibernate.Query;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vesper on 2017/9/13.
 */

@Repository("deviceDaolImpl")
public class DeviceDaoImpl implements DeviceDao {

    @Resource
    HibernateTemplate hibernateTemplate;

    @Override
    public List<Device> retrive(String brand, String model, String version, String owner, String location) {
        List<Device> device = new ArrayList<Device>();

        device = (List<Device>) hibernateTemplate.find("from Device as d where d.brand = '" + brand + "' or d.model = '" + model +"' or d.version = '" + version + "' or d.owner = '" + owner + "' or d.location = '" + location + "'");

        if((device.size() > 0) && (device != null))
            return device;
        return Collections.emptyList();
    }

    @Override
    public void add(Device device) {
        hibernateTemplate.save(device);
    }

    @Override
    public Pager<Device> retriveAll() {
        Pager<Device> pager = new Pager<Device>();
        int size = PageConstants.getSize();
        int offset = PageConstants.getOffset();
        long total = (long)this.hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("select count(*) from Device").uniqueResult();
        Query query = this.hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("from Device");
        query.setFirstResult(offset).setMaxResults(size);
        List<Device> devices = query.list();
        pager.setDatas(devices);
        pager.setOffset(offset);
        pager.setSize(size);
        pager.setTotal(total);

        return pager;
    }

    @Override
    public Device load(int id) {
        return hibernateTemplate.load(Device.class, id);
    }

    @Override
    public void update(Device device) {
        hibernateTemplate.update(device);
    }

    @Override
    public void delete(int id) {
        Device device = this.load(id);
        hibernateTemplate.delete(device);
    }
}
