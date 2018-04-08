#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_hongfans_ndkdemo_JNIHelper_stringFromJNI(JNIEnv *env, jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

// 在C语言中，修饰符extern用在变量或者函数的声明前，用来说明“此变量/函数是在别处定义的，要在此处引用”。
extern "C"
JNIEXPORT jstring JNICALL
Java_com_hongfans_ndkdemo_JNIHelper_getString(JNIEnv *env, jobject) {
    std::string hello = "keep on";
    return env->NewStringUTF(hello.c_str());
}


