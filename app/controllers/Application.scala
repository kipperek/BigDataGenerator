package controllers

import org.bson.types.ObjectId

import models.Generator
import models.Person
import models.PersonDAO
import play.api.data.Form
import play.api.data.Forms.jodaDate
import play.api.data.Forms.nonEmptyText
import play.api.data.Forms.number
import play.api.data.Forms.tuple
import play.api.mvc.Action
import play.api.mvc.Controller

object Application extends Controller {

    private val generatorForm = Form(
    "number" -> number)
      
    def index = Action {
    Ok(views.html.index("OK"))
  }
  
     def add = Action {
    Ok(views.html.add("OK"))
  }
     
      def addPost = Action {implicit request =>
    personForm.bindFromRequest.fold(
      formWithErrors => BadRequest("Invalid data!"), 
      {
        case (name, lastName, sex, dateOfBirth, civilStatus, dateOfInsuranceSigning,
          dateOfInsuranceEnding, location, insuranceType, insurancePremium, insuranceValue) => {
        	val newPerson = new Person(new ObjectId, name, lastName, sex, dateOfBirth.toLocalDate().toString(), civilStatus, dateOfInsuranceSigning.toLocalDate().toString(),
          dateOfInsuranceEnding.toLocalDate().toString(), location, insuranceType, insurancePremium.toDouble, insuranceValue.toDouble)  
            PersonDAO.save(newPerson)
            val tenPersons = Person.getTwenty
            val personsNumber = Person.countPersons
            Ok(views.html.database(tenPersons, personsNumber))
        }
      })
  }
   
   
     def generator = Action {
    Ok(views.html.generator(generatorForm))
  }
     def generatorPost = Action {
    	 implicit request => val number = generatorForm.bindFromRequest.get
    	 
       val generatedPersons = Generator.generatePersons(number)
       for (person <- generatedPersons) yield Person.add(person)
       val tenPersons = Person.getTwenty
       val personsNumber = Person.countPersons
    Ok(views.html.database(tenPersons, personsNumber))
  }
     
     
     def database = Action {
       val tenPersons = Person.getTwenty
       val personsNumber = Person.countPersons
    Ok(views.html.database(tenPersons, personsNumber))
  }
     
     
  private val personForm = Form(
    tuple("name" -> nonEmptyText,
      "lastName" -> nonEmptyText,
      "sex" -> nonEmptyText,
      "dateOfBirth" -> jodaDate("yyyy-mm-dd"),
      "civilStatus" -> nonEmptyText,
      "dateOfInsuranceSigning" -> jodaDate("yyyy-mm-dd"),
      "dateOfInsuranceEnding" -> jodaDate("yyyy-mm-dd"),
      "location" -> nonEmptyText,
      "insuranceType" -> nonEmptyText,
      "insurancePremium" -> number,
      "insuranceValue" -> number))

}