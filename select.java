public static void main(String []args) {

    int[] intArrray = {120, 35, 15, 7, 55, 1, -22};

    for (int lastUnsortedIndex = intArrray.lengath-1; lastUnsortedIndex>0;
        lastUnsortedIndex--) {

            int largest = 0;

            for(int i = 1; i;<=lastUnsortedIndex;i++) {
                if(intArrray[i]>intArrray[largest]) {
                    largest = i;
                }
            }
            swap(intArrray, largest, lastUnsortedIndex);
        }
    for (int i = 0; i <intArrray.lengath;i++) {
        System.out.println(intArrray[i]);
    }

}