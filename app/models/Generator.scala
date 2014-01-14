package models

import scala.util.Random
import scala.io.Source._
import org.joda.time.LocalDate
import com.mongodb.casbah.Imports._

object Generator {

  val maleNames = fromFile("data/names/maleNames.txt").getLines.toList
  val femaleNames = fromFile("data/names/femaleNames.txt").getLines.toList
  val surnames = fromFile("data/names/lastNames.txt").getLines.toList
  val locations = fromFile("data/locations/locations.txt").getLines.toList

  def generatePersons(n: Int): List[Person] = (for(i <- 0 until n) yield generatePerson).toList  
  
  def generatePerson(): Person = {

    val random = new Random()

    def getRandomElementOfList(xs: List[String]): String = {
      xs(random.nextInt(xs.length))
    }

    // The function generates pair (sex,name) based on int argument; only 0 and 1 are expected to be passed (so this '_' means 1...) 
    def generateSexAndNamePair(x: Int): (String, String) = x match {
      case 0 => ("male", getRandomElementOfList(maleNames))
      case _ => ("female", getRandomElementOfList(femaleNames))
    }

    // 
    def generateDay(month: Int): Int = {
      month match {
        case 2 => random.nextInt(28) + 1
        case 4 | 6 | 9 | 11 => random.nextInt(30) + 1
        case _ => random.nextInt(31) + 1
      }
    }

    //
    def generateDateOfBirth(): LocalDate = {
      var year = 1960 + (random.nextGaussian() * 22).toInt
      if (year > 1995) year = 1995
      val month = random.nextInt(12) + 1
      val day = generateDay(month)
      new LocalDate(year, month, day)
    }

    //
    def generateInsuranceSigningDate(dateOfBirth: LocalDate): LocalDate = {
      var year = dateOfBirth.getYear() + 40 + (random.nextGaussian() * 15).toInt
      if (year > 2013) year = 2013
      val month = random.nextInt(12) + 1
      val day = generateDay(month)
      new LocalDate(year, month, day)
    }

    //
    def generateInsuranceEndingDate(dateOfSigning: LocalDate): LocalDate = {
      val year = dateOfSigning.getYear() + 1 + random.nextInt(40)
      val month = random.nextInt(12) + 1
      val day = generateDay(month)
      new LocalDate(year,month,day)
    }

    //
    def generateInsurancePremium(): Double = (math rint (15000 + random.nextGaussian * 5000) * 100) / 100

    //
    def generateInsuranceValue(insurancePremium: Double): Double = (math rint (5 * (random.nextInt(5) + 1) * insurancePremium) * 100 ) / 100

    // preparing values for object's fields
    val sexNamePair = generateSexAndNamePair(random.nextInt(2))
    val lastName = getRandomElementOfList(surnames)
    val dateOfBirth = generateDateOfBirth
    val civilStatus = getRandomElementOfList(CivilStatus.getStringList())
    val dateOfInsuranceSigning = generateInsuranceSigningDate(dateOfBirth)
    val dateOfInsuranceEnding = generateInsuranceEndingDate(dateOfInsuranceSigning)
    val location = getRandomElementOfList(locations)
    val insuranceType = getRandomElementOfList(InsuranceType.getStringList())
    val insurancePremium = generateInsurancePremium
    val insuranceValue = generateInsuranceValue(insurancePremium)

    new Person(new ObjectId, sexNamePair._2, lastName, sexNamePair._1, dateOfBirth.toString(), civilStatus,
      dateOfInsuranceSigning.toString(), dateOfInsuranceEnding.toString(), location, insuranceType, insurancePremium, insuranceValue)
  }
}