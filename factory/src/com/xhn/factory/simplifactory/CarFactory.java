package com.xhn.factory.simplifactory;

/**
 * ClassName：CarFactory
 * Package:com.xhn.factory.simplifactory
 * Description:简单工厂模式，无扩展性
 *
 * @Date:2019/3/13 20:18
 * @Author:13975567160@163.com
 */
public class CarFactory {
    public static Car createCar(String type){
        if("奥迪".equals(type)){
            return new Audi();
        }else if("比亚迪".equals(type)){
            return new Byd();
        }else {
            return null;
        }
    }
}
