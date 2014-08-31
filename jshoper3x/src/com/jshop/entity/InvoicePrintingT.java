package com.jshop.entity;

// Generated 2014-8-31 17:32:38 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InvoicePrintingT generated by hbm2java
 */
@Entity
@Table(name = "invoice_printing_t", catalog = "jshoper3")
public class InvoicePrintingT implements java.io.Serializable {

	private String invoicePrintingId;
	private String orderid;
	private String operatorname;
	private Date createPrintingTime;

	public InvoicePrintingT() {
	}

	public InvoicePrintingT(String invoicePrintingId, String orderid,
			String operatorname, Date createPrintingTime) {
		this.invoicePrintingId = invoicePrintingId;
		this.orderid = orderid;
		this.operatorname = operatorname;
		this.createPrintingTime = createPrintingTime;
	}

	@Id
	@Column(name = "INVOICE_PRINTING_ID", unique = true, nullable = false, length = 20)
	public String getInvoicePrintingId() {
		return this.invoicePrintingId;
	}

	public void setInvoicePrintingId(String invoicePrintingId) {
		this.invoicePrintingId = invoicePrintingId;
	}

	@Column(name = "ORDERID", nullable = false, length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "OPERATORNAME", nullable = false, length = 50)
	public String getOperatorname() {
		return this.operatorname;
	}

	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_PRINTING_TIME", nullable = false, length = 0)
	public Date getCreatePrintingTime() {
		return this.createPrintingTime;
	}

	public void setCreatePrintingTime(Date createPrintingTime) {
		this.createPrintingTime = createPrintingTime;
	}

}
