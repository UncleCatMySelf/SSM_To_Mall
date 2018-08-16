package com.hacker.service;

import com.hacker.common.ServiceResponse;
import com.hacker.pojo.User;

/**
 * Created by 这个程序员有纹身 on 17-12-6.
 */
public interface IUserService {

    ServiceResponse<User> login(String username, String password);

    ServiceResponse<String> register(User user);

    ServiceResponse<String> checkValid(String str,String type);

    ServiceResponse<String> selectQuestion(String username);

    ServiceResponse<String> checkAnswer(String username,String question,String answer);

    ServiceResponse<String> forgetRestPassword(String username,String passwordNew,String forgetToken);

    ServiceResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

    ServiceResponse<User> updateInformation(User user);

    ServiceResponse<User> getInfomation(Integer userId);

    ServiceResponse checkAdminRole(User user);
}
