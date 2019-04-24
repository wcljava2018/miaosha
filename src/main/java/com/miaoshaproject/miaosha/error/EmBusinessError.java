package com.miaoshaproject.miaosha.error;

public enum EmBusinessError implements CommonError {
    //通用的错误类型00001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOW_ERROR(10002,"未知错误"),

    //全局需要统一的状态码扭转
    //10000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001, "用户不存在")//错误码
    ;

    private int errCode;
    private String errMsg;

    private EmBusinessError(int errCode, String errMsg){
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}