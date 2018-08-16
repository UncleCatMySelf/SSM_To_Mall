package com.hacker.service;

import com.hacker.common.ServiceResponse;
import com.hacker.pojo.Category;

import java.util.List;

/**
 * Created by 这个程序员有纹身 on 12/8/17.
 */
public interface ICategoryService {

    ServiceResponse addCategory(String categoryName, Integer parentId);

    ServiceResponse updateCategoryName(Integer categoryId,String categoryName);

    ServiceResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServiceResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
