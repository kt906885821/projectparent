package entity;

import java.io.Serializable;
import java.util.List;

/**
 * 后端返回前端的分页的实体类，
 * @author Administrator
 * @
 *
 */
public class PageResult implements Serializable{
	
	private long total; //返回的记录数
	
	private List rows;  //每页的记录数据
	
	public PageResult() {}

	public PageResult(long total, List rows) {
		this.total = total;
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}
	
	
}
