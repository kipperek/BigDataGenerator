// @SOURCE:/home/kainos/Projekt/scalaProj/conf/routes
// @HASH:ae164e0ffda8005b996d417323856105f482cd93
// @DATE:Mon Jan 13 23:28:11 CET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_database1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("database"))))
        

// @LINE:9
private[this] lazy val controllers_Application_add2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add"))))
        

// @LINE:10
private[this] lazy val controllers_Application_generator3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("generator"))))
        

// @LINE:12
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:15
private[this] lazy val controllers_Application_addPost5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add"))))
        

// @LINE:16
private[this] lazy val controllers_Application_generatorPost6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("generator"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """database""","""controllers.Application.database"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add""","""controllers.Application.add"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """generator""","""controllers.Application.generator"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add""","""controllers.Application.addPost"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """generator""","""controllers.Application.generatorPost""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_database1(params) => {
   call { 
        invokeHandler(controllers.Application.database, HandlerDef(this, "controllers.Application", "database", Nil,"GET", """ My pages                        """, Routes.prefix + """database"""))
   }
}
        

// @LINE:9
case controllers_Application_add2(params) => {
   call { 
        invokeHandler(controllers.Application.add, HandlerDef(this, "controllers.Application", "add", Nil,"GET", """""", Routes.prefix + """add"""))
   }
}
        

// @LINE:10
case controllers_Application_generator3(params) => {
   call { 
        invokeHandler(controllers.Application.generator, HandlerDef(this, "controllers.Application", "generator", Nil,"GET", """""", Routes.prefix + """generator"""))
   }
}
        

// @LINE:12
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:15
case controllers_Application_addPost5(params) => {
   call { 
        invokeHandler(controllers.Application.addPost, HandlerDef(this, "controllers.Application", "addPost", Nil,"POST", """ POSTs ;)""", Routes.prefix + """add"""))
   }
}
        

// @LINE:16
case controllers_Application_generatorPost6(params) => {
   call { 
        invokeHandler(controllers.Application.generatorPost, HandlerDef(this, "controllers.Application", "generatorPost", Nil,"POST", """""", Routes.prefix + """generator"""))
   }
}
        
}

}
     