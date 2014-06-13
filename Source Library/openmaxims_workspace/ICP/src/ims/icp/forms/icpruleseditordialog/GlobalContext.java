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

package ims.icp.forms.icpruleseditordialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		ICP = new ICPContext(context);
		Rules = new RulesContext(context);
	}
	public final class ICPContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private ICPContext(ims.framework.Context context)
		{
			this.context = context;

			RulesEditorDialog = new RulesEditorDialogContext(context);
		}
		public final class RulesEditorDialogContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private RulesEditorDialogContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getRuleIsNotNull()
			{
				return !cx_ICPRulesEditorDialogRule.getValueIsNull(context);
			}
			public ims.admin.vo.BusinessRuleVo getRule()
			{
				return (ims.admin.vo.BusinessRuleVo)cx_ICPRulesEditorDialogRule.getValue(context);
			}
		public void setRule(ims.admin.vo.BusinessRuleVo value)
		{
				cx_ICPRulesEditorDialogRule.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_ICPRulesEditorDialogRule = new ims.framework.ContextVariable("ICP.RulesEditorDialog.Rule", "_cv_ICP.RulesEditorDialog.Rule");
			private ims.framework.Context context;
		}

		public boolean getICPSelectedIsNotNull()
		{
			return !cx_ICPICPSelected.getValueIsNull(context);
		}
		public ims.icp.vo.ICPVo getICPSelected()
		{
			return (ims.icp.vo.ICPVo)cx_ICPICPSelected.getValue(context);
		}
		public void setICPSelected(ims.icp.vo.ICPVo value)
		{
			cx_ICPICPSelected.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ICPICPSelected = new ims.framework.ContextVariable("ICP.ICPSelected", "_cv_ICP.ICPSelected");

		public RulesEditorDialogContext RulesEditorDialog;
		private ims.framework.Context context;
	}
	public final class RulesContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RulesContext(ims.framework.Context context)
		{
			this.context = context;

			RuleEditorComponent = new RuleEditorComponentContext(context);
		}
		public final class RuleEditorComponentContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private RuleEditorComponentContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getFormModeIsNotNull()
			{
				return !cx_RulesRuleEditorComponentFormMode.getValueIsNull(context);
			}
			public ims.rules.vo.enums.RulesEditorComponentFormAction getFormMode()
			{
				return (ims.rules.vo.enums.RulesEditorComponentFormAction)cx_RulesRuleEditorComponentFormMode.getValue(context);
			}
		public void setFormMode(ims.rules.vo.enums.RulesEditorComponentFormAction value)
		{
				cx_RulesRuleEditorComponentFormMode.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_RulesRuleEditorComponentFormMode = new ims.framework.ContextVariable("Rules.RuleEditorComponent.FormMode", "_cv_Rules.RuleEditorComponent.FormMode");
			private ims.framework.Context context;
		}

		public boolean getRuleToEditIsNotNull()
		{
			return !cx_RulesRuleToEdit.getValueIsNull(context);
		}
		public ims.admin.vo.BusinessRuleVo getRuleToEdit()
		{
			return (ims.admin.vo.BusinessRuleVo)cx_RulesRuleToEdit.getValue(context);
		}
		public void setRuleToEdit(ims.admin.vo.BusinessRuleVo value)
		{
			cx_RulesRuleToEdit.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RulesRuleToEdit = new ims.framework.ContextVariable("Rules.RuleToEdit", "_cv_Rules.RuleToEdit");

		public RuleEditorComponentContext RuleEditorComponent;
		private ims.framework.Context context;
	}

	public ICPContext ICP;
	public RulesContext Rules;
}