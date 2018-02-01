package ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor1 implements HandlerInterceptor {
	/*
	 * Controller����ǰ����������� ����true��ʾ����ִ�У�����false��ִֹ�� �û�Ȩ�޵���֤����¼��֤�����Է�������
	 */

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("Interceptor1.preHandle()");
		return true;
	}

	/*
	 * Controllerִ�к��������������������ڷ���ModelAndView֮ǰ
	 */

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("Interceptor1.postHandle()");
	}

	/*
	 * Controllerִ�������ModelAndView��ͼ�Ѿ�����
	 */

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("Interceptor1.afterCompletion()");
	}

}
