package com.liw.crawler.route.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 说明：
 *
 * @author liw@suncd.com
 * @date 2018/2/5 16:16
 */
@Component
public class AuthorityFilter extends ZuulFilter {

    private final static Logger LOGGER = LoggerFactory.getLogger(AuthorityFilter.class);


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        LOGGER.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        //获取token
        String token = request.getParameter("token");
        String requestIp = request.getParameter("ip");


       /* if(accessToken == null) {
            LOGGER.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){
                LOGGER.error("",e);
            }
            return null;
        }*/
        LOGGER.info("ok");
        return null;
    }
}
