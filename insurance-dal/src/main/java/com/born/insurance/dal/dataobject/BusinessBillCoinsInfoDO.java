/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import com.yjf.common.lang.util.money.Money;

/**
 * A data object class directly models database table <tt>business_bill_coins_info</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/business_bill_coins_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class BusinessBillCoinsInfoDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long coinsInfoId;

	private long insuraceCompanyId;

	private String insuraceCompanyName;

	private String chief;

	private double portion;

	private Money premiumAmount = new Money(0, 0);

	private Money brokerAmount = new Money(0, 0);

	private Money outAmount = new Money(0, 0);

	private Money otherAmount = new Money(0, 0);

	private long businessBillId;

    //========== getters and setters ==========

	public long getCoinsInfoId() {
		return coinsInfoId;
	}
	
	public void setCoinsInfoId(long coinsInfoId) {
		this.coinsInfoId = coinsInfoId;
	}

	public long getInsuraceCompanyId() {
		return insuraceCompanyId;
	}
	
	public void setInsuraceCompanyId(long insuraceCompanyId) {
		this.insuraceCompanyId = insuraceCompanyId;
	}

	public String getInsuraceCompanyName() {
		return insuraceCompanyName;
	}
	
	public void setInsuraceCompanyName(String insuraceCompanyName) {
		this.insuraceCompanyName = insuraceCompanyName;
	}

	public String getChief() {
		return chief;
	}
	
	public void setChief(String chief) {
		this.chief = chief;
	}

	public double getPortion() {
		return portion;
	}
	
	public void setPortion(double portion) {
		this.portion = portion;
	}

	public Money getPremiumAmount() {
		return premiumAmount;
	}
	
	public void setPremiumAmount(Money premiumAmount) {
		if (premiumAmount == null) {
			this.premiumAmount = new Money(0, 0);
		} else {
			this.premiumAmount = premiumAmount;
		}
	}

	public Money getBrokerAmount() {
		return brokerAmount;
	}
	
	public void setBrokerAmount(Money brokerAmount) {
		if (brokerAmount == null) {
			this.brokerAmount = new Money(0, 0);
		} else {
			this.brokerAmount = brokerAmount;
		}
	}

	public Money getOutAmount() {
		return outAmount;
	}
	
	public void setOutAmount(Money outAmount) {
		if (outAmount == null) {
			this.outAmount = new Money(0, 0);
		} else {
			this.outAmount = outAmount;
		}
	}

	public Money getOtherAmount() {
		return otherAmount;
	}
	
	public void setOtherAmount(Money otherAmount) {
		if (otherAmount == null) {
			this.otherAmount = new Money(0, 0);
		} else {
			this.otherAmount = otherAmount;
		}
	}

	public long getBusinessBillId() {
		return businessBillId;
	}
	
	public void setBusinessBillId(long businessBillId) {
		this.businessBillId = businessBillId;
	}


	/**
     * @return
     *
     * @see java.lang.Object#toString()
     */
	@Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}