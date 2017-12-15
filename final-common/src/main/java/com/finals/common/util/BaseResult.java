package com.finals.common.util;
/**
 * 返回结果集封装类，转成的json格式为：
 * <pre>
 * 成功：{"code":0,"message":"message","data":?}
 * 失败：{"code":1,"message":"fail message","data":?}
 * 0表示成功，1为通用失败代码，表示失败，也可以指定到具体失败代码。
 * </pre>
 * @author zhangqp
 * @version 1.0, 2017年3月9日
 */
public class BaseResult<T> {
    private int code = 0; // 0 成功，其他失败
    private String message; // 携带的说明信息
    private T data; // 返回数据
    
    /**
     * 成功（成功代码为0）
     * @param message
     * @return
     */
    public static BaseResult<Object> success() {
        return new BaseResult<Object>();
    }
    
    /**
     * 成功信息（成功代码为0）
     * @param message
     * @return
     */
    public static BaseResult<Object> success(String message) {
        return new BaseResult<Object>(0, message, null);
    }
    
//    /**
//     * 返回数据（成功代码为0）
//     * @param data
//     * @return
//     */
//    public static BaseResult<Object> success(Object data) {
//        return new BaseResult<Object>(0, null, data);
//    }
    
    /**
     * 成功信息、返回数据（成功代码为0）
     * @param message
     * @param data
     * @return
     */
    public static BaseResult<Object> success(String message, Object data) {
        return new BaseResult<Object>(0, message, data);
    }
    
    /**
     * 失败信息（失败代码为1）
     * @param message
     * @return
     */
    public static BaseResult<Object> fail(String message) {
        return new BaseResult<Object>(1, message, null);
    }
    
    /**
     * 失败信息、返回数据（失败代码为1）
     * @param message
     * @param data
     * @return
     */
    public static BaseResult<Object> fail(String message, Object data) {
        return new BaseResult<Object>(1, message, data);
    }
    
    /**
     * 失败代码、失败信息
     * @param code
     * @param message
     * @return
     */
    public static BaseResult<Object> fail(int code, String message) {
        return new BaseResult<Object>(code, message, null);
    }
    
    /**
     * 失败代码、失败信息、返回数据
     * @param code
     * @param message
     * @return
     */
    public static BaseResult<Object> fail(int code, String message, Object data) {
        return new BaseResult<Object>(code, message, data);
    }
    
    public BaseResult() {}

    public BaseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    /**
     * 自动封装的对象，增加一个_wtype标识，默认为0
     * @author zhangqp
     * @version 1.0, 2017年3月25日
     */
    public static class WrappedResult extends BaseResult<Object> {
        private int _wtype = 0;
        
        public static WrappedResult create(Object data) {
            return new WrappedResult(data);
        }
        
        public static WrappedResult create(Object data, int _wtype) {
            return new WrappedResult(data, _wtype);
        }
        
        public WrappedResult(Object data) {
            this.setData(data);
        }
        
        public WrappedResult(Object data, int _wtype) {
            this._wtype = _wtype;
            this.setData(data);
        }

        public int get_wtype() {
            return _wtype;
        }
        public void set_wtype(int _wtype) {
            this._wtype = _wtype;
        }
    }
}
