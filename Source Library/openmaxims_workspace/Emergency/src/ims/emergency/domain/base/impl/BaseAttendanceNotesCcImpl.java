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

package ims.emergency.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseAttendanceNotesCcImpl extends DomainImpl implements ims.emergency.domain.AttendanceNotesCc, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatelistNotes(ims.core.patient.vo.PatientRefVo patient, ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCare, ims.core.admin.vo.CareContextRefVo careContext, ims.emergency.vo.lookups.AttendanceClinicalNoteType noteType, ims.core.vo.lookups.HcpDisType discipline, ims.core.vo.lookups.Specialty specialty, Boolean orderType)
	{
	}

	@SuppressWarnings("unused")
	public void validategetSpecialtyForHCP(ims.core.resource.people.vo.HcpRefVo hcpRef, ims.core.vo.lookups.HcpDisType hcpDisType)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCareContextsByPatient(ims.core.patient.vo.PatientRefVo patientRef)
	{
	}

	@SuppressWarnings("unused")
	public void validateisStale(ims.emergency.vo.AttendanceClinicalNotesRefVo attendanceClinicalNoteRef)
	{
	}
}