package com.netsdk.test;

import com.netsdk.common.Res;
import com.netsdk.demo.module.LoginModule;
import com.netsdk.demo.module.PtzControlModule;
import com.netsdk.lib.NetSDKLib;

import javax.swing.*;
import java.util.Vector;

//import com.netsdk.demo.frame.PTZControlFrame;

/**
 * @Author: Jack_yang
 * @Date: 2019/6/1 16:28
 */
public class MoveTest {

    public static NetSDKLib netsdk 		= NetSDKLib.NETSDK_INSTANCE;
    // 设备断线通知回调
    private static DisConnect disConnect       = new DisConnect();
    private static HaveReConnect haveReConnect = new HaveReConnect();

    public void ptzControlRightEnd(){
        LoginModule.init(disConnect, haveReConnect);
        if(LoginModule.login("172.18.19.223",80,"admin","admin123")){
            PtzControlModule.ptzControlRightDownStart(0,4,4);
            try{
                Thread.sleep(500);
            }catch (Exception e){
            }
            PtzControlModule.ptzControlRightDownEnd(0);
        }
    }

    public static void main(String[] args){
        MoveTest test = new MoveTest();
        test.ptzControlRightEnd();
    }
}
