package myapp

import javax.servlet.http._

class DemoServlet extends HttpServlet {

  override def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    (1 to 5).foreach(
      i => Seq("A", "B").foreach(
        j => println(i+"-"+j)
      )
    )
    resp.setContentType("application/json")
    resp.getWriter.println("{'result': 'ok'}")
  }
}
