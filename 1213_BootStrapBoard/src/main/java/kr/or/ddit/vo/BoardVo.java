package kr.or.ddit.vo;

public class BoardVo {
	private int boardNo;
	private String title;
	private String content;
	private int memNo;
	private String regDate;
	private String delyn;
	private int codeNo;
	
	// 게시판 이름
	private String codeName;
	
	// 작성자
	private String memName;

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getDelyn() {
		return delyn;
	}

	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}

	public int getCodeNo() {
		return codeNo;
	}

	public void setCodeNo(int codeNo) {
		this.codeNo = codeNo;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	
	@Override
	public String toString() {
		return "BoardVo [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", memNo=" + memNo
				+ ", regDate=" + regDate + ", delyn=" + delyn + ", codeNo=" + codeNo + ", codeName=" + codeName
				+ ", memName=" + memName + "]";
	}
	
	
	
	
	
	
	
	
}
