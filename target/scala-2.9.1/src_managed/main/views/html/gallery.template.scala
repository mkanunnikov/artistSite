
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
object gallery extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Int,List[model.Picture],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(pageSize:Int, pictures: List[model.Picture]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.47*/("""

"""),_display_(Seq[Any](/*3.2*/main("Галерея")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
    <div class="gallery">
        <div class="gallery_top">Каталог картин.  Картин на странице : """),_display_(Seq[Any](/*5.73*/pageSize)),format.raw/*5.81*/("""</div>
        """),_display_(Seq[Any](/*6.10*/for(picture <- pictures) yield /*6.34*/{_display_(Seq[Any](format.raw/*6.35*/("""
            <div class="picture_area">
            """),_display_(Seq[Any](/*8.14*/if(picture.getFotos==null)/*8.40*/{_display_(Seq[Any](format.raw/*8.41*/("""
                <span class="foto"><img src=""""),_display_(Seq[Any](/*9.47*/routes/*9.53*/.Assets.at("images/favicon.png"))),format.raw/*9.85*/("""" alt="Image not found"/></span>
            """),format.raw/*10.23*/("""
                """),format.raw/*11.106*/("""
            """)))})),format.raw/*12.14*/("""
                <span class="picture">Название: """),_display_(Seq[Any](/*13.50*/picture/*13.57*/.getName)),format.raw/*13.65*/("""</span>
                <span class="picture">Описание: """),_display_(Seq[Any](/*14.50*/picture/*14.57*/.getDescription)),format.raw/*14.72*/("""</span>
                <span class="picture">Год: """),_display_(Seq[Any](/*15.45*/picture/*15.52*/.getYear)),format.raw/*15.60*/("""</span>
                <span class="price">Цена: """),_display_(Seq[Any](/*16.44*/picture/*16.51*/.getPrice)),format.raw/*16.60*/("""</span>
            </div>
        """)))})),format.raw/*18.10*/("""
    </div>

""")))})))}
    }
    
    def render(pageSize:Int,pictures:List[model.Picture]) = apply(pageSize,pictures)
    
    def f:((Int,List[model.Picture]) => play.api.templates.Html) = (pageSize,pictures) => apply(pageSize,pictures)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 05 17:26:19 NOVT 2013
                    SOURCE: C:/work/artistSite/app/views/gallery.scala.html
                    HASH: 54e70a6b79519d0e51c3656b3330286de982ed03
                    MATRIX: 774->1|896->46|933->49|956->64|995->66|1129->165|1158->173|1209->189|1248->213|1286->214|1374->267|1408->293|1446->294|1528->341|1542->347|1595->379|1668->434|1714->540|1760->554|1846->604|1862->611|1892->619|1985->676|2001->683|2038->698|2126->750|2142->757|2172->765|2259->816|2275->823|2306->832|2374->868
                    LINES: 27->1|30->1|32->3|32->3|32->3|34->5|34->5|35->6|35->6|35->6|37->8|37->8|37->8|38->9|38->9|38->9|39->10|40->11|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|47->18
                    -- GENERATED --
                */
            