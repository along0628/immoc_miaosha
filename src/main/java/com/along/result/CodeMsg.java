package com.along.result;

/**
 * TODO：
 *      Result Class for util class.
 * @author wangalong
 * @version：1.0
 * @date 2021/4/11 12:12
 */
public class CodeMsg {
    private int code;
    private String msg;

    // common exception 5001xx
    public static CodeMsg SUCCESS = new CodeMsg(0, "SUCCESS");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "SERVER Exception");

    // login exception 5002xx

    // goods exception 5003xx

    // order exception 5004xx

    // miaosha exception 5005xx

    // wait add more error types...

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
