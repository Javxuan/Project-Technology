package com.ht.report.model.newerp;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/** 
* accounts 表的Model
*/
public class AccountsModelGen {

	//===========================================代码生成开始============================================

    //columns 开始
    private java.lang.Integer id;//
    private java.lang.Integer supplierId;//供应商id
    private java.lang.String bankNameCn;//开户银行
    private java.lang.String bankNameEn;//银行名称，英文
    private java.lang.String bankAddressCn;//开户银行地址，中文
    private java.lang.String bankAddressEn;//开户银行地址，英文
    private java.lang.String bankManCn;//开户银行账户，中文
    private java.lang.String bankManEn;//账户名称，英文
    private java.lang.String bankManLo;//收款人地址
    private java.lang.String bankPlace;//受款银行地区(国家和城市)
    private java.lang.String bankNum;//开户银行账号
    private java.lang.String iban;//受款人账户号码/IBAN
    private java.lang.String swift;//国际编号
    private java.lang.Integer payWay;//付款方式ID
    private java.lang.String payType;//付款类型
    private java.util.Date date;//添加时间
    private Integer status;//0不可用1可用
    private java.lang.Integer adder;//添加人
    private java.lang.String passportNumber;//护照号码
    private java.lang.String overseasSocialCard;//身份证号码或国外社保卡号码
	//columns 结束



  	/**
     * 
     *
     * @param value
     */
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	/**
     * 
     */
	public java.lang.Integer getId() {
		return this.id;
	}

  	/**
     * 供应商id
     *
     * @param value
     */
	public void setSupplierId(java.lang.Integer value) {
		this.supplierId = value;
	}
	
	/**
     * 供应商id
     */
	public java.lang.Integer getSupplierId() {
		return this.supplierId;
	}

  	/**
     * 开户银行
     *
     * @param value
     */
	public void setBankNameCn(java.lang.String value) {
		this.bankNameCn = value;
	}
	
	/**
     * 开户银行
     */
	public java.lang.String getBankNameCn() {
		return this.bankNameCn;
	}

  	/**
     * 银行名称，英文
     *
     * @param value
     */
	public void setBankNameEn(java.lang.String value) {
		this.bankNameEn = value;
	}
	
	/**
     * 银行名称，英文
     */
	public java.lang.String getBankNameEn() {
		return this.bankNameEn;
	}

  	/**
     * 开户银行地址，中文
     *
     * @param value
     */
	public void setBankAddressCn(java.lang.String value) {
		this.bankAddressCn = value;
	}
	
	/**
     * 开户银行地址，中文
     */
	public java.lang.String getBankAddressCn() {
		return this.bankAddressCn;
	}

  	/**
     * 开户银行地址，英文
     *
     * @param value
     */
	public void setBankAddressEn(java.lang.String value) {
		this.bankAddressEn = value;
	}
	
	/**
     * 开户银行地址，英文
     */
	public java.lang.String getBankAddressEn() {
		return this.bankAddressEn;
	}

  	/**
     * 开户银行账户，中文
     *
     * @param value
     */
	public void setBankManCn(java.lang.String value) {
		this.bankManCn = value;
	}
	
	/**
     * 开户银行账户，中文
     */
	public java.lang.String getBankManCn() {
		return this.bankManCn;
	}

  	/**
     * 账户名称，英文
     *
     * @param value
     */
	public void setBankManEn(java.lang.String value) {
		this.bankManEn = value;
	}
	
	/**
     * 账户名称，英文
     */
	public java.lang.String getBankManEn() {
		return this.bankManEn;
	}

  	/**
     * 收款人地址
     *
     * @param value
     */
	public void setBankManLo(java.lang.String value) {
		this.bankManLo = value;
	}
	
	/**
     * 收款人地址
     */
	public java.lang.String getBankManLo() {
		return this.bankManLo;
	}

  	/**
     * 受款银行地区(国家和城市)
     *
     * @param value
     */
	public void setBankPlace(java.lang.String value) {
		this.bankPlace = value;
	}
	
	/**
     * 受款银行地区(国家和城市)
     */
	public java.lang.String getBankPlace() {
		return this.bankPlace;
	}

  	/**
     * 开户银行账号
     *
     * @param value
     */
	public void setBankNum(java.lang.String value) {
		this.bankNum = value;
	}
	
	/**
     * 开户银行账号
     */
	public java.lang.String getBankNum() {
		return this.bankNum;
	}

  	/**
     * 受款人账户号码/IBAN
     *
     * @param value
     */
	public void setIban(java.lang.String value) {
		this.iban = value;
	}
	
	/**
     * 受款人账户号码/IBAN
     */
	public java.lang.String getIban() {
		return this.iban;
	}

  	/**
     * 国际编号
     *
     * @param value
     */
	public void setSwift(java.lang.String value) {
		this.swift = value;
	}
	
	/**
     * 国际编号
     */
	public java.lang.String getSwift() {
		return this.swift;
	}

  	/**
     * 付款方式ID
     *
     * @param value
     */
	public void setPayWay(java.lang.Integer value) {
		this.payWay = value;
	}
	
	/**
     * 付款方式ID
     */
	public java.lang.Integer getPayWay() {
		return this.payWay;
	}

  	/**
     * 付款类型
     *
     * @param value
     */
	public void setPayType(java.lang.String value) {
		this.payType = value;
	}
	
	/**
     * 付款类型
     */
	public java.lang.String getPayType() {
		return this.payType;
	}

  	/**
     * 添加时间
     *
     * @param value
     */
	public void setDate(java.util.Date value) {
		this.date = value;
	}
	
	/**
     * 添加时间
     */
	public java.util.Date getDate() {
		return this.date;
	}

  	/**
     * 0不可用1可用
     *
     * @param value
     */
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	/**
     * 0不可用1可用
     */
	public Integer getStatus() {
		return this.status;
	}

  	/**
     * 添加人
     *
     * @param value
     */
	public void setAdder(java.lang.Integer value) {
		this.adder = value;
	}
	
	/**
     * 添加人
     */
	public java.lang.Integer getAdder() {
		return this.adder;
	}

  	/**
     * 护照号码
     *
     * @param value
     */
	public void setPassportNumber(java.lang.String value) {
		this.passportNumber = value;
	}
	
	/**
     * 护照号码
     */
	public java.lang.String getPassportNumber() {
		return this.passportNumber;
	}

  	/**
     * 身份证号码或国外社保卡号码
     *
     * @param value
     */
	public void setOverseasSocialCard(java.lang.String value) {
		this.overseasSocialCard = value;
	}
	
	/**
     * 身份证号码或国外社保卡号码
     */
	public java.lang.String getOverseasSocialCard() {
		return this.overseasSocialCard;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("supplierId",getSupplierId())
			.append("bankNameCn",getBankNameCn())
			.append("bankNameEn",getBankNameEn())
			.append("bankAddressCn",getBankAddressCn())
			.append("bankAddressEn",getBankAddressEn())
			.append("bankManCn",getBankManCn())
			.append("bankManEn",getBankManEn())
			.append("bankManLo",getBankManLo())
			.append("bankPlace",getBankPlace())
			.append("bankNum",getBankNum())
			.append("iban",getIban())
			.append("swift",getSwift())
			.append("payWay",getPayWay())
			.append("payType",getPayType())
			.append("date",getDate())
			.append("status",getStatus())
			.append("adder",getAdder())
			.append("passportNumber",getPassportNumber())
			.append("overseasSocialCard",getOverseasSocialCard())
			.toString();
	}
	//===========================================代码生成结束============================================
}

