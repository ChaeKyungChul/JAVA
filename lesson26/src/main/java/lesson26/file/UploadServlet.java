package lesson26.file;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.File;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;


@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      // TODO Auto-generated method stub
	      response.getWriter().append("Served at: ").append(request.getContextPath());
	   }


	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        request.setCharacterEncoding("utf-8");
	      response.setContentType("text/html;charset=utf-8");
	      PrintWriter out = response.getWriter();
	      
	      //�������� ��ġ ��� ����
	      ServletContext context = getServletContext();
	      String realDir = context.getRealPath("upload");
	      
	      //DistFileItemFactory ��ü ����
	      DiskFileItemFactory factory = new DiskFileItemFactory();
	      
	      //���ε� ���� ũ�⸦ 1MB�� ����
	      factory.setSizeThreshold(1024*1024);
	      
	      //1MB���� ū ������ ���� ����Ǵ� ���� �ӽ�����ҷ� ����
	      File currentDirAndPath = new File(realDir);
	      factory.setRepository(currentDirAndPath);
	      
	      //ServletFileUpload ��ü ����
	      ServletFileUpload upload=new ServletFileUpload(factory);
	      
	      try {
	         //multipart/form-data�� �޾ƿ� ��� ���� List�� ����
	         List<FileItem> items = upload.parseRequest(request);
	         
	         //for���� ���� List ����
	         for(int i = 0; i < items.size(); i++) {
	            FileItem fileItem = items.get(i);
	            //isFormField()�޼ҵ带 �̿��Ͽ� request���� �������� �������� ����
	            if(fileItem.isFormField()) {
	               //������ �����Ͱ� �Ϲ� �ؽ�Ʈ
	               out.println(fileItem.getFieldName() + ":" +
	                           fileItem.getString("utf-8") + "<br><br>");
	            }else {
	               //������ �����Ͱ� �ִ� ���
	               if(fileItem.getSize() > 0) {
	                  
	                  //���� �̸� ����
	                  String fileName = fileItem.getName();
	                  out.println("�����̸� : " + fileName + "<br><br>");
	                  
	                  //���� ������ġ, �̸� ����
	                  String dirAndFileName = realDir + "\\" + fileName;
	                  out.println("������ġ : " + dirAndFileName + "<br><br>");
	                  out.println("<img src='upload/"+ fileName + "'>");
	                  
	                  //������ ������ �����ϱ� ���� ��ü ����
	                  File uploadFile = new File(dirAndFileName);
	                  
	                  try {
	                     fileItem.write(uploadFile);
	                     //���� ũ��
	                     out.println("size : " + fileItem.getSize() + "bytes <br><br>");
	                  } catch (Exception e) {
	                     // TODO Auto-generated catch block
	                     e.printStackTrace();
	                  }
	               }
	            }
	         }
	         
	      } catch (FileUploadException e) {
	         e.printStackTrace();
	      }
	      
	      doGet(request, response);
	   }

	}

