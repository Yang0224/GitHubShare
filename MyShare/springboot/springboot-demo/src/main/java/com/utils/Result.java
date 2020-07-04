package com.utils;

import sun.applet.Main;

import java.util.HashMap;
import java.util.Map;

public class Result {

	private static final int SUCCESS = 0;	// 成功
	private static final int ERROR = 1;		// 失败
	private static final int EXPIRE = -2;	// 过期

	private static Map<String, Object> map = new HashMap<String, Object>();
	private static Map<String, Object> data = new HashMap<String, Object>();
	
	/**
	 * 接口返回数据格式
	 * @author yangshaoping 2016年6月11日 上午10:45:03
	 * @param status
	 * @param msg
	 * @return
	 */
	public static Map<String, Object> result(Integer status,String msg){
		map.put("status", status);
		map.put("msg", msg);
		map.put("data", data);
		return map;
	}
	
	public static Map<String, Object> result(Integer status, String msg, Map<String, Object> data){
		map.put("status", status);
		map.put("msg", msg);
		map.put("data", data);
		return map;
	}
	
	/**
	 * 系统异常
	 * @author yangshaoping 2016年6月12日 上午10:13:02
	 * @return
	 */
	public static Map<String, Object> systemError(){
		map.put("status", ERROR);
		map.put("msg", "系统异常");
		map.put("data", data);
		return map;
	}
	public static Map<String, Object> systemError(Exception e){
		data.put("error", e.toString());
		map.put("status", ERROR);
		map.put("msg", "系统异常");
		map.put("data", data);
		return map;
	}
	
	/**
	 * status为success  msg自定义、data为空
	 * @author yangshaoping 2016年6月11日 下午2:49:58
	 * @param msg
	 * @return
	 */
	public static Map<String, Object> success(String msg){
		map.put("status", SUCCESS);
		map.put("msg", msg);
		map.put("data", data);
		return map;
	}
	
	/**
	 * status为success  msg、data自定义
	 * @author yangshaoping 2016年7月21日 上午10:43:59
	 * @param msg
	 * @return
	 */
	public static Map<String, Object> success(String msg , Map<String, Object> data){
		map.put("status", SUCCESS);
		map.put("msg", msg);
		map.put("data", data);
		return map;
	}
	
	/**
	 * status为success  msg、data自定义
	 * @author yangshaoping 2016年7月21日 上午10:43:59
	 * @param msg
	 * @return
	 */
	public static Map<String, Object> success(String msg , Object data){
		map.put("status", SUCCESS);
		map.put("msg", msg);
		map.put("data", data);
		return map;
	}

	public static Map<String, Object> success(String msg , String name, Object value){
		data.put(name, value);
		map.put("status", SUCCESS);
		map.put("msg", msg);
		map.put("data", data);
		return map;
	}
	
	/**
	 * status为error  msg自定义、data为空
	 * @author yangshaoping 2016年6月11日 下午2:49:58
	 * @param msg
	 * @return
	 */
	public static Map<String, Object> error(String msg){
		map.put("status", ERROR);
		map.put("msg", msg);
		map.put("data", data);
		return map;
	}
	
	/**
	 * status为error 
	 * @author yangshaoping 2016年6月11日 下午2:49:58
	 * @param msg
	 * @return
	 */
	public static Map<String, Object> error(String msg,Map<String, Object> data){
		map.put("status", ERROR);
		map.put("msg", msg);
		map.put("data", data);
		return map;
	}
	
	/**
	 * token失效
	 * @author yangshaoping 2016年7月19日 下午8:39:32
	 * @return
	 */
	public static Map<String, Object> expire(){
		map.put("status", EXPIRE);
		map.put("msg", "token失效");
		map.put("data", data);
		return map;
	}

}
