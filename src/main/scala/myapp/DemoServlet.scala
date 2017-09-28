package myapp

import javax.servlet.http._

class DemoServlet extends HttpServlet {

  override def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    val result: Int = {
      for {
        k <- List(1, 2, 3, 4, 5)
        j <- List(2, 3, 4, 5, 6)
      } yield k + j
    }.sum

    resp.setContentType("application/json")
    resp.getWriter.println(s"{'result': '$result'}")
  }
}

object DemoServlet {
  val x = 1
}