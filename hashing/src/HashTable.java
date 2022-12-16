import java.util.Random;

public class HashTable {
    private int[] keys; // hash tablosunda saklanan anahtar değerleri
    private int size; // hash tablosunun boyutu
    // Random nesnesi anahtar değerleri rastgele üretmek için kullanılır
    private Random random;

    // hash tablosunu oluşturan constructor
    public HashTable(int size) {
        this.size = size;
        this.keys = new int[size];
        // Random nesnesini oluşturalım
        random = new Random();
    }

    // lineer probing ile anahtar değerini hash tablosuna yerleştirme
    public void linearProbing(int key) {
        int index = key % size; // hash değerini hesapla
        if (index < 0) {
            index = index + size; // negatif bir değer varsa pozitif bir değere dönüştür
        }
        int i = 0;
        while (keys[(index + i) % size] != 0) {
            i++;
        }
        keys[(index + i) % size] = key;
    }



    // quadratic probing ile anahtar değerini hash tablosuna yerleştirme
    // quadratic probing ile anahtar değerini hash tablosuna yerleştirme
    public void quadraticProbing(int key) {
        int i = 0;
        int index = key % size; // hash değerini hesapla
        if (index < 0) {
            index = index + size; // negatif bir değer varsa pozitif bir değere dönüştür
        }
        while (keys[(int) ((index + Math.pow(i, 2)) % size)] != 0) {
            i++;
        }
        keys[(int) ((index + Math.pow(i, 2)) % size)] = key;
    }

    // hash tablosunu ekrana yazdıran metot
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println("Anahtar değeri: " + keys[i]);
        }
    }


    public static void main(String[] args) {
// Hash tablosunu oluşturalım
        HashTable hashTable = new HashTable(100);
// Rastgele 100 tane integer anahtar değer üretelim

        for (int i = 0; i < 100; i++) {
            int key = hashTable.random.nextInt();

            // Lineer probing yöntemi kullanarak anahtar değerini hash tablosuna yerleştirin
            hashTable.linearProbing(key);

            // Quadratic probing yöntemi kullanarak anahtar değerini hash tablosuna yerleştirin
            hashTable.quadraticProbing(key);


        }
        hashTable.print();
    }
}