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

package ims.clinical.forms.goalplanning;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.clinical.domain.GoalPlanning.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.clinical.domain.GoalPlanning domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbGoalTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnGoals().lyrGoals().Goal().cmbGoalType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.GoalTerm existingInstance = (ims.clinical.vo.lookups.GoalTerm)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbGoalTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.GoalTerm)
		{
			ims.clinical.vo.lookups.GoalTerm instance = (ims.clinical.vo.lookups.GoalTerm)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbGoalTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.GoalTerm existingInstance = (ims.clinical.vo.lookups.GoalTerm)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnGoals().lyrGoals().Goal().cmbGoalType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbGoalTypeLookup()
	{
		this.form.ctnGoals().lyrGoals().Goal().cmbGoalType().clear();
		ims.clinical.vo.lookups.GoalTermCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getGoalTerm(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnGoals().lyrGoals().Goal().cmbGoalType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbGoalTypeLookupValue(int id)
	{
		ims.clinical.vo.lookups.GoalTerm instance = ims.clinical.vo.lookups.LookupHelper.getGoalTermInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnGoals().lyrGoals().Goal().cmbGoalType().setValue(instance);
	}
	protected final void defaultcmbGoalTypeLookupValue()
	{
		this.form.ctnGoals().lyrGoals().Goal().cmbGoalType().setValue((ims.clinical.vo.lookups.GoalTerm)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.GoalTerm.class, engine.getFormName().getID(), ims.clinical.vo.lookups.GoalTerm.TYPE_ID));
	}
	protected final void oncmbAreaOfNeedValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnGoals().lyrGoals().Goal().cmbAreaOfNeed().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.GoalAreaOfNeed existingInstance = (ims.clinical.vo.lookups.GoalAreaOfNeed)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbAreaOfNeedLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.GoalAreaOfNeed)
		{
			ims.clinical.vo.lookups.GoalAreaOfNeed instance = (ims.clinical.vo.lookups.GoalAreaOfNeed)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbAreaOfNeedLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.GoalAreaOfNeed existingInstance = (ims.clinical.vo.lookups.GoalAreaOfNeed)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnGoals().lyrGoals().Goal().cmbAreaOfNeed().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbAreaOfNeedLookup()
	{
		this.form.ctnGoals().lyrGoals().Goal().cmbAreaOfNeed().clear();
		ims.clinical.vo.lookups.GoalAreaOfNeedCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getGoalAreaOfNeed(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnGoals().lyrGoals().Goal().cmbAreaOfNeed().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbAreaOfNeedLookupValue(int id)
	{
		ims.clinical.vo.lookups.GoalAreaOfNeed instance = ims.clinical.vo.lookups.LookupHelper.getGoalAreaOfNeedInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnGoals().lyrGoals().Goal().cmbAreaOfNeed().setValue(instance);
	}
	protected final void defaultcmbAreaOfNeedLookupValue()
	{
		this.form.ctnGoals().lyrGoals().Goal().cmbAreaOfNeed().setValue((ims.clinical.vo.lookups.GoalAreaOfNeed)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.GoalAreaOfNeed.class, engine.getFormName().getID(), ims.clinical.vo.lookups.GoalAreaOfNeed.TYPE_ID));
	}
	protected final void oncmbLOAValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnGoals().lyrGoals().Target().cmbLOA().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.LevelOfAchievement existingInstance = (ims.clinical.vo.lookups.LevelOfAchievement)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbLOALookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.LevelOfAchievement)
		{
			ims.clinical.vo.lookups.LevelOfAchievement instance = (ims.clinical.vo.lookups.LevelOfAchievement)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbLOALookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.LevelOfAchievement existingInstance = (ims.clinical.vo.lookups.LevelOfAchievement)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnGoals().lyrGoals().Target().cmbLOA().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbLOALookup()
	{
		this.form.ctnGoals().lyrGoals().Target().cmbLOA().clear();
		ims.clinical.vo.lookups.LevelOfAchievementCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getLevelOfAchievement(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnGoals().lyrGoals().Target().cmbLOA().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbLOALookupValue(int id)
	{
		ims.clinical.vo.lookups.LevelOfAchievement instance = ims.clinical.vo.lookups.LookupHelper.getLevelOfAchievementInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnGoals().lyrGoals().Target().cmbLOA().setValue(instance);
	}
	protected final void defaultcmbLOALookupValue()
	{
		this.form.ctnGoals().lyrGoals().Target().cmbLOA().setValue((ims.clinical.vo.lookups.LevelOfAchievement)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.LevelOfAchievement.class, engine.getFormName().getID(), ims.clinical.vo.lookups.LevelOfAchievement.TYPE_ID));
	}
	protected void clearScreen()
	{
		this.form.ctnGoals().lyrGoals().Goal().dteAchieved().setValue(null);
		this.form.ctnGoals().lyrGoals().Goal().txtGoal().setValue("");
		this.form.ctnGoals().lyrGoals().Goal().cmbGoalType().setValue(null);
		this.form.ctnGoals().lyrGoals().Goal().cmbAreaOfNeed().setValue(null);
	}
	protected void populateScreenFromData(ims.clinical.vo.PatientGoalVo value)
	{
		clearScreen();
		if(value == null)
			return;

		this.form.ctnGoals().lyrGoals().Goal().dteAchieved().setValue(value.getDateAchievedIsNotNull() ? value.getDateAchieved() : null);
		this.form.ctnGoals().lyrGoals().Goal().txtGoal().setValue(value.getGoalTextIsNotNull() ? value.getGoalText(): null);
		this.form.ctnGoals().lyrGoals().Goal().cmbGoalType().setValue(value.getGoalTypeIsNotNull() ? value.getGoalType() : null);
		this.form.ctnGoals().lyrGoals().Goal().cmbAreaOfNeed().setValue(value.getAreaOfNeedIsNotNull() ? value.getAreaOfNeed() : null);
	}
	protected ims.clinical.vo.PatientGoalVo populateDataFromScreen(ims.clinical.vo.PatientGoalVo value)
	{
		if(value == null)
			value = new ims.clinical.vo.PatientGoalVo();

		value.setDateAchieved(this.form.ctnGoals().lyrGoals().Goal().dteAchieved().getValue());
		value.setGoalText(this.form.ctnGoals().lyrGoals().Goal().txtGoal().getValue());
		value.setGoalType(this.form.ctnGoals().lyrGoals().Goal().cmbGoalType().getValue());
		value.setAreaOfNeed(this.form.ctnGoals().lyrGoals().Goal().cmbAreaOfNeed().getValue());

		return value;
	}
	protected ims.clinical.vo.PatientGoalVo populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.clinical.vo.PatientGoalVo());
	}
	public void initialize() throws ims.framework.exceptions.FormOpenException
	{
	}
	public boolean allowNew()
	{
		return form.getMode() == ims.framework.enumerations.FormMode.VIEW && !form.isReadOnly();
	}
	public boolean allowUpdate()
	{
		return form.getMode() == ims.framework.enumerations.FormMode.VIEW && !form.isReadOnly();
	}
	public String[] validateUIRules()
	{
		return null;
	}
	public void clear()
	{
	}
	public void search()
	{
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.clinical.domain.GoalPlanning domain;
}
