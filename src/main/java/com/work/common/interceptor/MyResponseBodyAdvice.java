package com.work.common.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.work.common.JSONResult;
import com.work.common.JsonUtil;
import com.work.common.md5.SecretUtils;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;


@EnableWebMvc
@ControllerAdvice
public class MyResponseBodyAdvice implements ResponseBodyAdvice<Object> {
	
	public static ObjectMapper objectMapper;

	@Override
	public boolean supports(MethodParameter returnType,
			Class<? extends HttpMessageConverter<?>> converterType) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object result,
			MethodParameter returnType, MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType,
			ServerHttpRequest request, ServerHttpResponse response) {
		try {
			JSONResult json = (JSONResult) result;
			ServletServerHttpRequest sshr = (ServletServerHttpRequest) request;
			HttpServletRequest req =   sshr.getServletRequest();
			String encrypt = req.getParameter("encrypt");
			if("true".equals(encrypt)){
				result = SecretUtils.enParameterByDES(JsonUtil.fromString(json));
			/*	result = SecretUtils.enParameterByDES(result.toString());*/
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
