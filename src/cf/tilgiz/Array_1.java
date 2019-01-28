package cf.tilgiz;

public class Array_1 implements Array{
    private int[] a = new int[6];
    private int size;

    @Override
    public int Get(int i) {
        if(i < a.length) return a[a.length - i - 1];
        else  return a[0];
    }

    int ArrLeng(){
        return a.length;
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
