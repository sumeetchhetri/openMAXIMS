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
 * Linked to clinical.SurgicalOperationDetails business object (ID: 1072100085).
 */
public class SurgicalOperationDetailsVo extends ims.clinical.vo.SurgicalOperationDetailsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SurgicalOperationDetailsVo()
	{
	}
	public SurgicalOperationDetailsVo(Integer id, int version)
	{
		super(id, version);
	}
	public SurgicalOperationDetailsVo(ims.clinical.vo.beans.SurgicalOperationDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.surgicalopnote = bean.getSurgicalOpNote() == null ? null : bean.getSurgicalOpNote().buildVo();
		this.incision = bean.getIncision();
		this.findings = bean.getFindings();
		this.procedure = bean.getProcedure();
		this.closure = bean.getClosure();
		this.prosthesis = bean.getProsthesis();
		this.drain = bean.getDrain();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.SurgicalOperationDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.surgicalopnote = bean.getSurgicalOpNote() == null ? null : bean.getSurgicalOpNote().buildVo(map);
		this.incision = bean.getIncision();
		this.findings = bean.getFindings();
		this.procedure = bean.getProcedure();
		this.closure = bean.getClosure();
		this.prosthesis = bean.getProsthesis();
		this.drain = bean.getDrain();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.SurgicalOperationDetailsVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.SurgicalOperationDetailsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.SurgicalOperationDetailsVoBean();
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
		if(fieldName.equals("AUTHORINGINFORMATION"))
			return getAuthoringInformation();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("SURGICALOPNOTE"))
			return getSurgicalOpNote();
		if(fieldName.equals("INCISION"))
			return getIncision();
		if(fieldName.equals("FINDINGS"))
			return getFindings();
		if(fieldName.equals("PROCEDURE"))
			return getProcedure();
		if(fieldName.equals("CLOSURE"))
			return getClosure();
		if(fieldName.equals("PROSTHESIS"))
			return getProsthesis();
		if(fieldName.equals("DRAIN"))
			return getDrain();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAuthoringInformationIsNotNull()
	{
		return this.authoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinformation = value;
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
	public boolean getSurgicalOpNoteIsNotNull()
	{
		return this.surgicalopnote != null;
	}
	public ims.clinical.vo.SurgicalOperationNotesVo getSurgicalOpNote()
	{
		return this.surgicalopnote;
	}
	public void setSurgicalOpNote(ims.clinical.vo.SurgicalOperationNotesVo value)
	{
		this.isValidated = false;
		this.surgicalopnote = value;
	}
	public boolean getIncisionIsNotNull()
	{
		return this.incision != null;
	}
	public String getIncision()
	{
		return this.incision;
	}
	public static int getIncisionMaxLength()
	{
		return 5000;
	}
	public void setIncision(String value)
	{
		this.isValidated = false;
		this.incision = value;
	}
	public boolean getFindingsIsNotNull()
	{
		return this.findings != null;
	}
	public String getFindings()
	{
		return this.findings;
	}
	public static int getFindingsMaxLength()
	{
		return 5000;
	}
	public void setFindings(String value)
	{
		this.isValidated = false;
		this.findings = value;
	}
	public boolean getProcedureIsNotNull()
	{
		return this.procedure != null;
	}
	public String getProcedure()
	{
		return this.procedure;
	}
	public static int getProcedureMaxLength()
	{
		return 5000;
	}
	public void setProcedure(String value)
	{
		this.isValidated = false;
		this.procedure = value;
	}
	public boolean getClosureIsNotNull()
	{
		return this.closure != null;
	}
	public String getClosure()
	{
		return this.closure;
	}
	public static int getClosureMaxLength()
	{
		return 5000;
	}
	public void setClosure(String value)
	{
		this.isValidated = false;
		this.closure = value;
	}
	public boolean getProsthesisIsNotNull()
	{
		return this.prosthesis != null;
	}
	public String getProsthesis()
	{
		return this.prosthesis;
	}
	public static int getProsthesisMaxLength()
	{
		return 5000;
	}
	public void setProsthesis(String value)
	{
		this.isValidated = false;
		this.prosthesis = value;
	}
	public boolean getDrainIsNotNull()
	{
		return this.drain != null;
	}
	public String getDrain()
	{
		return this.drain;
	}
	public static int getDrainMaxLength()
	{
		return 5000;
	}
	public void setDrain(String value)
	{
		this.isValidated = false;
		this.drain = value;
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
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
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
		if(this.authoringinformation == null)
			listOfErrors.add("AuthoringInformation is mandatory");
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
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
	
		SurgicalOperationDetailsVo clone = new SurgicalOperationDetailsVo(this.id, this.version);
		
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		clone.carecontext = this.carecontext;
		if(this.surgicalopnote == null)
			clone.surgicalopnote = null;
		else
			clone.surgicalopnote = (ims.clinical.vo.SurgicalOperationNotesVo)this.surgicalopnote.clone();
		clone.incision = this.incision;
		clone.findings = this.findings;
		clone.procedure = this.procedure;
		clone.closure = this.closure;
		clone.prosthesis = this.prosthesis;
		clone.drain = this.drain;
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
		if (!(SurgicalOperationDetailsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SurgicalOperationDetailsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((SurgicalOperationDetailsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((SurgicalOperationDetailsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.authoringinformation != null)
			count++;
		if(this.carecontext != null)
			count++;
		if(this.surgicalopnote != null)
			count++;
		if(this.incision != null)
			count++;
		if(this.findings != null)
			count++;
		if(this.procedure != null)
			count++;
		if(this.closure != null)
			count++;
		if(this.prosthesis != null)
			count++;
		if(this.drain != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected ims.core.vo.AuthoringInformationVo authoringinformation;
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected ims.clinical.vo.SurgicalOperationNotesVo surgicalopnote;
	protected String incision;
	protected String findings;
	protected String procedure;
	protected String closure;
	protected String prosthesis;
	protected String drain;
	private boolean isValidated = false;
	private boolean isBusy = false;
}