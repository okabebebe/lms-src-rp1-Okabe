package jp.co.sss.lms.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class SimpleDateFormat {
	
	public DateTimeFormatter date =DateTimeFormatter.ofPattern("yyyy/MM/dd");
	
	public LocalDateTime today() {
		return LocalDateTime.now();
		
	}

}
