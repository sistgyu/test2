package my.day19.a.collection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RecruitApply {

	// field
	private Recruit_imple rc;				// 채용공고
	private Gujikja_imple gu;				// 구직자
	private String apply_motive;	// 지원동기
	private String register_day;	// 등록일자
	
	// 기본생성자
	public RecruitApply() {
		Date now = new Date(); // 현재시각
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		register_day =  sdf.format(now);
		
	}
	
	// method
	public Recruit_imple getRc() {
		return rc;
	}

	public void setRc(Recruit_imple rc) {
		if(rc != null) {
	        this.rc = rc;
	    }
	    else {
	        System.out.println("[경고] 채용에 응모하려면 반드시 채용정보를 입력하세요!!\n"); 
	    }
	}

	public Gujikja_imple getGu() {
		return gu;
	}

	public void setGu(Gujikja_imple gu) {
		if(gu != null) {
	        this.gu = gu;
	    }
	    else {
	        System.out.println("[경고] 채용에 응모하려면 반드시 구직자정보를 입력하세요!!\n");
	    }
	}

	public String getApply_motive() {
		return apply_motive;
	}

	public void setApply_motive(String apply_motive) {
		if(apply_motive != null && !apply_motive.isBlank()) {
	        this.apply_motive = apply_motive;   
	    }
	    else {
	        System.out.println("[경고] 입사지원동기는 필수로 입력해야 합니다.!!\n");
	    }
	}

	public String getRegister_day() {
		return register_day;
	}
	
}
