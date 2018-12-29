package cn.itsource.pay.servlet;
//异步有问题，无法访问
public class AlipayConfig {
    //同步跳转地址
	public static String return_url="http://localhost:8080/alipay/success.jsp";
	//http://localhost:8080/alipay/success.jsp
	//异步通知地址
	public static String notify_url ="http://290a7cde.all123.net/notify";
	//商户id
	public static String app_id ="2016092300575789";
	//私钥
	public static String merchant_private_key ="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCIYYsO6kPoI819ns+J9Ah8bcmVv/21d/nusDvV+gPIKxiApO8fU0BsImA2wLlAWnB1Zy+P1SFLo0r2i4wD5x9/dNG8XMojIVZx88aIukGzELPAAOubur6Ez2Dl87QHbpPH1g/ODZPFE1cK4YHEi1FyG1qvcxu7bgu32Or7UxqnvQh6UWaPOlD9ZkRp4rsEkjD5NL4Awa+8gxxcKlmOV73VoZksOmncGdYFFw7wUDViInL3qRBFJpmHlx2H4j7pG/9HK3rVxQO6erzGIxJkUgukBXISDKVzS5BIm0jc0trP550Z6iGxXgNG3QXwQ6S53LvbWnzP/fgjDkFf9hCL17gfAgMBAAECggEAAR4Tfp7KyacpcuMPPkkinKploXV+RbNi9+K3yswOpeA8hilT0ETlXT123lv76JwVGdEroZkUecMvxQ9lqU6GgovZgBqeiWUniS1/LfWgvi/f2S3owFDqaLouSBQUII92ZIfLf1u7Hz1GVE9+ubaOh0nUF2XxDzsam3oKit6mdENkG5P1uJcxqmopTtOt1+9M3sYyxUfPnFmZy4So78FUcveQSWC7l/N9dRFIGDFG116ucmTaVrbGJW/UiRrm5lsMyZov/L0CoSBhKGXlsJd0mIZJ/I8KPy4m2tOyhboF2HAboCSQiw4DCdLMyR9NS9CqzTEIXQ6gJzpiX/41TQPVAQKBgQDvDjjTnRdQ+1oOagOeqOmIbPMebo6CxbBbKdj4HkoUVbIXQ3+TeSIrsjeyVDF4XMXagurneqBjDDXR/dS0q4S1P5coluhXdCCWpDMyUHGx2RkV96f9j01e6IiEF2M/Ugu26BAKPeiOAhk3Ea1N3RVp2+J9GNIILXVdMKTUwEXxnwKBgQCSDD4XsGO2TXPKvhcLYU+ar/pU+V8WATXYBcQN0DlsVnRkYVTVG2tQbx+kXnImEYHeBYYIlJnTOSB5VeGt3zlOfGNqHfglxhwKHKq1apIUM2FjzaDQyKE3Gyl8G3Z8SPcKyGfT8Bhz6r3MC9WLPwA7qMjG8VZD7qq4JYE+EompgQKBgC2lh5BQtL0P4bhS4fIPytf0BdBPyAKMgQpHSVjHX9nWKzVp/BhKzw2M8Dmq/e8/t7/rs7MTpUCEelpon48IGUUKqXBksGTSlc5t+CCpX6xYCgQ5z+gIzvtKZ5bhaGAU6Iu6cCWkgJ1tJSdwxqjRiF84T10XujM5iumKek7tj+19AoGAZJEZkKZdgwMCYPFUXPm9Hv9emXS+DSD4OrB9uCVR5VADBbwf9j7TPqfGWiDO6XfUvVWAXhg1dEU6H1ML+/ZiN7Ffo4rPfPNWC4CB7DpeLJrUzSyjOCFvIcsKXfNrO1njAwHMvRvvOqLB3uenPCM9vdcTqio1BMIrvHHW9S8+rAECgYA78zZhyWIbj1lGmfagFTDJY820fCkY8jcS+xXu/Eic1cw7JWucGzStjj4YXDjqwJBgtwBgtagp+hRde3gusb5nkRw24tYq0Bcn9I0nNHfNFTZE+7xxfaEIS1LVxNpIDB73QENHWvJpkSbxFaSeZrsxlxucDCTqmz6BjB/c9/z6IA==";
	public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA34yzKKghUYEweVqYAZ7BZzH0Dzg3Znfd87oUCfL5wWGCcYX1noWNurlo0v4DuhyZYs/22WVuynHaitG3bFO66BhwxxEXCOE4wnEfj4GV0atu5Wvn75mRCwNYxyLiMelN13G1uGD9zUAcsK2Be4uC999Pq6Yo8ZO4YkKNqvd//PfxQENE+CW8Xq3GJbmeIqBk6BYm1Eb6xoRflssBW6nM/b33WixbXSPOS4FM2Iu/zf70l3+RtVw5/0hkNiRfzkGqslPub0+QxfYxBQdjvH1qGhmi7xuP4la9lH6Qc+yqsREYBWDVODo9V/9yDdHlkfs/+FfQxyh9q5BoJygBjJVp9wIDAQAB";
	                                         

	                                         
	// 签名方式
	public static String sign_type ="RSA2";
	// 字符编码格式
	public static String charset ="utf-8";
	// 支付宝网关
	public static String gatewayUrl ="https://openapi.alipaydev.com/gateway.do";
	
}
