
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object add extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/template("Add data manually", "add.png")/*3.42*/{_display_(Seq[Any](format.raw/*3.43*/("""
	<div id="map">
				<script>
					draw2(""""),_display_(Seq[Any](/*6.14*/routes/*6.20*/.Assets.at("maps/data.json"))),format.raw/*6.48*/("""");
				</script>
			</div>
			<div id="formDiv">
				<form action=""""),_display_(Seq[Any](/*10.20*/controllers/*10.31*/.routes.Application.addPost())),format.raw/*10.60*/("""" id="addForm" method="post">
					<table class="formTable">
						<tr>
							<td>Name</td>
							<td><input type="text" name="name" /></td>
						</tr>
						<tr>
							<td>Surname</td>
							<td><input type="text" name="lastName" /></td>
						</tr>
						<tr>
							<td>Sex</td>
							<td>Male<input type="radio" name="sex" value="male" checked/> Female<input type="radio" name="sex" value="female" /></td>
						</tr>
						<tr>
							<td>Date of birth</td>
							<td><input type="date" name="dateOfBirth" /></td>
						</tr>
						<tr>
							<td>Civil status</td>
							<td>
							<select name="civilStatus">
								<option selected value="Single">Single</option>
								<option value="Married">Married</option>
								<option value="Widowed">Widowed</option>
								<option value="Separated">Separated</option>
								<option value="Divorced">Divorced</option>
							</select>
							</td>
						</tr>
					<!--<tr>
							<td>Personal identity number</td>
							<td><input type="text" name="pin" /></td>
						</tr> -->
						<tr>
							<td>Date of sign insurance</td>
							<td><input type="date" name="dateOfInsuranceSigning" /></td>
						</tr>
						<tr>
							<td>Date of insurance end</td>
							<td><input type="date" name="dateOfInsuranceEnding" /></td>
						</tr>
						<tr>
							<td>Location</td>
							<td><input type="text" name="location" id="location_input" value="Select location on the map" disabled/></td>
						</tr>
						<tr>
							<td>Type of insurance</td>
							<td>
								<select name="insuranceType">
									<option selected="selected" value="Health">Health</option>
									<option value="Life">Life</option>
									<option value="Casualty">Casualty</option>
									<option value="Car">Car</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>Insurance premium</td>
							<td><input type="text" name="insurancePremium"> &euro;</td>
						</tr>
						<tr>
							<td>Insurance value</td>
							<td><input type="text" name="insuranceValue"> &euro;</td>
						</tr>
					</table>
						<input type="submit" value="Add" /> <input type="reset" value="Reset" />
				</form>
			</div>
""")))})),format.raw/*79.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 14 00:51:32 CET 2014
                    SOURCE: /home/kainos/Projekt/scalaProj/app/views/add.scala.html
                    HASH: 304960db8542d684450a16a4c79c581dc32060f8
                    MATRIX: 554->1|665->18|702->21|750->61|788->62|866->105|880->111|929->139|1034->208|1054->219|1105->248|3308->2420
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|27->6|31->10|31->10|31->10|100->79
                    -- GENERATED --
                */
            