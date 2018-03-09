/**
 * 123
 */
package com.cloud.application;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huangfeichang
 * @date 2017年11月21日 下午8:26:02
 *
 */
public class Teest {

	/**
	 * @author huangfeichang
	 * @param args
	 */
	public static void main(String[] args) {
		assembleSqlFromObj(new ServiceHiApplication());
	}
	
	
	public static String assembleSqlFromObj(Object obj) {
		System.err.println("===类的注解====");
		System.err.println(obj.getClass().getName());
		// Object直接使用getAnnotations获取类的注解
		Annotation[] type = obj.getClass().getAnnotations();
		System.err.println(obj.getClass().getAnnotation(SpringBootApplication.class));
		for (Annotation annotation : type) {
			// 分别获取类的注解
			System.err.println(annotation);
		}
		System.err.println("===字段的注解====");
		// Object使用getDeclaredFields获取属性字段
		Field[] declaredFields = obj.getClass().getDeclaredFields();
		for (Field field : declaredFields) {
			System.err.println(field.getName());
			Annotation[] mm = field.getAnnotations();
			for (Annotation annotation : mm) {
				// 分别获取属性字段的注解
				System.err.println(annotation.toString());
			}
		}
		System.err.println("===方法的注解====");
		// Object使用getDeclaredMethods获取方法
		Method[] declaredMethods = obj.getClass().getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.err.println(method.getName());
			try {
				method.invoke(obj);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Annotation[] annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				// 分别获取方法的注解
				System.err.println(annotation.toString());
			}
		}
		return null;  
		
	}

}
