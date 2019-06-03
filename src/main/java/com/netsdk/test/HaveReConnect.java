package com.netsdk.test;

import com.netsdk.lib.NetSDKLib;
import com.sun.jna.Pointer;

/**
 * @Author: Jack_yang
 * @Date: 2019/6/3 15:44
 */
public class HaveReConnect implements NetSDKLib.fHaveReConnect {
    @Override
    public void invoke(NetSDKLib.LLong lLoginID, String pchDVRIP, int nDVRPort, Pointer dwUser) {

    }
}
