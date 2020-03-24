package com.yapt.demo.command;


/**
 * @author hurui
 * @version Id: FtpService.java, v 0.1 2020/3/21 15:32 YaphetS Exp $$
 */
public class FtpService {

    public void open(){
        System.out.println("打开Ftp服务器");
    }

    public void login(){
        System.out.println("登录Ftp服务器");
    }

    public void upload(){
        System.out.println("上传文件");
    }

    public void pause(){
        System.out.println("暂停文件上传");
    }

    public void resume(){
        System.out.println("继续上传文件");
    }

    public void cancel(){
        System.out.println("取消文件上传");
    }

    public void download(){
        System.out.println("下载文件");
    }

    public void exit(){
        System.out.println("退出Ftp服务器");
    }
}