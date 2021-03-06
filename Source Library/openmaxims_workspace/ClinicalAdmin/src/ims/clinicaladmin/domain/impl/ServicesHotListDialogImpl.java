//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 4342.23748)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.clinicaladmin.domain.impl;


import java.util.List;

import ims.clinicaladmin.domain.base.impl.BaseServicesHotListDialogImpl;
import ims.core.vo.domain.ServiceShortVoAssembler;
import ims.domain.DomainFactory;

public class ServicesHotListDialogImpl extends BaseServicesHotListDialogImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.ServiceShortVoCollection listServices()
	{
		DomainFactory factory = getDomainFactory();
		

		List lstServices = factory.find("from Service s where s.isActive = 1");
		if(lstServices != null && lstServices.size() > 0)
		{
			return ServiceShortVoAssembler.createServiceShortVoCollectionFromService(lstServices);
		}
		return null;
	}

	public ims.core.vo.ServiceShortVoCollection getServicesInList(ims.core.vo.ServiceShortVoCollection recordColl)
	{
		if(recordColl == null || recordColl.size() == 0)
			return null;
		StringBuffer hqlId = new StringBuffer();
		for(int i = 0;i < recordColl.size();i++)
		{
			if(i > 0)
				hqlId.append(",");
			
			hqlId.append(recordColl.get(i).getID_Service());
		}
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" from Service as s1_1 where (s1_1.id in ( " +  hqlId + "  ))  ");
		List listServices = factory.find(hql.toString());
		if(listServices != null && listServices.size() > 0)
		{
			return ServiceShortVoAssembler.createServiceShortVoCollectionFromService(listServices);
		}
		return null;

	}
}
