package com.sample.data.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * The {@code RequestInterceptor} class handles pre-post request processing.
 * <P>
 * When asynchronous handling completes, the request is dispatched to the
 * container for further processing. {@code preHandle} validate users authority
 * for specific operation.
 * </P>
 * 
 * @author AdarshSinghal
 *
 */
@Configuration
public class RequestInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
