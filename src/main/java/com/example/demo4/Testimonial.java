package com.example.demo4;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Testimonial", value = "/Testimonial")
public class Testimonial extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>" +
                "<link href=\"bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\n" +
                "<link rel=\"stylesheet\" href=\"style.css\">" +
                "</head>");
        out.println("<body> <header>\n" +
                "    <div class=\"container\">\n" +
                "        <div class=\"row align-items-sm-center\">\n" +
                "            <div class=\"col-1\"></div>\n" +
                "            <div class=\"col-1\"><img src=\"style/img.png\" class=\"img-fluid\" alt=\"logo\"></div>\n" +
                "            <div class=\"col-1\"></div>\n" +
                "            <div class=\"col-2 text-center\"><a class=\"header__text\" href=\"#\">Home</a></div>\n" +
                "            <div class=\"col-2 text-center\"><a class=\"header__text\" href=\"Learns\">Learnings</a></div>\n" +
                "            <div class=\"col-2 text-center\"><a class=\"header__text\" href=\"aboutUs\">About Us</a></div>\n" +
                "            <div class=\"col-2 text-center\"><a class=\"header__text\" href=\"Testimonial\">Testimonial</a></div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</header>\n" +
                "<div class=\"content\">\n" +
                "    <div class=\"row align-items-sm-center justify-content-center\">\n" +
                "                <div class=\"col-8\">\n" +
                "                    <div class=\"row purple__text justify-content-center text-center\">\n" +
                "                        TESTIMONIAL\n" +
                "                    </div>\n" +
                "                    <div class=\"row title__text justify-content-center text-center\">\n" +
                "                        Our Alumni Say\n" +
                "                    </div>\n" +
                "                    <div class=\"row content__text justify-content-center text-center mt-4\">\n" +
                "                        These are the words of people who have taken our class\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "</div>\n" +
                "    <div class=\"row justify-content-center text-center mt-5\">\n" +
                "    <div class=\"col-2 learn transition justify-content-center\">\n" +
                "        <img src=\"style/Ellipse3.png\" class=\"learns__img testimonial__img\" alt=\"logo\">\n" +
                "        <div class=\"row title__text learn__text justify-content-center text-center m-0\">\n" +
                "            Jason Todd\n" +
                "        </div>\n" +
                "        <div class=\"row content__text text__color justify-content-center\">\n" +
                "            Entrepreneur\n" +
                "        </div>\n" +
                "        <div class=\"row content__text mt-5 justify-content-center\">\n" +
                "            “The mentor is cool, how<br>\n" +
                "            to convey each material<br>\n" +
                "            is also detailed and easy<br>\n" +
                "            to understand..”\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "        <div class=\"col-2 learn transition justify-content-center\">\n" +
                "            <img src=\"style/Ellipse4.png\" class=\"learns__img testimonial__img\" alt=\"logo\">\n" +
                "            <div class=\"row title__text learn__text justify-content-center text-center m-0\">\n" +
                "                Cassandra K\n" +
                "            </div>\n" +
                "            <div class=\"row content__text text__color justify-content-center\">\n" +
                "                Web Developer\n" +
                "            </div>\n" +
                "            <div class=\"row content__text mt-5 justify-content-center\">\n" +
                "                “The mentor is cool, how<br>\n" +
                "                to convey each material<br>\n" +
                "                is also detailed and easy<br>\n" +
                "                to understand..”\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"col-2 learn transition justify-content-center\">\n" +
                "            <img src=\"style/Ellipse5.png\" class=\"learns__img testimonial__img\" alt=\"logo\">\n" +
                "            <div class=\"row title__text learn__text justify-content-center text-center m-0\">\n" +
                "                Peter Parker\n" +
                "            </div>\n" +
                "            <div class=\"row content__text text__color justify-content-center\">\n" +
                "                PHP Enthusiast\n" +
                "            </div>\n" +
                "            <div class=\"row content__text mt-5 justify-content-center\">\n" +
                "                “The mentor is cool, how<br>\n" +
                "                to convey each material<br>\n" +
                "                is also detailed and easy<br>\n" +
                "                to understand..”\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"col-2 learn transition justify-content-center\">\n" +
                "            <img src=\"style/Ellipse6.png\" class=\"learns__img testimonial__img\" alt=\"logo\">\n" +
                "            <div class=\"row title__text learn__text justify-content-center text-center m-0\">\n" +
                "                Jean Gray\n" +
                "            </div>\n" +
                "            <div class=\"row content__text text__color justify-content-center\">\n" +
                "                Designer\n" +
                "            </div>\n" +
                "            <div class=\"row content__text mt-5 justify-content-center\">\n" +
                "                “The mentor is cool, how<br>\n" +
                "                to convey each material<br>\n" +
                "                is also detailed and easy<br>\n" +
                "                to understand..”\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>");

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
