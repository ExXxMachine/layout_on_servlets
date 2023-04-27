package com.example.demo4;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Learns", value = "/Learns")
public class Learns extends HttpServlet {
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
                "</header> <div class=\"content content__learning\">\n" +
                "    <div class=\"row align-items-sm-center\">\n" +
                "        <div class=\"col-2\"></div>\n" +
                "        <div class=\"col-4\">\n" +
                "            <div class=\"row purple__text\">\n" +
                "                LEARNINGS\n" +
                "            </div>\n" +
                "            <div class=\"row title__text fs-2\">\n" +
                "                Online Learning Platform <br>\n" +
                "                International Curriculum\n" +
                "            </div>\n" +
                "            <div class=\"row content__text mt-2\">\n" +
                "                Study and understand the material <br>\n" +
                "                class is more relaxed without time limit.\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "<div class=\"row learns\">\n" +
                "    <div class=\"col-2 learn transition\">\n" +
                "        <img src=\"style/image2.png\" class=\"learns__img\" alt=\"logo\">\n" +
                "        <div class=\"row title__text learn__text m-2\">\n" +
                "            Starter\n" +
                "        </div>\n" +
                "        <div class=\"row content__text m-2\">\n" +
                "            Free class access for that <br>\n" +
                "            start learning code and <br>\n" +
                "            design\n" +
                "        </div>\n" +
                "        <button class=\"purple__button green__button\">See Class</button>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"col-2 learn transition\">\n" +
                "        <img src=\"style/image3.png\" class=\"learns__img\" alt=\"logo\">\n" +
                "        <div class=\"row title__text learn__text m-2\">\n" +
                "            Premium\n" +
                "        </div>\n" +
                "        <div class=\"row content__text m-2\">\n" +
                "            Advanced material from <br>\n" +
                "            the Starter & learn to<br>\n" +
                "            build projects\n" +
                "        </div>\n" +
                "        <button class=\"purple__button green__button\">See Class</button>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"col-2 learn transition\">\n" +
                "        <img src=\"style/image4.png\" class=\"learns__img\" alt=\"logo\">\n" +
                "        <div class=\"row title__text learn__text m-2\">\n" +
                "            Superstar\n" +
                "        </div>\n" +
                "        <div class=\"row content__text m-2\">\n" +
                "            Materials for experts<br>\n" +
                "            who have completed the<br>\n" +
                "            premium package\n" +
                "        </div>\n" +
                "        <button class=\"purple__button green__button\">See Class</button>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"col-2 learn transition\">\n" +
                "        <img src=\"style/image5.png\" class=\"learns__img\" alt=\"logo\">\n" +
                "        <div class=\"row title__text learn__text m-2\">\n" +
                "            Bootcamp\n" +
                "        </div>\n" +
                "        <div class=\"row content__text m-2\">\n" +
                "            Informatics science<br>\n" +
                "            training program with<br>\n" +
                "            the latest material\n" +
                "        </div>\n" +
                "        <button class=\"purple__button green__button\">See Class</button>\n" +
                "    </div>\n" +
                "</div>");

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
