package list.dao;

import java.util.List;
import java.util.Map;

import list.bean.ListDTO;

public interface ListDAO {

	public List<ListDTO> getProductList(Map<String, Integer> map);

	public List<String> getColor(String name);

	public int getMajorCategoryTotal(String category);

	public List<ListDTO> getProductSelectList(Map<String, String> map);

}
