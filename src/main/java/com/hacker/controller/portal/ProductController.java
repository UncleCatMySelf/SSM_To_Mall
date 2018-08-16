package com.hacker.controller.portal;

import com.github.pagehelper.PageInfo;
import com.hacker.common.ServiceResponse;
import com.hacker.service.IProductService;
import com.hacker.vo.ProductDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 这个程序员有纹身 on 12/9/17.
 */
@Controller
@RequestMapping("/product/")
public class ProductController {

    @Autowired
    private IProductService iProductService;


    @RequestMapping("detail.do")
    @ResponseBody
    public ServiceResponse<ProductDetailVo> detail(Integer productId){
        return iProductService.getProductDetail(productId);
    }

    @RequestMapping("list.do")
    @ResponseBody
    public  ServiceResponse<PageInfo> list(@RequestParam(value = "keyword",required = false)String keyword,
                                           @RequestParam(value = "categoryId",required = false)Integer categoryId,
                                           @RequestParam(value = "pageNum",defaultValue = "1")int pageNum,
                                           @RequestParam(value = "pageSize",defaultValue = "10")int pageSize,
                                           @RequestParam(value = "orderBy",defaultValue = "")String orderBy){
        return iProductService.getProductByKeywordCategory(keyword,categoryId,pageNum,pageSize,orderBy);
    }
}
