package ren.shuaipeng.sanbox.servlet;

//import org.springframework.util.StringUtils;
import ren.shuaipeng.sanbox.servlet.service.chaosblade.HttpClient3Service;
import ren.shuaipeng.sanbox.servlet.service.chaosblade.HttpClient4Service;
import ren.shuaipeng.sanbox.servlet.service.chaosblade.RestHttpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/index/*")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //解析PATH参数
        String servletPath = req.getPathInfo();
        if(!"".equals(servletPath)) {
            switch (servletPath) {
                case "/rest":
                    RestHttpService.getBaidu();
                    break;
                case "/httpclient3":
                    HttpClient3Service.getBaidu();
                    break;
                case "/httpclient4":
                    HttpClient4Service.getBaidu();
                    break;
            }
        }

        IndexService indexService = new IndexService();
        indexService.get(req.getParameter("a"));

        PrintWriter writer = resp.getWriter();
        writer.write("welcome,sanbox");
        writer.flush();
        writer.close();
    }
}
