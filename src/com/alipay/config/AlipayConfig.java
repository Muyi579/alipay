package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

	// ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCWgH544EAglbskB4APcHn9vIA5TOeL6I5aqJcpTP6r0pfw3k//sUrZ/PiW+f7s25cgpc4mohnJQVsXzKMZs9+zGtpZ5Ud9t1BmRbucp+tyx7BFeZC6dkxWS3iqZDX5mZc6IRWWW3N4XR9SH/x8LoNkLQDbgwYsA6DsFPLV/5lMr/FahtbGOta5EjrMtEYzN3slAmH50/iw2+qmy/rhUMyOl3t3JKBz3yFhLto6ZI4Ebu5+AvzcB9JI+4wWYe1boh5TrrQOYAq9SdycO3JUyuX9oWuw34iL4Geq1a4gbWu2X9FIbnie/RKOa2UfASDriZWYX7FMoJ+Gq8oNM+5Ydk4pAgMBAAECggEAe9xkObbVD/wqeAx0KEC5JUntfTr9lPdfsNzvCt6C+YXn5iQQUq7mm2DGdfppAyX1yriqYMEn16oh/gQ8dvrCL/T5nuJDZANp98GMFfFcpKoTOBpEMjEJwjt6o0C16yWsf/qaeZPqBDUfgccxVEIzgE5JVl8OxUp3NdRHxjcFQ0aGaPNOoLqf4SsakWnOEnJjk/aPEI5zixi75p30TZEMc+R7nm6xwizq0ngCJR6x5glD8I4I40CJ759O6ldeqLy4ri//EjNnWpFOeTtOjviiIY7TngGHZwytXgjH+yD0Xa+CWrX5AG81GbJrDIYfT6HVr1oPhehnQc5kVDNzklaRwQKBgQDK0rSKgunZKhuMvYPAWcZIyK6+LJ5SnkfJVYg0bOVFdhuyO8kRHmnJCnS+tGADljmE794kqfHpiKpeeA0JnuO1+DBKiYEFi6i02AwIMfd2kT+rDK/jRPSvTXZNnhfAt5sV4TnSR9ICZ3P2eNQnhx7rUNMv5zQ3RGXF/D07oZsGHwKBgQC99gr9kWqn6n9RzndhCQ43REfuMNtpC8Lz+7UaxYAi56YDFfH/85NbOjw//T4SRJ2OpOrHtczKX6zY0lJqr3nTTsUz+DcRRztZr6Jt9dWOb2o7whUxMnkaWtZZbY9i21x2tATwzx4M/w+2ChwPFZVlKrEw0nA3wm/BOaGuqXFStwKBgQCNMlJteuXBQQcc23I1HkpjsRG1Yup1KatgBiNkG8sgqDBvzB8Vw85xHs5XVMritFomqbZEX+sBYRr52Sl6YRq1O6qiuUcQzUENZLo7mk1kRYnFUnfAB+kvgQWy0zRF/YwBl2Hheg5BjjO0ijlnqzFjMElVN+ep8fvH8OnP8ZkykQKBgQC1OxDfPCYST3Hq3V0dkaMjbRxnDeu2e4cieOkewoBuTK0g0oYQGBVk+tlSf0wB576dwY9Qu4zHIqJoNbh1mjZTOBqCa3Q2Isxn013XJKv6+SbUHmVTi4DoePN5XEJpITlE8pioGiHkak9V8K02YvQmEaX9Gzf+qp0uLsqnNXctXwKBgF0z3hzTrD0fWqqyCOYO9kl+TiCYLsXd+BmdSMxVckd2q+viwSXBARYVm46g62Dbo2tQ/4MrLjwNkQAOou0MxzCHNbGD0OG/SbgEKLghgZJrImjQhGAj+IzfFla2/+3lyQqHKSh+Y7Egdgg80z496OrgoPE3Xap+F9gxEdvcZkeH";
	

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAloB+eOBAIJW7JAeAD3B5/byAOUzni+iOWqiXKUz+q9KX8N5P/7FK2fz4lvn+7NuXIKXOJqIZyUFbF8yjGbPfsxraWeVHfbdQZkW7nKfrcsewRXmQunZMVkt4qmQ1+ZmXOiEVlltzeF0fUh/8fC6DZC0A24MGLAOg7BTy1f+ZTK/xWobWxjrWuRI6zLRGMzd7JQJh+dP4sNvqpsv64VDMjpd7dySgc98hYS7aOmSOBG7ufgL83AfSSPuMFmHtW6IeU660DmAKvUncnDtyVMrl/aFrsN+Ii+BnqtWuIG1rtl/RSG54nv0SjmtlHwEg64mVmF+xTKCfhqvKDTPuWHZOKQIDAQAB";

	// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问/zhifu/notify_url.jsp
	public static String notify_url = "http://127.0.0.1:8080/shaxiang/index.jsp";

	// 页面跳转同步通知页面路径
	// 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问/zhifu/return_url.jsp
	public static String return_url = "http://127.0.0.1:8080/shaxiang/index.jsp";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";

	// ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * 
	 * @param sWord
	 *            要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
