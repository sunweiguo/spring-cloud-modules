package com.swg.springcloudeureka.controller;

import com.swg.springcloudeureka.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 【swg】.
 * @Date 2018/11/27 15:25
 * @DESC
 * @CONTACT 317758022@qq.com
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("test")
    public String test(){
        return "hi ,you are from " + port;
    }

    @RequestMapping("hello")
    public String hello(@RequestParam("name")String name) throws InterruptedException {
        System.out.println("方法开始执行。。。");
        Thread.sleep(800);
        System.out.println("方法执行结束。。。");
        return "hi "+ name +",you are from " + port;
    }

    @RequestMapping("/getbooks")
    public List<Book> book6(String ids) {
        System.out.println("ids>>>>>>>>>>>>>>>>>>>>>" + ids);
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("《李自成》", 55));
        books.add(new Book("中国文学简史", 33));
        books.add(new Book("文学改良刍议", 33));
        books.add(new Book("ids", 22));
        return books;
    }

    @RequestMapping("/getbook/{id}")
    public Book book61(@PathVariable Integer id) {
        Book book = new Book("《李自成》2", 55);
        return book;
    }

}
