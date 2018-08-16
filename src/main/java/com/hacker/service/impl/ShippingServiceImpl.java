package com.hacker.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import com.hacker.common.ServiceResponse;
import com.hacker.dao.ShippingMapper;
import com.hacker.pojo.Shipping;
import com.hacker.service.IShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 这个程序员有纹身 on 12/12/17.
 */
@Service("iShippingService")
public class ShippingServiceImpl implements IShippingService{

    @Autowired
    private ShippingMapper shippingMapper;

    @Override
    public ServiceResponse add(Integer userId, Shipping shipping){
        shipping.setUserId(userId);
        int rowCount =shippingMapper.insert(shipping);
        if(rowCount > 0){
            Map result = Maps.newHashMap();
            result.put("shippingId",shipping.getId());
            return ServiceResponse.createBySuccess("新建地址成功",result);
        }
        return ServiceResponse.createByERRORMessage("新建地址失败");
    }

    @Override
    public ServiceResponse<String> del(Integer userId,Integer shippingId){
        int resultCount = shippingMapper.deleteByShippingIdUserId(userId,shippingId);
        if(resultCount > 0){
            return ServiceResponse.createBySuccess("删除地址成功");
        }
        return ServiceResponse.createByERRORMessage("删除地址失败");
    }

    @Override
    public ServiceResponse update(Integer userId, Shipping shipping){
        shipping.setUserId(userId);
        int rowCount =shippingMapper.updateByShipping(shipping);
        if(rowCount > 0){
            return ServiceResponse.createBySuccess("更新地址成功");
        }
        return ServiceResponse.createByERRORMessage("更新地址失败");
    }

    @Override
    public ServiceResponse<Shipping> select(Integer userId,Integer shippingId){
        Shipping shipping = shippingMapper.selectByShippingIdUserId(userId,shippingId);
        if(shipping == null){
            return ServiceResponse.createByERRORMessage("无法查询到该地址");
        }
        return ServiceResponse.createBySuccess("查询地址成功",shipping);
    }

    @Override
    public ServiceResponse<PageInfo> list(Integer userId,int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Shipping> shippingList = shippingMapper.selectByUserId(userId);
        PageInfo pageInfo = new PageInfo(shippingList);
        return ServiceResponse.createBySuccess(pageInfo);
    }
}
