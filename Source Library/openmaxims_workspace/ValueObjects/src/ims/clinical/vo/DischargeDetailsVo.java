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

package ims.clinical.vo;

/**
 * Linked to eDischarge.DischargeDetails business object (ID: 1099100001).
 */
public class DischargeDetailsVo extends ims.edischarge.vo.DischargeDetailsRefVo implements ims.vo.ImsCloneable, Comparable, ims.vo.interfaces.IEDischargeSummary
{
	private static final long serialVersionUID = 1L;

	public DischargeDetailsVo()
	{
	}
	public DischargeDetailsVo(Integer id, int version)
	{
		super(id, version);
	}
	public DischargeDetailsVo(ims.clinical.vo.beans.DischargeDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.dateofdischarge = bean.getDateOfDischarge() == null ? null : bean.getDateOfDischarge().buildDateTime();
		this.dischargemethod = bean.getDischargeMethod() == null ? null : ims.core.vo.lookups.DischargeMethod.buildLookup(bean.getDischargeMethod());
		this.dischargedestination = bean.getDischargeDestination() == null ? null : ims.coe.vo.lookups.DischargeDestination.buildLookup(bean.getDischargeDestination());
		this.dischargingward = bean.getDischargingWard() == null ? null : bean.getDischargingWard().buildVo();
		this.systeminformation = bean.getSystemInformation() == null ? null : bean.getSystemInformation().buildSystemInformation();
		this.initiatinghcp = bean.getInitiatingHCP() == null ? null : bean.getInitiatingHCP().buildVo();
		this.dischargeletterstatus = bean.getDischargeLetterStatus() == null ? null : ims.clinical.vo.lookups.DischargeLetterStatus.buildLookup(bean.getDischargeLetterStatus());
		this.hasnocomplications = bean.getHasNoComplications();
		this.hasnocomorbidities = bean.getHasNoComorbidities();
		this.dischargingconsultant = bean.getDischargingConsultant() == null ? null : bean.getDischargingConsultant().buildVo();
		this.secondarydischargingconsultant = bean.getSecondaryDischargingConsultant() == null ? null : bean.getSecondaryDischargingConsultant().buildVo();
		this.dischargingspecialty = bean.getDischargingSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getDischargingSpecialty());
		this.dischargesupplementaryletterstatus = bean.getDischargeSupplementaryLetterStatus() == null ? null : ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus.buildLookup(bean.getDischargeSupplementaryLetterStatus());
		this.nurseenabledinstructions = bean.getNurseEnabledInstructions() == null ? null : bean.getNurseEnabledInstructions().buildVo();
		this.hasnodiagnosis = bean.getHasNoDiagnosis();
		this.methodofdischarge = bean.getMethodOfDischarge() == null ? null : ims.core.vo.lookups.MethodOfDischarge.buildLookup(bean.getMethodOfDischarge());
		this.isdiagnosiscomplete = bean.getIsDiagnosisComplete();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.DischargeDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.dateofdischarge = bean.getDateOfDischarge() == null ? null : bean.getDateOfDischarge().buildDateTime();
		this.dischargemethod = bean.getDischargeMethod() == null ? null : ims.core.vo.lookups.DischargeMethod.buildLookup(bean.getDischargeMethod());
		this.dischargedestination = bean.getDischargeDestination() == null ? null : ims.coe.vo.lookups.DischargeDestination.buildLookup(bean.getDischargeDestination());
		this.dischargingward = bean.getDischargingWard() == null ? null : bean.getDischargingWard().buildVo(map);
		this.systeminformation = bean.getSystemInformation() == null ? null : bean.getSystemInformation().buildSystemInformation();
		this.initiatinghcp = bean.getInitiatingHCP() == null ? null : bean.getInitiatingHCP().buildVo(map);
		this.dischargeletterstatus = bean.getDischargeLetterStatus() == null ? null : ims.clinical.vo.lookups.DischargeLetterStatus.buildLookup(bean.getDischargeLetterStatus());
		this.hasnocomplications = bean.getHasNoComplications();
		this.hasnocomorbidities = bean.getHasNoComorbidities();
		this.dischargingconsultant = bean.getDischargingConsultant() == null ? null : bean.getDischargingConsultant().buildVo(map);
		this.secondarydischargingconsultant = bean.getSecondaryDischargingConsultant() == null ? null : bean.getSecondaryDischargingConsultant().buildVo(map);
		this.dischargingspecialty = bean.getDischargingSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getDischargingSpecialty());
		this.dischargesupplementaryletterstatus = bean.getDischargeSupplementaryLetterStatus() == null ? null : ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus.buildLookup(bean.getDischargeSupplementaryLetterStatus());
		this.nurseenabledinstructions = bean.getNurseEnabledInstructions() == null ? null : bean.getNurseEnabledInstructions().buildVo(map);
		this.hasnodiagnosis = bean.getHasNoDiagnosis();
		this.methodofdischarge = bean.getMethodOfDischarge() == null ? null : ims.core.vo.lookups.MethodOfDischarge.buildLookup(bean.getMethodOfDischarge());
		this.isdiagnosiscomplete = bean.getIsDiagnosisComplete();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.DischargeDetailsVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.DischargeDetailsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.DischargeDetailsVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("DATEOFDISCHARGE"))
			return getDateOfDischarge();
		if(fieldName.equals("DISCHARGEMETHOD"))
			return getDischargeMethod();
		if(fieldName.equals("DISCHARGEDESTINATION"))
			return getDischargeDestination();
		if(fieldName.equals("DISCHARGINGWARD"))
			return getDischargingWard();
		if(fieldName.equals("SYSTEMINFORMATION"))
			return getSystemInformation();
		if(fieldName.equals("INITIATINGHCP"))
			return getInitiatingHCP();
		if(fieldName.equals("DISCHARGELETTERSTATUS"))
			return getDischargeLetterStatus();
		if(fieldName.equals("HASNOCOMPLICATIONS"))
			return getHasNoComplications();
		if(fieldName.equals("HASNOCOMORBIDITIES"))
			return getHasNoComorbidities();
		if(fieldName.equals("DISCHARGINGCONSULTANT"))
			return getDischargingConsultant();
		if(fieldName.equals("SECONDARYDISCHARGINGCONSULTANT"))
			return getSecondaryDischargingConsultant();
		if(fieldName.equals("DISCHARGINGSPECIALTY"))
			return getDischargingSpecialty();
		if(fieldName.equals("DISCHARGESUPPLEMENTARYLETTERSTATUS"))
			return getDischargeSupplementaryLetterStatus();
		if(fieldName.equals("NURSEENABLEDINSTRUCTIONS"))
			return getNurseEnabledInstructions();
		if(fieldName.equals("HASNODIAGNOSIS"))
			return getHasNoDiagnosis();
		if(fieldName.equals("METHODOFDISCHARGE"))
			return getMethodOfDischarge();
		if(fieldName.equals("ISDIAGNOSISCOMPLETE"))
			return getIsDiagnosisComplete();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getDateOfDischargeIsNotNull()
	{
		return this.dateofdischarge != null;
	}
	public ims.framework.utils.DateTime getDateOfDischarge()
	{
		return this.dateofdischarge;
	}
	public void setDateOfDischarge(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.dateofdischarge = value;
	}
	public boolean getDischargeMethodIsNotNull()
	{
		return this.dischargemethod != null;
	}
	public ims.core.vo.lookups.DischargeMethod getDischargeMethod()
	{
		return this.dischargemethod;
	}
	public void setDischargeMethod(ims.core.vo.lookups.DischargeMethod value)
	{
		this.isValidated = false;
		this.dischargemethod = value;
	}
	public boolean getDischargeDestinationIsNotNull()
	{
		return this.dischargedestination != null;
	}
	public ims.coe.vo.lookups.DischargeDestination getDischargeDestination()
	{
		return this.dischargedestination;
	}
	public void setDischargeDestination(ims.coe.vo.lookups.DischargeDestination value)
	{
		this.isValidated = false;
		this.dischargedestination = value;
	}
	public boolean getDischargingWardIsNotNull()
	{
		return this.dischargingward != null;
	}
	public ims.core.vo.LocationLiteVo getDischargingWard()
	{
		return this.dischargingward;
	}
	public void setDischargingWard(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.dischargingward = value;
	}
	public boolean getSystemInformationIsNotNull()
	{
		return this.systeminformation != null;
	}
	public ims.vo.SystemInformation getSystemInformation()
	{
		return this.systeminformation;
	}
	public void setSystemInformation(ims.vo.SystemInformation value)
	{
		this.isValidated = false;
		this.systeminformation = value;
	}
	public boolean getInitiatingHCPIsNotNull()
	{
		return this.initiatinghcp != null;
	}
	public ims.core.vo.HcpLiteVo getInitiatingHCP()
	{
		return this.initiatinghcp;
	}
	public void setInitiatingHCP(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.initiatinghcp = value;
	}
	public boolean getDischargeLetterStatusIsNotNull()
	{
		return this.dischargeletterstatus != null;
	}
	public ims.clinical.vo.lookups.DischargeLetterStatus getDischargeLetterStatus()
	{
		return this.dischargeletterstatus;
	}
	public void setDischargeLetterStatus(ims.clinical.vo.lookups.DischargeLetterStatus value)
	{
		this.isValidated = false;
		this.dischargeletterstatus = value;
	}
	public boolean getHasNoComplicationsIsNotNull()
	{
		return this.hasnocomplications != null;
	}
	public Boolean getHasNoComplications()
	{
		return this.hasnocomplications;
	}
	public void setHasNoComplications(Boolean value)
	{
		this.isValidated = false;
		this.hasnocomplications = value;
	}
	public boolean getHasNoComorbiditiesIsNotNull()
	{
		return this.hasnocomorbidities != null;
	}
	public Boolean getHasNoComorbidities()
	{
		return this.hasnocomorbidities;
	}
	public void setHasNoComorbidities(Boolean value)
	{
		this.isValidated = false;
		this.hasnocomorbidities = value;
	}
	public boolean getDischargingConsultantIsNotNull()
	{
		return this.dischargingconsultant != null;
	}
	public ims.core.vo.HcpLiteVo getDischargingConsultant()
	{
		return this.dischargingconsultant;
	}
	public void setDischargingConsultant(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.dischargingconsultant = value;
	}
	public boolean getSecondaryDischargingConsultantIsNotNull()
	{
		return this.secondarydischargingconsultant != null;
	}
	public ims.core.vo.HcpLiteVo getSecondaryDischargingConsultant()
	{
		return this.secondarydischargingconsultant;
	}
	public void setSecondaryDischargingConsultant(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.secondarydischargingconsultant = value;
	}
	public boolean getDischargingSpecialtyIsNotNull()
	{
		return this.dischargingspecialty != null;
	}
	public ims.core.vo.lookups.Specialty getDischargingSpecialty()
	{
		return this.dischargingspecialty;
	}
	public void setDischargingSpecialty(ims.core.vo.lookups.Specialty value)
	{
		this.isValidated = false;
		this.dischargingspecialty = value;
	}
	public boolean getDischargeSupplementaryLetterStatusIsNotNull()
	{
		return this.dischargesupplementaryletterstatus != null;
	}
	public ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus getDischargeSupplementaryLetterStatus()
	{
		return this.dischargesupplementaryletterstatus;
	}
	public void setDischargeSupplementaryLetterStatus(ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus value)
	{
		this.isValidated = false;
		this.dischargesupplementaryletterstatus = value;
	}
	public boolean getNurseEnabledInstructionsIsNotNull()
	{
		return this.nurseenabledinstructions != null;
	}
	public ims.clinical.vo.NurseEnabledInstructionsVo getNurseEnabledInstructions()
	{
		return this.nurseenabledinstructions;
	}
	public void setNurseEnabledInstructions(ims.clinical.vo.NurseEnabledInstructionsVo value)
	{
		this.isValidated = false;
		this.nurseenabledinstructions = value;
	}
	public boolean getHasNoDiagnosisIsNotNull()
	{
		return this.hasnodiagnosis != null;
	}
	public Boolean getHasNoDiagnosis()
	{
		return this.hasnodiagnosis;
	}
	public void setHasNoDiagnosis(Boolean value)
	{
		this.isValidated = false;
		this.hasnodiagnosis = value;
	}
	public boolean getMethodOfDischargeIsNotNull()
	{
		return this.methodofdischarge != null;
	}
	public ims.core.vo.lookups.MethodOfDischarge getMethodOfDischarge()
	{
		return this.methodofdischarge;
	}
	public void setMethodOfDischarge(ims.core.vo.lookups.MethodOfDischarge value)
	{
		this.isValidated = false;
		this.methodofdischarge = value;
	}
	public boolean getIsDiagnosisCompleteIsNotNull()
	{
		return this.isdiagnosiscomplete != null;
	}
	public Boolean getIsDiagnosisComplete()
	{
		return this.isdiagnosiscomplete;
	}
	public void setIsDiagnosisComplete(Boolean value)
	{
		this.isValidated = false;
		this.isdiagnosiscomplete = value;
	}
	/**
	* IEDischargeSummary interface methods
	*/
	public Boolean getIEDischargeSummaryIsComplete()
	{
		return isdiagnosiscomplete != null ? isdiagnosiscomplete : false;
	
	}
	public ims.clinical.vo.lookups.EDischargeSummarySection getIEDischargeSummarySection()
	{
		return ims.clinical.vo.lookups.EDischargeSummarySection.DIAGNOSIS;
	}
	
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.nurseenabledinstructions != null)
		{
			if(!this.nurseenabledinstructions.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.initiatinghcp == null)
			listOfErrors.add("InitiatingHCP is mandatory");
		if(this.dischargeletterstatus == null)
			listOfErrors.add("DischargeLetterStatus is mandatory");
		if(this.nurseenabledinstructions != null)
		{
			String[] listOfOtherErrors = this.nurseenabledinstructions.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		DischargeDetailsVo clone = new DischargeDetailsVo(this.id, this.version);
		
		clone.carecontext = this.carecontext;
		if(this.dateofdischarge == null)
			clone.dateofdischarge = null;
		else
			clone.dateofdischarge = (ims.framework.utils.DateTime)this.dateofdischarge.clone();
		if(this.dischargemethod == null)
			clone.dischargemethod = null;
		else
			clone.dischargemethod = (ims.core.vo.lookups.DischargeMethod)this.dischargemethod.clone();
		if(this.dischargedestination == null)
			clone.dischargedestination = null;
		else
			clone.dischargedestination = (ims.coe.vo.lookups.DischargeDestination)this.dischargedestination.clone();
		if(this.dischargingward == null)
			clone.dischargingward = null;
		else
			clone.dischargingward = (ims.core.vo.LocationLiteVo)this.dischargingward.clone();
		if(this.systeminformation == null)
			clone.systeminformation = null;
		else
			clone.systeminformation = (ims.vo.SystemInformation)this.systeminformation.clone();
		if(this.initiatinghcp == null)
			clone.initiatinghcp = null;
		else
			clone.initiatinghcp = (ims.core.vo.HcpLiteVo)this.initiatinghcp.clone();
		if(this.dischargeletterstatus == null)
			clone.dischargeletterstatus = null;
		else
			clone.dischargeletterstatus = (ims.clinical.vo.lookups.DischargeLetterStatus)this.dischargeletterstatus.clone();
		clone.hasnocomplications = this.hasnocomplications;
		clone.hasnocomorbidities = this.hasnocomorbidities;
		if(this.dischargingconsultant == null)
			clone.dischargingconsultant = null;
		else
			clone.dischargingconsultant = (ims.core.vo.HcpLiteVo)this.dischargingconsultant.clone();
		if(this.secondarydischargingconsultant == null)
			clone.secondarydischargingconsultant = null;
		else
			clone.secondarydischargingconsultant = (ims.core.vo.HcpLiteVo)this.secondarydischargingconsultant.clone();
		if(this.dischargingspecialty == null)
			clone.dischargingspecialty = null;
		else
			clone.dischargingspecialty = (ims.core.vo.lookups.Specialty)this.dischargingspecialty.clone();
		if(this.dischargesupplementaryletterstatus == null)
			clone.dischargesupplementaryletterstatus = null;
		else
			clone.dischargesupplementaryletterstatus = (ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus)this.dischargesupplementaryletterstatus.clone();
		if(this.nurseenabledinstructions == null)
			clone.nurseenabledinstructions = null;
		else
			clone.nurseenabledinstructions = (ims.clinical.vo.NurseEnabledInstructionsVo)this.nurseenabledinstructions.clone();
		clone.hasnodiagnosis = this.hasnodiagnosis;
		if(this.methodofdischarge == null)
			clone.methodofdischarge = null;
		else
			clone.methodofdischarge = (ims.core.vo.lookups.MethodOfDischarge)this.methodofdischarge.clone();
		clone.isdiagnosiscomplete = this.isdiagnosiscomplete;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(DischargeDetailsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A DischargeDetailsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((DischargeDetailsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((DischargeDetailsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.carecontext != null)
			count++;
		if(this.dateofdischarge != null)
			count++;
		if(this.dischargemethod != null)
			count++;
		if(this.dischargedestination != null)
			count++;
		if(this.dischargingward != null)
			count++;
		if(this.systeminformation != null)
			count++;
		if(this.initiatinghcp != null)
			count++;
		if(this.dischargeletterstatus != null)
			count++;
		if(this.hasnocomplications != null)
			count++;
		if(this.hasnocomorbidities != null)
			count++;
		if(this.dischargingconsultant != null)
			count++;
		if(this.secondarydischargingconsultant != null)
			count++;
		if(this.dischargingspecialty != null)
			count++;
		if(this.dischargesupplementaryletterstatus != null)
			count++;
		if(this.nurseenabledinstructions != null)
			count++;
		if(this.hasnodiagnosis != null)
			count++;
		if(this.methodofdischarge != null)
			count++;
		if(this.isdiagnosiscomplete != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 18;
	}
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected ims.framework.utils.DateTime dateofdischarge;
	protected ims.core.vo.lookups.DischargeMethod dischargemethod;
	protected ims.coe.vo.lookups.DischargeDestination dischargedestination;
	protected ims.core.vo.LocationLiteVo dischargingward;
	protected ims.vo.SystemInformation systeminformation;
	protected ims.core.vo.HcpLiteVo initiatinghcp;
	protected ims.clinical.vo.lookups.DischargeLetterStatus dischargeletterstatus;
	protected Boolean hasnocomplications;
	protected Boolean hasnocomorbidities;
	protected ims.core.vo.HcpLiteVo dischargingconsultant;
	protected ims.core.vo.HcpLiteVo secondarydischargingconsultant;
	protected ims.core.vo.lookups.Specialty dischargingspecialty;
	protected ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus dischargesupplementaryletterstatus;
	protected ims.clinical.vo.NurseEnabledInstructionsVo nurseenabledinstructions;
	protected Boolean hasnodiagnosis;
	protected ims.core.vo.lookups.MethodOfDischarge methodofdischarge;
	protected Boolean isdiagnosiscomplete;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
