package jbs.staffaction;

import jbs.Entity.Auto;
import jbs.Entity.Custom;
import jbs.biz.AutoBiz;
import jbs.biz.RentListBiz;
import jbs.biz.UserBiz;
import jbs.dto.RentListInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RentListDetailServlet",urlPatterns = "/RentListDetailServlet")
public class RentListDetailServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String rno = req.getParameter("rno");
        String cno = req.getParameter("cno");
        String autocard = req.getParameter("autocard");
        RentListBiz biz = new RentListBiz();
        AutoBiz biz2 = new AutoBiz();
        UserBiz biz3 = new UserBiz();
        try {
            RentListInfo rentListInfo = biz.getRentListDetail(rno);
            Auto auto = biz2.getAutoDetail(autocard);
            Custom custom = biz3.getCustomDetail(cno) ;
            req.setAttribute("rentListInfo",rentListInfo);
            req.setAttribute("auto",auto);
            req.setAttribute("custom",custom);
            req.getRequestDispatcher("/WEB-INF/StaffPages/RentListDetail.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            req.getRequestDispatcher("/WEB-INF/StaffPages/RentList.jsp").forward(req, resp);
        }
    }
}