package com.discardpast.chapter_four;

/**
 * Created by discardpast on 17-7-24.
 */

import java.lang.annotation.*;

/**
 * 使用@interface关键字定义注解
 * 成员以无参无异常方式声明
 * 可以用default为成员制定一个默认值
 * 成员类型是受限的，合法的类型包括原始类型及String,Class,Annotation,Enumeration
 * 如果注解只有一个成员,则成员名必须为value(),在使用时可以忽略成员名和复制号(=)
 * 注解类可以没有成员,没有成员的注解称为标识注解
 *
 * 元注解
 * @Target({ElementType.METHOD,ELementType.Type})（作用域）
 *      ElementType.CONSTRUCTOR      构造方法声明
 *      ElementType.FIELD            字段声明
 *      ElementType.LOCAL_VARIABLE   局部变量声明
 *      ElementType.METHOD           方法声明
 *      ElementType.PACKAGE          包声明
 *      ElementType.PARAMETER        参数声明
 *      ElementType.TYPE             类,接口
 * @Retention(RetentionPolicy.RUNTIME)
 *      RetentionPolicy.SOURCE       只在源码显示，编译时会丢弃
 *      RetentionPolicy.CLASS        编译时会记录到class中，运行时忽略
 *      RetentionPolicy.RUNTIME      运行时存在，可以通过反射读取
 * @Inherited
 *      允许类的子类可以继承该注解，子类的方法不可以继承该注解
 * @Documented
 *      生成javadoc会包含注解信息
 */
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.METHOD,ElementType.PACKAGE,ElementType.PARAMETER,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CustomizeAnnotation {
    String desc();
    String author();
    int age()default 18;
}

