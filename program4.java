import java.util.Scanner;

class Trainer {
    private int tid;

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getTid() {
        return this.tid;
    }

    public Trainer(int tid) {
        this.tid = tid;
    }

    public Trainer() {
        this.tid = 0;
    }
}

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Trainer[] ob = new Trainer[5];

        for (int i = 0; i < 5; i++) {
            ob[i] = new Trainer();

            System.out.println("Enter teacher id: ");
            int tidin = sc.nextInt();
            
            // Assuming you want to set the same teacher id for all trainers in the array
            for (int j = 0; j < 5; j++) {
                ob[j].setTid(tidin);
                System.out.println("tid: " + ob[j].getTid());
            }
        }
    }
}
