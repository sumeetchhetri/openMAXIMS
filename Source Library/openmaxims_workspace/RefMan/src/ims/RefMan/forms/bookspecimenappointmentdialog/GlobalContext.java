// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.bookspecimenappointmentdialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		RefMan = new RefManContext(context);
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getSpecimenWorkListItemsIsNotNull()
		{
			return !cx_RefManSpecimenWorkListItems.getValueIsNull(context);
		}
		public ims.ocrr.vo.SpecimenWorkListItemLiteVoCollection getSpecimenWorkListItems()
		{
			return (ims.ocrr.vo.SpecimenWorkListItemLiteVoCollection)cx_RefManSpecimenWorkListItems.getValue(context);
		}
		public void setSpecimenWorkListItems(ims.ocrr.vo.SpecimenWorkListItemLiteVoCollection value)
		{
			cx_RefManSpecimenWorkListItems.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManSpecimenWorkListItems = new ims.framework.ContextVariable("RefMan.SpecimenWorkListItems", "_cv_RefMan.SpecimenWorkListItems");
		public boolean getSpecimenWorkListItemIsNotNull()
		{
			return !cx_RefManSpecimenWorkListItem.getValueIsNull(context);
		}
		public ims.ocrr.vo.SpecimenWorkListItemLiteVo getSpecimenWorkListItem()
		{
			return (ims.ocrr.vo.SpecimenWorkListItemLiteVo)cx_RefManSpecimenWorkListItem.getValue(context);
		}
		public void setSpecimenWorkListItem(ims.ocrr.vo.SpecimenWorkListItemLiteVo value)
		{
			cx_RefManSpecimenWorkListItem.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManSpecimenWorkListItem = new ims.framework.ContextVariable("RefMan.SpecimenWorkListItem", "_cv_RefMan.SpecimenWorkListItem");
		public boolean getCatsReferralIsNotNull()
		{
			return !cx_RefManCatsReferral.getValueIsNull(context);
		}
		public ims.RefMan.vo.CatsReferralRefVo getCatsReferral()
		{
			return (ims.RefMan.vo.CatsReferralRefVo)cx_RefManCatsReferral.getValue(context);
		}
		public void setCatsReferral(ims.RefMan.vo.CatsReferralRefVo value)
		{
			cx_RefManCatsReferral.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManCatsReferral = new ims.framework.ContextVariable("RefMan.CatsReferral", "_cvp_RefMan.CatsReferral");

		private ims.framework.Context context;
	}

	public RefManContext RefMan;
}
