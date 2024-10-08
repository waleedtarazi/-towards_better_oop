public class ArrayListSpecial {
    int length;
    int currentIndex;
    int[] innerItems;
    public ArrayListSpecial(int length){
        innerItems = new int[length];
        this.length = length;
        currentIndex = 0;
    }


    private int[] moveItems(int[] currentItems, int size){
        int[] temp = new int[size];
        for(int i = 0; i<currentItems.length;i++){
            temp[i] = currentItems[i];
        }
        return temp;
    }

    public void addItem(int item){
        if(currentIndex<length){
            innerItems[currentIndex++] = item;
        } else if (currentIndex==length) {
            length = length + length/2; // -> 3
            System.out.println("new length: " + length);
            System.out.println("new currentIndex: " + currentIndex);
            innerItems = moveItems(innerItems,length);
            innerItems[currentIndex++] = item;
        }
        // 2 -> 2+ 2/2 = 3
        // currentIndex 0,1,2

    }

}
