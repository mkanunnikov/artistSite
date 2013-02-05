
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object about extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("О сайте")/*1.17*/ {_display_(Seq[Any](format.raw/*1.19*/("""
    <div>
        Информация о сайте
    </div>

""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 22 16:40:24 NOVT 2013
                    SOURCE: C:/work/artistSite/app/views/about.scala.html
                    HASH: d965a63cb3e02cf9be1248c238cc8db90e498a36
                    MATRIX: 828->1|851->16|890->18
                    LINES: 30->1|30->1|30->1
                    -- GENERATED --
                */
            