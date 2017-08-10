package com.discardpast.chapter_three;

/**
 * Created by discardpast on 17-7-24.
 */

/**
 * 按照运行机制分类
 *   源码注解
 *      注解只在源码中存在，编译成.class文件就不存在了
 *   编译时注解
 *      注解在源码和.class文件中都存在
 *      （jdk中的注解就是编译时注解）
 *   运行时注解
 *      在运行阶段还会起作用，甚至会影响运行逻辑的注解
 * 按照来源来分
 *   来自JDK的注解
 *   来自第三方的注解
 *   自定义注解
 * 元注解
 *   注解的注解
 */
public interface AnnotationClassification {
}
