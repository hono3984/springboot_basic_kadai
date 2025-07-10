package com.example.springpractice.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HeaderFooterFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初期化処理
        log.info("init()：フィルターを初期化します。");
    }
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	throws IOException, ServletException {
		
		log.info("doFilter():フィルター処理を開始します。");
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		httpResponse.setContentType("text/html; charset=UTF-8");
		
		String username= httpRequest.getRemoteUser();
		
		if(username ==null) {
			httpResponse.getWriter().write("はじめまして、ゲストさん。");
			} else {
				httpResponse.getWriter().write("こんにちは、" + username + "さん");
			}
		
		chain.doFilter(request, response);
		
		httpResponse.getWriter().write("<p>&copy; spring_tutorial All rights reserved.</p>");
		log.info("doFilter(): フィルター処理が完了しました。");
	}
	
	@Override
	public void destroy() {
		log.info("destroy(): フィルターを破棄します。");
	}
}



