package com.anji.redispipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/26 17:00
 */
public class test {
    public static void main(String[] args) {
        ConnectionMultiplexer redis = ConnectionMultiplexer.Connect("192.168.23.151:6379");

        var db = redis.GetDatabase();

        var productID = string.Format("productID_{0}", 1);

        for (int i = 0; i < 10; i++)
        {
            var customerID = i;

            db.SetAdd(productID, customerID);
        }
    }
}
