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
	      
	      //파일저장 위치 경로 추출
	      ServletContext context = getServletContext();
	      String realDir = context.getRealPath("upload");
	      
	      //DistFileItemFactory 객체 생성
	      DiskFileItemFactory factory = new DiskFileItemFactory();
	      
	      //업로드 파일 크기를 1MB로 지정
	      factory.setSizeThreshold(1024*1024);
	      
	      //1MB보다 큰 파일이 최종 저장되는 곳을 임시저장소로 지정
	      File currentDirAndPath = new File(realDir);
	      factory.setRepository(currentDirAndPath);
	      
	      //ServletFileUpload 객체 생성
	      ServletFileUpload upload=new ServletFileUpload(factory);
	      
	      try {
	         //multipart/form-data로 받아온 모든 값을 List에 저장
	         List<FileItem> items = upload.parseRequest(request);
	         
	         //for문을 돌려 List 추출
	         for(int i = 0; i < items.size(); i++) {
	            FileItem fileItem = items.get(i);
	            //isFormField()메소드를 이용하여 request값이 문자인지 파일인지 구별
	            if(fileItem.isFormField()) {
	               //추출한 데이터가 일반 텍스트
	               out.println(fileItem.getFieldName() + ":" +
	                           fileItem.getString("utf-8") + "<br><br>");
	            }else {
	               //추출한 데이터가 있는 경우
	               if(fileItem.getSize() > 0) {
	                  
	                  //파일 이름 추출
	                  String fileName = fileItem.getName();
	                  out.println("파일이름 : " + fileName + "<br><br>");
	                  
	                  //파일 저장위치, 이름 추출
	                  String dirAndFileName = realDir + "\\" + fileName;
	                  out.println("저장위치 : " + dirAndFileName + "<br><br>");
	                  out.println("<img src='upload/"+ fileName + "'>");
	                  
	                  //실제로 파일을 저장하기 위해 객체 생성
	                  File uploadFile = new File(dirAndFileName);
	                  
	                  try {
	                     fileItem.write(uploadFile);
	                     //파일 크기
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

