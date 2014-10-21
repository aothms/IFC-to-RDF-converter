package org.buildingsmart.IFC4_ADD1;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
/ *
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2014 Jyrki Oraskari (original)
 * Copyright (c) 2014 Pieter Pauwels (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class IfcResource extends IfcObject implements IfcResourceSelect
{
	// The property attributes
	private IfcIdentifier Identification_of_IfcResource;
	private IfcText LongDescription_of_IfcResource;
 // The inverse attributes

	private List<IfcRelAssignsToResource> ResourceOf= new ArrayList<IfcRelAssignsToResource>();


	// Getters and setters of properties
	public IfcIdentifier getIdentification_of_IfcResource() {
		return Identification_of_IfcResource;
	}

	public void setIdentification_of_IfcResource(IfcIdentifier value){
		this.Identification_of_IfcResource=value;
	}

	public IfcText getLongDescription_of_IfcResource() {
		return LongDescription_of_IfcResource;
	}

	public void setLongDescription_of_IfcResource(IfcText value){
		this.LongDescription_of_IfcResource=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelAssignsToResource> getResourceOf() {
		return ResourceOf;
	}

	public void setResourceOf(IfcRelAssignsToResource value){
		this.ResourceOf.add(value);
	}

}