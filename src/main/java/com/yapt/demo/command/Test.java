package com.yapt.demo.command;

import com.yapt.demo.command.orders.*;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/21 15:45 YaphetS Exp $$
 */
public class Test {

    public static void main(String[] args) {
        FtpService ftp = new FtpService();
        Controller controller = new Controller();
        controller.addOrder(new OpenOrder(ftp));
        controller.addOrder(new LoginOrder(ftp));
        controller.addOrder(new UploadOrder(ftp));
        controller.addOrder(new PauseOrder(ftp));
        controller.addOrder(new ResumeOrder(ftp));
        controller.addOrder(new CancelOrder(ftp));
        controller.addOrder(new ExitOrder(ftp));
        controller.execute();
    }
}