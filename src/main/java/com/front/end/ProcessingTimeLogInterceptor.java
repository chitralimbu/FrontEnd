package com.front.end;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class ProcessingTimeLogInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView){
        String queryString = request.getQueryString() == null ? "" : "?" + request.getQueryString();
        String path = request.getRequestURL() + queryString;
        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
       log.info(String.format("IP: %s - %s millisecond taken to process the request %s", request.getRemoteAddr(),(endTime - startTime), path));
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exceptionIfAny){
        //Nothing
    }

}
