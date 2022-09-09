import java.io.*;
import java.utill.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SessionServletDemo extends HTTPServlet
{
    public void doGet(HTTPServletRequest req,HTTPServletResponse res)throws servletException,IOException
    {
        res.SetContentType("text/html");
        HTTPSession Session=req.getSession();
        String heading;
        Integer cnt=(integer)Session.getAttribute("cnt");
        if(cnt==null)
        {
            cnt=NewInteger(0);
            heading=("Welcome you are Accessing the page for first time");
        }
        else
        {
            heading=("Welcome once again !");
            cnt=newInteger(cnt.intValue()+1);
        }
        Session.SetAttribute("cnt,cnt");
        PrintWriter out=res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<centre>");
        out.println("<h1>"+heading);
        out.println("The no.of previous access="+cnt);
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
        }
}