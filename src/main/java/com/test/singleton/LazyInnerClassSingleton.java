package com.test.singleton;
//这种方式实现单例方式 其实就是 饿汉式+内部类结合
public class LazyInnerClassSingleton {
    //默认使用 内部类 的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }
    private LazyInnerClassSingleton lazy=null;
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
