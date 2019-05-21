package interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author chuangyue
 * @Description //TODO
 * @Date 2019/5/21 0021
 **/
public class LoginInterceptor extends HandlerInterceptorAdapter {

@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(" before  controller");


    return false;


    }




}


