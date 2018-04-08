package com.hongfans.ndkdemo;

/**
 * TODO
 * Created by MEI on 2018/4/8.
 */

public class JNIHelper {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public static native String getString();
}
