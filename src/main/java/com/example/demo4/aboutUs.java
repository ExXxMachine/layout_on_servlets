package com.example.demo4;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "aboutUs", value = "/aboutUs")
public class aboutUs extends HttpServlet {
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
                "    <div class=\"row\">\n" +
                "        <div class=\"col-1\"></div>\n" +
                "        <div class=\"col-4\">\n" +
                "            <img src=\"style/about_img.png\" class=\"img-fluid\" alt=\"tetki\">\n" +
                "        </div>\n" +
                "        <div class=\"col-1\"></div>\n" +
                "        <div class=\"col-5\">\n" +
                "            <div class=\"row purple__text\">\n" +
                "                ABOUT US\n" +
                "            </div>\n" +
                "            <div class=\"row title__text\">\n" +
                "                We Help Improve <br>\n" +
                "                Your Work Experience\n" +
                "            </div>\n" +
                "            <div class=\"row content__text mt-3\">\n" +
                "                We help you to increase self-confidence<br>\n" +
                "                and train yourself in a direction.\n" +
                "            </div>\n" +
                "            <div class=\"row mt-4\">\n" +
                "                <div class=\"col-2\">\n" +
                "                    <img src=\"style/check.png\" class=\"img-fluid\" alt=\"check\">\n" +
                "                </div>\n" +
                "                <div class=\"col-9 content__text m-0\">\n" +
                "                    Study and produce creation to <br>\n" +
                "                    get a job\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row mt-4\">\n" +
                "                <div class=\"col-2\">\n" +
                "                    <img src=\"style/check.png\" class=\"img-fluid\" alt=\"check\">\n" +
                "                </div>\n" +
                "                <div class=\"col-9 content__text m-0\">\n" +
                "                    Up to date material and created by<br>\n" +
                "                    expert creators\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"row mt-4\">\n" +
                "                <div class=\"col-2\">\n" +
                "                    <img src=\"style/check.png\" class=\"img-fluid\" alt=\"check\">\n" +
                "                </div>\n" +
                "                <div class=\"col-9 content__text m-0\">\n" +
                "                    Complete classes and projects and<br>\n" +
                "                    get a certificate from us\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>");

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
