
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
object generator extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Int],Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(generateForm: Form[Int])(implicit lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/template("Generate data automaticly", "gen.png")/*5.50*/{_display_(Seq[Any](format.raw/*5.51*/("""
	<div id="textContent">
	<h2>Generator will automatically generate given amount of <br>data and insert it into database.</h2>
			<form action=""""),_display_(Seq[Any](/*8.19*/controllers/*8.30*/.routes.Application.generatorPost())),format.raw/*8.65*/("""" method="post">
				<div style="float:left; margin-left: 50px; text-align:right;">
				    Number of rows to generate &nbsp;&nbsp;<input type="text" name="number"/><br>
					<input type="submit" value='"""),_display_(Seq[Any](/*11.35*/Messages("persons.generate.submit"))),format.raw/*11.70*/("""' id="generatorSubmit"/>
				</div>
			</form>
			
	</div>
				
""")))})),format.raw/*17.2*/("""
"""))}
    }
    
    def render(generateForm:Form[Int],lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(generateForm)(lang)
    
    def f:((Form[Int]) => (Lang) => play.api.templates.HtmlFormat.Appendable) = (generateForm) => (lang) => apply(generateForm)(lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 13 23:56:56 CET 2014
                    SOURCE: /home/kainos/Projekt/scalaProj/app/views/generator.scala.html
                    HASH: 97f9e61cb53c595fb082b843920593b68fdacff9
                    MATRIX: 568->1|724->47|752->66|788->68|844->116|882->117|1062->262|1081->273|1137->308|1377->512|1434->547|1530->612
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|29->8|29->8|29->8|32->11|32->11|38->17
                    -- GENERATED --
                */
            