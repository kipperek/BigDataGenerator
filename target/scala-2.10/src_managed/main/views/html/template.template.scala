
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
object template extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, img: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.45*/("""

<!DOCTYPE html>

<html>
	<head>
		<style>
			@font-face """),format.raw/*8.16*/("""{"""),format.raw/*8.17*/(""" font-family: CustomFont; src: url("""),_display_(Seq[Any](/*8.53*/routes/*8.59*/.Assets.at("fonts/font1.OTF"))),format.raw/*8.88*/("""); """),format.raw/*8.91*/("""}"""),format.raw/*8.92*/(""" 
			@font-face """),format.raw/*9.16*/("""{"""),format.raw/*9.17*/(""" font-family: HeadingFont; src: url("""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("fonts/font2.OTF"))),format.raw/*9.89*/("""); """),format.raw/*9.92*/("""}"""),format.raw/*9.93*/(""" 
		</style>
		<LINK rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.49*/routes/*11.55*/.Assets.at("stylesheets/main.css"))),format.raw/*11.89*/("""" title="Default Styles" media="screen">
		<meta http-equiv="content-type" content="text/html; charset=utf-8">
		 
		<title>BigData generator</title>
		
		<script src=""""),_display_(Seq[Any](/*16.17*/routes/*16.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*16.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*17.17*/routes/*17.23*/.Assets.at("javascripts/d3.js"))),format.raw/*17.54*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*18.17*/routes/*18.23*/.Assets.at("javascripts/map.js"))),format.raw/*18.55*/("""" type="text/javascript"></script>
		
	</head>
	<body>
		<div id="header">
			<div id="header-content">
				<div id="himg" style="background: url("""),_display_(Seq[Any](/*24.44*/routes/*24.50*/.Assets.at("images/" + img))),format.raw/*24.77*/(""")"></div>
				<div id="htxt">"""),_display_(Seq[Any](/*25.21*/title)),format.raw/*25.26*/("""</div>
				<div id="menu">
					<a href=""""),_display_(Seq[Any](/*27.16*/controllers/*27.27*/.routes.Application.index())),format.raw/*27.54*/("""">Home</a> 
					<a href=""""),_display_(Seq[Any](/*28.16*/controllers/*28.27*/.routes.Application.generator())),format.raw/*28.58*/("""">Generator</a> 
					<a href=""""),_display_(Seq[Any](/*29.16*/controllers/*29.27*/.routes.Application.add())),format.raw/*29.52*/("""">Add</a> 
					<a href=""""),_display_(Seq[Any](/*30.16*/controllers/*30.27*/.routes.Application.database())),format.raw/*30.57*/("""">Database</a>
				</div>
			</div>
		</div>
		<div id="content">
			"""),_display_(Seq[Any](/*35.5*/content)),format.raw/*35.12*/("""
		</div>
	</body>
</html>"""))}
    }
    
    def render(title:String,img:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,img)(content)
    
    def f:((String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,img) => (content) => apply(title,img)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 13 23:30:11 CET 2014
                    SOURCE: /home/kainos/Projekt/scalaProj/app/views/template.scala.html
                    HASH: 34b586e612fc37bceb71ca24e60d4c0ccfe2010d
                    MATRIX: 571->1|708->44|793->103|821->104|892->140|906->146|956->175|986->178|1014->179|1057->196|1085->197|1157->234|1171->240|1221->269|1251->272|1279->273|1376->334|1391->340|1447->374|1652->543|1667->549|1734->594|1821->645|1836->651|1889->682|1976->733|1991->739|2045->771|2228->918|2243->924|2292->951|2358->981|2385->986|2463->1028|2483->1039|2532->1066|2595->1093|2615->1104|2668->1135|2736->1167|2756->1178|2803->1203|2865->1229|2885->1240|2937->1270|3042->1340|3071->1347
                    LINES: 19->1|22->1|29->8|29->8|29->8|29->8|29->8|29->8|29->8|30->9|30->9|30->9|30->9|30->9|30->9|30->9|32->11|32->11|32->11|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|45->24|45->24|45->24|46->25|46->25|48->27|48->27|48->27|49->28|49->28|49->28|50->29|50->29|50->29|51->30|51->30|51->30|56->35|56->35
                    -- GENERATED --
                */
            