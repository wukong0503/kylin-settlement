/*
 * Powered By chanjetpay-code-generator
 * Web Site: http://www.chanjetpay.com
 * Since 2014 - 2015
 */

package com.rkylin.settle.pojo;

import java.io.Serializable;

import com.rop.utils.StringUtils;

/**
 * SettleTransBillQuery
 * @author code-generator
 *
 */
public class SettleTransBillQuery implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private java.lang.Integer transBillId;
	private java.lang.String orderNo;
	private java.lang.String batchNo;
	private java.lang.String billNo;
	private java.lang.String rootInstCd;
	private java.lang.String productId;
	private java.lang.String userId;
	private java.lang.String referUserId;
	private java.lang.Long billAmount;
	private Integer billType;
	private java.lang.String obligate1;
	private java.lang.String obligate2;
	private Integer statusId;
	private java.lang.String remark;
	private java.util.Date accountDate;
	private java.util.Date createdTime;
	private java.util.Date updatedTime;
	
	// 分页
    private java.lang.String orderBy;
    private Integer offset;
    private java.lang.String limit;
    private Integer pageIndex;
    private Integer pageSize;
    
    //记账日期开始
    private java.lang.String accountDateBegin;
    //记账日期结束
    private java.lang.String accountDateEnd;

	/**
	 * 挂账交易id
	 * @param transBillId
	 */
	public void setTransBillId(java.lang.Integer transBillId) {
		this.transBillId = transBillId;
	}
	
	/**
	 * 挂账交易id
	 * @return
	 */
	public java.lang.Integer getTransBillId() {
		return this.transBillId;
	}
	/**
	 * 交易订单号
	 * @param orderNo
	 */
	public void setOrderNo(java.lang.String orderNo) {
		this.orderNo = StringUtils.isEmpty(orderNo)?null:orderNo;
	}
	
	/**
	 * 交易订单号
	 * @return
	 */
	public java.lang.String getOrderNo() {
		return this.orderNo;
	}
	/**
	 * 批次号
	 * @param batchNo
	 */
	public void setBatchNo(java.lang.String batchNo) {
		this.batchNo = batchNo;
	}
	
	/**
	 * 批次号
	 * @return
	 */
	public java.lang.String getBatchNo() {
		return this.batchNo;
	}
	/**
	 * 挂账条目=订单号+0001
	 * @param billNo
	 */
	public void setBillNo(java.lang.String billNo) {
		this.billNo = StringUtils.isEmpty(billNo)?null:billNo;
	}
	
	/**
	 * 挂账条目=订单号+0001
	 * @return
	 */
	public java.lang.String getBillNo() {
		return this.billNo;
	}
	/**
	 * 管理机构代码
	 * @param rootInstCd
	 */
	public void setRootInstCd(java.lang.String rootInstCd) {
		this.rootInstCd = StringUtils.isEmpty(rootInstCd)?null:rootInstCd;
	}
	
	/**
	 * 管理机构代码
	 * @return
	 */
	public java.lang.String getRootInstCd() {
		return this.rootInstCd;
	}
	/**
	 * 产品号
	 * @param productId
	 */
	public void setProductId(java.lang.String productId) {
		this.productId = StringUtils.isEmpty(productId)?null:productId;
	}
	
	/**
	 * 产品号
	 * @return
	 */
	public java.lang.String getProductId() {
		return this.productId;
	}
	/**
	 * 用户ID
	 * @param userId
	 */
	public void setUserId(java.lang.String userId) {
		this.userId = StringUtils.isEmpty(userId)?null:userId;
	}
	
	/**
	 * 用户ID
	 * @return
	 */
	public java.lang.String getUserId() {
		return this.userId;
	}
	/**
	 * 第三方账户ID
	 * @param referUserId
	 */
	public void setReferUserId(java.lang.String referUserId) {
		this.referUserId = referUserId;
	}
	
	/**
	 * 第三方账户ID
	 * @return
	 */
	public java.lang.String getReferUserId() {
		return this.referUserId;
	}
	/**
	 * 挂账金额
	 * @param billAmount
	 */
	public void setBillAmount(java.lang.Long billAmount) {
		this.billAmount = billAmount;
	}
	
	/**
	 * 挂账金额
	 * @return
	 */
	public java.lang.Long getBillAmount() {
		return this.billAmount;
	}
	/**
	 * 挂账类型0差错处理,1退款
	 * @param billType
	 */
	public void setBillType(Integer billType) {
		this.billType = (-1==billType)?null:billType;
	}
	
	/**
	 * 挂账类型0差错处理,1退款
	 * @return
	 */
	public Integer getBillType() {
		return this.billType;
	}
	/**
	 * 预留1
	 * @param obligate1
	 */
	public void setObligate1(java.lang.String obligate1) {
		this.obligate1 = obligate1;
	}
	
	/**
	 * 预留1
	 * @return
	 */
	public java.lang.String getObligate1() {
		return this.obligate1;
	}
	/**
	 * 预留2
	 * @param obligate2
	 */
	public void setObligate2(java.lang.String obligate2) {
		this.obligate2 = obligate2;
	}
	
	/**
	 * 预留2
	 * @return
	 */
	public java.lang.String getObligate2() {
		return this.obligate2;
	}
	/**
	 * 状态
	 * @param statusId
	 */
	public void setStatusId(Integer statusId) {
		this.statusId = (-1==statusId)?null:statusId;
	}
	
	/**
	 * 状态
	 * @return
	 */
	public Integer getStatusId() {
		return this.statusId;
	}
	/**
	 * 备注
	 * @param remark
	 */
	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}
	
	/**
	 * 备注
	 * @return
	 */
	public java.lang.String getRemark() {
		return this.remark;
	}
	/**
	 * 记账日期
	 * @param accountDate
	 */
	public void setAccountDate(java.util.Date accountDate) {
		this.accountDate = accountDate;
	}
	
	/**
	 * 记账日期
	 * @return
	 */
	public java.util.Date getAccountDate() {
		return this.accountDate;
	}
	/**
	 * 记录创建时间
	 * @param createdTime
	 */
	public void setCreatedTime(java.util.Date createdTime) {
		this.createdTime = createdTime;
	}
	
	/**
	 * 记录创建时间
	 * @return
	 */
	public java.util.Date getCreatedTime() {
		return this.createdTime;
	}
	/**
	 * 记录更新时间
	 * @param updatedTime
	 */
	public void setUpdatedTime(java.util.Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	/**
	 * 记录更新时间
	 * @return
	 */
	public java.util.Date getUpdatedTime() {
		return this.updatedTime;
	}

    public java.lang.String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(java.lang.String orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public java.lang.String getLimit() {
        return limit;
    }

    public void setLimit(java.lang.String limit) {
        this.limit = limit;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public java.lang.String getAccountDateBegin() {
        return accountDateBegin;
    }

    public void setAccountDateBegin(java.lang.String accountDateBegin) {
        this.accountDateBegin = StringUtils.isEmpty(accountDateBegin)?null:accountDateBegin;
    }

    public java.lang.String getAccountDateEnd() {
        return accountDateEnd;
    }

    public void setAccountDateEnd(java.lang.String accountDateEnd) {
        this.accountDateEnd = StringUtils.isEmpty(accountDateEnd)?null:accountDateEnd;
    }
	
}