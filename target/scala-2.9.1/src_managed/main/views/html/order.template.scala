
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
object order extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Ваш заказ")/*1.19*/ {_display_(Seq[Any](format.raw/*1.21*/("""
    <div>
        Чтобы заказать произведение зайдите в <a href="/gallery">Галерею</a>
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
                    SOURCE: C:/work/artistSite/app/views/order.scala.html
                    HASH: fa8e1c6c3f1ea113b7b719cfc5b37743215d5e9b
                    MATRIX: 828->1|853->18|892->20
                    LINES: 30->1|30->1|30->1
                    -- GENERATED --
                */
            