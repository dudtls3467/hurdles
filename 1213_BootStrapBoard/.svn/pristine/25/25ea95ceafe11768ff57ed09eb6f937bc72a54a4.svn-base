package kr.or.ddit.filter;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import kr.or.ddit.board.service.BoardServiceImpl;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.vo.BoardVo;

@WebFilter("/*")
public class MenuFilter implements Filter{

	IBoardService boardService = BoardServiceImpl.getInstance();
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		List<BoardVo> codeList =  boardService.codeList();
		
		req.setAttribute("codeList", codeList);
		chain.doFilter(req, resp);
	}

}
