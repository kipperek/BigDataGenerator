package models

object InsuranceType extends Enumeration {
	type InsuranceType = Value
	val Health, Life, Car, Casualty = Value
	
	def getStringList(): List[String] = 
	  for (insuranceType <- InsuranceType.values.toList) yield insuranceType.toString()

}