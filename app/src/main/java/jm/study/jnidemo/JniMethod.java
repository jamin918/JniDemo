package jm.study.jnidemo;

/**
 * @author PRDEV
 *         Created on 2018/7/27.
 */

public class JniMethod {

    static {
        System.loadLibrary("JniMethod");
    }

    public static native String getABI();
}
