package com.ot.murach.tags;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CurrentDateTag extends TagSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5888513427426207565L;

	@Override
	public int doStartTag() throws JspException {
		Date currentDate = new Date();
		DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
		String currentDateFormatted = dfs.format(currentDate);
		
		try {
			JspWriter out = pageContext.getOut();
			out.print(currentDateFormatted);
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		
		return SKIP_BODY;
	}

}
