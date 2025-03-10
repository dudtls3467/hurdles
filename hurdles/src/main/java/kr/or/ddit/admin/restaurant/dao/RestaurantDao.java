package kr.or.ddit.admin.restaurant.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.util.Pagenation;
import kr.or.ddit.util.mybatis.MybatisDao;
import kr.or.ddit.vo.FileVo;
import kr.or.ddit.vo.LocalVo;
import kr.or.ddit.vo.RestaurantCodeVo;
import kr.or.ddit.vo.RestaurantVo;
import kr.or.ddit.vo.ReviewVo;

public class RestaurantDao extends MybatisDao implements IRestaurantDao {
	/* Singleton */
	private static RestaurantDao instance;

	private RestaurantDao() {
	}

	public static RestaurantDao getInstance() {
		if (instance == null) {
			instance = new RestaurantDao();
		}

		return instance;
	}

	@Override
	public List<RestaurantVo> list(Pagenation<RestaurantVo> param) {
		return selectList("restaurant.list", param);
	}

	@Override
	public RestaurantVo detail(RestaurantVo param) {
		return selectOne("restaurant.detail", param);
	}

	@Override
	public int insert(RestaurantVo param) {
		return insert("restaurant.insert", param);
	}

	@Override
	public int update(RestaurantVo param) {
		return insert("restaurant.update", param);
	}

	@Override
	public int remove(RestaurantVo param) {
		return update("restaurant.delete", param);
	}

	@Override
	public int getAllCount(Pagenation<RestaurantVo> param) {
		return selectOne("restaurant.getAllCount", param);
	}

	@Override
	public int getNo() {
		return selectOne("restaurant.getNo");
	}

	public void restaurantFileInsert(List<Map<String, Object>> param) {
		insert("restaurant.restaurantFileInsert", param);
	}

	@Override
	public List<FileVo> getFileList(RestaurantVo param) {
		return selectList("restaurant.getFileList", param);
	}

	@Override
	public List<RestaurantCodeVo> getRestaurantCodeList() {
		return selectList("restaurantCode.list");
	}

	@Override
	public List<LocalVo> getLocalVo() {
		return selectList("local.list");
	}

	@Override
	public void restrauntFileDelete(int[] removeFileIdList) {
		update("restaurant.restaurantFileDelete", removeFileIdList);

	}

	public List<ReviewVo> reviewList(Map<String, Object> param) {
		return selectList("restaurant.reviewList", param);
	}

}
