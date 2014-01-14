
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
object database extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Person],Int,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(persons: List[Person], personsNumber: Int)(implicit lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.66*/("""

"""),_display_(Seq[Any](/*3.2*/template("BigData database", "base.png")/*3.42*/{_display_(Seq[Any](format.raw/*3.43*/("""

	
		<h2 style="margin-top: 30px;">
			Actually, there are """),_display_(Seq[Any](/*7.25*/personsNumber)),format.raw/*7.38*/(""" persons in the database. Here are some of them: 
		</h2>
	
	<table class="showTable">
		<tr>
			<th>"""),_display_(Seq[Any](/*12.9*/Messages("name"))),format.raw/*12.25*/("""</th>
			<th>"""),_display_(Seq[Any](/*13.9*/Messages("lastName"))),format.raw/*13.29*/("""</th>
			<th>"""),_display_(Seq[Any](/*14.9*/Messages("sex"))),format.raw/*14.24*/("""</th>
			<th>"""),_display_(Seq[Any](/*15.9*/Messages("dateOfBirth"))),format.raw/*15.32*/("""</th>
			<th>"""),_display_(Seq[Any](/*16.9*/Messages("civilStatus"))),format.raw/*16.32*/("""</th>
			<th>"""),_display_(Seq[Any](/*17.9*/Messages("dateOfInsuranceSigning"))),format.raw/*17.43*/("""</th>
			<th>"""),_display_(Seq[Any](/*18.9*/Messages("dateOfInsuranceEnding"))),format.raw/*18.42*/("""</th>
			<th>"""),_display_(Seq[Any](/*19.9*/Messages("location"))),format.raw/*19.29*/("""</th>
			<th>"""),_display_(Seq[Any](/*20.9*/Messages("insuranceType"))),format.raw/*20.34*/("""</th>
			<th>"""),_display_(Seq[Any](/*21.9*/Messages("insurancePremium"))),format.raw/*21.37*/("""</th>
			<th>"""),_display_(Seq[Any](/*22.9*/Messages("insuranceValue"))),format.raw/*22.35*/("""</th>
		</tr>
		"""),_display_(Seq[Any](/*24.4*/for(person <- persons) yield /*24.26*/ {_display_(Seq[Any](format.raw/*24.28*/("""
			<tr>
				<td>"""),_display_(Seq[Any](/*26.10*/person/*26.16*/.name)),format.raw/*26.21*/("""</td>			
				<td>"""),_display_(Seq[Any](/*27.10*/person/*27.16*/.lastName)),format.raw/*27.25*/("""</td>		
				<td>"""),_display_(Seq[Any](/*28.10*/person/*28.16*/.sex)),format.raw/*28.20*/("""</td>			
				<td>"""),_display_(Seq[Any](/*29.10*/person/*29.16*/.dateOfBirth)),format.raw/*29.28*/("""</td>			
				<td>"""),_display_(Seq[Any](/*30.10*/person/*30.16*/.civilStatus)),format.raw/*30.28*/("""</td>
				<td>"""),_display_(Seq[Any](/*31.10*/person/*31.16*/.dateOfInsuranceSigning)),format.raw/*31.39*/("""</td>
				<td>"""),_display_(Seq[Any](/*32.10*/person/*32.16*/.dateOfInsuranceEnding)),format.raw/*32.38*/("""</td>
				<td>"""),_display_(Seq[Any](/*33.10*/person/*33.16*/.location)),format.raw/*33.25*/("""</td>
				<td>"""),_display_(Seq[Any](/*34.10*/person/*34.16*/.insuranceType)),format.raw/*34.30*/("""</td>				
				<td>"""),_display_(Seq[Any](/*35.10*/person/*35.16*/.insurancePremium)),format.raw/*35.33*/("""</td>
				<td>"""),_display_(Seq[Any](/*36.10*/person/*36.16*/.insuranceValue)),format.raw/*36.31*/("""</td>
			</tr>
			""")))})),format.raw/*38.5*/("""
	</table>
	

""")))})),format.raw/*42.2*/("""
"""))}
    }
    
    def render(persons:List[Person],personsNumber:Int,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(persons,personsNumber)(lang)
    
    def f:((List[Person],Int) => (Lang) => play.api.templates.HtmlFormat.Appendable) = (persons,personsNumber) => (lang) => apply(persons,personsNumber)(lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 14 00:33:01 CET 2014
                    SOURCE: /home/kainos/Projekt/scalaProj/app/views/database.scala.html
                    HASH: 29955c77d5f0c4616763e6b5bca2144992d73b84
                    MATRIX: 574->1|732->65|769->68|817->108|855->109|951->170|985->183|1122->285|1160->301|1209->315|1251->335|1300->349|1337->364|1386->378|1431->401|1480->415|1525->438|1574->452|1630->486|1679->500|1734->533|1783->547|1825->567|1874->581|1921->606|1970->620|2020->648|2069->662|2117->688|2169->705|2207->727|2247->729|2301->747|2316->753|2343->758|2397->776|2412->782|2443->791|2496->808|2511->814|2537->818|2591->836|2606->842|2640->854|2694->872|2709->878|2743->890|2794->905|2809->911|2854->934|2905->949|2920->955|2964->977|3015->992|3030->998|3061->1007|3112->1022|3127->1028|3163->1042|3218->1061|3233->1067|3272->1084|3323->1099|3338->1105|3375->1120|3425->1139|3471->1154
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|33->12|33->12|34->13|34->13|35->14|35->14|36->15|36->15|37->16|37->16|38->17|38->17|39->18|39->18|40->19|40->19|41->20|41->20|42->21|42->21|43->22|43->22|45->24|45->24|45->24|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|51->30|51->30|51->30|52->31|52->31|52->31|53->32|53->32|53->32|54->33|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|57->36|57->36|57->36|59->38|63->42
                    -- GENERATED --
                */
            