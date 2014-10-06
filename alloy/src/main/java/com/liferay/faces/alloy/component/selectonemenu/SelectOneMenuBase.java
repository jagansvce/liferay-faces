/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.alloy.component.selectonemenu;
//J-

import javax.annotation.Generated;
import javax.faces.component.html.HtmlSelectOneMenu;

import com.liferay.faces.util.component.Styleable;

/**
 * @author	Bruno Basto
 * @author	Kyle Stiemann
 */
@Generated(value = "com.liferay.alloy.tools.builder.FacesBuilder")
public abstract class SelectOneMenuBase extends HtmlSelectOneMenu implements Styleable {

	// Protected Enumerations
	protected enum SelectOneMenuPropertyKeys {
		responsive
	}

	public boolean isResponsive() {
		return (Boolean) getStateHelper().eval(SelectOneMenuPropertyKeys.responsive, true);
	}

	public void setResponsive(boolean responsive) {
		getStateHelper().put(SelectOneMenuPropertyKeys.responsive, responsive);
	}
}
//J+
