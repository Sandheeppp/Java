package courseUd;

interface Member {
    void callback();
}

class Store implements Member {
    Member[] mem = new Member[100];
    int count = 0;

    @Override
    public void callback() {
        System.out.println("");
    }

    void register(Member m) {
        mem[count++] = m;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}

class Customerzs implements Member {
    String name;

    Customerzs(String n) {
        this.name = n;
    }

    @Override
    public void callback() {
        System.out.println(name + " notified of sale!!");
    }
}

public class StoreInterface {
    public static void main(String[] args) {
        Store s = new Store();
        Customerzs c1 = new Customerzs("Sandheep");
        Customerzs c2 = new Customerzs("Arun");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
