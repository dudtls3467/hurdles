package kr.or.ddit.main.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.board.service.BoardServiceImpl;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.vo.BoardVo;

@WebServlet("/main.do")
public class MainController extends HttpServlet{

//	IBoardService boardService = BoardServiceImpl.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		List<BoardVo> codeList =  boardService.codeList();
//		req.setAttribute("codeList", codeList);
		
		ServletContext ctx = req.getServletContext();
		ctx.getRequestDispatcher("/WEB-INF/view/main.jsp").forward(req, resp);
	
	}
	
}
