
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/template("Insurance BigData Generator", "home.png")/*3.53*/{_display_(Seq[Any](format.raw/*3.54*/("""
	<div id="textContent">
				<h1>Welcome to the Insurance Big Data Generator!</h1> <p style="margin-left: 30px;">What you want to do?<p>
				<ul style="margin-left: 40px;">
					<li><a href=""""),_display_(Seq[Any](/*7.20*/controllers/*7.31*/.routes.Application.generator())),format.raw/*7.62*/("""">I want to automatically generate big amount of data.</a></li>
					<li><a href=""""),_display_(Seq[Any](/*8.20*/controllers/*8.31*/.routes.Application.add())),format.raw/*8.56*/("""">I want to manually add data to database.</a></li>
					<li><a href=""""),_display_(Seq[Any](/*9.20*/controllers/*9.31*/.routes.Application.database())),format.raw/*9.61*/("""">I want to see what's in database.</a></li>
				</ul>
			</div>
""")))})),format.raw/*12.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 13 23:50:16 CET 2014
                    SOURCE: /home/kainos/Projekt/scalaProj/app/views/index.scala.html
                    HASH: 51de74554c4ba74f468da4139989b6a29e97fb17
                    MATRIX: 556->1|667->18|704->21|763->72|801->73|1028->265|1047->276|1099->307|1217->390|1236->401|1282->426|1388->497|1407->508|1458->538|1555->604
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|33->12
                    -- GENERATED --
                */
            