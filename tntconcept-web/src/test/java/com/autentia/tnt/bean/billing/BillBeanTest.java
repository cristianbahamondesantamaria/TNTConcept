package com.autentia.tnt.bean.billing;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autentia.tnt.businessobject.BillBreakDown;
import com.autentia.tnt.util.testing.SpringUtilsForTestingWeb;



public class BillBeanTest {
	
	@BeforeClass
    public static void init() throws Exception {
        SpringUtilsForTestingWeb.configure(new ClassPathXmlApplicationContext("applicationContext-test.xml"));
    }

	
	@Test
	public void createBreakDownIn2009Test() {
		
		BillBean billBean = new BillBean();
		billBean.create();
		final GregorianCalendar calendar = new GregorianCalendar(2009, 8, 31);
		billBean.setCreationDate(calendar.getTime());
		billBean.createBreakDown();
		for (BillBreakDown billBreakDown:billBean.getBill().getBreakDown()) {
			assertEquals(new BigDecimal("16"),billBreakDown.getIva());
		}
	}
	
	@Test
	public void createBreakDownInFirstDayOf18Test() {
		
		BillBean billBean = new BillBean();
		billBean.create();
		final GregorianCalendar calendar = new GregorianCalendar(2010, 7, 1);
		billBean.setCreationDate(calendar.getTime());
		billBean.createBreakDown();
		for (BillBreakDown billBreakDown:billBean.getBill().getBreakDown()) {
			assertEquals(new BigDecimal("18"),billBreakDown.getIva());
		}
	}
	
	@Test
	public void createBreakDownInLastDayOf18Test() {
		
		BillBean billBean = new BillBean();
		billBean.create();
		final GregorianCalendar calendar = new GregorianCalendar(2012, 8, 31);
		billBean.setCreationDate(calendar.getTime());
		billBean.createBreakDown();
		for (BillBreakDown billBreakDown:billBean.getBill().getBreakDown()) {
			assertEquals(new BigDecimal("18"),billBreakDown.getIva());
		}
	}
	
	@Ignore
	@Test
	public void createBreakDownInFirstDayOf21Test() {
		
		BillBean billBean = new BillBean();
		billBean.create();
		final GregorianCalendar calendar = new GregorianCalendar(2012, 9, 1);
		billBean.setCreationDate(calendar.getTime());
		billBean.createBreakDown();
		for (BillBreakDown billBreakDown:billBean.getBill().getBreakDown()) {
			assertEquals(new BigDecimal("21"),billBreakDown.getIva());
		}
	}
}