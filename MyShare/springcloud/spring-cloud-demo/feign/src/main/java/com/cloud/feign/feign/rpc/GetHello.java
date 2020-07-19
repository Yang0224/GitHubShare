/**
 * Copyright (C), 2015-2020
 * FileName: GetHello
 * Author:   YangShaoping
 * Date:     2020/7/19 20:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cloud.feign.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author yangshaoping
 * @create 2020-07-19 20:23
 */
@FeignClient(value = "ribbon-consumer")
public interface GetHello {

    @RequestMapping(value = "/hello?name=feign", method = RequestMethod.GET)
    String sayHello();
}