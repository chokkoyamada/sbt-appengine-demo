package myapp

import javax.servlet.http._
import scalaj.http.Http

class DemoServlet extends HttpServlet {
  val url = "https://api.github.com/search/repositories?q=language:scala&sort=stars&order=desc"

  override def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    resp.setContentType("application/json")
    val result = getPopularScalaProject(url)
    resp.getWriter.println(getPopularScalaProject(result.toString))
  }

  @throws(classOf[java.io.IOException])
  def getPopularScalaProject(url: String): String = Http(url).header("User-Agent", "sample http request").asString.body
}
