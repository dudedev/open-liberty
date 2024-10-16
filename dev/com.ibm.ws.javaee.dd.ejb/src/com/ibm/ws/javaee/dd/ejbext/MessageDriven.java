/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.javaee.dd.ejbext;

import com.ibm.ws.javaee.ddmetadata.annotation.DDXMIType;

/**
 * Represents a &lt;message-driven> bean object in the list of Enterprise Beans.
 */
@DDXMIType(name = "MessageDrivenExtension", namespace = "ejbext.xmi")
public interface MessageDriven extends EnterpriseBean {
    // nothing to extend...
}
