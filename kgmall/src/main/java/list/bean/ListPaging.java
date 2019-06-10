package list.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ListPaging {
	private int currentPage;
	private int pageBlock;
	private int pageSize;
	private int totalA;
	private StringBuffer pagingHTML;
	
	public void makePagingHTML(){
		pagingHTML = new StringBuffer();
		
		int totalP = (totalA+pageSize-1)/pageSize;
		
		int startPage = (currentPage-1)/pageBlock*pageBlock+1;
		int endPage = startPage+pageBlock-1;
		if(endPage > totalP) endPage = totalP;
		
		if(startPage > pageBlock)
			pagingHTML.append("[<a id=paging href='/kgmall/list/bottomListForm.do?pg="+(startPage-1)+"'>이전</a>]");
		
		for(int i=startPage; i<=endPage; i++) {
			if(i==currentPage)
				pagingHTML.append("[<a id=currentPaging href='/kgmall/list/bottomListForm.do?pg="+i+"'>"+i+"</a>]");
			else
				pagingHTML.append("[<a id=paging href='/kgmall/list/bottomListForm.do?pg="+i+"'>"+i+"</a>]");
		}
		
		if(totalP > endPage)
			pagingHTML.append("[<a id=paging href='/kgmall/list/bottomListForm.do?pg="+(endPage+1)+"'>다음</a>]");
	}

	public void makeSelectPagingHTML() {
		pagingHTML = new StringBuffer();
		
		int totalP = (totalA+pageSize-1)/pageSize;
		
		int startPage = (currentPage-1)/pageBlock*pageBlock+1;
		int endPage = startPage+pageBlock-1;
		if(endPage > totalP) endPage = totalP;
		
		if(startPage > pageBlock)
			pagingHTML.append("[<span id=paging onclick=bottomSelect("+(startPage-1)+")>이전</span>]");
		
		for(int i=startPage; i<=endPage; i++) {
			if(i==currentPage)
				pagingHTML.append("[<span id=currentPaging onclick=bottomSelect("+i+")>"+i+"</span>]");
			else
				pagingHTML.append("[<span id=paging onclick=bottomSelect("+i+")>"+i+"</span>]");
		}
		
		if(totalP > endPage)
			pagingHTML.append("[<span id=paging onclick=bottomSelect("+(endPage+1)+")>다음</span>]");
		
	}

}


	



















		
		
		
		
		
		
		
		
		






