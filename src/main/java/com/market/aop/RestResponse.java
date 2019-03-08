package com.market.aop;

import java.io.Serializable;

public class RestResponse<T> implements Serializable {

    private static final long serialVersionUID = 4602865333342914455L;

    private String resultCode;
    private String resultMsg;
    private T data;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
