/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.training.fulfilmentprocess.constants.BalaFulfilmentProcessConstants;

public class BalaFulfilmentProcessManager extends GeneratedBalaFulfilmentProcessManager
{
	public static final BalaFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (BalaFulfilmentProcessManager) em.getExtension(BalaFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
