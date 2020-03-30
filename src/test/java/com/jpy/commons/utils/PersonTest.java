package com.jpy.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.jpy.commons.utils.DateUtil;
/**
 * 
 * @ClassName: PersonTest 
 * @Description: 测试类
 * @author: 冀培银
 * @date: 2020年3月30日 下午2:35:32
 */
public class PersonTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			Person p = new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 120));
			p.setAbout(StringUtil.randomChineseString(140));
			//获取日历类
			Calendar c = Calendar.getInstance();
			c.set(2010, 0, 1);
			Date date = DateUtil.randomDate(c.getTime(), new Date());
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			p.setCreated(fmt.format(date));
			System.out.println(p);
		}
	}
}
