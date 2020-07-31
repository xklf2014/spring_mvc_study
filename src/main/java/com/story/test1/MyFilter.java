package com.story.test1;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletRequest.setCharacterEncoding("GBK");
        servletResponse.setCharacterEncoding("GBK");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
