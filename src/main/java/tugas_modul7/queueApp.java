package tugas_modul7;
public class queueApp {
    public static void main(String[] args) {
        mainqueue antrian = new mainqueue(10);
        antrian.enqueue(40);
        antrian.tampil();
        antrian.enqueue(33);
        antrian.tampil();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        antrian.enqueue(60);
        antrian.tampil();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.tampil();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.tampil();
        antrian.enqueue(54);
        antrian.tampil();
        System.out.println("nilai yang paling depan = " + antrian.peek());
   }
}