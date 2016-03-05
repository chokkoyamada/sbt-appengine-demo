package myapp

import javax.servlet.http._

class DemoServlet extends HttpServlet {
    override def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
        resp.setContentType("application/json")
        resp.getWriter.println(json)
    }

    private val json = """{ "name": "World" }"""
}
