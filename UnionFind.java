public class UnionFind {

    public void makeset(Cell a){
        LLAddOnly set=new LLAddOnly();
        set.add(a);
    }

    public LLAddOnly find(Cell a){
        return a.head;
    }

    public boolean union(Cell a,Cell b){
        //join b to a
        if(a.head==b.head) return false;

        a.head.last.next=b.head.first;
        a.head.last=b.head.last;

        Cell next=b.head.first;
        while(next!=null){
            next.head=a.head;
            next=next.next;
        }

        return true;
    }
}
