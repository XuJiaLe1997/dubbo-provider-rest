package org.xujiale.dubbodemo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import org.xujiale.dubbodemo.api.SystemService;
import org.xujiale.dubbodemo.bean.Response;

// 注意引入下面的包，参考pom文件，下面这几个注解和dubbo没有关系，不需要开启包扫描
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("system")
@Service    // 只有这个是dubbo的注解，需要开启包扫描
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})                 // 接受参数的序列化模式
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8}) // 返回的序列化模式，支持json和xml，utf-8编码
public class SystemServiceImpl implements SystemService {

    @GET
    @Path("serverIpList")
    public Response getServerIpList() {
        return new Response("succeed", "本地地址：127.0.0.1");
    }
}
