/**
 * TNTConcept Easy Enterprise Management by Autentia Real Bussiness Solution S.L.
 * Copyright (C) 2007 Autentia Real Bussiness Solution S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.autentia.tnt.businessobject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.autentia.tnt.dao.ITransferObject;

/**
 * Transfer object to store Bills
 * @author stajanov code generator
 */
public class Bill implements Serializable, ITransferObject
{
	/** Serial version field */
	private static final long serialVersionUID = -1L;
	
	public static final int MAX_LENGTH = 4096;
	
	private BillType billType;
	
	private Organization provider;
	
	private Contact contact;
	
	private String orderNumber;
	
	private Account account;
	
	private Set<AccountEntry> entries;
	
	private Integer ownerId;
	  
	private Integer departmentId;
	  
	private Date insertDate;  
	  
	private Date updateDate;
	
	private String bookNumber;
	
	private Set<CreditTitle> creditTitles;

	private Integer submitted;
	
	public Set<CreditTitle> getCreditTitles() {
		return creditTitles;
	}
	public void setCreditTitles(Set<CreditTitle> creditTitles) {
		this.creditTitles = creditTitles;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Set<AccountEntry> getEntries()
	{
		return entries;
	}
	public void setEntries( Set<AccountEntry> entries )
	{
		this.entries = entries;
	}
	
	public BillType getBillType()
	{
		return billType;
	}
	public void setBillType( BillType billType )
	{
		this.billType = billType;
	}
	
	public Contact getContact()
	{
		return contact;
	}
	public void setContact( Contact contact )
	{
		this.contact = contact;
	}
	
	public String getOrderNumber()
	{
		return orderNumber;
	}
	public void setOrderNumber( String orderNumber )
	{
		this.orderNumber = orderNumber;
	}
	
	public Organization getProvider()
	{
		return provider;
	}
	
	public void setProvider( Organization provider )
	{
		this.provider = provider;
	}
	
	public int getHasEntries()
	{
		return (entries!=null)?entries.size():0;
	}
	/* bill - generated by stajanov (do not edit/delete) */
	
	public Set<BillBreakDown> getBreakDown()
	{
		return breakDown;
	}
	public void setBreakDown( Set<BillBreakDown> breakDown )
	{
		this.breakDown = breakDown;
	}
	private Set<BillBreakDown> breakDown;
	
	/* bill - generated by stajanov (do not edit/delete) */
	
	private Set<BillPayment> billPayment = new LinkedHashSet<BillPayment>();
	
	public Set<BillPayment> getBillPayment() {
		return billPayment;
	}
	public void setBillPayment(Set<BillPayment> billPayment) {
		this.billPayment = billPayment;
	}
	
	public Date getStartBillDate()
	{
		return startBillDate;
	}
	public void setStartBillDate( Date startBillDate )
	{
		this.startBillDate = startBillDate;
	}
	
	
	
	public Date getEndBillDate()
	{
		return endBillDate;
	}
	public void setEndBillDate( Date endBillDate )
	{
		this.endBillDate = endBillDate;
	}

	public Integer getSubmitted() {
		return submitted;
	}

	public void setSubmitted(Integer submitted) {
		this.submitted = submitted;
	}

// Fields
	
	private Date startBillDate;
	
	
	
	private Date endBillDate;
	
	private Integer id;
	
	
	
	private Date creationDate;
	
	
	
	
	
	private BillPaymentMode paymentMode;
	
	
	
	
	private BillState state;
	
	
	
	private BigDecimal amount;
	
	
	
	private String number;
	
	
	
	private String name;
	
	
	
	private String file;
	
	
	
	private String fileMime;
	
	
	
	private String observations;
	
	
	
	private Project project;
	
	
	
	
	
	
	
	
	
	// Setters and getters
	
	
	
	public Integer getId()
	{
		return id;
	}
	private void setId( Integer id )
	{
		this.id = id;
	}
	
	
	
	public Date getCreationDate()
	{
		return creationDate;
	}
	public void setCreationDate( Date creationDate )
	{
		this.creationDate = creationDate;
	}
	
	
	public BillPaymentMode getPaymentMode()
	{
		return paymentMode;
	}
	public void setPaymentMode( BillPaymentMode paymentMode )
	{
		this.paymentMode = paymentMode;
	}
	
	
	
	public BillState getState()
	{
		return state;
	}
	public void setState( BillState state )
	{
		this.state = state;
	}
	
	
	/*
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount( BigDecimal amount ) {
		this.amount = amount;
	}
	 */
	
	
	public String getNumber()
	{
		return number;
	}
	public void setNumber( String number )
	{
		this.number = number;
	}
	
	
	
	public String getName()
	{
		return name;
	}
	public void setName( String name )
	{
		if (name != null && name.length() > MAX_LENGTH) {
			name = name.substring(0, MAX_LENGTH);
		}
		this.name = name;
	}
	
	
	
	public String getFile()
	{
		return file;
	}
	public void setFile( String file )
	{
		this.file = file;
	}
	
	
	
	public String getFileMime()
	{
		return fileMime;
	}
	public void setFileMime( String fileMime )
	{
		this.fileMime = fileMime;
	}
	
	
	
	public String getObservations()
	{
		return observations;
	}
	public void setObservations( String observations )
	{
		if (observations != null && observations.length() > MAX_LENGTH) {
			observations = observations.substring(0, MAX_LENGTH);
		}
		this.observations = observations;
	}
	
	
	
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	public Project getProject()
	{
		return project;
	}
	public void setProject( Project project )
	{
		this.project = project;
	}
	
	
	
	
	
	
	
	public boolean equals( Object that )
	{
		try {
			if (that == null)
				return false;
			else
				return this.getId().equals( ((Bill)that).getId() );
		} catch (Exception e) {
			return false;
		}
	}
	
	public int hashCode()
	{
		if(this.getId()==null)
			return super.hashCode();
		else
			return this.getId().intValue();
	}
	
	
	
	public BigDecimal getTotal()
	{
		BigDecimal valor = new BigDecimal(0);
		
		if(getBreakDown()!=null)
		{
			for(BillBreakDown elem:getBreakDown())
			{
				valor = valor.add(elem.getTotal());
			}
			
		}
		valor = valor.setScale(2,RoundingMode.HALF_EVEN);
		return valor;
	}
	
	public BigDecimal getBillPaymentTotal()
	{
		BigDecimal valor = new BigDecimal(0);
		if(getBillPayment()!=null)
		{
			for(BillPayment elem:getBillPayment())
			{
				if (elem.getAmount() != null) {
					valor = valor.add(elem.getAmount());
				}
			}
		}
		valor = valor.setScale(2,RoundingMode.HALF_EVEN);
		return valor;
	}
	
	
	public BigDecimal getTotalNoTaxes()
	{
		BigDecimal valor = new BigDecimal(0);
		
		if(getBreakDown()!=null)
		{
			for(BillBreakDown elem:getBreakDown())
			{	if(elem.getAmount()!=null){
					valor = valor.add(elem.getAmount().multiply(elem.getUnits()));
				}
			}
			
		}
		valor = valor.setScale(2,RoundingMode.HALF_EVEN);
		return valor;
	}
	
	public BigDecimal getAmount()
	{
		return amount;
	}
	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}
	
	private Integer entriesNumber;
	
	public Integer getEntriesNumber()
	{
		return entriesNumber;
	}
	public void setEntriesNumber(Integer entriesNumber)
	{
		this.entriesNumber = entriesNumber;
	}
	
	public Date getExpiration() {
		Date expiration = null;
		for (BillPayment payment: billPayment) {
			if (expiration == null) {
				expiration = payment.getExpirationDate();
			}
			
			else if (payment.getExpirationDate() != null && expiration.before(payment.getExpirationDate())) {
				expiration = payment.getExpirationDate();
			}
		}
		return expiration;
	}
	
	
	public String getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}
	public List<Integer> getOwnersId() {
		// TODO Auto-generated method stub
		return null;
	}
	
  	/**
  	 * @return Devuelve la cantidad pendiente de ser pagada
  	 */
  	public BigDecimal getUnpaid(){
  		BigDecimal		  total   = this.getTotal();
  		Set<AccountEntry> pagares = this.getEntries();
  		BigDecimal		  unpaid  = total;
  		
  		if (pagares != null){
  			for (AccountEntry p : pagares ){
  				unpaid = unpaid.subtract(p.getAmount().abs());
  			}
  		}
  		
  		if (unpaid.intValue() < 0){
  			return BigDecimal.ZERO;
  		} else {
  			return unpaid.setScale(2,RoundingMode.HALF_EVEN);	
  		}
  	}  	
}
