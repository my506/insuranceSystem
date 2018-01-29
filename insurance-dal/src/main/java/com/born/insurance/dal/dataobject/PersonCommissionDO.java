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
import java.util.Date;

/**
 * A data object class directly models database table <tt>person_commission</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/person_commission.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class PersonCommissionDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long commissionId;

	private long businessUserId;

	private String businessUserName;

	private String businessUserType;

	private String businessUserMobile;

	private String businessUserCertNo;

	private Money totalAmount = new Money(0, 0);

	private Money drawAmount = new Money(0, 0);

	private Money applyingAmount = new Money(0, 0);

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getCommissionId() {
		return commissionId;
	}
	
	public void setCommissionId(long commissionId) {
		this.commissionId = commissionId;
	}

	public long getBusinessUserId() {
		return businessUserId;
	}
	
	public void setBusinessUserId(long businessUserId) {
		this.businessUserId = businessUserId;
	}

	public String getBusinessUserName() {
		return businessUserName;
	}
	
	public void setBusinessUserName(String businessUserName) {
		this.businessUserName = businessUserName;
	}

	public String getBusinessUserType() {
		return businessUserType;
	}
	
	public void setBusinessUserType(String businessUserType) {
		this.businessUserType = businessUserType;
	}

	public String getBusinessUserMobile() {
		return businessUserMobile;
	}
	
	public void setBusinessUserMobile(String businessUserMobile) {
		this.businessUserMobile = businessUserMobile;
	}

	public String getBusinessUserCertNo() {
		return businessUserCertNo;
	}
	
	public void setBusinessUserCertNo(String businessUserCertNo) {
		this.businessUserCertNo = businessUserCertNo;
	}

	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		if (totalAmount == null) {
			this.totalAmount = new Money(0, 0);
		} else {
			this.totalAmount = totalAmount;
		}
	}

	public Money getDrawAmount() {
		return drawAmount;
	}
	
	public void setDrawAmount(Money drawAmount) {
		if (drawAmount == null) {
			this.drawAmount = new Money(0, 0);
		} else {
			this.drawAmount = drawAmount;
		}
	}

	public Money getApplyingAmount() {
		return applyingAmount;
	}
	
	public void setApplyingAmount(Money applyingAmount) {
		if (applyingAmount == null) {
			this.applyingAmount = new Money(0, 0);
		} else {
			this.applyingAmount = applyingAmount;
		}
	}

	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
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