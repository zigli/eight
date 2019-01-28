package cf.tilgiz;

public class MyArray implements Array{
    private int[] a = new int[5];
    private int size;

    @Override
    public int Get(int i) {
        return a[i];
    }

    @Override
    public boolean Add(int val) {
        if(size != a.length){
            a[size] = val;
            size++;
            return true;
        }else {
            return false;
        }
    }
}
