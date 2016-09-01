package com.tzl.entity;

public class BankCard {
    private Integer bankcardId;

    private String bankName;

    private String bankDes;

    public Integer getBankcardId() {
        return bankcardId;
    }

    public void setBankcardId(Integer bankcardId) {
        this.bankcardId = bankcardId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankDes() {
        return bankDes;
    }

    public void setBankDes(String bankDes) {
        this.bankDes = bankDes;
    }

	@Override
	public String toString() {
		return "BankCard [bankcardId=" + bankcardId + ", bankName=" + bankName
				+ ", bankDes=" + bankDes + "]";
	}
    
    
}