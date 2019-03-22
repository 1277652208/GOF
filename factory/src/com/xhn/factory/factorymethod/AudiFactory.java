package com.xhn.factory.factorymethod;

import com.xhn.factory.simplifactory.Byd;
import com.xhn.factory.simplifactory.Car;

/**
 * ClassName：AudiFactory
 * Package:com.xhn.factory.factorymethod
 * Description:
 *
 * @Date:2019/3/13 20:59
 * @Author:13975567160@163.com
 */
public class AudiFactory {
    public static Car createCar(String type) {
        return new Byd();
    }
}
