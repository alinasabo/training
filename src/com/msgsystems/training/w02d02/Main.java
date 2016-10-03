package com.msgsystems.training.w02d02;

import com.msgsystems.training.w02d02.service.StoreService;

public class Main {

    public static void main(String[] args) {

        StoreService storeService = new StoreService();

        storeService.displayStores();
        storeService.FilterStoresToDisplay();
        storeService.displayTotalCostsOfStores();

      //  storeService.removeStoreByName("Alina");
      //  storeService.removeStoreByName("ZARA");
        storeService.writeInAFile();


    }
}
