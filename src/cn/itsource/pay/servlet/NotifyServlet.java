package cn.itsource.pay.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/notify")//异步通知
public class NotifyServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//接受支付宝异步通知请求
		System.out.println("接受支付宝异步通知请求...");
		Map<String, String[]> parameterMap = request.getParameterMap();
		
		System.out.println(parameterMap);
		
		//成功处理后返回success
		response.getWriter().write("success");
	}
	
}
