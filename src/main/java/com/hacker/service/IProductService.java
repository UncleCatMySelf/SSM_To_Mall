package com.hacker.service;

import com.github.pagehelper.PageInfo;
import com.hacker.common.ServiceResponse;
import com.hacker.pojo.Product;
import com.hacker.vo.ProductDetailVo;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by 这个程序员有纹身 on 12/9/17.
 */
public interface IProductService {
    ServiceResponse saveOrUpdateProduct(Product product);

    ServiceResponse<java.lang.String> setSaleStatus(Integer productId, Integer status);

    ServiceResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServiceResponse<PageInfo> getProductList(int pageNum, int pageSize);

    ServiceResponse<PageInfo> searchProduct(java.lang.String productName, Integer productId, int pageNum, int pageSize);

    ServiceResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServiceResponse<PageInfo> getProductByKeywordCategory(java.lang.String keyword, Integer categoryId, int pageNum, int pageSize, java.lang.String orderBy);
}
