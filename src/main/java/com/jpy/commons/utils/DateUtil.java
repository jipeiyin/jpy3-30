package com.jpy.commons.utils;

import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 时间工具类
 * @author: 冀培银
 * @date: 2020年3月30日 下午2:12:14
 */
public class DateUtil {
	//在时间段内随机产生一个时间
	public static Date randomDate(Date startDate,Date endDate) {
		//从1970年到startDate的毫秒数
		long t1 = startDate.getTime();
		long t2 = endDate.getTime();
		if(t2<t1) {
			throw new RuntimeException("开始日期不能大于结束日期");
		}
		//随机产生一个在t1-t2之间的毫秒数
		long t =(long)((Math.random()*(t2-t1))+t1);
		return new Date(t);
	}
}
