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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.80 build 3999.26423)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.ocrr.domain.impl;

import java.util.List;

import ims.domain.exceptions.ForeignKeyViolationException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.ocrr.configuration.vo.ResultSpecimenTypesRefVo;
import ims.ocrr.domain.base.impl.BaseAlternateSpecimenTypesImpl;
import ims.ocrr.vo.domain.ResultSpecimenTypesVoAssembler;

public class AlternateSpecimenTypesImpl extends BaseAlternateSpecimenTypesImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* listResultSpecimenTypes
	*/
	public ims.ocrr.vo.ResultSpecimenTypesVoCollection listResultSpecimenTypes()
	{
		List items = getDomainFactory().find("from ResultSpecimenTypes");
		return ResultSpecimenTypesVoAssembler.createResultSpecimenTypesVoCollectionFromResultSpecimenTypes(items);
	}

	/**
	* saveResultSpecimenType
	*/
	public void saveResultSpecimenType(ims.ocrr.vo.ResultSpecimenTypesVo resultSpecimenType) throws ims.domain.exceptions.StaleObjectException
	{
		if (resultSpecimenType == null)
			throw new CodingRuntimeException("resultSpecimenType is null in method saveResultSpecimenType");
		if (!resultSpecimenType.isValidated())
			throw new CodingRuntimeException("resultSpecimenType has not been validated in method saveResultSpecimenType");
		
		getDomainFactory().save(ResultSpecimenTypesVoAssembler.extractResultSpecimenTypes(getDomainFactory(), resultSpecimenType));
	}

	public void deleteResultSpecimenType(ResultSpecimenTypesRefVo resSpecType) throws ForeignKeyViolationException
	{
		if (resSpecType == null || resSpecType.getID_ResultSpecimenTypes() == null)
			throw new CodingRuntimeException("resSpecType is null ot id not provided in method deleteResultSpecimenType");
		
		getDomainFactory().delete(getDomainFactory().getDomainObject(resSpecType));
	}
}