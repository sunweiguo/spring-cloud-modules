package com.swg.springcloudeureka.service;

import java.util.concurrent.ExecutionException;

/**
 * @Author 【swg】.
 * @Date 2018/11/27 15:29
 * @DESC
 * @CONTACT 317758022@qq.com
 */
public interface IHelloServie {
    public String hiService(String name) throws ExecutionException, InterruptedException;
}
