package com.isoftstone.finance.managesystem.web.auth;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented //用于描述其它类型的应该被作为被标注的程序成员的公共API，因此可以被例如javadoc此类的工具文档化
@Inherited //允许子类集成父类
@Target(ElementType.METHOD)//修饰的对象范围:描述方法
@Retention(RetentionPolicy.RUNTIME)//被保留的时间长短   RUNTIME:在运行时有效
public @interface AuthPassport {
	boolean validate() default true;
}
