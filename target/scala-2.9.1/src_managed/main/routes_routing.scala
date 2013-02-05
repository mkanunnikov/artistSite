// @SOURCE:C:/work/artistSite/conf/routes
// @HASH:a97b32ccb2e91b29fae6ab8d6ac8c52683da8bc2
// @DATE:Tue Jan 29 16:54:24 NOVT 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_about0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_Application_gallery1 = Route("GET", PathPattern(List(StaticPart("/gallery"))))
                    

// @LINE:9
val controllers_Application_order2 = Route("GET", PathPattern(List(StaticPart("/order"))))
                    

// @LINE:12
val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.about"""),("""GET""","""/gallery""","""controllers.Application.gallery(pageSize:java.lang.Integer ?= 10)"""),("""GET""","""/order""","""controllers.Application.order"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_about0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.about, HandlerDef(this, "controllers.Application", "about", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_gallery1(params) => {
   call(params.fromQuery[java.lang.Integer]("pageSize", Some(10))) { (pageSize) =>
        invokeHandler(_root_.controllers.Application.gallery(pageSize), HandlerDef(this, "controllers.Application", "gallery", Seq(classOf[java.lang.Integer])))
   }
}
                    

// @LINE:9
case controllers_Application_order2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.order, HandlerDef(this, "controllers.Application", "order", Nil))
   }
}
                    

// @LINE:12
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                