package mybatisStudy.Utils;

public class Pager {
	/**
	 * ���ж�������
	 */
	private Integer totals;
	
	/**
	 * ÿҳ��ʾ����
	 */
	private Integer pageSize;
	
	private Integer pageStart;
	
	private Integer page;
	
	private Integer totalPage;

	public Integer getTotals() {
		return totals;
	}

	public void setTotals(Integer totals) {
		this.totals = totals;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageStart() {
		return pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	
	
	
}
