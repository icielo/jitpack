package com.ptyx;

import io.xjar.boot.XBoot;

/**
 * @Author: lincl
 * @Date: 2019/4/1 9:54
 */
public class EncryptJar {
    public static void main(String[] args) throws Exception {
        String password = "io.xjar";
//        XBoot.encrypt("F:\\idea\\gpo\\out\\artifacts\\gpo_jar\\gpo.jar", "F:\\idea\\gpo\\out\\artifacts\\gpo_jar\\gpo2.jar", password);
//        XBoot.encrypt("F:\\gpo.jar", "F:\\gpo2.jar", password);
        XBoot.encrypt("F:\\gitee\\jitpack\\target\\jitpack-1.0-SNAPSHOT.jar", "F:\\gitee\\jitpack\\target\\jitpack-1.0-SNAPSHOT2.jar", password);

    }
}
