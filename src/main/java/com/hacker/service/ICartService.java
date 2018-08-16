package com.hacker.service;

import com.hacker.common.ServiceResponse;
import com.hacker.vo.CartVo;

/**
 * Created by 这个程序员有纹身 on 12/11/17.
 */
public interface ICartService {

    ServiceResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    ServiceResponse<CartVo> update(Integer userId, Integer productId, Integer count);

    ServiceResponse<CartVo> deleteProduct(Integer userId, String productIds);

    ServiceResponse<CartVo> list(Integer userId);

    ServiceResponse<CartVo> selectOrUnSelect(Integer userId,Integer checked,Integer productId);

    ServiceResponse<Integer> getCartProductCount(Integer userId);

}
