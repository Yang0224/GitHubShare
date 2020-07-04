package com.basic.entity;

import java.io.FileInputStream;
import java.io.InputStream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Cleanup;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.Synchronized;
import lombok.extern.log4j.Log4j;

@Data 		//注解在类上；提供类所有属性的 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法
@NoArgsConstructor 		//注解在类上；为类提供一个无参的构造方法
@AllArgsConstructor		//注解在类上；为类提供一个全参的构造方法
@Builder	//注解在类上；为类提供一个内部的Builder
@Log4j		//日志
public class User {

    private String name;

    private String sex;

    private int age;

    private String phone;

    @NonNull	//注解在参数上 如果该参数为null 会throw new NullPointerException(参数名)
    private String address;

    @SneakyThrows		//将方法中的代码用try-catch语句包裹起来
    @Synchronized		//效果和synchronized关键字相同
    public static void main(String[] args){

        User user = new User("lombok", "男", 18, "18322222222", "四川成都");
        user.setName("lombok-job");
        //user.setAddress(null);

        log.info("user ==> " + user);

        @Cleanup InputStream is = new FileInputStream(args[0]);		//自动释放资源
    }

}
