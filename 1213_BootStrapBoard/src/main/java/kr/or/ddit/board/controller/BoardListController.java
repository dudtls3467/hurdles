package kr.or.ddit.board.controller;

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

@WebServlet("/boardList.do")
public class BoardListController extends HttpServlet{
// 留ㅳ뀘�꽩�뼱癒뺣㉧�븷癒꾩뼱�뀗�뀅�뀋�뀅�꽩�뀋�뀅�꽩�뀋�뀅�꽩�뀋�뀅�뀋�뀅
	IBoardService boardService = BoardServiceImpl.getInstance();
	
	//test
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<BoardVo> codeList =  boardService.codeList();
		req.setAttribute("codeList", codeList);
		
		String codeNoStr = req.getParameter("codeNo");
		int codeNo = Integer.parseInt(codeNoStr);
		
		System.out.println("codeNo : "+codeNo);
		BoardVo board = new BoardVo();
		board.setCodeNo(codeNo);
		
		
		List<BoardVo> boardList = boardService.boardList(board);
		
		board = boardList.get(0);
		
		System.out.println("boardList => "+boardList);
		
		req.setAttribute("codeName", board.getCodeName());
		req.setAttribute("boardList", boardList);
		
		ServletContext ctx =  req.getServletContext();
		ctx.getRequestDispatcher("/WEB-INF/view/board/boardList.jsp").forward(req, resp);
		
	
	}
	
	
}
