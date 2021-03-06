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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.domain;

// Generated from form domain impl
public interface Equipment extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* Retrieving a list of equipment associated with a specific patient
	*/
	public ims.core.vo.EquipmentVoCollection listEquipment(ims.core.vo.PatientShort voPrisoner, Boolean activeOnly);

	// Generated from form domain interface definition
	/**
	* List of Hcps
	*/
	public ims.core.vo.HcpCollection listHcps(ims.core.vo.HcpFilter filter);

	// Generated from form domain interface definition
	/**
	* Save Equipment Details
	*/
	public ims.core.vo.EquipmentVo saveEquipmentDetails(ims.core.vo.EquipmentVo equipment) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Return an equipment collection by care context
	*/
	public ims.core.vo.EquipmentVoCollection listEquipmentByCareContext(ims.core.vo.CareContextLiteVo voCareContextLite, Boolean activeOnly);

	// Generated from form domain interface definition
	public ims.core.vo.EquipmentVo getEquipment(ims.core.resource.equipment.vo.EquipmentRefVo equipmentId);
}
