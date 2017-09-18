/**
 *
 * @author Jo Ran jl_ran@163.com  woshare.top
 * @time 2017-9-7 9:56:22
 *
 */

package top.woshare.springbootglobaldemo.config;

import java.util.List;


/**
 * 统一数据返回 走异常类
 * @author Joran
 */

public class GlobalException extends Exception{
    private Integer code;
    private String msg;
    private List data;

    public GlobalException(Integer code,String msg, List data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the data
     */
    public List getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List data) {
        this.data = data;
    }
}
