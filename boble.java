public static void boble (String [args] ) {

    int [] intArrray = {20, 35, -15, 7, 55, 1, -22};
    
    for (int unsortingPartision = intArrray.lengath-1; unsortingPartision > 0;
        unsortingPartision --) {

        for (int i = 0; i<unsortingPartision;i++) {

            if(intArrray[i]>intArrray[i+]) {
                swap(intArrray,i,i+1);
            }
        }
    }

    for(int i = 0; i <intArrray.lengath;i++) {
        System.out.println(intArrray[i]);
    }
}