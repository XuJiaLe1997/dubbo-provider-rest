package org.xujiale.dubbodemo.bean;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement  // 支持xml序列化
public class Response implements Serializable {

    private String msg;
    private String data;

    public Response() {
    }

    public Response(String msg, String data) {
        this.msg = msg;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
