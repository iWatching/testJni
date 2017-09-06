//
// Created by xiaoyongbing on 2017/9/6.
//
//自己创建一个c文件，实现自己定义的native方法，也就是.h文件中的方法
//引入自己生成的.h头文件
#include <com_hdos_rsyygh_testjni_TestNdk.h>

//返回一个字符串
JNIEXPORT jstring JNICALL Java_com_hdos_rsyygh_testjni_TestNdk_helloWord
  (JNIEnv *env, jclass jobj) {
    return (*env)->NewStringUTF(env,"HelloWorld 我是用jni调用出来的字符串");
}
//返回 a+b的结果
JNIEXPORT jint JNICALL Java_com_hdos_rsyygh_testjni_TestNdk_add
  (JNIEnv *env, jclass jobj, jint a, jint b){
  return a+b;
}
