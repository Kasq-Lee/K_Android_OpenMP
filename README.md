# OpenMP For Android

## 导入 OpenMP
本项目使用  
Android Studio Bumblebee 2011  
NDK-r23e  
JDK11

1. 在 CMakeLists.txt 添加：
   ```
   target_link_libraries( 
        ...
        -static-openmp
        -fopenmp
        ...     
        )
   ```
2. build.gradle 添加：
   ```
   android {
    ...
    defaultConfig {
        ...
        externalNativeBuild {
            cmake {
                ...         
                cppFlags "-fopenmp"
                cFlags "-fopenmp"
            }
        }
    }
   ```

## API 测试
### 代码第一步 HelloWord
```
#pragma omp parallel
    LOGE("Hello Word");
```
得到结果：  
![WX20220308-174148@2x_1](images/WX20220308-174148%402x_1.png)

parallel 会使得并行块里面的内容在多个线程内执行，所以会执行多次。

### 指定执行线程
