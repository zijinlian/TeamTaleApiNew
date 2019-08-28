package com.work.entity;

import java.math.BigDecimal;

public class TPubAttachrel extends TPubAttachrelKey {
    private String fdAttachdes;

	private String fdRectmodifier;

	private String fdRectmodiftime;

	private BigDecimal fdValidflag;

	public String getFdAttachdes() {
		return fdAttachdes;
	}

	public void setFdAttachdes(String fdAttachdes) {
		this.fdAttachdes = fdAttachdes;
	}

	public String getFdRectmodifier() {
		return fdRectmodifier;
	}

	public void setFdRectmodifier(String fdRectmodifier) {
		this.fdRectmodifier = fdRectmodifier;
	}

	public String getFdRectmodiftime() {
		return fdRectmodiftime;
	}

	public void setFdRectmodiftime(String fdRectmodiftime) {
		this.fdRectmodiftime = fdRectmodiftime;
	}

	public BigDecimal getFdValidflag() {
		return fdValidflag;
	}

	public void setFdValidflag(BigDecimal fdValidflag) {
		this.fdValidflag = fdValidflag;
	}
}