/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-6 23:10:32
 *
 */


package top.woshare.springbootdemo.domain;

import java.util.List;

/**
 * 统一返回数据的接口
 * @author Joran
 */

public class GlobalMessage {
    private Integer status;
    private String message;
    private List result;

    /**
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the result
     */
    public List getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(List result) {
        this.result = result;
    }
}
