package org.xujiale.dubbodemo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.xujiale.dubbodemo.api.UserService;
import org.xujiale.dubbodemo.bean.Response;
import org.xujiale.dubbodemo.bean.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
@Service
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserServiceImpl implements UserService {

    @POST
    @Path("register")
    public Response register(User userToRegister) {
        return new Response("succeed", "注册成功");
    }
}
