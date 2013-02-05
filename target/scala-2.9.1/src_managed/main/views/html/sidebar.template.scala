
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
object sidebar extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="sidebar">
<ul>
    <li>
        <a href="/">О сайте</a>
    </li>
    <li>
        <a href="/gallery">Галерея</a>
    </li>
    <li>
        <a href="/order">Ваш заказ</a>
    </li>
</ul>
</div>
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 22 16:45:49 NOVT 2013
                    SOURCE: C:/work/artistSite/app/views/sidebar.scala.html
                    HASH: 4273f142c9376ddbbbb9e1305889aff99c346188
                    MATRIX: 821->0
                    LINES: 30->1
                    -- GENERATED --
                */
            