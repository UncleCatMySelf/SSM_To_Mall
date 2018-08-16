package com.hacker.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 这个程序员有纹身 on 12/9/17.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
