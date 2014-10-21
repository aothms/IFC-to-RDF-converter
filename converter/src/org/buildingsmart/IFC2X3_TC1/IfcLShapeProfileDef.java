package org.buildingsmart.IFC2X3_TC1;
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

public class IfcLShapeProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure Depth_of_IfcLShapeProfileDef;
	private IfcPositiveLengthMeasure Width_of_IfcLShapeProfileDef;
	private IfcPositiveLengthMeasure Thickness_of_IfcLShapeProfileDef;
	private IfcPositiveLengthMeasure FilletRadius_of_IfcLShapeProfileDef;
	private IfcPositiveLengthMeasure EdgeRadius_of_IfcLShapeProfileDef;
	private IfcPlaneAngleMeasure LegSlope;
	private IfcPositiveLengthMeasure CentreOfGravityInX_of_IfcLShapeProfileDef;
	private IfcPositiveLengthMeasure CentreOfGravityInY_of_IfcLShapeProfileDef;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getDepth_of_IfcLShapeProfileDef() {
		return Depth_of_IfcLShapeProfileDef;
	}

	public void setDepth_of_IfcLShapeProfileDef(IfcPositiveLengthMeasure value){
		this.Depth_of_IfcLShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getWidth_of_IfcLShapeProfileDef() {
		return Width_of_IfcLShapeProfileDef;
	}

	public void setWidth_of_IfcLShapeProfileDef(IfcPositiveLengthMeasure value){
		this.Width_of_IfcLShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getThickness_of_IfcLShapeProfileDef() {
		return Thickness_of_IfcLShapeProfileDef;
	}

	public void setThickness_of_IfcLShapeProfileDef(IfcPositiveLengthMeasure value){
		this.Thickness_of_IfcLShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFilletRadius_of_IfcLShapeProfileDef() {
		return FilletRadius_of_IfcLShapeProfileDef;
	}

	public void setFilletRadius_of_IfcLShapeProfileDef(IfcPositiveLengthMeasure value){
		this.FilletRadius_of_IfcLShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getEdgeRadius_of_IfcLShapeProfileDef() {
		return EdgeRadius_of_IfcLShapeProfileDef;
	}

	public void setEdgeRadius_of_IfcLShapeProfileDef(IfcPositiveLengthMeasure value){
		this.EdgeRadius_of_IfcLShapeProfileDef=value;
	}

	public IfcPlaneAngleMeasure getLegSlope() {
		return LegSlope;
	}

	public void setLegSlope(IfcPlaneAngleMeasure value){
		this.LegSlope=value;
	}

	public IfcPositiveLengthMeasure getCentreOfGravityInX_of_IfcLShapeProfileDef() {
		return CentreOfGravityInX_of_IfcLShapeProfileDef;
	}

	public void setCentreOfGravityInX_of_IfcLShapeProfileDef(IfcPositiveLengthMeasure value){
		this.CentreOfGravityInX_of_IfcLShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getCentreOfGravityInY_of_IfcLShapeProfileDef() {
		return CentreOfGravityInY_of_IfcLShapeProfileDef;
	}

	public void setCentreOfGravityInY_of_IfcLShapeProfileDef(IfcPositiveLengthMeasure value){
		this.CentreOfGravityInY_of_IfcLShapeProfileDef=value;
	}

}