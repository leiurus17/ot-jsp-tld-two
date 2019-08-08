package com.ot.murach.tags;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CurrentTimeTag extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		Date currentDate = new Date();
		DateFormat dfs = DateFormat.getTimeInstance(DateFormat.SHORT);
		String currentTimeFormatted = dfs.format(currentDate);
		
		try {
			JspWriter out = pageContext.getOut();
			out.print(currentTimeFormatted);
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		
		return SKIP_BODY;
	}

}
