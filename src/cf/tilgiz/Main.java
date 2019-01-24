package cf.tilgiz;

public class Main {

    public static void main(String[] args) {
        int x = Math.summ(2,6);
        System.out.println(x);
        Math num = new Math();
        System.out.println(num.mult(3,5));
        System.out.println(Math.z);

        System.out.println("-------------------------");

        Array myarr = new MyArray();
        myarr.Add(4);
        myarr.Add(3);
        myarr.Add(44);
        myarr.Add(35);
        myarr.Add(24);
        System.out.println(myarr.Get(3));

    }
}
