// @SOURCE:C:/work/artistSite/conf/routes
// @HASH:a97b32ccb2e91b29fae6ab8d6ac8c52683da8bc2
// @DATE:Tue Jan 29 16:54:24 NOVT 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def about() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:8
def gallery(pageSize:java.lang.Integer = 10) = {
   Call("GET", "/gallery" + queryString(List(if(pageSize == 10) None else Some(implicitly[QueryStringBindable[java.lang.Integer]].unbind("pageSize", pageSize)))))
}
                                                        
 
// @LINE:9
def order() = {
   Call("GET", "/order")
}
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def about = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:8
def gallery = JavascriptReverseRoute(
   "controllers.Application.gallery",
   """
      function(pageSize) {
      return _wA({method:"GET", url:"/gallery" + _qS([(pageSize == null ? """ +  implicitly[JavascriptLitteral[java.lang.Integer]].to(10) + """ : (""" + implicitly[QueryStringBindable[java.lang.Integer]].javascriptUnbind + """)("pageSize", pageSize))])})
      }
   """
)
                                                        
 
// @LINE:9
def order = JavascriptReverseRoute(
   "controllers.Application.order",
   """
      function() {
      return _wA({method:"GET", url:"/order"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def about() = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq())
)
                              
 
// @LINE:8
def gallery(pageSize:java.lang.Integer) = new play.api.mvc.HandlerRef(
   controllers.Application.gallery(pageSize), HandlerDef(this, "controllers.Application", "gallery", Seq(classOf[java.lang.Integer]))
)
                              
 
// @LINE:9
def order() = new play.api.mvc.HandlerRef(
   controllers.Application.order(), HandlerDef(this, "controllers.Application", "order", Seq())
)
                              

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                