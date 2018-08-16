package com.hacker.service;

import com.github.pagehelper.PageInfo;
import com.hacker.common.ServiceResponse;
import com.hacker.pojo.Shipping;

/**
 * Created by 这个程序员有纹身 on 12/12/17.
 */
public interface IShippingService {

    ServiceResponse add(Integer userId, Shipping shipping);

    ServiceResponse<String> del(Integer userId,Integer shippingId);

    public ServiceResponse update(Integer userId, Shipping shipping);

    ServiceResponse<Shipping> select(Integer userId,Integer shippingId);

    ServiceResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}
