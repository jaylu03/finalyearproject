/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2021-02-17 19:19:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class complain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=no\" name=\"viewport\">\r\n");
      out.write("  <title>House Mart</title>\r\n");
      out.write("  <!-- General CSS Files -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"adminResources/css/app.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"adminResources/css/selectric.css\">\r\n");
      out.write("  <!-- Template CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"adminResources/css/style.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"adminResources/css/components.css\">\r\n");
      out.write("  <!-- Custom style CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"adminResources/css/custom.css\">\r\n");
      out.write("  <link rel='shortcut icon' type='image/x-icon' href='adminResources/image/favicon.ico' />\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css2?family=Montserrat&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./adminResources/css/register.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"loader\"></div>\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"main-content\" style=\"min-height: 562px;\">\r\n");
      out.write("        <section class=\"section\">\r\n");
      out.write("          <div class=\"section-body\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-12\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                  <div class=\"card-header\">\r\n");
      out.write("                    <h4>Write Your Post</h4>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"card-body\">\r\n");
      out.write("                    <div class=\"form-group row mb-4\">\r\n");
      out.write("                      <label class=\"col-form-label text-md-right col-12 col-md-3 col-lg-3\">Title</label>\r\n");
      out.write("                      <div class=\"col-sm-12 col-md-7\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group row mb-4\">\r\n");
      out.write("                      <label class=\"col-form-label text-md-right col-12 col-md-3 col-lg-3\">Category</label>\r\n");
      out.write("                      <div class=\"col-sm-12 col-md-7\">\r\n");
      out.write("                        <div class=\"selectric-wrapper selectric-form-control selectric-selectric selectric-above\"><div class=\"selectric-hide-select\"><select class=\"form-control selectric\" tabindex=\"-1\">\r\n");
      out.write("                          <option>Tech</option>\r\n");
      out.write("                          <option>News</option>\r\n");
      out.write("                          <option>Political</option>\r\n");
      out.write("                        </select></div><div class=\"selectric\"><span class=\"label\">Tech</span><b class=\"button\">â¾</b></div><div class=\"selectric-items\" tabindex=\"-1\" style=\"width: 564.406px;\"><div class=\"selectric-scroll\"><ul><li data-index=\"0\" class=\"selected highlighted\">Tech</li><li data-index=\"1\" class=\"\">News</li><li data-index=\"2\" class=\"last\">Political</li></ul></div></div><input class=\"selectric-input\" tabindex=\"0\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group row mb-4\">\r\n");
      out.write("                      <label class=\"col-form-label text-md-right col-12 col-md-3 col-lg-3\">Content</label>\r\n");
      out.write("                      <div class=\"col-sm-12 col-md-7\">\r\n");
      out.write("                        <textarea class=\"summernote-simple\" style=\"display: none;\"></textarea><div class=\"note-editor note-frame card\"><div class=\"note-dropzone\">  <div class=\"note-dropzone-message\"></div></div><div class=\"note-toolbar-wrapper\" style=\"height: 36px;\"><div class=\"note-toolbar card-header\" style=\"position: relative; top: 0px; width: 100%;\"><div class=\"note-btn-group btn-group note-style\"><button type=\"button\" class=\"note-btn btn btn-light btn-sm note-btn-bold\" tabindex=\"-1\" title=\"\" data-original-title=\"Bold (CTRL+B)\"><i class=\"note-icon-bold\"></i></button><button type=\"button\" class=\"note-btn btn btn-light btn-sm note-btn-italic\" tabindex=\"-1\" title=\"\" data-original-title=\"Italic (CTRL+I)\"><i class=\"note-icon-italic\"></i></button><button type=\"button\" class=\"note-btn btn btn-light btn-sm note-btn-underline\" tabindex=\"-1\" title=\"\" data-original-title=\"Underline (CTRL+U)\"><i class=\"note-icon-underline\"></i></button><button type=\"button\" class=\"note-btn btn btn-light btn-sm\" tabindex=\"-1\" title=\"\" data-original-title=\"Remove Font Style (CTRL+\\)\"><i class=\"note-icon-eraser\"></i></button></div><div class=\"note-btn-group btn-group note-font\"><button type=\"button\" class=\"note-btn btn btn-light btn-sm note-btn-strikethrough\" tabindex=\"-1\" title=\"\" data-original-title=\"Strikethrough (CTRL+SHIFT+S)\"><i class=\"note-icon-strikethrough\"></i></button></div><div class=\"note-btn-group btn-group note-para\"><div class=\"note-btn-group btn-group\"><button type=\"button\" class=\"note-btn btn btn-light btn-sm dropdown-toggle\" tabindex=\"-1\" data-toggle=\"dropdown\" title=\"\" data-original-title=\"Paragraph\"><i class=\"note-icon-align-left\"></i></button><div class=\"dropdown-menu\"><div class=\"note-btn-group btn-group note-align\"><button type=\"button\" class=\"note-btn btn btn-light btn-sm\" tabindex=\"-1\" title=\"\" data-original-title=\"Align left (CTRL+SHIFT+L)\"><i class=\"note-icon-align-left\"></i></button><button type=\"button\" class=\"note-btn btn btn-light btn-sm\" tabindex=\"-1\" title=\"\" data-original-title=\"Align center (CTRL+SHIFT+E)\"><i class=\"note-icon-align-center\"></i></button><button type=\"button\" class=\"note-btn btn btn-light btn-sm\" tabindex=\"-1\" title=\"\" data-original-title=\"Align right (CTRL+SHIFT+R)\"><i class=\"note-icon-align-right\"></i></button><button type=\"button\" class=\"note-btn btn btn-light btn-sm\" tabindex=\"-1\" title=\"\" data-original-title=\"Justify full (CTRL+SHIFT+J)\"><i class=\"note-icon-align-justify\"></i></button></div><div class=\"note-btn-group btn-group note-list\"><button type=\"button\" class=\"note-btn btn btn-light btn-sm\" tabindex=\"-1\" title=\"\" data-original-title=\"Outdent (CTRL+[)\"><i class=\"note-icon-align-outdent\"></i></button><button type=\"button\" class=\"note-btn btn btn-light btn-sm\" tabindex=\"-1\" title=\"\" data-original-title=\"Indent (CTRL+])\"><i class=\"note-icon-align-indent\"></i></button></div></div></div></div></div></div><div class=\"note-editing-area\"><div class=\"note-handle\"><div class=\"note-control-selection\" style=\"display: none;\"><div class=\"note-control-selection-bg\"></div><div class=\"note-control-holder note-control-nw\"></div><div class=\"note-control-holder note-control-ne\"></div><div class=\"note-control-holder note-control-sw\"></div><div class=\"note-control-sizing note-control-se\"></div><div class=\"note-control-selection-info\"></div></div></div><textarea class=\"note-codable\"></textarea><div class=\"note-editable card-block\" contenteditable=\"true\" style=\"min-height: 150px;\"><p><br></p></div></div><div class=\"note-statusbar\">  <div class=\"note-resizebar\">    <div class=\"note-icon-bar\"></div>    <div class=\"note-icon-bar\"></div>    <div class=\"note-icon-bar\"></div>  </div></div></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group row mb-4\">\r\n");
      out.write("                      <label class=\"col-form-label text-md-right col-12 col-md-3 col-lg-3\">Thumbnail</label>\r\n");
      out.write("                      <div class=\"col-sm-12 col-md-7\">\r\n");
      out.write("                        <div id=\"image-preview\" class=\"image-preview\">\r\n");
      out.write("                          <label for=\"image-upload\" id=\"image-label\">Choose File</label>\r\n");
      out.write("                          <input type=\"file\" name=\"image\" id=\"image-upload\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group row mb-4\">\r\n");
      out.write("                      <label class=\"col-form-label text-md-right col-12 col-md-3 col-lg-3\">Tags</label>\r\n");
      out.write("                      <div class=\"col-sm-12 col-md-7\">\r\n");
      out.write("                        <div class=\"bootstrap-tagsinput\"><input type=\"text\" placeholder=\"\"></div><input type=\"text\" class=\"form-control inputtags\" style=\"display: none;\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group row mb-4\">\r\n");
      out.write("                      <label class=\"col-form-label text-md-right col-12 col-md-3 col-lg-3\">Status</label>\r\n");
      out.write("                      <div class=\"col-sm-12 col-md-7\">\r\n");
      out.write("                        <div class=\"selectric-wrapper selectric-form-control selectric-selectric selectric-above\"><div class=\"selectric-hide-select\"><select class=\"form-control selectric\" tabindex=\"-1\">\r\n");
      out.write("                          <option>Publish</option>\r\n");
      out.write("                          <option>Draft</option>\r\n");
      out.write("                          <option>Pending</option>\r\n");
      out.write("                        </select></div><div class=\"selectric\"><span class=\"label\">Publish</span><b class=\"button\">â¾</b></div><div class=\"selectric-items\" tabindex=\"-1\" style=\"width: 564.406px;\"><div class=\"selectric-scroll\"><ul><li data-index=\"0\" class=\"selected highlighted\">Publish</li><li data-index=\"1\" class=\"\">Draft</li><li data-index=\"2\" class=\"last\">Pending</li></ul></div></div><input class=\"selectric-input\" tabindex=\"0\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group row mb-4\">\r\n");
      out.write("                      <label class=\"col-form-label text-md-right col-12 col-md-3 col-lg-3\"></label>\r\n");
      out.write("                      <div class=\"col-sm-12 col-md-7\">\r\n");
      out.write("                        <button class=\"btn btn-primary\">Create Post</button>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  const check = function() {\r\n");
      out.write("\t  document.getElementById(\"submit-btn\").addEventListener(\"click\", function(event){\r\n");
      out.write("\t\t  event.preventDefault()\r\n");
      out.write("\t\t});\r\n");
      out.write("\t  console.log(document.getElementById('password').value);\r\n");
      out.write("\t  console.log(document.getElementById('password2').value);\r\n");
      out.write("\t  if (document.getElementById('password').value ==\r\n");
      out.write("\t    document.getElementById('password2').value) {\r\n");
      out.write("\t    $(this).trigger(e.type);\r\n");
      out.write("\t  } else {\r\n");
      out.write("\t   alert(\"Password is not matching\");\r\n");
      out.write("\t  }\r\n");
      out.write("\t}\r\n");
      out.write("  </script>\r\n");
      out.write("  <!-- General JS Scripts -->\r\n");
      out.write("  <script src=\"adminResources/js/app.min.js\"></script>\r\n");
      out.write("  <!-- JS Libraies -->\r\n");
      out.write("  <script src=\"adminResources/js/jquery.pwstrength.min.js\"></script>\r\n");
      out.write("  <script src=\"adminResources/js/jquery.selectric.min.js\"></script>\r\n");
      out.write("  <!-- Page Specific JS File -->\r\n");
      out.write("  <script src=\"adminResources/js/auth-register.js\"></script>\r\n");
      out.write("  <!-- Template JS File -->\r\n");
      out.write("  <script src=\"adminResources/js/scripts.js\"></script>\r\n");
      out.write("  <!-- Custom JS File -->\r\n");
      out.write("  <script src=\"adminResources/js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
