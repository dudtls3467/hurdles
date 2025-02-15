package kr.or.ddit.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.util.MybatisDao;
import kr.or.ddit.util.MybatisUtil;
import kr.or.ddit.vo.BoardVo;

public class BoardDaoImpl extends MybatisDao implements IBoardDao {

	private static BoardDaoImpl instance;
	
	private BoardDaoImpl() {
		
	}
	
	public static BoardDaoImpl getInstance() {
		if(instance == null) {
			instance = new BoardDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<BoardVo> boardList(BoardVo board) {
		SqlSession session = MybatisUtil.getInstance(true);
		List<BoardVo> boardList = null;
		try {
			boardList = session.selectList("board.boardList", board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardList;
	}

	@Override
	public List<BoardVo> codeList() {
		return selectList("board.codeList");
	}

}
