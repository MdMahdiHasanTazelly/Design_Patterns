public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setSearch(new Sequential());
        context.doSearch();

        context.setSearch(new HashTable());
        context.doSearch();

        context.setSort(new Heap());
        context.doSort();
    }
}
