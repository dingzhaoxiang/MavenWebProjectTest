package push;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dzx on 2017/6/2.
 */
public class PushMeessageServlet extends HttpServlet {
    final Logger logger  =  LoggerFactory.getLogger(PushMeessageServlet.class);
    public PushMeessageServlet() {
        super();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("doPost!");
        System.out.println("推送给手机");
    }
}
