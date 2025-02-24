public class Context {
    Sort sortObj;
    Search searchObj;

    public void setSearch(Search search){
        this.searchObj = search;
    }
    public void setSort(Sort sort){
        this.sortObj = sort;
    }

    public void doSort(){
        sortObj.sort();
    }
    public void doSearch(){
        searchObj.search();
    }
}
