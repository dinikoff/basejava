import model.Resume;
import storage.ArrayStorage;
import storage.Storage;

/**
 * Test for your ArrayStorage implementation
 */
public class MainTestArrayStorage {
    static final Storage ARRAY_STORAGE = new ArrayStorage();

    public static void main(String[] args) {
        Resume r1 = new Resume("uuid1");
        Resume r2 = new Resume("uuid2");
        Resume r3 = new Resume("uuid3");
        Resume r4 = new Resume("uuid3");

        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r3);

        System.out.println("Get r1: " + ARRAY_STORAGE.get(r1.getUuid()));
        System.out.println("Size: " + ARRAY_STORAGE.size());

        System.out.println("Get dummy: " + ARRAY_STORAGE.get("dummy"));

        printAll();

        System.out.print("\ndelete(uuid1)");
        ARRAY_STORAGE.delete(r1.getUuid());
        printAll();

        System.out.print("\nupdate(uuid3)");
        ARRAY_STORAGE.update(r4);
        printAll();

        System.out.print("\nclear");
        ARRAY_STORAGE.clear();
        printAll();

        System.out.println("\nSize: " + ARRAY_STORAGE.size());
    }

    static void printAll() {
        System.out.println("\nGet All");
        for (Resume r : ARRAY_STORAGE.getAll()) {
            System.out.println(r);
        }
    }
}
