package cn.lzh.antiepidemic.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * [德鲁伊的工具类](DruidUtil)
 * @author LZH
 * @version V1.0
 * @description zh - 德鲁伊的工具类
 * @description en - DruidUtil
 * @since 2021/12/14 19:19
 */
public class DruidUtil {
    private static Properties  properties;
    private static DataSource dataSource;
    static {
        try {
            properties=new Properties();
            InputStream is=DruidUtil.class.getResourceAsStream("/druid.properties");
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dataSource=DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDataSource(){
        return dataSource;
    }

}
