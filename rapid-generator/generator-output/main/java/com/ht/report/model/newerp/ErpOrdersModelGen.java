package com.ht.report.model.newerp;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/** 
* erp_orders 表的Model
*/
public class ErpOrdersModelGen {

	//===========================================代码生成开始============================================

    //columns 开始
    private java.lang.Integer id;//主键
    private java.lang.String erpOrdersSn;//ERPè®¢å•å†…å•å·
    private java.lang.String ordersSn;//分销平台客户单号
    private java.lang.Integer fxOrderId;//分销平台内单号
    private java.lang.String buyerName;//买家名称
    private java.lang.String buyerPhone;//买家电话
    private java.lang.String buyerEmail;//买家邮箱
    private java.lang.String buyerAddress1;//买家地址1
    private java.lang.String buyerAddress2;//买家地址2
    private java.lang.String buyerCity;//买家城市
    private java.lang.String buyerState;//买家省
    private java.lang.String buyerZip;//买家邮编
    private java.lang.String buyerZone;//地区
    private java.lang.String regionIds;//省市区（0-0-0）
    private java.lang.String zoneCode;//地区行政编码
    private java.lang.String buyerCountry;//买家国家
    private java.math.BigDecimal ordersTotal;//订单总额
    private java.math.BigDecimal actualOrdersTotal;//折扣后的总价
    private java.math.BigDecimal marketValue;//订单市场金额(推送支付平台)
    private java.math.BigDecimal fxOrdersTotal;//分销商卖给客户的原始价格
    private java.math.BigDecimal fxActualOrdersTotal;//分销商卖给客户的实际价格
    private java.math.BigDecimal shopAmount;//店铺应收金额
    private java.math.BigDecimal ordersShipFee;//运费
    private java.math.BigDecimal consolidatedTax;//综合税=(消费税+增值税)*0.7
    private java.lang.String currencyType;//汇率类型
    private java.math.BigDecimal currencyValue;//汇率
    private Integer shippingMethod;//运输方式
    private java.lang.String payId;//交易号
    private Integer payMethod;//
    private java.lang.String salesAccount;//分销商
    private java.lang.Integer distributorsId;//分销平台分销商id
    private java.lang.Integer erpUserId;//erp操作人
    private java.lang.Integer ordersType;//订单类型(0.一票一种一件1.一票一种多件，2一票多种多件)
    private Integer ordersStatus;//订单状态(10:新建 20:已打印 30:核对出库 90:已取消 100:已发货)
    private Integer returnStatus;//销售退货状态(10退货中,20已退货,30已退款)
    private java.util.Date ordersExportTime;//订单进入ERP的时间
    private java.util.Date ordersShippingTime;//发货时间
    private Integer ordersEdit;//订单是否更新
    private java.math.BigDecimal heavi;//重量
    private java.math.BigDecimal actualHeavi;//实际重量
    private java.lang.Integer toid;//合并拆分后id
    private java.lang.String orderType;//平台类型
    private java.lang.String suffix;//发货类型
    private java.lang.Integer businessType;//1:一般贸易/2：海外直邮/3：香港直邮/4：国内保税
    private java.lang.String siteUrl;//平台地址
    private java.lang.String consumerNote;//买家留言
    private java.lang.String certificate;//身份证
    private java.lang.String postRoad;//邮路
    private java.lang.String transportion;//订单物流单号
    private java.lang.String idCardFont;//
    private java.lang.String idCardBack;//
    private Integer isVerification;//0:待验证；1已验证
    private java.lang.String errorType;//异常类型:1金额超2000,2身份认证失败,3重量超10Kg,4订单缺货,5身份证消费超2w,6姓名有问题,7身份证格式,8地址不规范,9订单SKU种类超4,10电话号码超20000,a订单SKU总数超25,b特殊sku订单,c.特殊分销商订单e.税金异常
    private Integer ishandle;//订单是否处理过（0未处理 1已处理）
    private Integer ispush;//是否推送风控系统
    private java.util.Date deliveryTime;//ERP订单计划发货时间
    private java.lang.String orderGroup;//订单分组
    private java.lang.Integer warehouseId;//仓库id
    private java.lang.Integer areaCustomId;//海关区域(1香港,2广州,3深圳,4杭州)
    private java.lang.String batchNumber;//面单打印批次号
    private Integer pickupWay;//客户提货方式(自送:0自提:1)
    private java.lang.String paymentAccount;//
    private Integer isVirtualStore;//
    private java.util.Date orderCreateTime;//
    private java.util.Date fxOrderCreateTime;//分销平台的订单创建时间
    private java.util.Date orderPayTime;//网站订单支付时间
    private java.util.Date orderConfirmTime;//网站订单确认时间
    private java.util.Date orderCheckTime;//网站订单审核时间
    private java.util.Date orderAuditTime;//ERP客服审单时间
    private java.util.Date customsAuditTime;//海关审核时间
    private java.util.Date taxPayTime;//缴税时间
    private java.lang.Integer pushStatus;//推送状态
    private java.lang.Boolean itype;//订单类型
    private java.lang.Boolean erpOrderType;//订单类型(0.一般销售订单,1.代发销售订单,2.不良品销售订单,3.其它,4.临期品销售订单,8海外直邮)
    private java.lang.Boolean isExport;//是否导出(0未导出,1导出)
    private java.lang.String siteOrderNo;//平台订单号
    private java.lang.String payAccount;//匹对收款帐号
    private Integer isUse;//
    private java.lang.String paymentInfoMethod;//支付方式
    private java.lang.String paymentInfoNumber;//支付流水号
    private java.lang.String paymentInfoName;//支付人姓名
    private java.lang.String paymentInfoIdCardNumber;//支付人身份证号
    private java.lang.String path;//
    private java.lang.String noticemessage;//推送保税仓提示信息
    private java.lang.Integer printStatus;//打印面单状态
    private java.lang.String notReachDelivery;//无法送达的快递id字符串(id之间逗号隔开)
    private Integer split;//0/1拆单/不拆单
    private java.lang.Integer chooseWarehouseStatus;//10:初始/20加入处理队列/30选仓失败/40选仓成功
    private java.lang.String chooseWarehouseMessage;//选仓结果描述
    private Integer payment;//推送支付平台状态(0/1/2/3 未推送/已推送/成功/失败)
    private java.lang.Integer pushExpress;//快递推送状态 默认为0 推送失败为2，成功为1
    private Integer customs;//推送海关0/1/2/3未同步/成功/失败/已同步
    private Integer bondedwarehouse;//推送保税wms系统状态(0/1/2未/成功/失败)
    private java.lang.String paymentMessage;//推送支付返回的信息
    private java.lang.String customsMessage;//推送海关返回的信息
    private java.lang.String bondedwarehouseMeassage;//推送保税仓提示信息
    private java.lang.String expressMessage;//
    private java.lang.String carBatch;//车次
    private java.lang.String invtNo;//清单编号
    private java.lang.Boolean isPayTax;//是否缴纳税款；0:未缴纳 1:已经缴纳
	//columns 结束



  	/**
     * 主键
     *
     * @param value
     */
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	/**
     * 主键
     */
	public java.lang.Integer getId() {
		return this.id;
	}

  	/**
     * ERPè®¢å•å†…å•å·
     *
     * @param value
     */
	public void setErpOrdersSn(java.lang.String value) {
		this.erpOrdersSn = value;
	}
	
	/**
     * ERPè®¢å•å†…å•å·
     */
	public java.lang.String getErpOrdersSn() {
		return this.erpOrdersSn;
	}

  	/**
     * 分销平台客户单号
     *
     * @param value
     */
	public void setOrdersSn(java.lang.String value) {
		this.ordersSn = value;
	}
	
	/**
     * 分销平台客户单号
     */
	public java.lang.String getOrdersSn() {
		return this.ordersSn;
	}

  	/**
     * 分销平台内单号
     *
     * @param value
     */
	public void setFxOrderId(java.lang.Integer value) {
		this.fxOrderId = value;
	}
	
	/**
     * 分销平台内单号
     */
	public java.lang.Integer getFxOrderId() {
		return this.fxOrderId;
	}

  	/**
     * 买家名称
     *
     * @param value
     */
	public void setBuyerName(java.lang.String value) {
		this.buyerName = value;
	}
	
	/**
     * 买家名称
     */
	public java.lang.String getBuyerName() {
		return this.buyerName;
	}

  	/**
     * 买家电话
     *
     * @param value
     */
	public void setBuyerPhone(java.lang.String value) {
		this.buyerPhone = value;
	}
	
	/**
     * 买家电话
     */
	public java.lang.String getBuyerPhone() {
		return this.buyerPhone;
	}

  	/**
     * 买家邮箱
     *
     * @param value
     */
	public void setBuyerEmail(java.lang.String value) {
		this.buyerEmail = value;
	}
	
	/**
     * 买家邮箱
     */
	public java.lang.String getBuyerEmail() {
		return this.buyerEmail;
	}

  	/**
     * 买家地址1
     *
     * @param value
     */
	public void setBuyerAddress1(java.lang.String value) {
		this.buyerAddress1 = value;
	}
	
	/**
     * 买家地址1
     */
	public java.lang.String getBuyerAddress1() {
		return this.buyerAddress1;
	}

  	/**
     * 买家地址2
     *
     * @param value
     */
	public void setBuyerAddress2(java.lang.String value) {
		this.buyerAddress2 = value;
	}
	
	/**
     * 买家地址2
     */
	public java.lang.String getBuyerAddress2() {
		return this.buyerAddress2;
	}

  	/**
     * 买家城市
     *
     * @param value
     */
	public void setBuyerCity(java.lang.String value) {
		this.buyerCity = value;
	}
	
	/**
     * 买家城市
     */
	public java.lang.String getBuyerCity() {
		return this.buyerCity;
	}

  	/**
     * 买家省
     *
     * @param value
     */
	public void setBuyerState(java.lang.String value) {
		this.buyerState = value;
	}
	
	/**
     * 买家省
     */
	public java.lang.String getBuyerState() {
		return this.buyerState;
	}

  	/**
     * 买家邮编
     *
     * @param value
     */
	public void setBuyerZip(java.lang.String value) {
		this.buyerZip = value;
	}
	
	/**
     * 买家邮编
     */
	public java.lang.String getBuyerZip() {
		return this.buyerZip;
	}

  	/**
     * 地区
     *
     * @param value
     */
	public void setBuyerZone(java.lang.String value) {
		this.buyerZone = value;
	}
	
	/**
     * 地区
     */
	public java.lang.String getBuyerZone() {
		return this.buyerZone;
	}

  	/**
     * 省市区（0-0-0）
     *
     * @param value
     */
	public void setRegionIds(java.lang.String value) {
		this.regionIds = value;
	}
	
	/**
     * 省市区（0-0-0）
     */
	public java.lang.String getRegionIds() {
		return this.regionIds;
	}

  	/**
     * 地区行政编码
     *
     * @param value
     */
	public void setZoneCode(java.lang.String value) {
		this.zoneCode = value;
	}
	
	/**
     * 地区行政编码
     */
	public java.lang.String getZoneCode() {
		return this.zoneCode;
	}

  	/**
     * 买家国家
     *
     * @param value
     */
	public void setBuyerCountry(java.lang.String value) {
		this.buyerCountry = value;
	}
	
	/**
     * 买家国家
     */
	public java.lang.String getBuyerCountry() {
		return this.buyerCountry;
	}

  	/**
     * 订单总额
     *
     * @param value
     */
	public void setOrdersTotal(java.math.BigDecimal value) {
		this.ordersTotal = value;
	}
	
	/**
     * 订单总额
     */
	public java.math.BigDecimal getOrdersTotal() {
		return this.ordersTotal;
	}

  	/**
     * 折扣后的总价
     *
     * @param value
     */
	public void setActualOrdersTotal(java.math.BigDecimal value) {
		this.actualOrdersTotal = value;
	}
	
	/**
     * 折扣后的总价
     */
	public java.math.BigDecimal getActualOrdersTotal() {
		return this.actualOrdersTotal;
	}

  	/**
     * 订单市场金额(推送支付平台)
     *
     * @param value
     */
	public void setMarketValue(java.math.BigDecimal value) {
		this.marketValue = value;
	}
	
	/**
     * 订单市场金额(推送支付平台)
     */
	public java.math.BigDecimal getMarketValue() {
		return this.marketValue;
	}

  	/**
     * 分销商卖给客户的原始价格
     *
     * @param value
     */
	public void setFxOrdersTotal(java.math.BigDecimal value) {
		this.fxOrdersTotal = value;
	}
	
	/**
     * 分销商卖给客户的原始价格
     */
	public java.math.BigDecimal getFxOrdersTotal() {
		return this.fxOrdersTotal;
	}

  	/**
     * 分销商卖给客户的实际价格
     *
     * @param value
     */
	public void setFxActualOrdersTotal(java.math.BigDecimal value) {
		this.fxActualOrdersTotal = value;
	}
	
	/**
     * 分销商卖给客户的实际价格
     */
	public java.math.BigDecimal getFxActualOrdersTotal() {
		return this.fxActualOrdersTotal;
	}

  	/**
     * 店铺应收金额
     *
     * @param value
     */
	public void setShopAmount(java.math.BigDecimal value) {
		this.shopAmount = value;
	}
	
	/**
     * 店铺应收金额
     */
	public java.math.BigDecimal getShopAmount() {
		return this.shopAmount;
	}

  	/**
     * 运费
     *
     * @param value
     */
	public void setOrdersShipFee(java.math.BigDecimal value) {
		this.ordersShipFee = value;
	}
	
	/**
     * 运费
     */
	public java.math.BigDecimal getOrdersShipFee() {
		return this.ordersShipFee;
	}

  	/**
     * 综合税=(消费税+增值税)*0.7
     *
     * @param value
     */
	public void setConsolidatedTax(java.math.BigDecimal value) {
		this.consolidatedTax = value;
	}
	
	/**
     * 综合税=(消费税+增值税)*0.7
     */
	public java.math.BigDecimal getConsolidatedTax() {
		return this.consolidatedTax;
	}

  	/**
     * 汇率类型
     *
     * @param value
     */
	public void setCurrencyType(java.lang.String value) {
		this.currencyType = value;
	}
	
	/**
     * 汇率类型
     */
	public java.lang.String getCurrencyType() {
		return this.currencyType;
	}

  	/**
     * 汇率
     *
     * @param value
     */
	public void setCurrencyValue(java.math.BigDecimal value) {
		this.currencyValue = value;
	}
	
	/**
     * 汇率
     */
	public java.math.BigDecimal getCurrencyValue() {
		return this.currencyValue;
	}

  	/**
     * 运输方式
     *
     * @param value
     */
	public void setShippingMethod(Integer value) {
		this.shippingMethod = value;
	}
	
	/**
     * 运输方式
     */
	public Integer getShippingMethod() {
		return this.shippingMethod;
	}

  	/**
     * 交易号
     *
     * @param value
     */
	public void setPayId(java.lang.String value) {
		this.payId = value;
	}
	
	/**
     * 交易号
     */
	public java.lang.String getPayId() {
		return this.payId;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPayMethod(Integer value) {
		this.payMethod = value;
	}
	
	/**
     * 
     */
	public Integer getPayMethod() {
		return this.payMethod;
	}

  	/**
     * 分销商
     *
     * @param value
     */
	public void setSalesAccount(java.lang.String value) {
		this.salesAccount = value;
	}
	
	/**
     * 分销商
     */
	public java.lang.String getSalesAccount() {
		return this.salesAccount;
	}

  	/**
     * 分销平台分销商id
     *
     * @param value
     */
	public void setDistributorsId(java.lang.Integer value) {
		this.distributorsId = value;
	}
	
	/**
     * 分销平台分销商id
     */
	public java.lang.Integer getDistributorsId() {
		return this.distributorsId;
	}

  	/**
     * erp操作人
     *
     * @param value
     */
	public void setErpUserId(java.lang.Integer value) {
		this.erpUserId = value;
	}
	
	/**
     * erp操作人
     */
	public java.lang.Integer getErpUserId() {
		return this.erpUserId;
	}

  	/**
     * 订单类型(0.一票一种一件1.一票一种多件，2一票多种多件)
     *
     * @param value
     */
	public void setOrdersType(java.lang.Integer value) {
		this.ordersType = value;
	}
	
	/**
     * 订单类型(0.一票一种一件1.一票一种多件，2一票多种多件)
     */
	public java.lang.Integer getOrdersType() {
		return this.ordersType;
	}

  	/**
     * 订单状态(10:新建 20:已打印 30:核对出库 90:已取消 100:已发货)
     *
     * @param value
     */
	public void setOrdersStatus(Integer value) {
		this.ordersStatus = value;
	}
	
	/**
     * 订单状态(10:新建 20:已打印 30:核对出库 90:已取消 100:已发货)
     */
	public Integer getOrdersStatus() {
		return this.ordersStatus;
	}

  	/**
     * 销售退货状态(10退货中,20已退货,30已退款)
     *
     * @param value
     */
	public void setReturnStatus(Integer value) {
		this.returnStatus = value;
	}
	
	/**
     * 销售退货状态(10退货中,20已退货,30已退款)
     */
	public Integer getReturnStatus() {
		return this.returnStatus;
	}

  	/**
     * 订单进入ERP的时间
     *
     * @param value
     */
	public void setOrdersExportTime(java.util.Date value) {
		this.ordersExportTime = value;
	}
	
	/**
     * 订单进入ERP的时间
     */
	public java.util.Date getOrdersExportTime() {
		return this.ordersExportTime;
	}

  	/**
     * 发货时间
     *
     * @param value
     */
	public void setOrdersShippingTime(java.util.Date value) {
		this.ordersShippingTime = value;
	}
	
	/**
     * 发货时间
     */
	public java.util.Date getOrdersShippingTime() {
		return this.ordersShippingTime;
	}

  	/**
     * 订单是否更新
     *
     * @param value
     */
	public void setOrdersEdit(Integer value) {
		this.ordersEdit = value;
	}
	
	/**
     * 订单是否更新
     */
	public Integer getOrdersEdit() {
		return this.ordersEdit;
	}

  	/**
     * 重量
     *
     * @param value
     */
	public void setHeavi(java.math.BigDecimal value) {
		this.heavi = value;
	}
	
	/**
     * 重量
     */
	public java.math.BigDecimal getHeavi() {
		return this.heavi;
	}

  	/**
     * 实际重量
     *
     * @param value
     */
	public void setActualHeavi(java.math.BigDecimal value) {
		this.actualHeavi = value;
	}
	
	/**
     * 实际重量
     */
	public java.math.BigDecimal getActualHeavi() {
		return this.actualHeavi;
	}

  	/**
     * 合并拆分后id
     *
     * @param value
     */
	public void setToid(java.lang.Integer value) {
		this.toid = value;
	}
	
	/**
     * 合并拆分后id
     */
	public java.lang.Integer getToid() {
		return this.toid;
	}

  	/**
     * 平台类型
     *
     * @param value
     */
	public void setOrderType(java.lang.String value) {
		this.orderType = value;
	}
	
	/**
     * 平台类型
     */
	public java.lang.String getOrderType() {
		return this.orderType;
	}

  	/**
     * 发货类型
     *
     * @param value
     */
	public void setSuffix(java.lang.String value) {
		this.suffix = value;
	}
	
	/**
     * 发货类型
     */
	public java.lang.String getSuffix() {
		return this.suffix;
	}

  	/**
     * 1:一般贸易/2：海外直邮/3：香港直邮/4：国内保税
     *
     * @param value
     */
	public void setBusinessType(java.lang.Integer value) {
		this.businessType = value;
	}
	
	/**
     * 1:一般贸易/2：海外直邮/3：香港直邮/4：国内保税
     */
	public java.lang.Integer getBusinessType() {
		return this.businessType;
	}

  	/**
     * 平台地址
     *
     * @param value
     */
	public void setSiteUrl(java.lang.String value) {
		this.siteUrl = value;
	}
	
	/**
     * 平台地址
     */
	public java.lang.String getSiteUrl() {
		return this.siteUrl;
	}

  	/**
     * 买家留言
     *
     * @param value
     */
	public void setConsumerNote(java.lang.String value) {
		this.consumerNote = value;
	}
	
	/**
     * 买家留言
     */
	public java.lang.String getConsumerNote() {
		return this.consumerNote;
	}

  	/**
     * 身份证
     *
     * @param value
     */
	public void setCertificate(java.lang.String value) {
		this.certificate = value;
	}
	
	/**
     * 身份证
     */
	public java.lang.String getCertificate() {
		return this.certificate;
	}

  	/**
     * 邮路
     *
     * @param value
     */
	public void setPostRoad(java.lang.String value) {
		this.postRoad = value;
	}
	
	/**
     * 邮路
     */
	public java.lang.String getPostRoad() {
		return this.postRoad;
	}

  	/**
     * 订单物流单号
     *
     * @param value
     */
	public void setTransportion(java.lang.String value) {
		this.transportion = value;
	}
	
	/**
     * 订单物流单号
     */
	public java.lang.String getTransportion() {
		return this.transportion;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setIdCardFont(java.lang.String value) {
		this.idCardFont = value;
	}
	
	/**
     * 
     */
	public java.lang.String getIdCardFont() {
		return this.idCardFont;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setIdCardBack(java.lang.String value) {
		this.idCardBack = value;
	}
	
	/**
     * 
     */
	public java.lang.String getIdCardBack() {
		return this.idCardBack;
	}

  	/**
     * 0:待验证；1已验证
     *
     * @param value
     */
	public void setIsVerification(Integer value) {
		this.isVerification = value;
	}
	
	/**
     * 0:待验证；1已验证
     */
	public Integer getIsVerification() {
		return this.isVerification;
	}

  	/**
     * 异常类型:1金额超2000,2身份认证失败,3重量超10Kg,4订单缺货,5身份证消费超2w,6姓名有问题,7身份证格式,8地址不规范,9订单SKU种类超4,10电话号码超20000,a订单SKU总数超25,b特殊sku订单,c.特殊分销商订单e.税金异常
     *
     * @param value
     */
	public void setErrorType(java.lang.String value) {
		this.errorType = value;
	}
	
	/**
     * 异常类型:1金额超2000,2身份认证失败,3重量超10Kg,4订单缺货,5身份证消费超2w,6姓名有问题,7身份证格式,8地址不规范,9订单SKU种类超4,10电话号码超20000,a订单SKU总数超25,b特殊sku订单,c.特殊分销商订单e.税金异常
     */
	public java.lang.String getErrorType() {
		return this.errorType;
	}

  	/**
     * 订单是否处理过（0未处理 1已处理）
     *
     * @param value
     */
	public void setIshandle(Integer value) {
		this.ishandle = value;
	}
	
	/**
     * 订单是否处理过（0未处理 1已处理）
     */
	public Integer getIshandle() {
		return this.ishandle;
	}

  	/**
     * 是否推送风控系统
     *
     * @param value
     */
	public void setIspush(Integer value) {
		this.ispush = value;
	}
	
	/**
     * 是否推送风控系统
     */
	public Integer getIspush() {
		return this.ispush;
	}

  	/**
     * ERP订单计划发货时间
     *
     * @param value
     */
	public void setDeliveryTime(java.util.Date value) {
		this.deliveryTime = value;
	}
	
	/**
     * ERP订单计划发货时间
     */
	public java.util.Date getDeliveryTime() {
		return this.deliveryTime;
	}

  	/**
     * 订单分组
     *
     * @param value
     */
	public void setOrderGroup(java.lang.String value) {
		this.orderGroup = value;
	}
	
	/**
     * 订单分组
     */
	public java.lang.String getOrderGroup() {
		return this.orderGroup;
	}

  	/**
     * 仓库id
     *
     * @param value
     */
	public void setWarehouseId(java.lang.Integer value) {
		this.warehouseId = value;
	}
	
	/**
     * 仓库id
     */
	public java.lang.Integer getWarehouseId() {
		return this.warehouseId;
	}

  	/**
     * 海关区域(1香港,2广州,3深圳,4杭州)
     *
     * @param value
     */
	public void setAreaCustomId(java.lang.Integer value) {
		this.areaCustomId = value;
	}
	
	/**
     * 海关区域(1香港,2广州,3深圳,4杭州)
     */
	public java.lang.Integer getAreaCustomId() {
		return this.areaCustomId;
	}

  	/**
     * 面单打印批次号
     *
     * @param value
     */
	public void setBatchNumber(java.lang.String value) {
		this.batchNumber = value;
	}
	
	/**
     * 面单打印批次号
     */
	public java.lang.String getBatchNumber() {
		return this.batchNumber;
	}

  	/**
     * 客户提货方式(自送:0自提:1)
     *
     * @param value
     */
	public void setPickupWay(Integer value) {
		this.pickupWay = value;
	}
	
	/**
     * 客户提货方式(自送:0自提:1)
     */
	public Integer getPickupWay() {
		return this.pickupWay;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPaymentAccount(java.lang.String value) {
		this.paymentAccount = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPaymentAccount() {
		return this.paymentAccount;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setIsVirtualStore(Integer value) {
		this.isVirtualStore = value;
	}
	
	/**
     * 
     */
	public Integer getIsVirtualStore() {
		return this.isVirtualStore;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setOrderCreateTime(java.util.Date value) {
		this.orderCreateTime = value;
	}
	
	/**
     * 
     */
	public java.util.Date getOrderCreateTime() {
		return this.orderCreateTime;
	}

  	/**
     * 分销平台的订单创建时间
     *
     * @param value
     */
	public void setFxOrderCreateTime(java.util.Date value) {
		this.fxOrderCreateTime = value;
	}
	
	/**
     * 分销平台的订单创建时间
     */
	public java.util.Date getFxOrderCreateTime() {
		return this.fxOrderCreateTime;
	}

  	/**
     * 网站订单支付时间
     *
     * @param value
     */
	public void setOrderPayTime(java.util.Date value) {
		this.orderPayTime = value;
	}
	
	/**
     * 网站订单支付时间
     */
	public java.util.Date getOrderPayTime() {
		return this.orderPayTime;
	}

  	/**
     * 网站订单确认时间
     *
     * @param value
     */
	public void setOrderConfirmTime(java.util.Date value) {
		this.orderConfirmTime = value;
	}
	
	/**
     * 网站订单确认时间
     */
	public java.util.Date getOrderConfirmTime() {
		return this.orderConfirmTime;
	}

  	/**
     * 网站订单审核时间
     *
     * @param value
     */
	public void setOrderCheckTime(java.util.Date value) {
		this.orderCheckTime = value;
	}
	
	/**
     * 网站订单审核时间
     */
	public java.util.Date getOrderCheckTime() {
		return this.orderCheckTime;
	}

  	/**
     * ERP客服审单时间
     *
     * @param value
     */
	public void setOrderAuditTime(java.util.Date value) {
		this.orderAuditTime = value;
	}
	
	/**
     * ERP客服审单时间
     */
	public java.util.Date getOrderAuditTime() {
		return this.orderAuditTime;
	}

  	/**
     * 海关审核时间
     *
     * @param value
     */
	public void setCustomsAuditTime(java.util.Date value) {
		this.customsAuditTime = value;
	}
	
	/**
     * 海关审核时间
     */
	public java.util.Date getCustomsAuditTime() {
		return this.customsAuditTime;
	}

  	/**
     * 缴税时间
     *
     * @param value
     */
	public void setTaxPayTime(java.util.Date value) {
		this.taxPayTime = value;
	}
	
	/**
     * 缴税时间
     */
	public java.util.Date getTaxPayTime() {
		return this.taxPayTime;
	}

  	/**
     * 推送状态
     *
     * @param value
     */
	public void setPushStatus(java.lang.Integer value) {
		this.pushStatus = value;
	}
	
	/**
     * 推送状态
     */
	public java.lang.Integer getPushStatus() {
		return this.pushStatus;
	}

  	/**
     * 订单类型
     *
     * @param value
     */
	public void setItype(java.lang.Boolean value) {
		this.itype = value;
	}
	
	/**
     * 订单类型
     */
	public java.lang.Boolean getItype() {
		return this.itype;
	}

  	/**
     * 订单类型(0.一般销售订单,1.代发销售订单,2.不良品销售订单,3.其它,4.临期品销售订单,8海外直邮)
     *
     * @param value
     */
	public void setErpOrderType(java.lang.Boolean value) {
		this.erpOrderType = value;
	}
	
	/**
     * 订单类型(0.一般销售订单,1.代发销售订单,2.不良品销售订单,3.其它,4.临期品销售订单,8海外直邮)
     */
	public java.lang.Boolean getErpOrderType() {
		return this.erpOrderType;
	}

  	/**
     * 是否导出(0未导出,1导出)
     *
     * @param value
     */
	public void setIsExport(java.lang.Boolean value) {
		this.isExport = value;
	}
	
	/**
     * 是否导出(0未导出,1导出)
     */
	public java.lang.Boolean getIsExport() {
		return this.isExport;
	}

  	/**
     * 平台订单号
     *
     * @param value
     */
	public void setSiteOrderNo(java.lang.String value) {
		this.siteOrderNo = value;
	}
	
	/**
     * 平台订单号
     */
	public java.lang.String getSiteOrderNo() {
		return this.siteOrderNo;
	}

  	/**
     * 匹对收款帐号
     *
     * @param value
     */
	public void setPayAccount(java.lang.String value) {
		this.payAccount = value;
	}
	
	/**
     * 匹对收款帐号
     */
	public java.lang.String getPayAccount() {
		return this.payAccount;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setIsUse(Integer value) {
		this.isUse = value;
	}
	
	/**
     * 
     */
	public Integer getIsUse() {
		return this.isUse;
	}

  	/**
     * 支付方式
     *
     * @param value
     */
	public void setPaymentInfoMethod(java.lang.String value) {
		this.paymentInfoMethod = value;
	}
	
	/**
     * 支付方式
     */
	public java.lang.String getPaymentInfoMethod() {
		return this.paymentInfoMethod;
	}

  	/**
     * 支付流水号
     *
     * @param value
     */
	public void setPaymentInfoNumber(java.lang.String value) {
		this.paymentInfoNumber = value;
	}
	
	/**
     * 支付流水号
     */
	public java.lang.String getPaymentInfoNumber() {
		return this.paymentInfoNumber;
	}

  	/**
     * 支付人姓名
     *
     * @param value
     */
	public void setPaymentInfoName(java.lang.String value) {
		this.paymentInfoName = value;
	}
	
	/**
     * 支付人姓名
     */
	public java.lang.String getPaymentInfoName() {
		return this.paymentInfoName;
	}

  	/**
     * 支付人身份证号
     *
     * @param value
     */
	public void setPaymentInfoIdCardNumber(java.lang.String value) {
		this.paymentInfoIdCardNumber = value;
	}
	
	/**
     * 支付人身份证号
     */
	public java.lang.String getPaymentInfoIdCardNumber() {
		return this.paymentInfoIdCardNumber;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setPath(java.lang.String value) {
		this.path = value;
	}
	
	/**
     * 
     */
	public java.lang.String getPath() {
		return this.path;
	}

  	/**
     * 推送保税仓提示信息
     *
     * @param value
     */
	public void setNoticemessage(java.lang.String value) {
		this.noticemessage = value;
	}
	
	/**
     * 推送保税仓提示信息
     */
	public java.lang.String getNoticemessage() {
		return this.noticemessage;
	}

  	/**
     * 打印面单状态
     *
     * @param value
     */
	public void setPrintStatus(java.lang.Integer value) {
		this.printStatus = value;
	}
	
	/**
     * 打印面单状态
     */
	public java.lang.Integer getPrintStatus() {
		return this.printStatus;
	}

  	/**
     * 无法送达的快递id字符串(id之间逗号隔开)
     *
     * @param value
     */
	public void setNotReachDelivery(java.lang.String value) {
		this.notReachDelivery = value;
	}
	
	/**
     * 无法送达的快递id字符串(id之间逗号隔开)
     */
	public java.lang.String getNotReachDelivery() {
		return this.notReachDelivery;
	}

  	/**
     * 0/1拆单/不拆单
     *
     * @param value
     */
	public void setSplit(Integer value) {
		this.split = value;
	}
	
	/**
     * 0/1拆单/不拆单
     */
	public Integer getSplit() {
		return this.split;
	}

  	/**
     * 10:初始/20加入处理队列/30选仓失败/40选仓成功
     *
     * @param value
     */
	public void setChooseWarehouseStatus(java.lang.Integer value) {
		this.chooseWarehouseStatus = value;
	}
	
	/**
     * 10:初始/20加入处理队列/30选仓失败/40选仓成功
     */
	public java.lang.Integer getChooseWarehouseStatus() {
		return this.chooseWarehouseStatus;
	}

  	/**
     * 选仓结果描述
     *
     * @param value
     */
	public void setChooseWarehouseMessage(java.lang.String value) {
		this.chooseWarehouseMessage = value;
	}
	
	/**
     * 选仓结果描述
     */
	public java.lang.String getChooseWarehouseMessage() {
		return this.chooseWarehouseMessage;
	}

  	/**
     * 推送支付平台状态(0/1/2/3 未推送/已推送/成功/失败)
     *
     * @param value
     */
	public void setPayment(Integer value) {
		this.payment = value;
	}
	
	/**
     * 推送支付平台状态(0/1/2/3 未推送/已推送/成功/失败)
     */
	public Integer getPayment() {
		return this.payment;
	}

  	/**
     * 快递推送状态 默认为0 推送失败为2，成功为1
     *
     * @param value
     */
	public void setPushExpress(java.lang.Integer value) {
		this.pushExpress = value;
	}
	
	/**
     * 快递推送状态 默认为0 推送失败为2，成功为1
     */
	public java.lang.Integer getPushExpress() {
		return this.pushExpress;
	}

  	/**
     * 推送海关0/1/2/3未同步/成功/失败/已同步
     *
     * @param value
     */
	public void setCustoms(Integer value) {
		this.customs = value;
	}
	
	/**
     * 推送海关0/1/2/3未同步/成功/失败/已同步
     */
	public Integer getCustoms() {
		return this.customs;
	}

  	/**
     * 推送保税wms系统状态(0/1/2未/成功/失败)
     *
     * @param value
     */
	public void setBondedwarehouse(Integer value) {
		this.bondedwarehouse = value;
	}
	
	/**
     * 推送保税wms系统状态(0/1/2未/成功/失败)
     */
	public Integer getBondedwarehouse() {
		return this.bondedwarehouse;
	}

  	/**
     * 推送支付返回的信息
     *
     * @param value
     */
	public void setPaymentMessage(java.lang.String value) {
		this.paymentMessage = value;
	}
	
	/**
     * 推送支付返回的信息
     */
	public java.lang.String getPaymentMessage() {
		return this.paymentMessage;
	}

  	/**
     * 推送海关返回的信息
     *
     * @param value
     */
	public void setCustomsMessage(java.lang.String value) {
		this.customsMessage = value;
	}
	
	/**
     * 推送海关返回的信息
     */
	public java.lang.String getCustomsMessage() {
		return this.customsMessage;
	}

  	/**
     * 推送保税仓提示信息
     *
     * @param value
     */
	public void setBondedwarehouseMeassage(java.lang.String value) {
		this.bondedwarehouseMeassage = value;
	}
	
	/**
     * 推送保税仓提示信息
     */
	public java.lang.String getBondedwarehouseMeassage() {
		return this.bondedwarehouseMeassage;
	}

  	/**
     * 
     *
     * @param value
     */
	public void setExpressMessage(java.lang.String value) {
		this.expressMessage = value;
	}
	
	/**
     * 
     */
	public java.lang.String getExpressMessage() {
		return this.expressMessage;
	}

  	/**
     * 车次
     *
     * @param value
     */
	public void setCarBatch(java.lang.String value) {
		this.carBatch = value;
	}
	
	/**
     * 车次
     */
	public java.lang.String getCarBatch() {
		return this.carBatch;
	}

  	/**
     * 清单编号
     *
     * @param value
     */
	public void setInvtNo(java.lang.String value) {
		this.invtNo = value;
	}
	
	/**
     * 清单编号
     */
	public java.lang.String getInvtNo() {
		return this.invtNo;
	}

  	/**
     * 是否缴纳税款；0:未缴纳 1:已经缴纳
     *
     * @param value
     */
	public void setIsPayTax(java.lang.Boolean value) {
		this.isPayTax = value;
	}
	
	/**
     * 是否缴纳税款；0:未缴纳 1:已经缴纳
     */
	public java.lang.Boolean getIsPayTax() {
		return this.isPayTax;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("erpOrdersSn",getErpOrdersSn())
			.append("ordersSn",getOrdersSn())
			.append("fxOrderId",getFxOrderId())
			.append("buyerName",getBuyerName())
			.append("buyerPhone",getBuyerPhone())
			.append("buyerEmail",getBuyerEmail())
			.append("buyerAddress1",getBuyerAddress1())
			.append("buyerAddress2",getBuyerAddress2())
			.append("buyerCity",getBuyerCity())
			.append("buyerState",getBuyerState())
			.append("buyerZip",getBuyerZip())
			.append("buyerZone",getBuyerZone())
			.append("regionIds",getRegionIds())
			.append("zoneCode",getZoneCode())
			.append("buyerCountry",getBuyerCountry())
			.append("ordersTotal",getOrdersTotal())
			.append("actualOrdersTotal",getActualOrdersTotal())
			.append("marketValue",getMarketValue())
			.append("fxOrdersTotal",getFxOrdersTotal())
			.append("fxActualOrdersTotal",getFxActualOrdersTotal())
			.append("shopAmount",getShopAmount())
			.append("ordersShipFee",getOrdersShipFee())
			.append("consolidatedTax",getConsolidatedTax())
			.append("currencyType",getCurrencyType())
			.append("currencyValue",getCurrencyValue())
			.append("shippingMethod",getShippingMethod())
			.append("payId",getPayId())
			.append("payMethod",getPayMethod())
			.append("salesAccount",getSalesAccount())
			.append("distributorsId",getDistributorsId())
			.append("erpUserId",getErpUserId())
			.append("ordersType",getOrdersType())
			.append("ordersStatus",getOrdersStatus())
			.append("returnStatus",getReturnStatus())
			.append("ordersExportTime",getOrdersExportTime())
			.append("ordersShippingTime",getOrdersShippingTime())
			.append("ordersEdit",getOrdersEdit())
			.append("heavi",getHeavi())
			.append("actualHeavi",getActualHeavi())
			.append("toid",getToid())
			.append("orderType",getOrderType())
			.append("suffix",getSuffix())
			.append("businessType",getBusinessType())
			.append("siteUrl",getSiteUrl())
			.append("consumerNote",getConsumerNote())
			.append("certificate",getCertificate())
			.append("postRoad",getPostRoad())
			.append("transportion",getTransportion())
			.append("idCardFont",getIdCardFont())
			.append("idCardBack",getIdCardBack())
			.append("isVerification",getIsVerification())
			.append("errorType",getErrorType())
			.append("ishandle",getIshandle())
			.append("ispush",getIspush())
			.append("deliveryTime",getDeliveryTime())
			.append("orderGroup",getOrderGroup())
			.append("warehouseId",getWarehouseId())
			.append("areaCustomId",getAreaCustomId())
			.append("batchNumber",getBatchNumber())
			.append("pickupWay",getPickupWay())
			.append("paymentAccount",getPaymentAccount())
			.append("isVirtualStore",getIsVirtualStore())
			.append("orderCreateTime",getOrderCreateTime())
			.append("fxOrderCreateTime",getFxOrderCreateTime())
			.append("orderPayTime",getOrderPayTime())
			.append("orderConfirmTime",getOrderConfirmTime())
			.append("orderCheckTime",getOrderCheckTime())
			.append("orderAuditTime",getOrderAuditTime())
			.append("customsAuditTime",getCustomsAuditTime())
			.append("taxPayTime",getTaxPayTime())
			.append("pushStatus",getPushStatus())
			.append("itype",getItype())
			.append("erpOrderType",getErpOrderType())
			.append("isExport",getIsExport())
			.append("siteOrderNo",getSiteOrderNo())
			.append("payAccount",getPayAccount())
			.append("isUse",getIsUse())
			.append("paymentInfoMethod",getPaymentInfoMethod())
			.append("paymentInfoNumber",getPaymentInfoNumber())
			.append("paymentInfoName",getPaymentInfoName())
			.append("paymentInfoIdCardNumber",getPaymentInfoIdCardNumber())
			.append("path",getPath())
			.append("noticemessage",getNoticemessage())
			.append("printStatus",getPrintStatus())
			.append("notReachDelivery",getNotReachDelivery())
			.append("split",getSplit())
			.append("chooseWarehouseStatus",getChooseWarehouseStatus())
			.append("chooseWarehouseMessage",getChooseWarehouseMessage())
			.append("payment",getPayment())
			.append("pushExpress",getPushExpress())
			.append("customs",getCustoms())
			.append("bondedwarehouse",getBondedwarehouse())
			.append("paymentMessage",getPaymentMessage())
			.append("customsMessage",getCustomsMessage())
			.append("bondedwarehouseMeassage",getBondedwarehouseMeassage())
			.append("expressMessage",getExpressMessage())
			.append("carBatch",getCarBatch())
			.append("invtNo",getInvtNo())
			.append("isPayTax",getIsPayTax())
			.toString();
	}
	//===========================================代码生成结束============================================
}

