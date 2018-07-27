# JniDemo
A simple example of calling native methods via jni on the android platform.


## 实现过程：

  #### 1、创建一个Android工程：取名为JniDemo，新建一个 Java 文件，在该文件中加载 JNI 的库和定义需要通过 native 实现的方法，如：
  ```
  public class JniMethod {

    static {
        System.loadLibrary("JniMethod");
    }

    public static native String getABI();
}
  ```
 #### 2、进入到 JniMethod 所在的目录，使用 javac 命令编译该类，得到该类的 .class 文件，因为后面需要通过该 .class 文件生成 .h 头文件。
  
 #### 3、在项目src/java/目录下，使用 javah 命令生成与 JniMethod.class 文件相对应的 .h 头文件。
  
 #### 4、为了方便，新建一个 jni 目录，保存所有与 JNI 相关的文件。将刚刚生成的 JniMethod.h 移到该目录中，然后创建一个 JniMethod.c 的文件实现定义在 JniMethod.h 头文件中的方法。
  
 #### 5、在jni目录下创建 Android.mk 和 application.mk 文件。
  
 #### 6、在jni目录下运行 ndk-build 命令（如果提示找不到命令，需要先下载ndk，然后配置好环境变量），得到动态库 .so 文件。
  
 #### 7、创建jniLibs文件夹，将生成的.so文件复制到这个目录下。
  
