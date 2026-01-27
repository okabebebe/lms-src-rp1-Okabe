package jp.co.sss.lms.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 勤怠管理画面用DTO
 * 
 * @author 東京ITスクール
 */
@Component
@Data
@EqualsAndHashCode(callSuper = true)
public class AttendanceManagementDto extends StudentAttendanceDto {

	/** 当日フラグ */
	private Boolean isToday;
	/** 中抜け時間（文字列） */
	private String blankTimeValue;
	/** セクション名 */
	private String sectionName;
	
	/** 岡部遥-Task.26-出勤時間の時 */
	private String trainingStartHour;
	/** 岡部遥-Task.26-出勤時間の分 */
	private String trainingStartMinute;
	/** 岡部遥-Task.26-退勤時間の時 */
	private String trainingEndtHour;
	/** 岡部遥-Task.26-退勤時間の分 */
	private String trainingEndMinute;

}
