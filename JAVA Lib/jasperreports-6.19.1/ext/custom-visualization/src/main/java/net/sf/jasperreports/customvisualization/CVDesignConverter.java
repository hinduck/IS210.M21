/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2022 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.customvisualization;

import net.sf.jasperreports.engine.JRComponentElement;
import net.sf.jasperreports.engine.JRPrintElement;
import net.sf.jasperreports.engine.component.ComponentDesignConverter;
import net.sf.jasperreports.engine.convert.ElementIconConverter;
import net.sf.jasperreports.engine.convert.ReportConverter;

public class CVDesignConverter extends ElementIconConverter implements ComponentDesignConverter
{
	public static final String COMPONENT_ICON = "net/sf/jasperreports/customvisualization/icon-32.png";

	/**
	 *
	 */
	private final static CVDesignConverter INSTANCE = new CVDesignConverter();

	/**
	 *
	 */
	private CVDesignConverter()
	{
		super(COMPONENT_ICON);
	}

	/**
	 *
	 */
	public static CVDesignConverter getInstance()
	{
		return INSTANCE;
	}

	@Override
	public JRPrintElement convert(ReportConverter reportConverter, JRComponentElement element)
	{

		JRPrintElement pe = super.convert(reportConverter, element);
		return pe;

	}
}
