package ssm.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvercer implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		if (source != null) {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {
				return format.parse(source);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
