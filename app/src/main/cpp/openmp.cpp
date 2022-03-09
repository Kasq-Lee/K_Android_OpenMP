#include <jni.h>
#include <omp.h>
#include <android/log.h>

#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR,"OpenMP_Test" ,__VA_ARGS__) // 定义LOGE类型

extern "C"
JNIEXPORT void JNICALL
Java_com_kasq_test_openmp_MainActivity_openMp_1HelloWord(JNIEnv *env, jobject thiz) {
#pragma omp parallel
    LOGE("Hello Word");
}