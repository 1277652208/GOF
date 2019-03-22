package com.xhn.factory.factorymethod;

import com.xhn.factory.simplifactory.Byd;
import com.xhn.factory.simplifactory.Car;

/**
 * ClassName：BydFactory
 * Package:com.xhn.factory.factorymethod
 * Description:
 *
 * @Date:2019/3/13 20:58
 * @Author:13975567160@163.com
 */
public class BydFactory {
    public static Car createCar(String type) {
        return new Byd();
    }
}
