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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.ocs_if.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class IfOrderMessageVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfOrderMessageVo copy(ims.ocs_if.vo.IfOrderMessageVo valueObjectDest, ims.ocs_if.vo.IfOrderMessageVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderMessage(valueObjectSrc.getID_OrderMessage());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// OrderDetails
		valueObjectDest.setOrderDetails(valueObjectSrc.getOrderDetails());
		// Investigations
		valueObjectDest.setInvestigations(valueObjectSrc.getInvestigations());
		// messageStatus
		valueObjectDest.setMessageStatus(valueObjectSrc.getMessageStatus());
		// ProviderSystem
		valueObjectDest.setProviderSystem(valueObjectSrc.getProviderSystem());
		// PlacerOrdNum
		valueObjectDest.setPlacerOrdNum(valueObjectSrc.getPlacerOrdNum());
		// HL7Message
		valueObjectDest.setHL7Message(valueObjectSrc.getHL7Message());
		// OrderCategory
		valueObjectDest.setOrderCategory(valueObjectSrc.getOrderCategory());
		// failureMessage
		valueObjectDest.setFailureMessage(valueObjectSrc.getFailureMessage());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfOrderMessageVoCollectionFromOrderMessage(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderMessage objects.
	 */
	public static ims.ocs_if.vo.IfOrderMessageVoCollection createIfOrderMessageVoCollectionFromOrderMessage(java.util.Set domainObjectSet)	
	{
		return createIfOrderMessageVoCollectionFromOrderMessage(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderMessage objects.
	 */
	public static ims.ocs_if.vo.IfOrderMessageVoCollection createIfOrderMessageVoCollectionFromOrderMessage(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfOrderMessageVoCollection voList = new ims.ocs_if.vo.IfOrderMessageVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject = (ims.ocrr.orderingresults.domain.objects.OrderMessage) iterator.next();
			ims.ocs_if.vo.IfOrderMessageVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderMessage objects.
	 */
	public static ims.ocs_if.vo.IfOrderMessageVoCollection createIfOrderMessageVoCollectionFromOrderMessage(java.util.List domainObjectList) 
	{
		return createIfOrderMessageVoCollectionFromOrderMessage(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderMessage objects.
	 */
	public static ims.ocs_if.vo.IfOrderMessageVoCollection createIfOrderMessageVoCollectionFromOrderMessage(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfOrderMessageVoCollection voList = new ims.ocs_if.vo.IfOrderMessageVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject = (ims.ocrr.orderingresults.domain.objects.OrderMessage) domainObjectList.get(i);
			ims.ocs_if.vo.IfOrderMessageVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderMessage set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderMessageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderMessageVoCollection voCollection) 
	 {
	 	return extractOrderMessageSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderMessageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderMessageVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOrderMessageVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject = IfOrderMessageVoAssembler.extractOrderMessage(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderMessage list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderMessageList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderMessageVoCollection voCollection) 
	 {
	 	return extractOrderMessageList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderMessageList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderMessageVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOrderMessageVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject = IfOrderMessageVoAssembler.extractOrderMessage(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderMessage object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderMessage
	 */
	 public static ims.ocs_if.vo.IfOrderMessageVo create(ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderMessage object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocs_if.vo.IfOrderMessageVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfOrderMessageVo valueObject = (ims.ocs_if.vo.IfOrderMessageVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfOrderMessageVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfOrderMessageVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderMessage
	 */
	 public static ims.ocs_if.vo.IfOrderMessageVo insert(ims.ocs_if.vo.IfOrderMessageVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderMessage
	 */
	 public static ims.ocs_if.vo.IfOrderMessageVo insert(DomainObjectMap map, ims.ocs_if.vo.IfOrderMessageVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderMessage(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// OrderDetails
		valueObject.setOrderDetails(ims.ocs_if.vo.domain.IfOcsOrderShortVoAssembler.create(map, domainObject.getOrderDetails()) );
		// Investigations
		valueObject.setInvestigations(ims.ocs_if.vo.domain.IfOrderInvestigationVoAssembler.createIfOrderInvestigationVoCollectionFromOrderInvestigation(map, domainObject.getInvestigations()) );
		// messageStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getMessageStatus();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.OrderMessageStatus voLookup3 = new ims.ocrr.vo.lookups.OrderMessageStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderMessageStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.ocrr.vo.lookups.OrderMessageStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setMessageStatus(voLookup3);
		}
				// ProviderSystem
		valueObject.setProviderSystem(ims.ocrr.vo.domain.ProviderSystemVoAssembler.create(map, domainObject.getProviderSystem()) );
		// PlacerOrdNum
		valueObject.setPlacerOrdNum(domainObject.getPlacerOrdNum());
		// HL7Message
		valueObject.setHL7Message(domainObject.getHL7Message());
		// OrderCategory
		ims.domain.lookups.LookupInstance instance7 = domainObject.getOrderCategory();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.Category voLookup7 = new ims.ocrr.vo.lookups.Category(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.ocrr.vo.lookups.Category parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.ocrr.vo.lookups.Category(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setOrderCategory(voLookup7);
		}
				// failureMessage
		valueObject.setFailureMessage(domainObject.getFailureMessage());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderMessage extractOrderMessage(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderMessageVo valueObject) 
	{
		return 	extractOrderMessage(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderMessage extractOrderMessage(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderMessageVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderMessage();
		ims.ocrr.orderingresults.domain.objects.OrderMessage domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderMessage)domMap.get(valueObject);
			}
			// ims.ocs_if.vo.IfOrderMessageVo ID_OrderMessage field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.OrderMessage();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderMessage());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderMessage)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.OrderMessage) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderMessage.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderMessage());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.orderingresults.domain.objects.OcsOrderSession value1 = null;
		if ( null != valueObject.getOrderDetails() ) 
		{
			if (valueObject.getOrderDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderDetails()) != null)
				{
					value1 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domMap.get(valueObject.getOrderDetails());
				}
			}
			else
			{
				value1 = (ims.ocrr.orderingresults.domain.objects.OcsOrderSession)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.class, valueObject.getOrderDetails().getBoId());
			}
		}
		domainObject.setOrderDetails(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection refCollection2 = new ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection();
		if (valueObject.getInvestigations() != null)
		{
			for (int i2=0; i2<valueObject.getInvestigations().size(); i2++)
			{
				ims.ocrr.orderingresults.vo.OrderInvestigationRefVo ref2 = (ims.ocrr.orderingresults.vo.OrderInvestigationRefVo)valueObject.getInvestigations().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainInvestigations2 = domainObject.getInvestigations();
		if (domainInvestigations2 == null)
		{
			domainInvestigations2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderInvestigationRefVo vo = refCollection2.get(i);					
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainInvestigations2.contains(dom))
			{
				domainInvestigations2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainInvestigations2.iterator();
		//Find out which objects need to be removed
		while (iter2.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter2.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet2.contains(o))
			{
				removedSet2.add(o);
			}
		}
		iter2 = removedSet2.iterator();
		//Remove the unwanted objects
		while (iter2.hasNext())
		{
			domainInvestigations2.remove(iter2.next());
		}		
		
		domainObject.setInvestigations(domainInvestigations2);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getMessageStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getMessageStatus().getID());
		}
		domainObject.setMessageStatus(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ProviderSystem value4 = null;
		if ( null != valueObject.getProviderSystem() ) 
		{
			if (valueObject.getProviderSystem().getBoId() == null)
			{
				if (domMap.get(valueObject.getProviderSystem()) != null)
				{
					value4 = (ims.core.admin.domain.objects.ProviderSystem)domMap.get(valueObject.getProviderSystem());
				}
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.ProviderSystem)domainFactory.getDomainObject(ims.core.admin.domain.objects.ProviderSystem.class, valueObject.getProviderSystem().getBoId());
			}
		}
		domainObject.setProviderSystem(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPlacerOrdNum() != null && valueObject.getPlacerOrdNum().equals(""))
		{
			valueObject.setPlacerOrdNum(null);
		}
		domainObject.setPlacerOrdNum(valueObject.getPlacerOrdNum());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHL7Message() != null && valueObject.getHL7Message().equals(""))
		{
			valueObject.setHL7Message(null);
		}
		domainObject.setHL7Message(valueObject.getHL7Message());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getOrderCategory() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getOrderCategory().getID());
		}
		domainObject.setOrderCategory(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFailureMessage() != null && valueObject.getFailureMessage().equals(""))
		{
			valueObject.setFailureMessage(null);
		}
		domainObject.setFailureMessage(valueObject.getFailureMessage());

		return domainObject;
	}

}
