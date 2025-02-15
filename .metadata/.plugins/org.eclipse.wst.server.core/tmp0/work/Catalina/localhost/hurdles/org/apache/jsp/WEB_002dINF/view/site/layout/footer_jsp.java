/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.33
 * Generated at: 2025-01-03 05:16:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.site.layout;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<footer id=\"footer\" class=\"footer dark-background mt-5\">\n");
      out.write("   <div class=\"container\">\n");
      out.write("     <div class=\"row gy-3\">\n");
      out.write("       <div class=\"col-lg-4 col-md-6 d-flex\">\n");
      out.write("         <i class=\"bi bi-geo-alt icon\"></i>\n");
      out.write("         <div class=\"address\">\n");
      out.write("           <h4>Address</h4>\n");
      out.write("           \n");
      out.write("           <p>대전광역시 중구 계룡로 846</p>\n");
      out.write("           <p>대덕인재개발원 </p>\n");
      out.write("           <p></p>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("       <div class=\"col-lg-4 col-md-6 d-flex\">\n");
      out.write("         <i class=\"bi bi-telephone icon\"></i>\n");
      out.write("         <div>\n");
      out.write("           <h4>Contact</h4>\n");
      out.write("           <p>\n");
      out.write("             <strong>Phone:</strong> <span>042-0000-0000</span><br>\n");
      out.write("             <strong>Email:</strong> <span>info@gmail.com</span><br>\n");
      out.write("           </p>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("       <div class=\"col-lg-4 col-md-6 d-flex\">\n");
      out.write("         <i class=\"bi bi-clock icon\"></i>\n");
      out.write("         <div>\n");
      out.write("           <h4>Opening Hours</h4>\n");
      out.write("           <p>\n");
      out.write("             <strong>Mon-Fir:</strong> <span>09AM - 18PM</span><br>\n");
      out.write("             <strong>Sat-Sun</strong>: <span>Closed</span>\n");
      out.write("           </p>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("       <!-- <div class=\"col-lg-3 col-md-6\">\n");
      out.write("         <h4>Follow Us</h4>\n");
      out.write("         <div class=\"social-links d-flex\">\n");
      out.write("           <a href=\"#\" class=\"twitter\"><i class=\"bi bi-twitter-x\"></i></a>\n");
      out.write("           <a href=\"#\" class=\"facebook\"><i class=\"bi bi-facebook\"></i></a>\n");
      out.write("           <a href=\"#\" class=\"instagram\"><i class=\"bi bi-instagram\"></i></a>\n");
      out.write("           <a href=\"#\" class=\"linkedin\"><i class=\"bi bi-linkedin\"></i></a>\n");
      out.write("         </div>\n");
      out.write("       </div> -->\n");
      out.write("\n");
      out.write("     </div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("   <div class=\"container copyright text-center mt-4\">\n");
      out.write("     <p>© <span>Copyright</span> <strong class=\"px-1 sitename\">Massu</strong> <span>All Rights Reserved</span></p>\n");
      out.write("     <div class=\"credits\">\n");
      out.write("       <!-- All the links in the footer should remain intact. -->\n");
      out.write("       <!-- You can delete the links only if you've purchased the pro version. -->\n");
      out.write("       <!-- Licensing information: https://bootstrapmade.com/license/ -->\n");
      out.write("       <!-- Purchase the pro version with working PHP/AJAX contact form: [buy-url] -->\n");
      out.write("       Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>\n");
      out.write("     </div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write(" </footer>\n");
      out.write(" \n");
      out.write(" <a href=\"#\" id=\"scroll-top\" class=\"scroll-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\n");
      out.write("  <!-- Preloader -->\n");
      out.write(" <div id=\" \"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal\" tabindex=\"-1\" id=\"logoutModal\">\n");
      out.write("  <div class=\"modal-dialog \">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\">로그아웃</h5>\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <p>로그아웃 하시겠습니까?</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">닫기</button>\n");
      out.write("        <a class=\"btn btn-primary\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/auth/logout.do\">로그아웃</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"modal\" tabindex=\"-1\" id=\"loginConfirmModal\">\n");
      out.write("  <div class=\"modal-dialog \">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\">로그인 하시겠습니까?</h5>\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <p>로그인 후 이용하실 수 있습니다.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">닫기</button>\n");
      out.write("        <a class=\"btn btn-primary\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/auth/login.do\">로그인하러 가기</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- <div class=\"modal fade\" id=\"postcodeModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\"> -->\n");
      out.write("<div class=\"modal fade\" id=\"postcodeModal\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("  <div class=\"modal-dialog  modal-md\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\">주소 검색</h5>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <div class=\"postcode-wrap\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer border-0 pt-0\">\n");
      out.write("        <button class=\"btn btn-secondary\" type=\"button\" data-bs-dismiss=\"modal\">닫기</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
