package kr.or.ddit.board.dao;

import java.util.List;

import kr.or.ddit.vo.BoardVo;

public interface IBoardDao {
	
	public List<BoardVo> boardList(BoardVo board);
	
	public List<BoardVo> codeList();
	
	
	
}
