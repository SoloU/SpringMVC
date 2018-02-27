package com.sd.datasource;

/**
 * Created by Vesper on 2018/2/26.
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDbType(String dbType) {
        System.out.println(Thread.currentThread());
        contextHolder.set(dbType);
    }

    public static String getDbType() {
        System.out.println(Thread.currentThread());
        return ((String) contextHolder.get());
    }

    public static void clearDbType() {
        contextHolder.remove();
    }
}
