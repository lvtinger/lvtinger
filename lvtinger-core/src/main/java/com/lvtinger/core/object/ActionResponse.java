package com.lvtinger.core.object;

import java.io.Serializable;


/**
 * @author qiuxu
 */
public class ActionResponse<T> implements Serializable {
    private static final long serialVersionUID = -2943336617576614127L;

    private int code;
    private boolean success;
    private T content;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}