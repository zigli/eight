package cf.tilgiz;

public class Main {

    public static void main(String[] args) {
        int x = Math.summ(2,6);
        System.out.println(x);
        Math num = new Math();
        System.out.println(num.mult(3,5));
        System.out.println(Math.z);

        System.out.println("-------------------------");
        System.out.println("-------------------------");

        Array myarr = new MyArray();
        System.out.println(myarr.Add(4));
        System.out.println(myarr.Add(3));
        System.out.println(myarr.Add(44));
        System.out.println(myarr.Add(35));
        System.out.println(myarr.Add(24));
        System.out.println(myarr.Add(14));
        System.out.println(myarr.Get(3));

    }
}
