package com.born.insurance.dataobject;

import java.util.Date;

import com.yjf.common.lang.util.money.Money;

public class BusinessBillFormDO extends SimpleFormDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -21355375245234350L;
	
	private long businessBillId;

	private long letterId;

	private long formId;

	private String insuranceOfType;

	private String billNo;

	private String priceNo;

	private String renewalNo;

	private String batchNo;

	private String insuranceDepart;

	private String insuranceTeam;

	private String insuranceBrokerNo;

	private String insuranceBrokerName;

	private String insuranceNo;

	private String invoiceNo;

	private long billCustomerId;

	private String billCustomerName;

	private long billInsuredId;

	private String billInsuredName;

	private long insuranceTypeId;

	private String insuranceTypeName;

	private long insuranceCatalogId;

	private String insuranceCatalogName;

	private Money insuranceAmount = new Money(0, 0);

	private Money premiumAmount = new Money(0, 0);

	private Date insuranceDate;

	private Date beginDate;

	private Date endDate;

	private long businessUserId;

	private String businessUserName;

	private long insuranceCompanyId;

	private String insuranceCompanyName;

	private long agencyCompanyId;

	private String agencyCompanyName;
	
	private double brokerScale;

	private double commonScale;

	private double grossRate;

	private Money grossProfit = new Money(0, 0); 
	
	private Money brokerVal = new Money(0, 0) ;

	private Money commonVal = new Money(0, 0);

	private String remark;

	private long sorceBusinessBillId;
	
	private String billStatus;

	private String status;

	private long version;

	private long creatorId;

	private String creatorName;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getBusinessBillId() {
		return businessBillId;
	}
	
	public void setBusinessBillId(long businessBillId) {
		this.businessBillId = businessBillId;
	}

	public long getLetterId() {
		return letterId;
	}
	
	public void setLetterId(long letterId) {
		this.letterId = letterId;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getInsuranceOfType() {
		return insuranceOfType;
	}
	
	public void setInsuranceOfType(String insuranceOfType) {
		this.insuranceOfType = insuranceOfType;
	}

	public String getBillNo() {
		return billNo;
	}
	
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getPriceNo() {
		return priceNo;
	}
	
	public void setPriceNo(String priceNo) {
		this.priceNo = priceNo;
	}

	public String getRenewalNo() {
		return renewalNo;
	}
	
	public void setRenewalNo(String renewalNo) {
		this.renewalNo = renewalNo;
	}

	public String getBatchNo() {
		return batchNo;
	}
	
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getInsuranceDepart() {
		return insuranceDepart;
	}
	
	public void setInsuranceDepart(String insuranceDepart) {
		this.insuranceDepart = insuranceDepart;
	}

	public String getInsuranceTeam() {
		return insuranceTeam;
	}
	
	public void setInsuranceTeam(String insuranceTeam) {
		this.insuranceTeam = insuranceTeam;
	}

	public String getInsuranceBrokerNo() {
		return insuranceBrokerNo;
	}
	
	public void setInsuranceBrokerNo(String insuranceBrokerNo) {
		this.insuranceBrokerNo = insuranceBrokerNo;
	}

	public String getInsuranceBrokerName() {
		return insuranceBrokerName;
	}
	
	public void setInsuranceBrokerName(String insuranceBrokerName) {
		this.insuranceBrokerName = insuranceBrokerName;
	}

	public String getInsuranceNo() {
		return insuranceNo;
	}
	
	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}
	
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public long getBillCustomerId() {
		return billCustomerId;
	}
	
	public void setBillCustomerId(long billCustomerId) {
		this.billCustomerId = billCustomerId;
	}

	public String getBillCustomerName() {
		return billCustomerName;
	}
	
	public void setBillCustomerName(String billCustomerName) {
		this.billCustomerName = billCustomerName;
	}

	public long getBillInsuredId() {
		return billInsuredId;
	}
	
	public void setBillInsuredId(long billInsuredId) {
		this.billInsuredId = billInsuredId;
	}

	public String getBillInsuredName() {
		return billInsuredName;
	}
	
	public void setBillInsuredName(String billInsuredName) {
		this.billInsuredName = billInsuredName;
	}

	public long getInsuranceTypeId() {
		return insuranceTypeId;
	}
	
	public void setInsuranceTypeId(long insuranceTypeId) {
		this.insuranceTypeId = insuranceTypeId;
	}

	public String getInsuranceTypeName() {
		return insuranceTypeName;
	}
	
	public void setInsuranceTypeName(String insuranceTypeName) {
		this.insuranceTypeName = insuranceTypeName;
	}

	public long getInsuranceCatalogId() {
		return insuranceCatalogId;
	}
	
	public void setInsuranceCatalogId(long insuranceCatalogId) {
		this.insuranceCatalogId = insuranceCatalogId;
	}

	public String getInsuranceCatalogName() {
		return insuranceCatalogName;
	}
	
	public void setInsuranceCatalogName(String insuranceCatalogName) {
		this.insuranceCatalogName = insuranceCatalogName;
	}

	public Money getInsuranceAmount() {
		return insuranceAmount;
	}
	
	public void setInsuranceAmount(Money insuranceAmount) {
		if (insuranceAmount == null) {
			this.insuranceAmount = new Money(0, 0);
		} else {
			this.insuranceAmount = insuranceAmount;
		}
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

	public Date getInsuranceDate() {
		return insuranceDate;
	}
	
	public void setInsuranceDate(Date insuranceDate) {
		this.insuranceDate = insuranceDate;
	}

	public Date getBeginDate() {
		return beginDate;
	}
	
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public long getInsuranceCompanyId() {
		return insuranceCompanyId;
	}
	
	public void setInsuranceCompanyId(long insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}

	public String getInsuranceCompanyName() {
		return insuranceCompanyName;
	}
	
	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}

	public long getAgencyCompanyId() {
		return agencyCompanyId;
	}
	
	public void setAgencyCompanyId(long agencyCompanyId) {
		this.agencyCompanyId = agencyCompanyId;
	}

	public String getAgencyCompanyName() {
		return agencyCompanyName;
	}
	
	public void setAgencyCompanyName(String agencyCompanyName) {
		this.agencyCompanyName = agencyCompanyName;
	}

	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getSorceBusinessBillId() {
		return sorceBusinessBillId;
	}
	
	public void setSorceBusinessBillId(long sorceBusinessBillId) {
		this.sorceBusinessBillId = sorceBusinessBillId;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public long getVersion() {
		return version;
	}
	
	public void setVersion(long version) {
		this.version = version;
	}

	public long getCreatorId() {
		return creatorId;
	}
	
	public void setCreatorId(long creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return creatorName;
	}
	
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
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

	public double getBrokerScale() {
		return brokerScale;
	}

	public void setBrokerScale(double brokerScale) {
		this.brokerScale = brokerScale;
	}

	public double getCommonScale() {
		return commonScale;
	}

	public void setCommonScale(double commonScale) {
		this.commonScale = commonScale;
	}

	public double getGrossRate() {
		return grossRate;
	}

	public void setGrossRate(double grossRate) {
		this.grossRate = grossRate;
	}

	public Money getGrossProfit() {
		return grossProfit;
	}

	public void setGrossProfit(Money grossProfit) {
		this.grossProfit = grossProfit;
	}

	public Money getBrokerVal() {
		return brokerVal;
	}

	public void setBrokerVal(Money brokerVal) {
		this.brokerVal = brokerVal;
	}

	public Money getCommonVal() {
		return commonVal;
	}

	public void setCommonVal(Money commonVal) {
		this.commonVal = commonVal;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	



}