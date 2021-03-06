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
package com.liferay.faces.alloy.component.commandbutton;

import java.util.Map;

import com.liferay.faces.alloy.component.commandlink.CommandLink;


/**
 * This class isolates differences between JSF 2.2 and JSF 2.1 in order to minimize diffs across branches.
 *
 * @author  Neil Griffin
 */
public abstract class SplitCommandButtonCompat extends CommandLink {

	// Protected Data Members
	protected CommandButton wrappedCommandButton;

	@Override
	public Map<String, Object> getPassThroughAttributes(boolean create) {
		return wrappedCommandButton.getPassThroughAttributes(create);
	}

	@Override
	public String getRole() {
		return wrappedCommandButton.getRole();
	}

	@Override
	public void setRole(String role) {
		wrappedCommandButton.setRole(role);
	}
}
