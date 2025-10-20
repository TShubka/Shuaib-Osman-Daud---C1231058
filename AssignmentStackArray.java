public class AssignmentStackArray {
    private String[] items;
    private int topIndex;
    private static int stackCount = 0;

    // Constructor
    public AssignmentStackArray(int size) {
        items = new String[size];
        topIndex = -1;
        stackCount++;
    }

    public static int getStackCount() {
        return stackCount;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public boolean isFull() {
        return topIndex == items.length - 1;
    }

    public void push(String word) throws Exception {
        if (isFull()) {
            expandStack();
        }
        items[++topIndex] = word;
    }

    public String pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("The stack is empty — nothing to remove!");
        }
        return items[topIndex--];
    }

    public String peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("The stack is empty — nothing to view!");
        }
        return items[topIndex];
    }

    private void expandStack() {
        int newSize = items.length * 2;
        String[] biggerArray = new String[newSize];
        for (int i = 0; i <= topIndex; i++) {
            biggerArray[i] = items[i];
        }
        items = biggerArray;
    }

    public void showItems() {
        System.out.println("Stack words:");
        for (int i = topIndex; i >= 0; i--) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        AssignmentStackArray bookStack = new AssignmentStackArray(3);

        bookStack.push("Quran");
        bookStack.push("Hadith");
        bookStack.push("Fiqh");
        bookStack.push("Tafsir");

        bookStack.showItems();
        System.out.println("Top word: " + bookStack.peek());
        System.out.println("Removed: " + bookStack.pop());
        bookStack.showItems();
        System.out.println("Total stacks created: " + AssignmentStackArray.getStackCount());
    }
}
