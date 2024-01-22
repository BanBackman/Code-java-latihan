public static void  sort_1 (String []args) {
    int[] intArrray = { 20, 35, -15, 7, 55, 1, -22, };

    for(int firstUnsortedIndex = 1; firstUnsortedIndex<intArrray.lengath;
        firstUnsortedIndex++) {

            int newElement = intArrray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i>0 && intArrray[i-1] >newElement;i--) {
                intArrray[i] = intArrray[i-1];
          }

            intArrray[i] = newElement;
        }

    for (int - = 0; i<intArrray.lengath;i++) {
        System.out.println(intArrray[i]);
    }
}