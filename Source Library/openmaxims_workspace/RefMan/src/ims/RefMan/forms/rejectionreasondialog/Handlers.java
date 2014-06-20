// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.rejectionreasondialog;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected String[] getLookupUsageErrors();
	abstract protected void bindcmbReasonLookup();
	abstract protected void defaultcmbReasonLookupValue();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnPrintGPClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkPatientValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancel() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnOk() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkGPValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbReasonValueSet(Object value);

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				// Checking lookups usage
				if(getLookupUsageErrors() != null && getLookupUsageErrors().length > 0)
					throw new ims.framework.exceptions.FormMandatoryLookupMissingException(ims.framework.exceptions.FormMandatoryLookupMissingException.getError(getLookupUsageErrors()));
				onFormOpen(args);
			}
		});
		this.form.btnPrint().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnPrintGPClick();
			}
		});
		this.form.chkPatient().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkPatientValueChanged();
			}
		});
		this.form.btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancel();
			}
		});
		this.form.btnOk().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnOk();
			}
		});
		this.form.chkGP().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkGPValueChanged();
			}
		});
		this.form.cmbReason().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbReasonValueSet(value);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbReasonLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbReasonLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbReasonLookupValue();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}