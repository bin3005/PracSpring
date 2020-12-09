package com.mvc.upgrade.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter {
	private Logger logger = LoggerFactory.getLogger(LogFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 필터 인스턴스 초기화
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 전 / 후 처리
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		String remoteAddr = req.getRemoteAddr(); //로컬 호스트IP 주소
		String uri = req.getRequestURI();
		String url = req.getRequestURL().toString();
		String queryString = req.getQueryString();
		String referer = req.getHeader("refere"); // 이전 페이지( 보내는 페이지)
		String agent = req.getHeader("User-Agent"); //사용자 정보 (브라우저 , os 등)
		
		StringBuffer sb = new StringBuffer();
		sb.append("remoteAddr: " + remoteAddr+"\n")
			.append("uri: " + uri + "\n")
			.append("url: " + url + "\n")
			.append("queryString: " + queryString+"\n")
			.append("referer: " + referer +"\n")
			.append("agent: " + agent + "\n");
		
		logger.info("[LOG FILTER]\n"+sb);
		
		chain.doFilter(req, response);
	}

	@Override
	public void destroy() {
		// 필터 인스턴스 종료
	}

}
