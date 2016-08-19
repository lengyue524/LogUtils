package com.apkfuns.logutils;


/**
 * Created by pengwei08 on 2015/7/16.
 * 日志管理器
 */
public final class LogUtils {

    private static Logger printer = new Logger();
    private static LogConfigImpl logConfig = LogConfigImpl.getInstance();

    /**
     * 选项配置
     *
     * @return
     */
    public static LogConfig getLogConfig() {
        return logConfig;
    }

    public static Printer tag(String tag) {
        return printer.setTag(tag);
    }

    /**
     * verbose输出
     *
     * @param msg
     * @param args
     */
    public static void v(String msg, Object... args) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.v(msg, args);
    }

    public static void v(Object object) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.v(object);
    }


    /**
     * debug输出
     *
     * @param msg
     * @param args
     */
    public static void d(String msg, Object... args) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.d(msg, args);
    }

    public static void d(Object object) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.d(object);
    }

    /**
     * info输出
     *
     * @param msg
     * @param args
     */
    public static void i(String msg, Object... args) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.i(msg, args);
    }

    public static void i(Object object) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.i(object);
    }

    /**
     * warn输出
     *
     * @param msg
     * @param args
     */
    public static void w(String msg, Object... args) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.w(msg, args);
    }

    public static void w(Object object) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.w(object);
    }

    /**
     * error输出
     *
     * @param msg
     * @param args
     */
    public static void e(String msg, Object... args) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.e(msg, args);
    }

    public static void e(Object object) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.e(object);
    }

    /**
     * assert输出
     *
     * @param msg
     * @param args
     */
    public static void wtf(String msg, Object... args) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.wtf(msg, args);
    }

    public static void wtf(Object object) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.wtf(object);
    }

    /**
     * 打印json
     *
     * @param json
     */
    public static void json(String json) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.json(json);
    }

    /**
     * 输出xml
     *
     * @param xml
     */
    public static void xml(String xml) {
        if (!logConfig.isEnable()) {
            return;
        }
        printer.xml(xml);
    }
}
