package models

object CivilStatus extends Enumeration {
	type CivilStatus = Value
	val Single, Married, Widowed, Separated, Divorced = Value
	
	def getStringList(): List[String] =
	  for (civilStatus <- CivilStatus.values.toList) yield civilStatus.toString()
}