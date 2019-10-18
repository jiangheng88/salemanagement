package cn.qst.sale.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jiangheng
 * @date 2019/10/4 10:12
 * @description
 */
public class DateTypeConverter implements Converter<String, Date> {
    // 要转换的目标日期类型的格式

    private static final String STR_DATE = "yyyy-MM-dd";
    private static final String STR_DATETIME = "yyyy-MM-dd HH:mm:ss";
    private static final String STR_TIMESTAMP = "yyyy-MM-dd HH:mm:ss.SSS";

    @Override
    public Date convert(String s) {
        System.out.println("自定义类型转换之前的时间字符串：" + s);
        return toDate(s);
    }

    /**
     * 实现时间转换器
     * @param value
     * @return
     */
    private Date toDate(String value) {
        // 默认返回值为null【也可以为当前系统时间，有业务确定使用那种默认值】
        Date date = null;
        // 当前转换的字符串对象不为空，且不为null
        if (value != null && !"".equals(value)) {
            // 剔除空格
            String strDateValue = value.trim();
            // 进行类型转换的格式串
            String strFormat = STR_DATE;
            // 处理格式： "yyyy-MM-dd";
            if (strDateValue.length() <= 10) {
            } else if (strDateValue.length() <= 19) {
                // 处理格式："yyyy-MM-dd HH:mm:ss";
                strFormat = STR_DATETIME;
            } else if (strDateValue.length() <= 23) {
                // 处理格式："yyyy-MM-dd HH:mm:ss.SSS"
                strFormat = STR_TIMESTAMP;
            }

            try {
                // 使用simpledataformat进行转换
                SimpleDateFormat sdf = new SimpleDateFormat(strFormat);
                date = sdf.parse(strDateValue);
            } catch (ParseException e) {
                System.out.println("数据类型转换错误：" + e.getMessage());
            }
        }
        return date;
    }



}
