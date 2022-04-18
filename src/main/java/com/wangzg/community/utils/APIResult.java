package com.wangzg.community.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResult {

	private Integer status;//状态码
	private String msg;  //错误信息
	private Integer total;
	private Object data;  //传递的信息



	/**
	 * 功能描述: Get/delete 成功
	 * @param: [object]
	 * @return: com.wangzg.community.utils.APIResult
	 * @auther: wanzg
	 * @date: 2022-2-15 9:38
	 */
	public static APIResult ok(Object object) {
		APIResult apiResult = new APIResult();
		apiResult.setStatus(ConstantsUtils.CODE_STATUS_200);
		apiResult.setData(object);
		return apiResult;

	}

	/**
	 * 功能描述: put/post 成功
	 * @param: [object]
	 * @return: com.wangzg.community.utils.APIResult
	 * @auther: wanzg
	 * @date: 2022-2-15 9:38
	 */
	public static APIResult created(Object object) {
		APIResult apiResult = new APIResult();
		apiResult.setStatus(ConstantsUtils.CODE_STATUS_201);
		apiResult.setData(object);
		return apiResult;

	}

	/**
	 * 功能描述: 404Not Found
	 * @param: [msg]
	 * @return: com.wangzg.community.utils.APIResult
	 * @auther: wanzg
	 * @date: 2022-2-15 9:38
	 */
	public static APIResult notFound(String msg) {
		APIResult apiResult = new APIResult();
		apiResult.setStatus(ConstantsUtils.CODE_STATUS_404);
		apiResult.setMsg(msg);
		return apiResult;

	}

	/**
	 * 功能描述: 用户未认证
	 * @param: [msg]
	 * @return: com.wangzg.community.utils.APIResult
	 * @auther: wanzg
	 * @date: 2022-2-15 9:38
	 */
	public static APIResult unauthorized(String msg) {
		APIResult apiResult = new APIResult();
		apiResult.setStatus(ConstantsUtils.CODE_STATUS_401);
		apiResult.setMsg(msg);
		return apiResult;

	}
}
