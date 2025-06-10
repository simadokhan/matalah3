//Sima dokhan Id:214587842
public class Main {
    public static void main(String[] args) {
        {
            MyLinkedList list = new MyLinkedList();

            list.add(5);
            list.add(10);
            list.add(15);
            list.add(20);
            list.add(25);

            System.out.println("List after additions:");
            list.print();

            System.out.println("Size: " + list.size());
            System.out.println("Contains 15? " + list.contains(15));
            System.out.println("Index of 20: " + list.indexOf(20));
            System.out.println("Value at index 2: " + list.get(2));
            System.out.println("Is list empty? " + list.isEmpty());

            list.remove((Object)10);
            list.remove(0);
            list.remove((Object)25);

            System.out.println("List after removals:");
            list.print();

            System.out.println("Array conversion:");
            int[] array = list.toArray();
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            list.add(99);
            list.add(88);
            System.out.println("List after indexed insertions:");
            list.print();

            list.clear();
            System.out.println("After clear:");
            list.print();
            System.out.println("Is list empty? " + list.isEmpty());

        }
    }
}
/*List after additions:
5 10 15 20 25
Size: 5
Contains 15? true
Index of 20: 3
Value at index 2: 15
Is list empty? false
List after removals:
10 15 20 25
Array conversion:
10 15 20 25
List after indexed insertions:
10 15 20 25 99 88
After clear:
List is empty.
Is list empty? true
*/
