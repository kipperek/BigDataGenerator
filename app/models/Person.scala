package models

import com.mongodb.casbah.Imports._
import mongoContext._
import com.novus.salat.dao.SalatDAO
import com.mongodb.casbah.MongoConnection

case class Person(_id: ObjectId, name: String, lastName: String, sex: String, dateOfBirth: String, 
    civilStatus: String, dateOfInsuranceSigning: String, dateOfInsuranceEnding: String, location: String,
    insuranceType: String, insurancePremium: Double, insuranceValue: Double)
    
    
object PersonDAO extends SalatDAO[Person, ObjectId](collection = MongoConnection()("mydb")("person")) {}

object Person {
  
  def add(person: Person) = {
    PersonDAO.insert(person)
  }
  
  def getTwenty(): List[Person] = PersonDAO.find(MongoDBObject.empty).toList.take(20)
  
  def countPersons(): Int = PersonDAO.find(MongoDBObject.empty).length
  
}