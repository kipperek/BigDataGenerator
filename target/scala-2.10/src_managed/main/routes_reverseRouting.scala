// @SOURCE:/home/kainos/Projekt/scalaProj/conf/routes
// @HASH:ae164e0ffda8005b996d417323856105f482cd93
// @DATE:Mon Jan 13 23:28:11 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def database(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "database")
}
                                                

// @LINE:15
def addPost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "add")
}
                                                

// @LINE:9
def add(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "add")
}
                                                

// @LINE:10
def generator(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "generator")
}
                                                

// @LINE:16
def generatorPost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "generator")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:16
// @LINE:15
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def database : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.database",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "database"})
      }
   """
)
                        

// @LINE:15
def addPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
      }
   """
)
                        

// @LINE:9
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
      }
   """
)
                        

// @LINE:10
def generator : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.generator",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "generator"})
      }
   """
)
                        

// @LINE:16
def generatorPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.generatorPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "generator"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def database(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.database(), HandlerDef(this, "controllers.Application", "database", Seq(), "GET", """ My pages                        """, _prefix + """database""")
)
                      

// @LINE:15
def addPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addPost(), HandlerDef(this, "controllers.Application", "addPost", Seq(), "POST", """ POSTs ;)""", _prefix + """add""")
)
                      

// @LINE:9
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.add(), HandlerDef(this, "controllers.Application", "add", Seq(), "GET", """""", _prefix + """add""")
)
                      

// @LINE:10
def generator(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.generator(), HandlerDef(this, "controllers.Application", "generator", Seq(), "GET", """""", _prefix + """generator""")
)
                      

// @LINE:16
def generatorPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.generatorPost(), HandlerDef(this, "controllers.Application", "generatorPost", Seq(), "POST", """""", _prefix + """generator""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    